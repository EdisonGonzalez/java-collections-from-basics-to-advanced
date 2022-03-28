package unit9GenericsInDepth.C3;

import java.util.ArrayList;

public class CollectionDemo {
    public static void main(String[] args) {
        /**
         * generics?
         *      type checking at compile time
         *
         * why?
         * //benefits
         *      1. Stronger Type checks
         *      2. type safety
         *      3. Elimination of casts
         *      4. code re-usability
         *
         *      NOTE: Collection Framework -Type Safety
         */
        // Example require casting and error and compile error not detected
        ArrayList multiTypeList = new ArrayList();
        multiTypeList.add("John");
        multiTypeList.add(1);
        for (Object object : multiTypeList) {
            try {
                String str = (String) object;
            } catch (Exception e) {
                System.out.println("Exception occurred in casting, exception: " + e + "\n");
            }
        }

        // Solve previous error with stronger type and avoid casting operation WITH GENERICS
        ArrayList<String> compileList = new ArrayList<>(); // Elements in ArrayList are String Type
        compileList.add("John");
        //compileList.add(1); // This line produces a compile error
        for (String object : compileList) { // Elements in ArrayList are String Type
            String str = object; // Non-require casting
            System.out.println("Element in compileTest: " + str);
        }
    }
}
