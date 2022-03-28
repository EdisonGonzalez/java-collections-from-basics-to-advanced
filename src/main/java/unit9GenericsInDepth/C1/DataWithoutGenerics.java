package unit9GenericsInDepth.C1;

public class DataWithoutGenerics {
    private String data;

    public DataWithoutGenerics(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "data is: " + data;
    }
}
