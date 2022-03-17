package unit8StreamsInDepthAndCollections.C1;

import java.util.ArrayList;
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

        //Streams
        //filter
        List<Integer> l1 = list.stream().filter(i -> i>=30).collect(Collectors.toList());
        System.out.println(l1);

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

        //forEach,min,max
    }
}
