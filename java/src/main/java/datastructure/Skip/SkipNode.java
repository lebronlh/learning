package datastructure.Skip;

public class SkipNode<T> {
    int key;
    T value;
    SkipNode right,down;

    public SkipNode(int key, T value) {
        this.key = key;
        this.value = value;
    }
}
