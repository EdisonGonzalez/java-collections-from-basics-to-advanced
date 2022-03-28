package unit9GenericsInDepth.C2;

public interface IData<T> {
    // By default, public abstract
    T getData();
    void setData(T data);
}
