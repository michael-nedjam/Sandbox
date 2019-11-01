package codility;

public class PassingCars {
    public static int solution(int[] A) {
        // write your code in Java SE 8
        int pair = 0;
        int pairable = 0;
        for (int i = 0; i < A.length; i++) {
            if(A[i] == 0){
                pairable++;
            } else{
                pair+=pairable;
            }
            if(pair > 1000000000)
                return -1;
        }

        return pair;
    }

    public static void main (String[] args) {
        // write your code in Java SE 8
        int result = solution(new int[] {0,1,0,1,1});
        System.out.println("Solution fond " + result);
    }
}
