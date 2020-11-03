package leecode.Tree;

public class Node {
    int data;
    Node leftChild;
    Node rightChild;
    boolean isDeleted;

    public Node(int data){
        this.data = data;
    }

    public void display(){
        System.out.println(this.data);
    }

}
