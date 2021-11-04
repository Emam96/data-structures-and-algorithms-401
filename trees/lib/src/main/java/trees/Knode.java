package trees;

import java.util.ArrayList;
import java.util.List;

public class Knode<T> {
    T value;
    List<Knode> children = new ArrayList<>();

    public Knode(T value) {
        this.value = value;
    }


    public List<Knode> getChildren() {
        return children;
    }

    public void addChild(Knode child) {
        this.children.add(child);
    }

}