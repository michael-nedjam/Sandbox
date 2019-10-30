package codility;

import javafx.collections.transformation.SortedList;

import java.util.SortedSet;
import java.util.TreeSet;

public class OddOccurrencesInArray {

    public static int solution(int[] A) {
        // write your code in Java SE 8
        SortedSet<Integer> added = new TreeSet();
        for (int i = 0; i < A.length; i++) {
            if(added.contains(A[i])){
                added.remove(Integer.valueOf(A[i]));
            } else {
                added.add(A[i]);
            }
        }

        return added.first();
    }

/*
    public static int solution(int[] A) {
        int result = 0;
        // write your code in Java SE 8
        boolean[] values = new boolean[1000000000];
        for (int i = 0; i < A.length; i++) {
            if (values[A[i]]) {
                values[A[i]] = false;
                result-=A[i];
            } else {
                values[A[i]] = true;
                result+=A[i];
            }
        }

        return result;
    }
*/

    public static void main (String[] args) {
        // write your code in Java SE 8
        int result = solution(new int[] {9,1,2,1,2,7,9});
        System.out.println("Solution fond " + result);

    }
}