package day14.homework;


import java.util.HashMap;
import java.util.Map;

/**
 * @author Yang Song
 * @date 2022/8/4 18:10
 */
public class LRUCache {
    private static class Node {
        int key;
        int value;
        Node pre;
        Node next;
        public Node(int key,int value) {
            this.key = key;
            this.value = value;
        }
        public Node(Node pre,int key,int value, Node next) {
            this.key = key;
            this.value = value;
            this.pre = pre;
            this.next = next;
        }
    }
    public LRUCache(int initialCapacity){
        this.initialCapacity = initialCapacity;
        head = new Node(-1,-1);
        tail = new Node(-1,-1);
        head.next = tail;
        tail.pre = head;
    }
    public LRUCache(){
        this(10);
    }
    private final Node head , tail;
    /**
     * 缓存容量
     */
    private int initialCapacity;
    /**
     * 节点数量
     */
    private int size = 0;
    Map<Integer,Node> nodeMap = new HashMap<>(initialCapacity);
    public void put(int key,int value) {
        // 如果key存在，则更新其值 ,位置不动
        if (nodeMap.containsKey(key)) {
            Node oldFirst = nodeMap.get(key);
            oldFirst.value = value;
        }else {
            // 如果key不存在，则创建一个新的节点 并将其添加到链表头部
            Node newFirst = new Node(key,value);
            nodeMap.put(key,newFirst);
            size++;
            moveToHead(newFirst);
        }
    }
    public int get(int key) {
        // 如果key存在，则将其移动到链表头部，并返回其值
        if(nodeMap.containsKey(key)){
            Node newFirst = nodeMap.get(key);
            // 将newFirst移动到链表头部
            moveToHead(newFirst);
            return newFirst.value;
        }
        return -1;
    }

    /**
     * 将node移动到链表头部
     * @param newFirst 新节点
     */
    private void moveToHead(Node newFirst) {
        Node oldFirst = head.next;
        // 如果newFirst是链表的第一个节点，则不需要再移动
        if (newFirst == oldFirst)  return;
        // 如果newFirst是链表中原有的节点，需要将其前驱的后继指向newFirst的后继 ，并将newFirst的后继的前驱指向newFirst的前驱
        if(newFirst.next != null) {
            newFirst.next.pre = newFirst.pre;
            newFirst.pre.next = newFirst.next;
        }
        oldFirst.pre = newFirst;
        newFirst.next = oldFirst;
        head.next = newFirst;
        newFirst.pre = head;

        // 如果链表中的节点数量超过了缓存容量，则删除链表尾部的节点
        if (size > initialCapacity) {
            Node lastNode = tail.pre;
            lastNode.pre.next = tail;
            tail.pre = lastNode.pre;
            nodeMap.remove(lastNode.key);
            size--;
        }
    }
}
