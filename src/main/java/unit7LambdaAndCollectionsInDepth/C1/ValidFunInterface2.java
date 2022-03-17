package unit7LambdaAndCollectionsInDepth.C1;

public interface ValidFunInterface2 {

    void method1();

    // Default Method - any amount of this method type is allowed
    default void method2() {
    }

    // Static Method - any amount of this method type is allowedk
    static void method3() {
    }
}
