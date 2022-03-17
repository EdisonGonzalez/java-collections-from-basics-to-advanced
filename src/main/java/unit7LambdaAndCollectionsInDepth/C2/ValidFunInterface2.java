package unit7LambdaAndCollectionsInDepth.C2;

// This annotation check functional interface accomplishment
@FunctionalInterface
public interface ValidFunInterface2 {
    // Only one abstract method1
    void method1();

    // Default Method
    default void method2() {}

    // Static Method
    static void method3() {}
}
