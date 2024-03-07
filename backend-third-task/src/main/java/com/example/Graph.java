package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
	private List<List<Integer>> adjacencyList;

	public Graph(List<int[]> connections) {
		int maxVertex = -1;
		for (int[] connection : connections) {
			maxVertex = Math.max(maxVertex, Math.max(connection[0], connection[1]));
		}
		adjacencyList = new ArrayList<>(maxVertex + 1);
		for (int i = 0; i <= maxVertex; i++) {
			adjacencyList.add(new ArrayList<>());
		}
		for (int[] connection : connections) {
			int a = connection[0];
			int b = connection[1];
			adjacencyList.get(a).add(b);
			adjacencyList.get(b).add(a);
		}
	}

	public List<List<Integer>> getAdjacencyList() {
		return adjacencyList;
	}
}
