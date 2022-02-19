/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package journey.to.the.moon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author wimukthirajapaksha
 */
public class JourneyToTheMoon {

    /**
     * @param args the command line arguments
     */
    
    static class Vertex {
        int id;
        boolean visited;
        List<Vertex> siblings;

        public Vertex(int id) {
            this.id = id;
            this.siblings = new ArrayList<>();
        }
    }
    
    public static int journeyToMoon(int n, List<List<Integer>> astronaut) {
        Vertex[] list = new Vertex[n];
        for (int i=0; i<n; i++) {
            list[i] = new Vertex(i);
        }
        for (List<Integer> i: astronaut) {
            list[i.get(0)].siblings.add(list[i.get(1)]);
            list[i.get(1)].siblings.add(list[i.get(0)]);
        }
//        for (Vertex v: list) {
//            System.out.print(v.id+" - ");
//            for (Vertex vv: v.siblings) {
//                System.out.print(vv.id+" ");
//            }
//            System.out.println();
//        }
        List<Integer> count = new ArrayList<>();
        for (Vertex v: list) {
            int tempCount = 0;
            Queue<Vertex> queue = new LinkedList<>();
            if (!v.visited) {
                v.visited = true;
                queue.add(v);
                tempCount++;
                while(!queue.isEmpty()) {
                    Vertex temp = queue.poll();
                    for (Vertex curr: temp.siblings) {
                        if (!curr.visited) {
                            curr.visited = true;
                            queue.add(curr);
                            tempCount++;
                        }
                    }
                }
                count.add(tempCount);
            }
        }
        System.out.println(count);
        int total=0;
        int preCount=0;
        for (int i: count) {
            total+=i*(n-i-preCount);
            preCount+=i;
        }
        System.out.println(total);
        return total;
    }
    
//    public static void abc(int a[10]) {
//        
//    }
    
    public static void main(String[] args) {
//        JourneyToTheMoon.journeyToMoon(5, Arrays.asList(Arrays.asList(0, 1), Arrays.asList(2, 3), Arrays.asList(0, 4)));
//        JourneyToTheMoon.journeyToMoon(4, Arrays.asList(Arrays.asList(0, 1), Arrays.asList(0, 2), Arrays.asList(0, 3)));
//        JourneyToTheMoon.journeyToMoon(10, Arrays.asList(
//                Arrays.asList(0, 2), Arrays.asList(1, 8), Arrays.asList(1, 4),
//                Arrays.asList(2, 8), Arrays.asList(2, 6), Arrays.asList(3, 5), Arrays.asList(6, 9)
//        ));

//        int k, tar = 15;
//        boolean fla = false;
//        for(k=2; k<tar; k+=2) {
//            if (tar%k==3) {
//                fla = true;
//                break;
//            }
//        }
//        System.out.println(k+""+fla);

//          int[] x = {1,2,3,4,5};
//          for (int i=1; i<x.length; i++) {
//              x[i-1]=1+i++;
//          }
//          System.out.println(x[2]);

//        for (int i=1; i<5; i++) {
//            for (int j=1; j<i; j++) {
//                System.out.println(i);
//            }
//        }

//        int[] a = {1,2,3,4,5,6};
//        for (int i=a.length/2; i<a.length; i++) {
//            a[i-1]=a[i]+a[i];
//        }
//        for (int i: a) {
//            System.out.println(i);
//        }

//        String[][] a = {{"a","b","c"}, {"d","e","f"}, {"g","h","i"}};
//        System.out.println(a[0][1]);
        
        int a=10;
        int b = 20;
        int[] c = {6,4,8,10};
        foo(a, b, c);
        System.out.println(c[0]+ c[3]+" - "+c[2]+ c[1]);

//        Scanner s = new Scanner(System.in);
//        int x = s.nextInt();
//        while(x>=3 && x<=8) {
//            if (x%2==0) {
//                x=x+2;
//            } else {
//                x=x-1;
//            }
//            System.out.println(x);
//        }
//        System.out.println(x);
    }
    
    public static void foo(int a, int b, int[] c) {
        a+=5;
        b*=2;
        for (int i=0; i<c.length; i++) {
            if (i%2==0) {
                c[i]-=3;
            } else {
                c[i]*=2;
            }
        }
    }
}
