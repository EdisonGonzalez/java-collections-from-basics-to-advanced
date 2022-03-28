package unit9GenericsInDepth.C2;

public class Demo {
    public static void main(String[] args) {
        IData<String> data1 = new Data<>("We have implemented generic");
        System.out.println(data1.getData());

        // Subclassing
        Data<String> data2 = new Data<>("Data 2");
        BaseData<String> baseData1 = data2;
        System.out.println(baseData1);
    }
}
