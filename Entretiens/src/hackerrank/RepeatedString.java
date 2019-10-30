package hackerrank;

import java.io.IOException;
import java.util.Scanner;

public class RepeatedString {

    static long repeatedString(String s, long n) {

        long nbAInString = countA(s);
        if(nbAInString == 0)
            return 0;

        long relicat = 0;

        long nbAFound = 0;
        if(s.length() < n){
            nbAFound = (n / s.length()) * nbAInString;
            relicat =  n % s.length();
        } else {
            relicat = n;
        }
        String subS = s.substring(0, (int) (relicat));
        nbAFound+=countA(subS);

        return nbAFound;
    }

    static long countA(String s){
        return s.chars().filter(c -> c == 'a').count();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        System.out.println(result);

        scanner.close();
    }
}