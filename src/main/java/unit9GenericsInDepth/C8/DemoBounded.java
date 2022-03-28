package unit9GenericsInDepth.C8;

import java.util.Arrays;
import java.util.List;

public class DemoBounded {
    public static void main(String[] args) {
        // Two types of lists
        List<Integer> iList = Arrays.asList(2, 5, 1, 8, 9, 7);
        List<String> slist = Arrays.asList("hello", "there", "how", "are", "you");

        // Create two DataSorter objects
        DataSorter<Integer> sorter1 = new DataSorter<>(iList);
        DataSorter<String> sorter2 = new DataSorter<>(slist);

        // Execute sorter method (This contains print)
        sorter1.getSortedData();
        sorter2.getSortedData();

        /**
         * NOTE: The previous execution is successfully but what happens if you want only convert certain type of data?
         */
        List<Double> dList = Arrays.asList(2.5, 5.7, 8.5, 9.8, 4.0, 9.0);

        // In this case you need to restrict the data, check DataSorterBounded
        DataSorterBounded<Integer> dataSorterBounded1 = new DataSorterBounded<>(iList);
        DataSorterBounded<Double> dataSorterBounded2 = new DataSorterBounded<>(dList);
        // DataSorterBounded<String> dataSorterBounded3 = new DataSorterBounded<>(slist); // Create compilation error: Type parameter 'java.lang.String' is not within its bound; should extend 'java.lang.Number'

        // Execute sorter method (This contains print)
        dataSorterBounded1.getSortedData();
        dataSorterBounded2.getSortedData();

        // Bounded with interfaces
        CBound b = new CBound();
        getSortedData(b);

        IBound1 ib = new DBound();
        getSortedData2(ib);
    }

    /**
     * @param list
     * @param <T>
     *
     * In the following generic static method, we can see:
     *
     *      1. Bounded is carried out by interface.
     *      2. Use & operator for indicate multiples bounded (Only with interface)
     *          2.1. Is required that object implements all interfaces like CBound class
     */
    public static <T extends IBound1 & IBound2> void getSortedData(T list) {
    }

    public static <T extends IBound1> void getSortedData2(T list) {
    }

}

interface IBound1 {
}

interface IBound2 {
}

class CBound implements IBound1, IBound2 {
}

class DBound implements IBound1 {}