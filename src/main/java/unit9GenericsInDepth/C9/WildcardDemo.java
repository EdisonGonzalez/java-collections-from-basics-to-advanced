package unit9GenericsInDepth.C9;

import java.util.ArrayList;
import java.util.List;

public class WildcardDemo {
    /**
     * Question mark can be anything and this method is not generic, other way to create the similar functionality is:
     *
     *  public static <T> void displayData(List<T> l) {
     *      for (T t: l) {
     *          System.out.println(t);
     *      }
     *  }
     */
    public static void displayData(List<?> l) {
        for (Object t : l) {
            System.out.println(t);
        }
    }

    public static void displayDataWithLowerBounded(List<? super Number> l) {
        for (Object t : l) {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(57);
        displayData(list);

        /**
         * NOTE: You can use wildcard in many places where you cannot use type parameter, example while creating
         * object, you can use question mark. This question should not use single (Like ? instead of List<?>) and
         * it is also not used as a return type (public static ? void -> Error)
         */
        List<?> errorList = new ArrayList<>();
        // In the following cases all lines represent error because the question symbol does not determine what type the list is
        // "I don't know what exactly object is going to come in"
        // errorList.add("3");
        // errorList.add(34);
        // errorList.add(Integer.valueOf(2));

        // Call methods with lower wildcard
        // displayDataWithLowerBounded(list); // This is an error because Integer isn't super type of number
        List<Number> numberList = new ArrayList<>();
        displayDataWithLowerBounded(numberList);
    }
}
