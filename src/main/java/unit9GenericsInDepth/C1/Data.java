package unit9GenericsInDepth.C1;

public class Data<T>{
    // T type parameter
    private T data;

    public Data(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "data is: " + data;
    }
}
