package codility;

public class Triangle {

    public static int solution(int[] A) {
        // write your code in Java SE 8

        if(A.length<3)
            return 0;

        for (int p = 0; p < A.length-2; p++) {
            for (int q = p + 1; q < A.length-1; q++) {
                for (int r = q + 1; r < A.length; r++) {
                    if(A[p] + A[q] > A[r] &&
                            A[q] + A[r] > A[p] &&
                            A[r] + A[p] > A[q])
                        return 1;
                }
            }
        }

        return 0;
    }

    public static void main (String[] args) {
        // write your code in Java SE 8
        int result = solution(new int[] {10,2,5,1,8,20});
        System.out.println("Solution fond " + result);

        result = solution(new int[] {10,50,5,1});
        System.out.println("Solution fond " + result);

    }
}