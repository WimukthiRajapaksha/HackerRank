package larry.s.array;

import java.util.Arrays;
import java.util.List;


class Result {
    public static String larrysArray(List<Integer> A) {   // 1,6,5,2,4,3
        int count = 0;
        for (int i=0; i< A.size()-1; i++) {
            for (int j=i+1; j<A.size(); j++) {
                if (A.get(i)>A.get(j)) {
                    count ++;
                }
            }
            
        }
        System.out.println(count);
        if (count%2==0) {
            return "YES";
        } else {
            return "NO";
        }
    }

}
public class LarrySArray {
    public static void main(String[] args) {
        List<Integer> li1 = Arrays.asList(1,6,5,2,4,3); 
        List<Integer> li2 = Arrays.asList(3, 1, 2); 
        List<Integer> li3 = Arrays.asList(1, 3, 4, 2); 
        List<Integer> li4 = Arrays.asList(1, 2, 3, 5, 4);
        
        System.out.println(Result.larrysArray(li1));
        System.out.println(Result.larrysArray(li2));
        System.out.println(Result.larrysArray(li3));
        System.out.println(Result.larrysArray(li4));
    }
}
