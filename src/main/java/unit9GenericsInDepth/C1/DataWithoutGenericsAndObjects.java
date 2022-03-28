package unit9GenericsInDepth.C1;

public class DataWithoutGenericsAndObjects {
    private Object data;

    public DataWithoutGenericsAndObjects(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "data is: " + data;
    }
}
