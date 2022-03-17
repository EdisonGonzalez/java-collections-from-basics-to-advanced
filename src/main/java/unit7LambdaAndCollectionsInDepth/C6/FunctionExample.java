package unit7LambdaAndCollectionsInDepth.C6;

import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {
        String s = "BasicsStrong";
        Function<String,Integer> fun = String::length; // String::length = str -> str.length();
        int len = fun.apply(s);
        System.out.println(len);
    }
}
