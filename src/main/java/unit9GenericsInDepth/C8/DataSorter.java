package unit9GenericsInDepth.C8;

import java.util.List;

public class DataSorter<T> {
    private List<T> list;

    public DataSorter(List<T> list) {
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
