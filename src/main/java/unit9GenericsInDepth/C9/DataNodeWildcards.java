package unit9GenericsInDepth.C9;


public class DataNodeWildcards<E> {
    private E data;
    private DataNodeWildcards<? extends Number> next; // Applying upper bounded wildcard

    /**
     *
     * In all DataNodeWildcard you can use the wildcard unbounded (Only question mark)
     * But in the most common uses is better use with bounded, remember ? symbol indicate anything type
     *
     */

    public DataNodeWildcards(E data, DataNodeWildcards<? extends Number> next) {
        this.data = data;
        this.next = next;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public DataNodeWildcards<? extends Number> getNext() {
        return next;
    }

    public void setNext(DataNodeWildcards<? extends Number> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "DataNodeWildcards{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}

