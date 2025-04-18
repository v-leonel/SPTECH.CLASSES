public class Node {
    private Integer info;
    private Node next;

    public Node(Integer info, Node next) {
        this.info = info;
        this.next = null;
    }

    public Integer getInfo() {
        return info;
    }

    public void setInfo(Integer info) {
        this.info = info;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
