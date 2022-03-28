package unit9GenericsInDepth.C8;

import java.util.List;

public class DataSorterBounded<T extends Number> {
    private List<T> list;

    public DataSorterBounded(List<T> list) {
        this.list = list;
    }

    public void getSortedData() {
        System.out.println("\n" + "------------------ Start ------------------ ");
        list.sort(null);
        for (T t : list) {
            System.out.println(t);
        }
        System.out.println("------------------- End ------------------- ");
    }
}
