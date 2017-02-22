import java.util.*;
import java.io.*;

class RunLength {
    public static String RunLength(String str) {

        String result = "";
        int nbConsecutiveChar = 0;
        char currentChar = ' ';
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(i == 0){
                currentChar = ch;
                nbConsecutiveChar = 1;
            } else if(currentChar == ch){
                nbConsecutiveChar++;
            } else {
                result+= String.valueOf(nbConsecutiveChar) + currentChar;
                currentChar = ch;
                nbConsecutiveChar = 1;
            }
        }

        result+= String.valueOf(nbConsecutiveChar) + currentChar;

        return result;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(RunLength(s.nextLine()));
    }

}








  