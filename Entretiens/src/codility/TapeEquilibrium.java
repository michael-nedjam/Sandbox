package codility;

public class TapeEquilibrium {

    public static int solution(int[] A) {
        // write your code in Java SE 8
        int begin = 0;
        int end = 0;
        int i = 0;
        int j = A.length -1;

        while(i<=j){
            if(Math.abs((begin + A[i]) - end) <
                    Math.abs((end + A[j]) - begin) ){
                begin+=A[i];
                i++;
            } else {
                end+=A[j];
                j--;
            }
        }

        return Math.abs(begin - end);
    }

    public static void main (String[] args) {
        // write your code in Java SE 8
        int result = solution(new int[] {1000, -1000});
        System.out.println("Solution fond " + result);
    }
}