package unit9GenericsInDepth.C6;

import java.util.ArrayList;
import java.util.List;

public class Subtyping {
    public static void main(String[] args) {
        // Integer is subtype of Object, It's possible assignation
        Object o = new Object();
        Integer i = 11;
        o = i; // It's possible
        System.out.println(o);

        // Add subtypes to List. Integer and double are subtypes of Number
        List<Number> list = new ArrayList<>();
        list.add(10); // Integer
        list.add(10.5); // Double
        System.out.println(list);

        // Add subtypes of objects to list
        List<Figure<Integer>> fList = new ArrayList<>();
        // Redundant List<Integer> l1 = new ArrayList<Integer>();
        fList.add(new Figure<>(List.of(1,2,3)));
        fList.add(new Rectangle<>(List.of(3,7,9,0)));
        System.out.println(fList);

        /**
         * NEXT CASES ARE ERRORS:
         *
         *      1. The generic type required be the same. (List -> ArrayList)
         *          1.1. Even IF collection represent the same types. (ArrayList -> ArrayList)
         */
        // List<Number> 11 = new ArrayList<Integer>();
        // ArrayList<Number> l2 = new ArrayList<Integer>();
    }
}
