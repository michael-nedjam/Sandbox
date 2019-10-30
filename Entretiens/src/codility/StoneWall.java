package codility;

import java.util.Stack;

public class StoneWall {

    public static int solution(int[] H) {
        // write your code in Java SE 8
        Stack<Integer> previousBlock = new Stack<>();
        previousBlock.add(H[0]);
        int nbBlock = 0;

        for (int i = 1; i < H.length; i++) {
            int value = H[i];
            Integer previousValue = previousBlock.peek();
            if(previousValue < value){
                previousBlock.add(value);
            } else if(previousValue > value){
                while(!previousBlock.empty() && previousBlock.peek() > value){
                    previousBlock.pop();
                    nbBlock++;
                }
                if(previousBlock.empty() || previousBlock.peek() < value) // == is skipped
                    previousBlock.add(value);
            }
        }
        
        return previousBlock.size() + nbBlock;
    }

    public static void main (String[] args) {
        // write your code in Java SE 8
        int result = solution(new int[] {8,8,5,7,9,8,7,4,8});
        System.out.println("Solution fond " + result);
    }
}