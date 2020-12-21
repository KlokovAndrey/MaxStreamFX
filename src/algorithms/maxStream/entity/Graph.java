package algorithms.maxStream.entity;

import java.util.ArrayList;

public class Graph {
    Node root;
    ArrayList<Edge> way;
    double totalBandwight;

    public Graph(Edge[] newEdges, Node[] newNodes) {
        totalBandwight = 0;
        this.way = new ArrayList<Edge>();
        //Node 1
        this.root = new Node();
        root = newNodes[0];
        //Edge a
        root.edges.add(newEdges[0]);
        newEdges[0].prev=root;
        newEdges[0].next=newNodes[1];
        //Edge b
        root.edges.add(newEdges[1]);
        newEdges[1].prev=root;
        newEdges[1].next=newNodes[2];
        //Edge c
        newNodes[1].edges.add(newEdges[2]);
        newEdges[2].prev=newNodes[1];
        newEdges[2].next=newNodes[4];
        //Edge d
        newNodes[1].edges.add(newEdges[3]);
        newEdges[3].prev=newNodes[1];
        newEdges[3].next=newNodes[3];
        //Edge e
        newNodes[2].edges.add(newEdges[4]);
        newEdges[4].prev=newNodes[2];
        newEdges[4].next=newNodes[3];
        //Edge f
        newNodes[2].edges.add(newEdges[5]);
        newEdges[5].prev=newNodes[2];
        newEdges[5].next=newNodes[5];
        //Edge g
        newNodes[3].edges.add(newEdges[6]);
        newEdges[6].prev=newNodes[3];
        newEdges[6].next=newNodes[4];
        //Edge h
        newNodes[3].edges.add(newEdges[7]);
        newEdges[7].prev=newNodes[3];
        newEdges[7].next=newNodes[5];
        //Edge i
        newNodes[4].edges.add(newEdges[8]);
        newEdges[8].prev=newNodes[4];
        newEdges[8].next=newNodes[7];
        //Edge j
        newNodes[4].edges.add(newEdges[9]);
        newEdges[9].prev=newNodes[4];
        newEdges[9].next=newNodes[6];
        //Edge k
        newNodes[5].edges.add(newEdges[10]);
        newEdges[10].prev=newNodes[5];
        newEdges[10].next=newNodes[6];
        //Edge l
        newNodes[5].edges.add(newEdges[11]);
        newEdges[11].prev=newNodes[5];
        newEdges[11].next=newNodes[9];
        //Edge m
        newNodes[6].edges.add(newEdges[12]);
        newEdges[12].prev=newNodes[6];
        newEdges[12].next=newNodes[7];
        //Edge n
        newNodes[6].edges.add(newEdges[13]);
        newEdges[13].prev=newNodes[6];
        newEdges[13].next=newNodes[8];
        //Edge o
        newNodes[6].edges.add(newEdges[14]);
        newEdges[14].prev=newNodes[6];
        newEdges[14].next=newNodes[9];
        //end of graph
        newNodes[7].edges.add(null);
        newNodes[8].edges.add(null);
        newNodes[9].edges.add(null);

    }

    public void test(){
        Node curr = new Node();
        curr = root;

        System.out.println("a: " + curr.edges.get(0).weiht);
        curr = curr.edges.get(0).next;
        System.out.println("b: " + curr.edges.get(0).weiht);
        curr = curr.edges.get(0).next;
        System.out.println("c: " + curr.edges.get(0).weiht);

    }

    public void deleteEdge(Edge edge){
        Node node = edge.prev;
        node.edges.remove(edge);
    }

    public double minBandwidht(){
        double min=way.get(0).weiht;
        for(Edge edge: way){
            if(edge.weiht<min) min = edge.weiht;
        }
        return min;
    }

    public double algorithm(){
        Node node = new Node();
        node = this.root;
        while(true) {
            while (!node.isEnd()) {
                while (node.isDeadEnd() && node != root) {  //if
                    node = this.way.get(way.size() - 1).prev;
                    node.edges.remove(node.max());
                    this.way.remove(way.size() - 1);
                }
                if(node.isDeadEnd() && node == root) return this.totalBandwight;
                way.add(node.max());
                System.out.println(node.max().weiht);
                node = node.max().next;
            }

            double minBandwidht = this.minBandwidht();
            System.out.println("min " + minBandwidht);
            this.totalBandwight+=minBandwidht;
            node = this.root;
            for(Edge edge: way){
                edge.weiht-=minBandwidht;
                if(edge.weiht==0) deleteEdge(edge);
            }
            this.way.clear();
            if(node.isDeadEnd() && node == root) break;

        }
        return this.totalBandwight;
    }
}
