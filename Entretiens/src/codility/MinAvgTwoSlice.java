package codility;

public class MinAvgTwoSlice {

    public class Slice {
        int position;
        int nbElement;
        int value;
        double average;

        public Slice(int position, int nbElement, int value) {
            this.position = position;
            this.nbElement = nbElement;
            this.value = value;
            this.average = (double)this.value / (double)this.nbElement;
        }

        @Override
        protected Slice clone() {
            return new Slice(this.position, this.nbElement, this.value);
        }

        public void addElement(int element){
            this.nbElement++;
            this.value+=element;
            this.average = (double)this.value / (double)this.nbElement;
        }

        public int getPosition() {
            return position;
        }
        public double getAverage() {
            return average;
        }
    }

    public int solution(int[] A) {
        // write your code in Java SE 8
        Slice minSlice = new Slice(0, 2, A[0]+A[1]);
        Slice challenger = minSlice.clone();

        for (int i = 2; i < A.length; i++) {
            Slice current = new Slice(i-1, 2, A[i-1]+A[i]);
            challenger.addElement(A[i]);
            if(current.getAverage() < challenger.getAverage())
                challenger = current;
            if(challenger.getAverage() < minSlice.getAverage())
                minSlice = challenger;
        }

        return minSlice.getPosition();
    }



    public static void main (String[] args) {
        // write your code in Java SE 8
        int result = new MinAvgTwoSlice().solution(new int[] {4,2,2,5,1,5,8});
        System.out.println(result);
    }


}
