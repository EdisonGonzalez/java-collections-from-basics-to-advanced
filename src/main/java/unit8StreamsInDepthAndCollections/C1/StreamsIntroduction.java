package unit8StreamsInDepthAndCollections.C1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsIntroduction {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        //Previous way of making changes to collections (before Java 8)
        long start1 = System.nanoTime();
        ArrayList<Integer> newList = new ArrayList<Integer>();
        for(Integer i : list) {
            if(i >= 30) {
                newList.add(i);
            }
        }
        System.out.println(newList);
        long end1 = System.nanoTime();
        System.out.println("Elapsed Time in nano seconds without streams: "+ (end1-start1));

        //Streams
        //filter
        long start2 = System.nanoTime();
        ArrayList<Integer> l1 = (ArrayList<Integer>) list.stream().filter(i -> i>=30).collect(Collectors.toList());
        System.out.println(l1);
        long end2 = System.nanoTime();
        System.out.println("Elapsed Time in nano seconds with streams: "+ (end2-start2));

        //map
        List<Integer> l2= list.stream().map( i -> i*2).collect(Collectors.toList());
        System.out.println(l2);

        //count
        long cnt = list.stream().filter(i -> i>=30).count();
        System.out.println(cnt);


        //Default Natural Sorting: sorted()
        List<Integer> l3 = list.stream().sorted().collect(Collectors.toList());
        System.out.println(l3);

        //Custom Sorting : sorted(Comparator c)
        List<Integer> l4 = list.stream().sorted((i1,i2)-> i2.compareTo(i1)).collect(Collectors.toList());
        System.out.println(l4);

        //forEach
        /**
         * Replace this code:
         * for (Integer element : list) {
         *     System.out.println(...);
         * }
         */
        list.forEach(element -> System.out.println("Print elements in forEach, element: " + element));

        // min
        Integer min = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("min: " + min);

        // max
        Integer max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("max: " + max);
    }
}
