/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fraudulent.activity.notifications;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author wimukthirajapaksha
 */
public class FraudulentActivityNotifications {

    /**
     * @param args the command line arguments
     */
    
//    public static int[] countSort(int[] expenditure, int d, int power) {
//        int[] count = new int[10];
//        System.out.println(power);
//        for (int i=0; i<expenditure.length; i++) {
//            count[(expenditure[i]/power)%10]++;
//        }
//        for (int i=1; i<10; i++) {
//            count[i]+=count[i-1];
//        }
//        int[] resultant = new int[expenditure.length];
//        for (int i=expenditure.length-1; i>=0; i--) {
//            count[(expenditure[i]/power)%10]--;
//            resultant[count[(expenditure[i]/power)%10]] = expenditure[i];
//        }
//        for (int i: resultant) {
//            System.out.print(i+ " ");
//        }
//        System.out.println("--------");
//        return resultant;
//    }
    
    public static int activityNotifications(List<Integer> expenditure, int d) {
        int[] all = new int[10];
        int place = d-1;
        for (int i=0; i<d-1; i++) {
            all[expenditure.get(i)]++;
        }
        int retCount=0;
        while(place<expenditure.size()-1) {
            double thre = 0;
            all[expenditure.get(place)]++;
            
            for (int i: all) {
                System.out.print(i+" ");
            }
            System.out.println();
            if (d%2==0) {
                int count = 0;
                int prev = -1;
                int next = -1;
                for(int i=0; i<all.length; i++) {
                    count+=all[i];
                    if (prev==-1 && count >= d/2) {
                        prev = i;
                    }
                    if (next==-1 && count >= (d/2) +1) {
                        next = i;
                    }
                    thre = (prev+next)/2.0;
                }
                
                
                
//                int count = 0;
//                for(int i=0; i<all.length-1; i++) {
//                    if (count<d/2 && count+all[i]>d/2) {
//                        thre=i;
//                        break;
//                    }
//                    count+=all[i];
//                    if (count<d/2) {
//                        thre = 0;
//                    } else if (count==d/2) {
//                        if (all[i]!=0) {
//                            thre = i;
//                        }                        
//                    } else {
//                        System.out.println(i+" "+thre);
//                        thre=(thre+i)/2.0;
//                        break;
//                    }
//                }
            } else {
                int count = 0;
                for(int i=0; i<all.length; i++) {
                    count+=all[i];
                    if (count>d/2) {
                        thre = i;
                        break;
                    }
                }
            }
            System.out.println(thre + " -> "+expenditure.get(place+1));
            if (2*thre<=expenditure.get(place+1)) {
                retCount++;
            }
            place++;
            all[expenditure.get(place-d)]--;
        }
        System.out.println(retCount);
        return retCount;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        int max = 200;        
//        int window = d;
//        int count = 0;
//        int[] temp = new int[d];
//        for (int i=window-d; i<window; i++) {
//            temp[i-window+d] = expenditure.get(i);
////            if (max<expenditure.get(i)) {
////                max = expenditure.get(i);
////            }
//        }
//        
//        while(window<expenditure.size()) {
//            for (int i=1; max/i>0; i*=10) {
//                System.out.println(i);
//                temp = FraudulentActivityNotifications.countSort(temp, d, i);
//            }
//            double center = 0;
//            if (d%2==0) {
//                center = (temp[temp.length/2]+temp[temp.length/2-1])/2.0;
//            } else {
//                center = temp[temp.length/2];
//            }
//            System.out.println("center "+center+" window"+expenditure.get(window));
//            if (2*center<=expenditure.get(window)) {
//                count++;
//            }
//            System.out.println("window "+expenditure.get(window));
//            temp[window%d] = expenditure.get(window);
////            if (max<expenditure.get(window)) {
////                max = expenditure.get(window);
////            }
//            window++;
//        }
//        System.out.println(count);
//        
//        
//        return count;
        
        
        
        
        
        
        
        
        
        
        
//        int i=d-1;
//        int[] arr = new int[d];
//        int[] formattedArr = new int[d];
//        int count = 0;
//        int max = 0;
//        int min = Integer.MAX_VALUE;
//        for (int j=0; j<i; j++) {
////            arr[j] = expenditure.get(j);
//            if (max<expenditure.get(j)) {
//                max = expenditure.get(j);
//            }
//            if (min>expenditure.get(j)) {
//                min = expenditure.get(j);
//            }
//        }
//        for (int j=0; j<i; j++) {
//            arr[j] = expenditure.get(j);
////            formattedArr[j] = expenditure.get(j)-min;
//        }
////        for (int a: arr) {
////            System.out.print(a);
////        }
////        System.out.println("--");
//        while(i<expenditure.size()-1) {
//            
//            int tem = arr[i%d];
//            arr[i%d] = expenditure.get(i);
//            if (min == tem && max == tem) {
//                for (int j=0; j<i; j++) {
//                    if (max<expenditure.get(j)) {
//                        max = expenditure.get(j);
//                    }
//                    if (min>expenditure.get(j)) {
//                        min = expenditure.get(j);
//                    }
//                }
//            } else if (min == tem) {
//                for (int j=0; j<i; j++) {
//                    if (min>expenditure.get(j)) {
//                        min = expenditure.get(j);
//                    }
//                }
//            } else if (max == tem) {
//                for (int j=0; j<i; j++) {
//                    if (max<expenditure.get(j)) {
//                        max = expenditure.get(j);
//                    }
//                }
//            }
//            
//            for (int j=0; j<arr.length; j++) {
//                formattedArr[j] = arr[j]-min;
//            }
//            for (int a: formattedArr) {
//                System.out.print(a);
//            }
//            System.out.println("-+-");
//            System.out.println("---"+expenditure.get(i)+" "+i+ " "+ min+ " "+max);
//            
//            if (max<expenditure.get(i)) {
//                max = expenditure.get(i);
//            }
//            if (min>expenditure.get(i)) {
//                min = expenditure.get(i);
//            }
//            int[] countArr = new int[max-min+1];
//            
//            System.out.println("formattedArr");
//            for (int a: formattedArr) {
//                System.out.print(a);
//            }
//            System.out.println();
//            
//            for (int j=0; j<formattedArr.length; j++) {
//                countArr[formattedArr[j]]++;
//            }
//            
//            for (int j=1; j<countArr.length; j++) {
//                countArr[j] += countArr[j-1];
//            }
//            System.out.println("countArr");
//            for (int a: countArr) {
//                System.out.print(a);
//            }
//            System.out.println();
//            
//            for (int j=arr.length-1; j>=0; j--) {
//                
//            }
//
//            double median=0;
//            int temp=0;
//            for (int j=0; j<countArr.length; j++) {
//                if (formattedArr.length%2==0) {
//                    if (temp<(formattedArr.length/2) && temp+countArr[j]>(formattedArr.length/2)) {
//                        temp+=countArr[j];
//                        median=j+min;
//                        System.out.println("111111111111111111 "+median);
//                        break;
//                    } else if (temp==(formattedArr.length/2) && temp+countArr[j]>=(formattedArr.length/2)) {
//                        temp+=countArr[j];
//                        median=j-1+min;
//                        System.out.println("median");
//                        System.out.println(median);
//                        for (int k=j; k<countArr.length; k++) {
//                            if (countArr[k]!=0) {
//                                median+=k+min;
//                                System.out.println(median);
//                                median/=2.0;
//                                System.out.println(median);
//                                break;
//                            }
//                        }
//                        System.out.println("2222222222222 "+median);
//                        break;
//                    } else {
//                        temp+=countArr[j];
//                    }
//                } else {
//                    temp+=countArr[j];
//                    if(temp>formattedArr.length/2) {
//                        median=j+min;
//                        System.out.println("3333333333333333 "+median);
//                        break;
//                    }
//                }
//            }
//            if (2*median<=expenditure.get(i+1)) {
//                System.out.println("count "+median+" "+expenditure.get(i+1));
//                count++;
//            } else {
//                System.out.println("count- "+median+" "+expenditure.get(i+1));
//            }
//            i++;
//        }
//        
//        System.out.println(count);
//        return count;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        int i=d-1;
//        int[] arr = new int[d];
//        int count = 0;
//        int max = 0;
//        for (int j=0; j<i; j++) {
//            arr[j] = expenditure.get(j);
//            if (max<expenditure.get(j)) {
//                max = expenditure.get(j);
//            }
//        }
//        while(i<expenditure.size()-1) {
//            System.out.println("---"+expenditure.get(i)+" "+i);
//            if (max<expenditure.get(i)) {
//                max = expenditure.get(i);
//            }
//            System.out.println(max);
//            arr[i%d] = expenditure.get(i);
//            int[] countArr = new int[max+1];
//            for (int j=0; j<arr.length; j++) {
//                countArr[arr[j]]++;
//            }
//            System.out.println("arr");
//            for (int a: arr) {
//                System.out.print(a);
//            }
//            System.out.println();
//            for (int j=1; j<countArr.length; j++) {
//                countArr[j] += countArr[j-1];
//            }
//            System.out.println("countArr");
//            for (int a: countArr) {
//                System.out.print(a);
//            }
//            System.out.println();
//            int[] sortedArr = new int[arr.length];
//            
//            for (int j=(arr.length-1)/2-1; j>=0; j--) {
//                countArr[arr[j]]--;
//                sortedArr[countArr[arr[j]]] = arr[j];
//            }
//            
//            System.out.println("----->");
//            for (int a: sortedArr) {
//                System.out.print(a+" ");
//            }
//            double median=0;
//            if (sortedArr.length%2==0) {
//                median = (sortedArr[sortedArr.length/2]+sortedArr[(sortedArr.length/2)-1])/2.0;
//            } else {
//                median = sortedArr[sortedArr.length/2];
//            }
////            int temp=0;
////            for (int j=0; j<countArr.length; j++) {
////                if (arr.length%2==0) {
////                    if (temp<(arr.length/2) && temp+countArr[j]>(arr.length/2)) {
////                        temp+=countArr[j];
////                        median=j;
////                        System.out.println("111111111111111111 "+median);
////                        break;
////                    } else if (temp==(arr.length/2) && temp+countArr[j]>=(arr.length/2)) {
////                        temp+=countArr[j];
////                        median=j-1;
////                        System.out.println("median");
////                        System.out.println(median);
////                        for (int k=j; k<countArr.length; k++) {
////                            if (countArr[k]!=0) {
////                                median+=k;
////                                System.out.println(median);
////                                median/=2.0;
////                                System.out.println(median);
////                                break;
////                            }
////                        }
////                        System.out.println("2222222222222 "+median);
////                        break;
////                    } else {
////                        temp+=countArr[j];
////                    }
////                } else {
////                    temp+=countArr[j];
////                    if(temp>arr.length/2) {
////                        median=j;
////                        System.out.println("3333333333333333 "+median);
////                        break;
////                    }
////                }
////            }
//            if (2*median<=expenditure.get(i+1)) {
//                System.out.println("count "+median+" "+expenditure.get(i+1));
//                count++;
//            } else {
//                System.out.println("count- "+median+" "+expenditure.get(i+1));
//            }
//            i++;
//        }
//        
//        System.out.println(count);
//        return count;
    }
    
    public static void main(String[] args) {
//        List<Integer> lis = Arrays.asList(432, 8, 530, 90, 88, 231, 11, 45, 677, 199);
        List<Integer> lis = Arrays.asList(2, 3, 4, 2, 3, 6, 8, 4, 5);
        FraudulentActivityNotifications.activityNotifications(lis, 4);
//        List<Integer> lis = Arrays.asList(1, 2, 3, 4, 4);
//        FraudulentActivityNotifications.activityNotifications(lis, 4);
//        List<Integer> lis = Arrays.asList(10, 20, 30, 40, 50);
//        FraudulentActivityNotifications.activityNotifications(lis, 3);
    }
    
}
