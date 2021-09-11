/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strong.password;
class Result {
    public static int minimumNumber(int n, String password) {
//        int includedCount = 0;
        int includedCount = (4*password.length()) - (
                    password.replaceFirst("[a-z]", "").length()+
                    password.replaceFirst("[A-Z]", "").length()+ 
                    password.replaceFirst("[0-9]", "").length() + 
                    password.replaceFirst("[^A-Za-z0-9]", "").length());
//        if (password.matches(".*[a-z]+.*")) {
//            includedCount++;
//        }
//        if (password.matches(".*[A-Z]+.*")) {
//            includedCount++;
//        }
//        if (password.matches(".*[0-9]+.*")) {
//            includedCount++;
//        }
//        if (password.matches(".*[^A-Za-z0-9]+.*")) {
//            includedCount++;
//        }
        
        if (4-includedCount + n < 6) {
            System.out.println("00000");
            System.out.println(6-n);
//            System.out.println(6-includedCount);
            System.out.println("00000");
            return (6-n);
        } else {
            System.out.println(4-includedCount+"---");
            return (4-includedCount);
        }
//        System.out.println(requiredCount);
//        return requiredCount;
    }

}

//3
//4
//5
//3
//1
//1

public class StrongPassword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Result.minimumNumber(3, "A232A312");
        Result.minimumNumber(2, "AA");
        Result.minimumNumber(1, "A");
        Result.minimumNumber(6, "AAAAAA");
        Result.minimumNumber(5, "2bb#A");
        Result.minimumNumber(11, "#HackerRank");
        
        Result.minimumNumber(40, "0aaaaaaaaaaaaaaaaaaaA+aaaaaaaaaaaaaaaaa");
    }
    
}
