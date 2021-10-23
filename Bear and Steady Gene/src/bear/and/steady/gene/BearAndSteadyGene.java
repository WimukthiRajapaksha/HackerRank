/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bear.and.steady.gene;

/**
 *
 * @author wimukthirajapaksha
 */
public class BearAndSteadyGene {

    /**
     * @param args the command line arguments
     */
    
    public static int steadyGene(String gene) {
        int ca=gene.length() - gene.replace("A", "").length();
        int cc=gene.length() - gene.replace("C", "").length();
        int ct=gene.length() - gene.replace("T", "").length();
        int cg=gene.length() - gene.replace("G", "").length();
        int thre = gene.length()/4;
//        System.out.println(thre);
        System.out.println(ca + " - " + cc + " - " + ct + " - " + cg);
        int cao = ca>thre ? ca-thre : 0;
        int cco = cc>thre ? cc-thre : 0;
        int cto = ct>thre ? ct-thre : 0;
        int cgo = cg>thre ? cg-thre : 0;
        if (cao==0 && cco==0 && cto==0 && cgo==0) {
            return 0;
        }
        int i=0;
        int ex = cao+cco+cto+cgo;
        int j = ex;
        int min=10000000;
        String ss = "";
        char[] cha = gene.toCharArray();
        while(j<gene.length() || i+ex<gene.length()) {
//            System.out.println(gene.substring(0, i));
//            System.out.println(gene.substring(j));
//            String s = gene.substring(0, i)+ gene.substring(j);
//            ca = s.length() - s.replace("A", "").length();
//            cc = s.length() - s.replace("C", "").length();
//            ct = s.length() - s.replace("T", "").length();
//            cg = s.length() - s.replace("G", "").length();
            String s = gene.substring(i, j);
//            System.out.println(i + " - " + j);
            System.out.println(s);
            int caa = ca - (s.length() - s.replace("A", "").length());
            int ccc = cc - (s.length() - s.replace("C", "").length());
            int ctt = ct - (s.length() - s.replace("T", "").length());
            int cgg = cg - (s.length() - s.replace("G", "").length());
            if (caa>thre || ccc>thre || ctt>thre || cgg>thre) {
                j++;
            } else {
                if (min>j-i) {
                    System.out.println("---");
                    min = j-i;
                    ss = s;
                    if (min==ex) {
                        break;
                    }
                }
                i++;
            }
            if (i+ex>j) {
                j++;
            }
//            if (i>=s.length() || i+ex>j || j>=s.length()) {
//                
//            }
        }
        System.out.println(min);
        System.out.println(ss);
        return 0;
        
        
        
        
        
        
//        int ca=gene.length() - gene.replace("A", "").length();
//        int cc=gene.length() - gene.replace("C", "").length();
//        int ct=gene.length() - gene.replace("T", "").length();
//        int cg=gene.length() - gene.replace("G", "").length();
//        int thre = gene.length()/4;
////        System.out.println(thre);
//        System.out.println(ca + " - " + cc + " - " + ct + " - " + cg);
//        ca = ca>thre ? ca-thre : 0;
//        cc = cc>thre ? cc-thre : 0;
//        ct = ct>thre ? ct-thre : 0;
//        cg = cg>thre ? cg-thre : 0;
////        if (ca>0) {
////            System.out.print("A ");
////        }
////        if (cc>0) {
////            System.out.print("C ");
////        }
////        if (ct>0) {
////            System.out.print("T ");
////        }
////        if (cg>0) {
////            System.out.print("G ");
////        }
////        System.out.println();
//        
//
//
//
//        int over = ca+cc+ct+cg;
//        String ret = "";
//        for (int i=over; i<gene.length(); i++) {
//            for (int j=0; j<gene.length()-i; j++) {
//                String sub = gene.substring(j, j+i);
//                boolean elig = true;
//                if (ca>0 && (sub.length() - sub.replace("A", "").length())<ca) {
//                    elig = false;
//                }
//                if (cc>0 && (sub.length() - sub.replace("C", "").length())<cc) {
//                    elig = false;
//                }
//                if (ct>0 && (sub.length() - sub.replace("T", "").length())<ct) {
//                    elig = false;
//                }
//                if (cg>0 && (sub.length() - sub.replace("G", "").length())<cg) {
//                    elig = false;
//                }
//                if (elig) {
//                    ret = sub;
////                    System.out.println(sub);
//                    break;
//                }
//            }
//            if (ret.length()>0) {
//                break;
//            }
//        }
////        System.out.println("-----\n\n"+ret);
//        return ret.length();
    }
    
    public static void main(String[] args) {
//        BearAndSteadyGene.steadyGene("GAAATAAA");
//        BearAndSteadyGene.steadyGene("ACTGAAAA");
        BearAndSteadyGene.steadyGene("TGATGCCGTCCCCTCAACTTGAGTGCTCCTAATGCGTTGC"); //7, 5, 7, 
//        System.out.println(s.substring(0, 0));
//        int[] arr = {2, 4};
//        for (int i=0; i<10; i++) {
//            int p = arr[0]++;
//            System.out.println(arr[0]);
//            System.out.println(p);
//        }
    }
    
}
