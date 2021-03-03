package mars2021;

import java.io.IOException;

public class PermMissingElem {

    public int solution(int[] A) {
        int result = A.length * 2 + 1;

        for (int i = 0; i < A.length; i++){
            result = result + i - A[i];
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        PermMissingElem aPermMissingElem = new PermMissingElem();
        int[] a = {2, 3, 1, 5};
        int result = aPermMissingElem.solution(a);
        String output = String.format("result = %d", result);
        System.out.println(output);
    }
}
