package hackerrank;

import java.io.IOException;
import java.util.Scanner;

public class CountingValleys {

    // Complete the sockMerchant function below.
    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int altitude = 0;
        int nbValleys = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'U'){
                if(altitude == -1)
                    nbValleys++;
                altitude ++;
            } else {
                altitude --;
            }
        }

        return nbValleys;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        System.out.println(result);

        scanner.close();
    }
}