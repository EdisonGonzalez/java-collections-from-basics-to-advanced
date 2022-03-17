package unit7LambdaAndCollectionsInDepth.C5;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        int salary = 5000;
        Predicate<Integer> p = i -> i>=4000;
        boolean result = p.test(salary);
        System.out.println(result);
    }
}
