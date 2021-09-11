/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almost.sorted;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Result {
    public static void almostSorted(List<Integer> arr) {  
        List<Integer> newArr = new ArrayList<>();
        for (int i=0;i<arr.size();i++) {
            if (i==0) {
                newArr.add(0);
            }
            newArr.add(arr.get(i));
        }
        newArr.add(100000);
        
        int peakInd = 0; // newArr.get(0);
        int valleyInd = 0; // newArr.get(0);
        boolean alreadySorted = true;
        boolean swap = false;
        boolean confirmSwap = false;
        for (int i=0; i<newArr.size()-1;i++) { // 0,1,5,3,4,2,7,6,8,10000
            if (newArr.get(i)<newArr.get(i+1) && valleyInd == 0 /*valleyVal == newArr.get(0)*/) {
                peakInd = i+1; // newArr.get(i+1);
            } else if (newArr.get(i)>newArr.get(i+1)) {
                alreadySorted = false;
                valleyInd = i+1; // newArr.get(i+1);
                if (swap) {
                    confirmSwap = true;
                }
            } else {
                alreadySorted = false;
                swap = true;
            }
        }
//        System.out.println(alreadySorted+" - "+ peakInd + " - " + valleyInd);
        if (alreadySorted) {
            System.out.println("yes");
        } else {
//            if (cannot) {
//                System.out.println("no");
//            } else 
            if (newArr.get(peakInd)<newArr.get(valleyInd+1) && (newArr.get(valleyInd)>newArr.get(peakInd-1))) {
                if (valleyInd-peakInd > 2 && newArr.get(peakInd+1)>newArr.get(peakInd+2)) {
                    System.out.println("yes\nreverse "+peakInd + " "+valleyInd);
                } else {
                    if (!confirmSwap) {
                        System.out.println("yes\nswap "+peakInd + " "+valleyInd);
                    } else {
                        System.out.println("no");
                    }
                }
            } else {
                System.out.println("no");
            }
        }
                
//yes
//swap 1 2
//1 2
//no-
//1 2
//yes
//reverse 2 5
//2 5
//yes
//swap 2 5
//2 5
//no
//2 7
//yes
//swap 2 3
//2 3
//yes
//reverse 1 4
//1 4
        
        
        
        
        
        
//        List<Integer> newArr = new ArrayList<Integer>();
//        for (int i=0; i<arr.size(); i++) {
//            if (i==0) {
//                newArr.add(0);
//            }
//            newArr.add(arr.get(i));
//        }
//        newArr.add(10000000);
//        arr = newArr;
//        int peak = arr.get(0);
//        int peakInd = 0;
//        int valley = arr.get(0);
//        int valleyInd = 0;
//        boolean atTheBeg= false;
////        boolean foundOne = false;
////        boolean cannot = false;
//        for (int i=0; i<arr.size()-1;i++) { // 1,2,3,6,4,5
//            if (arr.get(i)>arr.get(i+1)) {
////                foundOne = true;
//                if (i==1) {
//                    atTheBeg = true;
//                    peakInd = arr.get(i);
//                    peakInd = i;
//                    valley = arr.get(i+1);
//                    valleyInd = i+1;
////                    System.out.println("conti"+arr.get(i));
//                    continue;
//                }
////                System.out.println("ssss"+arr.get(i));
//                if (peak == arr.get(0) && !atTheBeg) {
//                    peak = arr.get(i);
//                    peakInd = i;
//                    valley = arr.get(i+1);
//                    valleyInd = i+1;
//                } else {
//                    valley = arr.get(i+1);
//                    valleyInd = i+1;
//                }
//            } 
//            else if (peak != arr.get(0) && i == arr.size()-2 && peak > arr.get(arr.size()-2)) {
//                valley = arr.get(arr.size()-2);
//                valleyInd = arr.size()-2;
//            }
//        }
//        if (peakInd == 0 && valleyInd == 0) {
//            System.out.println("yes");
//        } else if (Math.abs(peakInd-valleyInd)==1) {
//            if (arr.size() > 4 && arr.get(peakInd)<arr.get(peakInd+2) && arr.get(valleyInd)>arr.get(valleyInd-2) && arr.get(peakInd)>arr.get(peakInd-1) && arr.get(valleyInd)<arr.get(valleyInd+1)) {
//                System.out.println("yes\nswap "+peakInd + " "+valleyInd);
//            } else if (arr.size() == 4){
//                System.out.println("yes\nswap "+peakInd + " "+valleyInd);
//            } else {
//                System.out.println("no-");
//            }
//        } else if (arr.get(peakInd-1)<arr.get(valleyInd) && arr.get(valleyInd)<arr.get(peakInd+1) && (Math.abs(valleyInd-peakInd)>2 && arr.get(peakInd+1)>arr.get(peakInd+2))) {
//            System.out.println("yes\nreverse "+peakInd + " "+valleyInd);
//        } else if (arr.get(peakInd-1)<arr.get(valleyInd) && arr.get(valleyInd)<arr.get(peakInd+1) && arr.get(peakInd+1)>arr.get(valleyInd) && arr.get(valleyInd)>arr.get(peakInd-1)) {
//            System.out.println("yes\nswap "+peakInd + " "+valleyInd);
//        } else {
//            System.out.println("no");
//        }
//        System.out.println(peakInd + " " + valleyInd);
    }
}

public class AlmostSorted {
    
    public static void main(String[] args) {
        List<Integer> arr1 = Arrays.asList(4, 2); // swap 1 2
        List<Integer> arr2 = Arrays.asList(3, 1, 2); // no 
        List<Integer> arr3 = Arrays.asList(1,5,4,3,2,6); // reverse 2 5
        List<Integer> arr4 = Arrays.asList(1,5,3,4,2,6); // swap 2 5
        List<Integer> arr5 = Arrays.asList(1,5,3,4,2,7,6,8); // swap 2 7 *
        List<Integer> arr6 = Arrays.asList(1,3,2,4); // swap 2 3
        List<Integer> arr7 = Arrays.asList(4,3,2,1,10); // reverse 1 4
        Result.almostSorted(arr1); 
        Result.almostSorted(arr2); 
        Result.almostSorted(arr3); 
        Result.almostSorted(arr4); 
        Result.almostSorted(arr5); 
        Result.almostSorted(arr6); 
        Result.almostSorted(arr7); 
    }
}
