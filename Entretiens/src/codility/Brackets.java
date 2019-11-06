package codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Brackets {

    public int solution(String S) {
        // write your code in Java SE 8
        Stack<Integer> openedBrackets = new Stack<>();

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if(isOpener(c)){
                openedBrackets.add((int) c);
            } else if(openedBrackets.isEmpty() || !isCoherentPair((char) (int) openedBrackets.pop(), c))
                return  0;
        }

        return openedBrackets.isEmpty()? 1 : 0;
    }

    private boolean isCoherentPair(char opener, char closer){
        return (opener == '{' && closer == '}') ||
                (opener == '(' && closer == ')')||
                (opener == '[' && closer == ']') ;
    }

    private boolean isOpener(char c){
        return c == '{' || c == '(' || c =='[';
    }

    public static void main (String[] args) {
        // write your code in Java SE 8
        int result = new Brackets().solution("{[()()]}");
        System.out.println("Solution fond " + result);

    }
}