package codility;

import java.util.Arrays;

public class GenomicRangeQuery {
    public static int[] solution(String S, int[] P, int[] Q) {
        // write your code in Java SE 8
        int[] minimuns = new int[P.length];

        for (int i = 0; i < P.length; i++) {
            String shrunk = S.substring(P[i], Q[i]+1);
            char minChar = shrunk.charAt(0);
            for (int j = 1; j < shrunk.length(); j++) {
                char currentChar = shrunk.charAt(j);
                if(currentChar == 'A'){
                    minChar = 'A';
                    break;
                } else if(currentChar < minChar)
                    minChar = currentChar;
            }
            minimuns[i] = charConverter(minChar);
        }
        
        return minimuns;
    }

    private static int charConverter(char c){
        if(c == 'A') return 1;
        if(c == 'C') return 2;
        if(c == 'G') return 3;
        else return 4; // 'T'
    }

    public static void main (String[] args) {
        // write your code in Java SE 8
        int[] result = solution("CAGCCTA",
                new int[] {2,5,0},
                new int[] {4,5,6});
        Arrays.stream(result).forEach(System.out::println);
    }
}
