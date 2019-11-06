package codility;

import java.util.*;

public class Peaks {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int nbBlocks = 0;

        if(A.length >= 3){
            SortedMap<Integer, Integer> potentielDivisor = new TreeMap<>();

            for (int i = 1; i < A.length/2; i++) {
                if(A.length % i == 0)
                    potentielDivisor.put(i, 0);
            }

            for (int i = 1; i < A.length - 2 ; i++) {
                if(A[i-1] < A[i] && A[i] > A[i+1]){
                    List<Integer> keyToRemove = new ArrayList<>();
                    for (Map.Entry<Integer, Integer> entry : potentielDivisor.entrySet()){
                        int gap = i + 1 - entry.getValue();
                        if(gap > entry.getKey()){
                            keyToRemove.add(entry.getKey());
                            if(potentielDivisor.size() == 0)
                                return 0;
                        } else if(gap > 0){
                            entry.setValue(entry.getValue() + entry.getKey());
                        }
                    }
                    keyToRemove.forEach(key -> potentielDivisor.remove(key));
                }
            }
            nbBlocks = A.length / potentielDivisor.firstKey();
        }

        return nbBlocks;
    }
}
