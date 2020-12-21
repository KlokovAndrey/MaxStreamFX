package algorithms.maxStream.entity;

public class Edge {
    double weiht;
    Node prev;
    Node next;

    public Edge(double weiht, Node prev, Node next) {
        this.weiht = weiht;
        this.prev = prev;
        this.next = next;
    }

    public Edge(double weiht) {
        this.weiht = weiht;
        this.prev = new Node();
        this.next = new Node();
    }
}
