package mars2021;

import java.io.IOException;
import java.util.Random;

public class BinaryGap {
    public int solution(int N) {
        int result = 0;
        boolean isSurroundedByOne = false;
        int nbZeroInRow = 0;
        while(N > 1){
            boolean isZero = N % 2 == 0;
            System.out.println(isZero);
            if(isZero){
                if(isSurroundedByOne)
                    nbZeroInRow++;// count Zero
                // ignore Zero
            } else {
                isSurroundedByOne = true;// indicate that representation seq is surrounded by 1
                if(nbZeroInRow > result)
                    result = nbZeroInRow; // Save zero seq
                nbZeroInRow = 0;
            }
            if(nbZeroInRow > result)
                result = nbZeroInRow; // Save zero seq
            N=N/2;
        }

        return result;
    }
    public static void main(String[] args) throws IOException {
        BinaryGap aBinaryGap = new BinaryGap();
        int N = new Random().nextInt();
        int result = aBinaryGap.solution(1041);
        String output = String.format("N = %d, result = %d", N, result);
        System.out.println(output);
    }
}
