package src.DSA.GRAPH;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SampleInputGraph {
    public static void main(String[] args) {

        // Undirected graph
        int n = 5;
        int e = 6;
        Scanner sc = new Scanner(System.in);


        List<List<Integer>> abc = new ArrayList<>();

        for (int i = 1; i <= n + 1; i++) {
            abc.add(new ArrayList<>());

        }
        for (int i = 1; i <= e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            abc.get(u).add(v);
            abc.get(v).add(u);  // remove this from undirected grpah

        }
        undrectedWeightedGrpah();

    }

    public static void undrectedWeightedGrpah() {

        int nodes = 5;
        int edges = 6;

        List<List<Edge>> inputGraph = new ArrayList<>();
        Scanner sc = new Scanner(System.in);


        for (int i = 1; i < nodes + 1; i++) {
            inputGraph.add(new ArrayList<>());
        }

        for (int i = 1; i < edges + 1; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int wt = sc.nextInt();

            inputGraph.get(u).add(new Edge(v, wt));
            inputGraph.get(v).add(new Edge(u, wt));

        }

    }

    static class Edge {
        int destination;
        int weight;

        Edge(int destination, int weight) {
            this.destination = destination;
            this.weight = weight;
        }
    }


}
