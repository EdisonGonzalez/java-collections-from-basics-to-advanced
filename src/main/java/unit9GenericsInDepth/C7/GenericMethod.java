package unit9GenericsInDepth.C7;

public class GenericMethod {
    public static <T> String concat(T data) { // It's required indicate with <T> between modifiers and return type in method
        return "Data is : " + data;
    }

    public static void main(String[] args) {
        System.out.println(concat("String"));
        System.out.println(concat(2022));
    }
}
