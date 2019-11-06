package codewars;

import java.util.Arrays;

public class HishestLowest {
    private static int max = 0;
    private static int min = 0;

    public static String highAndLow(String numbers) {
        // Code here or
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;

        Arrays.stream(numbers.split((" "))).forEach(c -> {
            int value = Integer.valueOf(c);
            if(value > max)
                max = value;
            if(value < min)
                min = value;
        });

        return new StringBuffer().append(max).append(" ").append(min).toString();
    }
}