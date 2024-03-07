package com.example;

import java.util.List;

public class SeparatedGraphsSolver {
    private boolean[] visited;

    public int countSeparatedGraphs(Graph graph) {
        List<List<Integer>> adjacencyList = graph.getAdjacencyList();
        visited = new boolean[adjacencyList.size()];
        int count = 0;
        for (int i = 0; i < adjacencyList.size(); i++) {
            if (!visited[i] && !adjacencyList.get(i).isEmpty()) {
                dfs(adjacencyList, i);
                count++;
            }
        }
        return count;
    }

    private void dfs(List<List<Integer>> adjacencyList, int node) {
        visited[node] = true;
        for (int neighbor : adjacencyList.get(node)) {
            if (!visited[neighbor]) {
                dfs(adjacencyList, neighbor);
            }
        }
    }
}
