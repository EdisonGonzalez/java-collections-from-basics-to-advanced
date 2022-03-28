package unit9GenericsInDepth.C6;

import java.util.List;

public class Rectangle<T> extends Figure<T> { //Its required that the same subtype type
    public Rectangle(List<T> fs) {
        super(fs);
    }
}
