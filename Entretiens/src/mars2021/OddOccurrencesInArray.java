package mars2021;

import java.io.IOException;

public class OddOccurrencesInArray {
    public int solution(int[] A) {
        int result = 0;

        boolean[] unpaired = new boolean[1000000];
        for (int value:A) {
            if (unpaired[value]){
                unpaired[value] = false;
                result -= value;
            } else {
                unpaired[value] = true;
                result+=value;
            }
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        OddOccurrencesInArray aOddOccurrencesInArray = new OddOccurrencesInArray();
        int[] a = {9, 3, 9, 3, 9, 7, 9};
        int result = aOddOccurrencesInArray.solution(a);
        String output = String.format("result = %d", result);
        System.out.println(output);
    }
}
