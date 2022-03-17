package unit7LambdaAndCollectionsInDepth.C2;

public class LambdaIntroduction {

    public static void main(String[] args) {
        // 1 - Previous to functional way
		/*CallFunInterface funInter = new CallFunInterface();
		funInter.funMethod();*/

        // 2 - Way for lambda
        MyFunctionalInterface funInterLambda = () -> System.out.println("FunctionalMethod");
        funInterLambda.funMethod();
    }
}

interface MyFunctionalInterface{
    void funMethod(); // By default, public abstract
}

/**
 class CallFunInterface implements MyFunctionalInterface{
	@Override
	public void funMethod() {
		System.out.println("FunctionalMethod");
	}
}
**/