package mars2021;

import java.io.IOException;

public class TapeEquilibrium {
    public int solution(int[] A) {
        int minDiff = Integer.MAX_VALUE;
        int[] sum = new int[A.length];

        int count = 0;
        for (int i = 0; i < A.length-1;i++){
            count+=A[i];
            sum[i]=count;
        }

        count = 0;
        for (int j = A.length-1; j > 0; j--) {
            count+=A[j];

            int diff = Math.abs(sum[j-1] - count);
            if( diff < minDiff)
                minDiff = diff;
        }

        // write your code in Java SE 8
        return minDiff;
    }

    public static void main(String[] args) throws IOException {
        TapeEquilibrium aTapeEquilibrium = new TapeEquilibrium();
        int[] a = {1, 1};
        int result = aTapeEquilibrium.solution(a);
        String output = String.format("result = %d", result);
        System.out.println(output);
    }
}
