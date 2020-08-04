package datastructure.redblacktree;

public class RBTree<T extends Comparable<T>> {
    private RBTree<T> mRoot;//根结点

    private static final  boolean RED =false;
    private static final  boolean BLACK =true;

    public class RBTNode<T extends Comparable<T>>{
        boolean color;
        T key;
        RBTNode<T> left;
        RBTNode<T> right;
        RBTNode<T> parent;

        public RBTNode(boolean color, T key, RBTNode<T> left, RBTNode<T> right, RBTNode<T> parent) {
            this.color = color;
            this.key = key;
            this.left = left;
            this.right = right;
            this.parent = parent;
        }
    }
    //左旋代码的实现
    private  void leftRotate(RBTNode<T> node){
        //设置右孩子为y
        RBTNode<T> y=node.right;
        node.right=y.left;
        if(y.left !=null){

        }


    }



}


