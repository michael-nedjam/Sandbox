package mars2021;

import java.io.IOException;

public class FrogRiverOne {

    public int solution(int X, int[] A) {
        int result = -1;
        boolean[] positionOk = new boolean[X+1];
        int jumpRemaining = X;

        int i = 0;
        for (; i < A.length && jumpRemaining > 0; i++) {
            if(A[i] > X)
                continue;
            if(!positionOk[A[i]]){
                jumpRemaining--;
                positionOk[A[i]] = true;
            }
        }

        if(jumpRemaining > 0)
            result = -1;
        else
            result = i - 1;

        return result;
    }

    public static void main(String[] args) throws IOException {
        FrogRiverOne aFrogRiverOne = new FrogRiverOne();
        int[] a = {1, 3, 1, 4, 2, 3, 5, 4};
        int x = 4;
        int result = aFrogRiverOne.solution(x, a);
        String output = String.format("result = %d", result);
        System.out.println(output);
    }
}
