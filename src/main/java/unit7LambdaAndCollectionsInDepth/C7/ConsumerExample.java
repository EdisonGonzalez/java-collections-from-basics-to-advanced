package unit7LambdaAndCollectionsInDepth.C7;

import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        Consumer<String> c = System.out::println; // s -> System.out.println(s) = System.out::println
        c.accept("Consumer");
    }
}
