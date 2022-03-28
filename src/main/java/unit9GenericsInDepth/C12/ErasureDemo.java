package unit9GenericsInDepth.C12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ErasureDemo {
    public static void main(String[] args) {
        // It's possible indicate raw on left side (That is the type for l1 variable)
        // On the right side unnecessary notation is only for constructor
        ArrayList l1 = new ArrayList<String>();
        l1.add(1);
        l1.add("Hello");
        l1.add(true);
        System.out.println(l1);

        try {
            System.out.println(method1(10)); // The error is allowed, because type parameter is only information for compile but in JVM does not exist
        } catch (Exception e) {
            System.out.println("Message error" + e);
        }
    }

    public static String method1(Integer i) {
        List<String> a = new LinkedList<String>();
        List b = a;
        b.add(i);
        return a.iterator().next();
    }

    /**
     * Method overloading with parameter type change is not allowed.
     */
    //public static void method2(List<String> l) {}
    //public static void method2(List<Integer> l) {}

}
