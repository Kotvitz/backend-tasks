package com.example;

import java.util.Arrays;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter the list of integers separated by spaces: ");
			String input = scanner.nextLine();

			String[] strNumbers = input.split("\\s+");
			int[] numbers = Arrays.stream(strNumbers).mapToInt(Integer::parseInt).toArray();
			
			PairFinder.findPairsSummingToTarget(numbers, 13);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
