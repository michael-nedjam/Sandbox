import java.util.*;
import java.io.*;

class PrimeTime {
    public static String PrimeTime(String arg) {

        // code goes here
        int num = Integer.valueOf(arg);
        String result = "true";
        for(int i = 2; i < num; i++){
            if(num % i == 0) {
                result = "false";
                break;
            }
        }
        return result;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(PrimeTime(s.nextLine()));
    }

}








  