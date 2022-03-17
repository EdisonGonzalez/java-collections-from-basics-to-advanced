package unit7LambdaAndCollectionsInDepth.C3;

interface MyFunInterface3{
    int doSomeCalculation(int a);
}


public class LambdaExample3 {

    public static void main(String[] args) {
        MyFunInterface3 i = a -> {
            int x = a + 10;
            x = x/2;
            return x;
        };
        int op= i.doSomeCalculation(100);
        System.out.println(op);
    }
}
