package leecode.Tree;

public class BinaryTree implements Tree {
    //表示根节点
    private Node root;

    @Override
    public Node find(int key) {
        Node current = root;
        while (root!=null){
            if(current.data<key)//当前值小，找右子树
                current = current.rightChild;
            else if (current.data>key)//当前值大，找左子树
                current = current.leftChild;
            else
                return current;
        }
        return null;//树为空
    }

    @Override
    public boolean insert(int data) {
        Node newNode = new Node(data);
        if(root == null){//空树，直接插入结点为根节点
            root = newNode;
            return true;
        }else{
            Node current = root;
            //插入结点比当前结点小，与当前结点左节点比较，如果左节点为空，则插入
            //插入结点比当前结点大，与当前结点右节点比较，如果右节点为空，插入。
           while (current!=null) {
               if (data < current.data) {
                   current = current.leftChild;
                   if (current == null) {
                       current = newNode;
                       return true;
                   }
               }else{
                   current=current.rightChild;
                   if (current == null) {
                       current = newNode;
                       return true;
                   }
               }
           }
        }
        return false;
    }

    /**
     * 中序遍历
     * @param current
     */
    @Override
    public void infixOrder(Node current) {
        System.out.println(current.data);
        infixOrder(current.leftChild);
        infixOrder(current.rightChild);
    }

    /**
     * 前序遍历
     * @param current
     */
    @Override
    public void preOrder(Node current) {
        infixOrder(current.leftChild);
        System.out.println(current.data);
        infixOrder(current.rightChild);
    }

    /**
     * 后序遍历
     * @param current
     */
    @Override
    public void postOrder(Node current) {
        infixOrder(current.leftChild);
        infixOrder(current.rightChild);
        System.out.println(current.data);
    }

    /**
     * 寻找最大值
     * @return
     */
    @Override
    public Node findMax() {
        Node current = root;
        Node maxNode = current;
        while (current!=null){
                maxNode =current;
               current = current.rightChild;
        }
        return maxNode;
    }

    @Override
    public Node findMin() {
        return null;
    }

    @Override
    public boolean delete(int key) {
        return false;
    }
}
