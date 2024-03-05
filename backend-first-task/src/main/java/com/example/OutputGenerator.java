package com.example;

public class OutputGenerator {
	public static void generateOutput(int[] numbers) {
		int[] distinctElements = DistinctElementsCalculator.calculateDistinctElements(numbers);
		int min = MeasurementCalculator.findMin(numbers);
		int max = MeasurementCalculator.findMax(numbers);

		for (int num : distinctElements) {
			System.out.print(num + " ");
		}
		System.out.println("\nCount: " + numbers.length);
		System.out.println("Distinct: " + distinctElements.length);
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
	}
}
