package mars2021;

import java.io.IOException;

public class CyclicRotation {
    public int[] solution(int[] A, int K) {
        int[] result = new int[A.length];

        if(A.length == 0){
            result = A;
        } else {
            K = K % A.length;

            if(K == 0){
                result = A;
            } else {
                for(int i = 0; i+K < A.length;i++)
                    result[K+i] = A[i];
                for(int i = A.length-K; i < A.length; i++)
                    result[i + K - A.length] = A[i];
            }
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        CyclicRotation aCyclicRotation = new CyclicRotation();
        int[] a = {};
        int k = 3;
        int[] result = aCyclicRotation.solution(a, k);
        String output = String.format("k = %d, result = ", k);
        for (int v: result) {
            output+=v + ", ";
        }
        System.out.println(output);
    }
}
