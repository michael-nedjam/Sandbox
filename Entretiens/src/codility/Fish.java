package codility;
import java.util.Arrays;

public class Fish {

    public static int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        int fishThatSurvive = 0;
        int predatorSize = -1;

        for (int i = 0; i < A.length ; i++) {
            if(B[i] == 0 && A[i] > predatorSize){
                fishThatSurvive++;
                predatorSize = -1;
            } else if(B[i] == 1 && A[i] > predatorSize)
                predatorSize = A[i];
        }

        predatorSize = -1;
        for (int i = A.length-1; i >= 0 ; i--) {
            if(B[i] == 1 && A[i] > predatorSize){
                fishThatSurvive++;
                predatorSize = -1;
            } else if(B[i] == 0 && A[i] > predatorSize)
                predatorSize = A[i];
        }

        return fishThatSurvive;
    }

    public static void main (String[] args) {
        // write your code in Java SE 8
        int result = solution(new int[]{4,3,2,1,5},
                new int[]{0,1,0,0,0});
        System.out.println("Solution fond" + result);

    }
}