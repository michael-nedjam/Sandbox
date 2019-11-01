package hackerrank;

import java.io.IOException;
import java.util.Scanner;

public class NewYearChaos {

    static int minimumBribes(int[] q) {
        int commute = 0;

        for (int i = 0; i < q.length; i++) {
            int delta = Math.abs((i+1) - q[i]);
            if(delta > 2)
                return 0;
            commute+=delta;
        }

        return commute / 2;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            int r = minimumBribes(q);

            if(r == 0){
                System.out.println("Too chaotic");
            } else {
                System.out.println(r);
            }
        }



        scanner.close();
    }
}