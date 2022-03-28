package unit7LambdaAndCollectionsInDepth.C9;

/**
 * You use lambda expressions to create anonymous methods. Sometimes, however, a lambda expression does nothing but call an existing method.
 * In those cases, it's often clearer to refer to the existing method by name. Method references enable you to do this;
 * they are compact, easy-to-read lambda expressions for methods that already have a name.
 *
 * Check official docs: https://docs.oracle.com/javase/tutorial/java/javaOO/methodreferences.html
 */
import java.util.function.BiFunction;

public class MethodReferencesExamples {

    public static <T> T mergeThings(T a, T b, BiFunction<T, T, T> merger) {
        return merger.apply(a, b);
    }

    public static String appendStrings(String a, String b) {
        return a + b;
    }

    public String appendStrings2(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {

        MethodReferencesExamples myApp = new MethodReferencesExamples();

        // Calling the method mergeThings with a lambda expression
        System.out.println(MethodReferencesExamples.
                mergeThings("Hello ", "World!", (a, b) -> a + b));

        // Reference to a static method
        System.out.println(MethodReferencesExamples.
                mergeThings("Hello ", "World!", MethodReferencesExamples::appendStrings));

        // Reference to an instance method of a particular object
        System.out.println(MethodReferencesExamples.
                mergeThings("Hello ", "World!", myApp::appendStrings2));

        // Reference to an instance method of an arbitrary object of a
        // particular type
        System.out.println(MethodReferencesExamples.
                mergeThings("Hello ", "World!", String::concat));
    }
}
