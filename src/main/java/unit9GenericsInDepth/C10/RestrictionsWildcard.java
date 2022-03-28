package unit9GenericsInDepth.C10;

import java.util.ArrayList;
import java.util.List;

public class RestrictionsWildcard {
    /**
     * The wildcards providing solutions for generic type problems.
     *
     * But introduces its owm limitations
     */
    // 1 - We cannot use them as a type parameter in the class level that is in the header of the reference type declaration
    // public class Box<?> { }

    // 2 - Wildcards does not support multiple bounds
    // public class Box<T> {
    //    private list<? extends Number & Runnable> a;
    // }

    // 3 - Use for variables in arguments or fields in class getting error if you don't use bounded
    // public static void displayData(List<?> l) {
    //    l.add(25); // Does not matter what element tries to insert, getting error because it doesn't know the correct type
    //    List<?> l1 = new ArrayList<>();
    //    l1.add(25);
    // }

}
