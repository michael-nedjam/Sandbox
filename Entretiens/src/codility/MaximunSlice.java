package codility;

public class MaximunSlice {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int maxSum = -1000000;
        int currentSum = 0;
        for (int i = 0; i < A.length ; i++) {
            int value = A[i];
            currentSum+=value;
            if(currentSum > maxSum)
                maxSum = currentSum;
            if(currentSum < 0)
                currentSum=0;
        }
        return maxSum;
    }
}