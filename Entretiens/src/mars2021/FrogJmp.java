package mars2021;

import java.io.IOException;
import java.util.Random;

public class FrogJmp {

    public int solution(int X, int Y, int D) {
        int result = 0;
        int distance = Y-X;

        result = distance /D;
        if(distance % D > 0)
            result++;

        return result;
    }

    public static void main(String[] args) throws IOException {
        FrogJmp aFrogJmp = new FrogJmp();
        int x = Math.abs(new Random().nextInt());
        int y = Math.abs(new Random().nextInt());
        int d = Math.abs(new Random().nextInt());
        int result = aFrogJmp.solution(x, y, d);
        String output = String.format("x = %d, y = %d, d = %d, result = %d", x, y, d, result);
        System.out.println(output);
    }
}
