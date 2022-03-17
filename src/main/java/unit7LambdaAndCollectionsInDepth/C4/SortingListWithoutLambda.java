package unit7LambdaAndCollectionsInDepth.C4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingListWithoutLambda {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(5);
        list.add(0);
        list.add(3);
        list.add(11);
        System.out.println(list);

        // List.sort
        Collections.sort(list,(o1,o2) -> {
//            if(o1 > o2) {
//                return -1;
//            }else if(o1 < o2) {
//                return 1;
//            }else {
//                return 0;
//            }}
            return o2.compareTo(o1);
        });
        System.out.println(list);
    }
}
