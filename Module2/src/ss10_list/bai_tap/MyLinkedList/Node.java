package ss10_list.bai_tap.MyLinkedList;

public class Node {
    private Node next ;
    private Object data ;

    public Node() {
    }

    public Node(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "next=" + next +
                ", data=" + data +
                '}';
    }
}
