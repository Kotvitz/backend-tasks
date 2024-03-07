package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			List<int[]> connections = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				int a = scanner.nextInt() - 1;
				int b = scanner.nextInt() - 1;
				connections.add(new int[] { a, b });
			}

			Graph graph = new Graph(connections);
			SeparatedGraphsSolver solver = new SeparatedGraphsSolver();
			int separatedGraphsCount = solver.countSeparatedGraphs(graph);
			System.out.println(separatedGraphsCount);
			scanner.close();
		}
	}
}
