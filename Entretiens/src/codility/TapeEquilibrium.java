package codility;

public class TapeEquilibrium {

    public static int solution(int[] H) {
        // write your code in Java SE 8
        int begin = 0;
        int end = 0;
        int i = 0;
        int j = H.length -1;

        while(i<=j){
            if(Math.abs((begin + H[i]) - end) <=
                    Math.abs((end + H[j]) - begin) ){
                begin+=H[i];
                i++;
            } else {
                end+=H[j];
                j--;
            }
        }

        return Math.abs(begin - end);
    }

    public static void main (String[] args) {
        // write your code in Java SE 8
        int result = solution(new int[] {3,1,2,4,3});
        System.out.println("Solution fond " + result);
    }
}