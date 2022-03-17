package unit7LambdaAndCollectionsInDepth.C3;

interface MyFunInterface{
    void funMethodAdd(int a, int b);
}

public class LambdaExample1 {

    public static void main(String[] args) {
        MyFunInterface funInter = (a,b) -> System.out.println("The sum of a and b is: "+(a+b));
        funInter.funMethodAdd(10,20);
    }
}
