public class BinaryGap {

    public static int solution(int N) {
        int maxGap = 0;
        int currentGap = 0;
        boolean isGap = false;

        int currentValue = N;
        while(currentValue >= 1){
            if(currentValue % 2 == 0){
                if(isGap)
                    currentGap++;
            }else{
                if(isGap){
                    if(currentGap > maxGap)
                        maxGap = currentGap;
                    currentGap = 0;
                }
                isGap = true;
                currentValue-=1;
            }
            currentValue/=2;
        }
        return maxGap;
    }

    public static void main (String[] args) {
        // write your code in Java SE 8
        int result = solution(1311060);
        System.out.println("Solution fond" + result);

    }
}