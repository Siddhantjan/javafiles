package AdvancedDataStructures;

import java.util.List;

public abstract class Graph {

    private int noOfNodes;
    private int noOfEdges;
    public Graph(){
        noOfEdges =0;
        noOfNodes=0;
    }

    public int getNoOfNodes() {
        return noOfNodes;
    }

    public int getNoOfEdges() {
        return noOfEdges;
    }

public void  addVertex(){
        implementaddVertex();
        noOfNodes++;
}

    public abstract void implementaddVertex();
    public abstract List<Integer> getNeighbors(int v);


}
