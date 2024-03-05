package com.example;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter the list of integers separated by spaces: ");
			String input = scanner.nextLine();

			String[] inputArray = input.split(" ");
			int[] numbers = new int[inputArray.length];
			for (int i = 0; i < inputArray.length; i++) {
				numbers[i] = Integer.parseInt(inputArray[i]);
			}

			OutputGenerator.generateOutput(numbers);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
