/**
 * Using the Java language, have the function PatternChaser(str) take str which will be a string and return the longest pattern within the string. A pattern for this challenge will be defined as: if at least 2 or more adjacent characters within the string repeat at least twice. So for example "aabecaa" contains the pattern aa, on the other hand "abbbaac" doesn't contain any pattern. Your program should return yes/no pattern/null. So if str were "aabejiabkfabed" the output should be yes abe. If str were "123224" the output should return no null. The string may either contain all characters (a through z only), integers, or both. But the parameter will always be a string type. The maximum length for the string being passed in will be 20 characters. If a string for example is "aa2bbbaacbbb" the pattern is "bbb" and not "aa". You must always return the longest pattern possible.
 */

import java.util.*;
import java.io.*;

class PatternChaser {
    public static String PatternChaser(String str) {

        // code goes here
        int nbPattern = 0;
        String patternFound = null;

        for(int pos1 = 0; pos1 < str.length() - 1; pos1++){
            String pattern = str.substring(pos1, pos1+2);
            int currentNbPattern = 1;
            String remainingStr = str.substring(pos1+1);
            int pos2 = remainingStr.indexOf(pattern);
            if(pos2 >= 0 && (pos2 >= remainingStr.length() - pattern.length())){
                currentNbPattern = 2;
            } else {
                while(pos2 >= 0 && (pos2 < remainingStr.length() - pattern.length())){
                    currentNbPattern = 2;
                    while((pos2+pattern.length() < remainingStr.length()) && str.charAt(pos1+pattern.length()) == remainingStr.charAt(pos2+pattern.length())){
                        pattern+=str.charAt(pos1+pattern.length());
                        currentNbPattern = 2;
                    }
                    remainingStr = remainingStr.substring(pos2+pattern.length());
                    pos2 = remainingStr.indexOf(pattern);
                }
            }

            if(currentNbPattern >= 2 && currentNbPattern >= nbPattern ){
                if(patternFound == null || patternFound.length() < pattern.length()){
                    patternFound = pattern;
                    nbPattern = currentNbPattern;
                }
            }
        }

        return nbPattern >= 2? "yes " + patternFound: "no null";
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(PatternChaser(s.nextLine()));
    }
}








