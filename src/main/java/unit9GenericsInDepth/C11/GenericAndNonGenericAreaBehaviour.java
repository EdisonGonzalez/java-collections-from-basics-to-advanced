package unit9GenericsInDepth.C11;

import java.util.ArrayList;

public class GenericAndNonGenericAreaBehaviour {
    public static void main(String[] args) {
        /**
         * First: Suppose that you create one ArrayList where you only want to allow adding strings, but the point here
         * is that the behaviour of an object depends on the location in which the object is present, i.e:
         *      1. If it's generic area, you can only be able to add elements which are of parametrized type.
         *      2. If it isn't generic area, you can add any type of elements to that object.
         */
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Basics");
        l1.add("Strong");
        // l1.add(25); // Error Integer isn't String type
        method(l1);
        System.out.println(l1);

        // Now, reverse is also true
        ArrayList l2 = new ArrayList();
        l2.add("Basics");
        l2.add("Strong");
        l2.add(10);
        // l1.add(25); // Error Integer isn't String type
        method2(l2);
        System.out.println(l2);
    }

    public static void method(ArrayList l1) {
        l1.add(10);
        l1.add("See This");
        l1.add(true);
    }

    public static void method2(ArrayList<String> l2) {
        l2.add("See This");
    }
}
