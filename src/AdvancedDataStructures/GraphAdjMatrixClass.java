package AdvancedDataStructures;

import java.util.List;

public class GraphAdjMatrixClass extends  Graph{
    private int[][] adj;
    public static void main(String[] args) {

    }
    public void implementaddEdge(int v, int w){
        adj[v][w]=1;
    }

    @Override
    public void implementaddVertex() {

    }

    @Override
    public List<Integer> getNeighbors(int v) {
        return null;
    }
}
