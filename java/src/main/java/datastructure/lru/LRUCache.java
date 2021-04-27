package datastructure.lru;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    /**
     * 双向链表+Hashmap
     * 实现的功能：
     * 1、新数据插入：放到链表前面
     * 2、有缓存数据被命中，将该数据放到链表前面
     * 3、如果链表满了则从链表后面删除数据
     */
    class Node{
        String key;
        int val;
        Node prev;
        Node after;

        public Node(String key, int val) {
            this.key = key;
            this.val = val;
        }

        public Node() {
        }
    }

    private Map<String,Node> map;
    private int capacity;
    //保存链表的头结点
    //保存链表的尾节点
    private Node head;
    private Node tail;

    public LRUCache(Map<String, Node> map, int capacity) {
        this.map = new HashMap<>(capacity);
        this.capacity = capacity;
    }



    //获取元素
    public int get(String key){
        Node node = map.get(key);
        if(node==null)
            return -1;
        else{
            moveToHead(node);
            return node.val;
        }



    }

    //移动节点变成头结点，原来的头结点后移
    private void moveToHead(Node node) {
        if(node==head)
            return;

        if(node==tail){
            tail = tail.prev;
            tail.after=null;
        }else {
            node.after=node.prev.after;
            node.prev=node.after.prev;
        }
        node.after = head;
        head = node;
        head.prev=null;
    }


    //添加元素
    public void put(String key,int val){
        //判断元素个数是否大于capacity
        if(map.size()>=capacity){
            //删除链表末尾的元素
            map.remove(tail.key);
            tail = tail.prev;
        }
        Node cur = new Node(key,val);
        if(head!=null){
            Node node = map.get(key);
            if(node!=null){
                moveToHead(cur);
            }else{
                addToHead(cur);
            }
            map.put(key,cur);
        }else{
            //第一次添加，直接到头结点和尾节点
            head = cur;
            tail =cur;
        }
        map.put(key,cur);
    }

    private void addToHead(Node cur) {
    }

}
