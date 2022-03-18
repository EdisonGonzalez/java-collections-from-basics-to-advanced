package unit5MapsAndTreesInDepth.C6;

import java.util.Map;
import java.util.TreeMap;

public class ComputeMap {
    public static void main(String[] args) {
        Map<String, Integer> treemap = new TreeMap<>();

        // Ralph a new employee
        int employeeNo = 1;
        treemap.compute("Ralph",
                (s1, s2) -> (s2 == null) ? employeeNo : s2 + 1);  // Line 1

        int s2 = 3;  // Line 2

        // Anne a  new employee
        /**
         * NOTE:  local variables referenced from a lambda expression must be final or effectively final
         *            Example error:     (s1, s3) -> (s1 == null) ? employeeNo + 1 : s2++);  // Line 3
         */
        int finalS = s2;
        treemap.compute("Anne",
                (s1, s3) -> (s1 == null) ? employeeNo + 1 : finalS + 1);  // Line 3
        s2++;
        System.out.println(treemap);
    }
}
