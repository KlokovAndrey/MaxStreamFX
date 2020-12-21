package algorithms.maxStream;

import algorithms.maxStream.entity.Edge;
import algorithms.maxStream.entity.Graph;
import algorithms.maxStream.entity.Node;

public class testAlgorithm {
    public static void main(String[] args) {
        double a=40, b=30, c=15, d=20, e=18, f=17, g=22, h=14, i=10, j=15, k=7, l=16, m=8, n=7, o=11;
        Edge[] edges = {new Edge(a), new Edge(b), new Edge(c), new Edge(d), new Edge(e), new Edge(f),
                new Edge(g), new Edge(h), new Edge(i), new Edge(j), new Edge(k), new Edge(l), new Edge(m), new Edge(n),
                new Edge(o)};
        Node[] nodes = {new Node(), new Node(), new Node(), new Node(), new Node(), new Node(), new Node(), new Node(),
                new Node(), new Node()};




        Graph graph = new Graph(edges, nodes);
        //System.out.println(graph.root.edges.get(0).next.edges.get(1).next.edges.get(0).weiht);
        //graph.test();
        System.out.println(graph.algorithm());
    }
}
