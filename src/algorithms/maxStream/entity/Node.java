package algorithms.maxStream.entity;


import java.util.ArrayList;

public class Node {
    ArrayList<Edge> edges;

    public Node(ArrayList<Edge> edges) {
        this.edges = edges;
    }

    public Node() {
        this.edges = new ArrayList<Edge>();
    }

    public Edge max(){
        Edge maxEdge = edges.get(0);
        double max = edges.get(0).weiht;
        for(Edge edge: edges){
            if(max<edge.weiht){
                max=edge.weiht;
                maxEdge=edge;
            }
        }
        return maxEdge;
    }

    public boolean isEnd(){
        boolean flag = false;
        for(Edge edge: edges){
            if(edge == null) return true;
        }
        return false;
    }

    public boolean isDeadEnd(){
        boolean flag = true;
        for(Edge edge: edges){
            if(edge.weiht != 0) return false;
        }
        return true;
    }


}
