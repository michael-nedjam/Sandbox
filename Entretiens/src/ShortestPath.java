import java.util.*;
import java.io.*;

class ShortestPath {

    static String arrive = null;
    static String debut = null;

    public static String ShortestPath(String[] strArr) {

        List<Arc> arcs = new ArrayList<>();
        int debutArcs = Integer.valueOf(strArr[0]) + 1;
        arrive = strArr[debutArcs-1];
        debut = strArr[1];

        for (int i = (debutArcs) ; i < strArr.length; i++) {
            arcs.add(new Arc(strArr[i]));
        }

        List<Arc> result = findMinPath(null, 1, arcs);

        for (Arc arc: result) {
            System.out.print(arc.toString());
        }

        return strArr[0];
    }

    public static List<Arc> findMinPath(Arc arc, int position, List<Arc> arcs){
        List<Arc> result = null;

        for (; position < arcs.size(); position++) {
            Arc currentArc = arcs.get(position);
            if((arc == null && (currentArc.getStart().compareTo(debut)==0)) || (arc != null && arc.getEnd().compareTo(currentArc.getStart())==0)){
                if(currentArc.getEnd().compareTo(arrive)==0){
                    result = new ArrayList<Arc>();
                    result.add(currentArc);
                    break;
                } else {
                    List<Arc> arcsTemp = findMinPath(currentArc, 0, arcs);
                    if(arcsTemp != null){
                        arcsTemp.add(currentArc);
                        if(result == null || arcsTemp.size() < result.size()){
                            result = arcsTemp;
                        }
                    }
                }
            }
        }

        return result;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(ShortestPath(new String[]{"5","A","B","C","D","F","B-C","A-B","A-C","C-D","D-F"}));
    }
}

class Arc {
    private String start = null;
    private String end = null;

    Arc(String arc){
        start = arc.substring(0, arc.indexOf('-'));
        end = arc.substring(arc.indexOf('-')+1);
    }

    public String getStart(){
        return this.start;
    }

    public String getEnd(){
        return this.end;
    }

    public String toString(){
        return "[" + this.start + "-" + this.end + "]";
    }
}