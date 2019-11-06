package codility;

public class MaxProfit {
    public static int solution(int[] A) {
        // write your code in Java SE 8
        int profit = 0;
        Integer buyPrice = null;

        for (int i = 0; i < A.length; i++) {
            int dayPrice = A[i];
            if(buyPrice == null){
                buyPrice = dayPrice;
            } else {
                int dayProfit = dayPrice - buyPrice;
                if(dayProfit > profit){
                    profit = dayProfit;
                } else if(dayPrice < buyPrice)
                    buyPrice = dayPrice;
            }
        }
        
        return profit;
    }
}
