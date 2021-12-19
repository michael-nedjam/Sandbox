package hackerrank.mathematics.findpoint;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;

public class FindPoint {

    /*
     * Complete the 'findPoint' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER px
     *  2. INTEGER py
     *  3. INTEGER qx
     *  4. INTEGER qy
     */

    /**
     * Get next Value of series of 2 values
     * @param from start value
     * @param to Second and last value of the serie
     * @return the next value of the serie
     */
    private static Integer getNextValueOfSeries(int from, int to){
        int diff = Math.abs(from - to);
        return from > to ? to - diff : to + diff;
    }

    public static List<Integer> findPoint(int px, int py, int qx, int qy) {
        List<Integer> reflexionPoint = new ArrayList<Integer>();
        reflexionPoint.add(getNextValueOfSeries(px, qx));
        reflexionPoint.add(getNextValueOfSeries(py, qy));
        return reflexionPoint;
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, n).forEach(nItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int px = Integer.parseInt(firstMultipleInput[0]);

                int py = Integer.parseInt(firstMultipleInput[1]);

                int qx = Integer.parseInt(firstMultipleInput[2]);

                int qy = Integer.parseInt(firstMultipleInput[3]);

                List<Integer> result = FindPoint.findPoint(px, py, qx, qy);

                bufferedWriter.write(
                        result.stream()
                                .map(Object::toString)
                                .collect(joining(" "))
                                + "\n"
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
