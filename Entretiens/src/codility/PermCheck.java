package codility;

public class PermCheck {
    public static int solution(int[] A) {
        // write your code in Java SE 8
        boolean[] dejaVue = new boolean[A.length + 1];
        int isPermutation = 1;

        for (int i = 0; i < A.length; i++) {
            int value = A[i];
            boolean tooBigValue = value > A.length;
            if(tooBigValue || dejaVue[value]){
                isPermutation = 0;
                break;
            }
            dejaVue[value] = true;
        }

        return isPermutation;
    }

    public static void main (String[] args) {
        // write your code in Java SE 8
        int result = solution(new int[] {4,1,3,2});
        System.out.println("Solution fond" + result);

    }
}
