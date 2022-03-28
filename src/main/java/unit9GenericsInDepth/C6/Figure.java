package unit9GenericsInDepth.C6;

import java.util.List;

public class Figure<T> {
    private List<T> listFigures;
    public Figure(List<T> fs) {
        this.listFigures = fs;
    }

    public List<T> getFigures() {
        return listFigures;
    }

    public void setFigures(List<T> fs) {
        this.listFigures = fs;
    }
}
