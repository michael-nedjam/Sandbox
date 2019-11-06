package codewars;

public class BitCounting {

    public static int countBits(int n){
        // Show me the code!
        int result = 0;

        while(n > 0){
            if(n % 2 == 1){
                result++;
                n--;
            }
            n/=2;
        }

        return result;
    }
}