package datastructures.graph;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {

    HashMap<String, ArrayList<String>> adjMap = new HashMap<>();

    public void printGraph() {
        System.out.println(adjMap);
    }


    public boolean addVertex(String vertex) {
        if (adjMap.get(vertex) == null) {
            adjMap.put(vertex, new ArrayList<String>());
            return true;
        }
        return false;
    }


    public boolean removeVertex(String vertex) {
        if (adjMap.get(vertex) == null) return false;

        for (String otherVertex: adjMap.get(vertex)) {
            adjMap.get(otherVertex).remove(vertex);
        }
        adjMap.remove(vertex);
        return true;
    }


    public boolean addEdge(String vertex1, String vertex2) {
        if (adjMap.get(vertex1) != null && adjMap.get(vertex2) != null) {
            adjMap.get(vertex1).add(vertex2);
            adjMap.get(vertex2).add(vertex1);
            return true;
        }
        return false;
    }


    public boolean removeEdge(String vertex1, String vertex2) {
        if (adjMap.get(vertex1) != null && adjMap.get(vertex2) != null) {
            adjMap.get(vertex1).remove(vertex2);
            adjMap.get(vertex2).remove(vertex1);
            return true;
        }
        return false;
    }

}
