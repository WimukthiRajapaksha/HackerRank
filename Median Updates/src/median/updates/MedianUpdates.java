/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package median.updates;

/**
 *
 * @author wimukthirajapaksha
 */
public class MedianUpdates {

    /**
     * @param args the command line arguments
     */
    
    static class Node {
        int value;
        int height;
        Node left;
        Node right;
        int totalCount;
        Node(int value) {
            this.value = value;
            this.totalCount = totalCount;
        }
    }
    
    static int height(Node node) {
        return (node == null) ? -1 : node.height;
    }
    
    static void updateHeight(Node node) {
        if (node == null) {
            return;
        }
        node.height = Math.max(MedianUpdates.height(node.left), MedianUpdates.height(node.right))+1;
    }
    
    static Node leftRotate(Node node) {
        Node nodeRight = node.right;
        Node nodeRightLeft = nodeRight.left;
        
        nodeRight.left = node;
        node.right = nodeRightLeft;
        
        MedianUpdates.updateHeight(node);
        MedianUpdates.updateHeight(nodeRight);
        
        return nodeRight;
    }
    
    static Node rightRotate(Node node) {
        Node nodeLeft = node.left;
        Node nodeLeftRight = nodeLeft.right;
        
        nodeLeft.right = node;
        node.left = nodeLeftRight;
        
        MedianUpdates.updateHeight(node);
        MedianUpdates.updateHeight(nodeLeft);
        
        return nodeLeft;
    }
    
    static int balancedValue(Node node) {
        if (node == null) {
            return 0;
        }
        return MedianUpdates.height(node.left)-MedianUpdates.height(node.right);
    }
    
    static Node insertValue(Node node, int value) {
        if (node == null) {
            Node temp = new Node(value);
            temp.totalCount = 1;
            return temp;
        }
        if (value<node.value) {
            Node temp = node.left;
            node.left = MedianUpdates.insertValue(node.left, value);
//            if (temp != null) {
//                node.left.totalCount += 1;
//            }
            node.totalCount += 1;
        } else if (value>node.value) {
            Node temp = node.right;
            node.right = MedianUpdates.insertValue(node.right, value);
//            if (temp != null) {
//                node.right.totalCount += 1;
//            }
            node.totalCount += 1;
        } else {
            node.totalCount += 1;
            return node;
        }
        
        MedianUpdates.updateHeight(node);
        int balance = MedianUpdates.balancedValue(node);
        
        if (balance>1 && value<node.left.value) {
            return MedianUpdates.rightRotate(node);
        } else if (balance>1 && value>node.left.value) {
            node.left = MedianUpdates.leftRotate(node.left);
            return MedianUpdates.rightRotate(node);
        } else if (balance<-1 && value>node.right.value) {
            return MedianUpdates.leftRotate(node);
        } else if (balance<-1 && value<node.right.value) {
            node.right = MedianUpdates.rightRotate(node.right);
            return MedianUpdates.leftRotate(node);
        }
        return node;
    }
    
    static Node minValueNode(Node node) {
        Node temp = node;
        while(temp.left != null) {
            temp = temp.left;
        }
        return temp;
    }
    
    static Node delete(Node node, int value) {
        if (node == null) {
            return node;
        }
        if (value<node.value) {
            node.left = MedianUpdates.delete(node.left, value);
//            if (node.left != null) {
//                node.left.totalCount -= 1;
//            }
            node.totalCount -= 1;
        } else if (value>node.value) {
            node.right = MedianUpdates.delete(node.right, value);
//            if (node.right != null) {
//                node.right.totalCount -= 1;
//            }
            node.totalCount -= 1;
        } else {
            System.out.println(node.value+"->"+node.totalCount);
            if (node.totalCount != 1) {
                node.totalCount -= 1;
            } else if (node.left == null || node.right == null) {
                Node temp = null;
                if (node.left == null) {
                    temp = node.right;
                } else {
                    temp = node.left;
                }
                if (temp == null) {
                    temp = node;
                    node = null;
                } else {
                    node = temp;
                    node.totalCount -= 1;
                }
            } else {
                Node temp = MedianUpdates.minValueNode(node.right);
                node.value = temp.value;
                node.right = MedianUpdates.delete(node.right, temp.value);
                node.right.totalCount -= 1;
            }
        }
        if (node == null) {
            return node;
        }
        MedianUpdates.updateHeight(node);
        int balance = MedianUpdates.balancedValue(node);
        if (balance>1 && MedianUpdates.balancedValue(node.left)>=0) {
            return MedianUpdates.rightRotate(node);
        } else if (balance>1 && MedianUpdates.balancedValue(node.left)<0) {
            node.left = MedianUpdates.leftRotate(node.left);
            return MedianUpdates.rightRotate(node);
        } else if (balance<-1 && MedianUpdates.balancedValue(node.right)>=0) {
            return MedianUpdates.leftRotate(node);
        } else if (balance<-1 && MedianUpdates.balancedValue(node.right)<0){
            node.right = MedianUpdates.leftRotate(node.right);
            return MedianUpdates.leftRotate(node);
        }
        return node;
    }
    
    static void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.value+"-"+node.totalCount);
        MedianUpdates.preOrder(node.left);
        MedianUpdates.preOrder(node.right);
    }
    
    static int printMedian(Node node, int count, boolean isOdd) {
        
    }
    
    static void median(String a[],int x[]) {
        
    }
    
    public static void main(String[] args) {
//        String[] str = new String[]{"r", "a", "a", "a", "a", "a", "a", "r", "r", "r", "r", "r"};
//        int[] val = new int[]{1, 1, 1, 2, 1, 2, 3, 1, 2, 1, 1, 1};
//        "r", "a", "a", "a", "a", "a", "a", "r", "r", "r"
//         1,   1,   1,   2,   1,   2,   3,   1,   2,   1

//        String[] str = new String[]{"a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "r"};
//        int[] val = new int[]{1, 1, 1, 1, 1, 3, 0, 4, 3, 0, 3, 2, 3};

        String[] str = new String[]{"r", "a", "a", "a", "r", "r", "r"};
        int[] val = new int[]{1, 1, 2, 1, 1, 2, 1};
        MedianUpdates.median(str, val);
    }
    
}
