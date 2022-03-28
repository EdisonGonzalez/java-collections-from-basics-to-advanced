package unit9GenericsInDepth.C1;

public class DemoRequireGenerics {
    public static void main(String[] args) {
        DataWithoutGenerics d1 = new DataWithoutGenerics("This is d1");
        System.out.println(d1); // By default, toString() method is called

        try {
            DataWithoutGenericsAndObjects d2 = new DataWithoutGenericsAndObjects("10");
            System.out.println(d2); // By default, toString() method is called
            int data = (int) (d2.getData());
            System.out.println("The int value is: " + data); // Never print this error and compiler not detected thus mistake
        } catch (Exception e) {
            System.out.println("In principle the compiler does not show the error so the generic, stronger type is required. The error obtained is: " + e);
        }

        /**
         * The type of parameter T of the generic class (In class: GenericClass<T>) is the parameter that provides
         * information to the compiler of what type it should be
         */
        Data<String> d3 = new Data<>("This is d3");
        System.out.println(d3);
        Data<Integer> d4 = new Data<>(10);
        System.out.println(d4);

        // Data<String> d5 = new Data<Integer>(10); // Is not possible, compilation error
        // Data<String> d6 = new Data<>(10); // Is not possible, compilation error
    }
}