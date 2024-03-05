package com.example;

import java.util.Arrays;

public class DistinctElementsCalculator {
	public static int[] calculateDistinctElements(int[] numbers) {
		Arrays.sort(numbers);

		int distinctCount = 0;
		for (int i = 0; i < numbers.length - 1; i++) {
			if (numbers[i] != numbers[i + 1]) {
				distinctCount++;
			}
		}

		int[] distinctElements = new int[distinctCount + 1];
		int index = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (i == 0 || numbers[i] != numbers[i - 1]) {
				distinctElements[index++] = numbers[i];
			}
		}

		return distinctElements;
	}
}
