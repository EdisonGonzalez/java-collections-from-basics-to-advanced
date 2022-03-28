package unit9GenericsInDepth.C4;

import java.util.List;

public class RawTypeDemo {
    public static void main(String[] args) {
        Box<Integer> genBox = new Box<>(List.of(1, 2, 3));
        System.out.println("----------- Using Generics --------------");
        for (Integer integer : genBox.getA()) {
            System.out.println(integer);
        }
        System.out.println("---------------- End --------------------" + "\n");

        /**
         * Raw Type:
         *
         *      1. You be able to add any data type to the list and not getting error for that (No restrict me to single type)
         *      2. Just getting a warning for a short time:
         *          2.1. Raw type exists (Java 1.5 version) to maintain compatibility with older versions of Java
         *          2.2. Raw type should be used when we have only one data type in our collection, since raw type is
         *          NOT TYPE SAFE, and we can get runtime errors because they were not seen in the compilation
         */
        Box rawBox = new Box(List.of(1, 2, "basicsStrong")); // Warning for Raw Type in this line
        System.out.println("---------- Using Raw Types --------------");
        for (Object obj : rawBox.getA()) {
            System.out.println(obj);
        }
        System.out.println("---------------- End --------------------" + "\n");
        // NOTE: In this case does not exist any error because only use println on objects, maybe with casting have ClassCastException for example
    }
}
