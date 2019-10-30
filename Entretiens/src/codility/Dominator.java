package codility;

import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Dominator {

    public static int solution(int[] A) {

        if(A.length == 1)
            return 0;

        // write your code in Java SE 8
        AtomicInteger result = new AtomicInteger();
        result.set(-1);
        int majority = A.length / 2;
        SortedMap<Integer, Integer> counters = new TreeMap<>();

        for (int i = 0; i < A.length; i++) {
            int value = A[i];

            Integer counter;
            if ((counter = counters.get(value)) != null) {
                counter++;
                if(counter > majority) { // dominator found
                    result.set(i);
                    break;
                } else if(i - counter <= majority) { // element can be an dominator ?
                    counters.put(value, counter);
                } else { // element cannot be an dominator
                    counters.remove(value);
                }
            } else if(i <= majority) {  //  // element can be an dominator ?
                counters.put(value, 1);
            }
        }

        return result.intValue();
    }

    public static void main (String[] args) {
        // write your code in Java SE 8
        int result = solution(new int[] {3,4,3,2,3,-1,4,3,3});
        System.out.println("Solution fond " + result);

    }
}