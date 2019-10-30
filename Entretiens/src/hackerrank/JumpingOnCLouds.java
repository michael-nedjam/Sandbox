package hackerrank;

import java.io.IOException;
import java.util.Scanner;

public class JumpingOnCLouds {

    static int jumpingOnClouds(int[] c) {
        int nbJumps = 0;

        if(c.length == 2)
            return 1;

        for (int i = 0; i < c.length-1;) {
            if(i+2 >= c.length || c[i+2] == 0)
                i++;
            i++;
            nbJumps++;
        }

        return nbJumps;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

        System.out.println(result);

        scanner.close();
    }
}