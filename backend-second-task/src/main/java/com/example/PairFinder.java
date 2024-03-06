package com.example;

import java.util.ArrayList;
import java.util.List;

public class PairFinder {
	public static void findPairsSummingToTarget(int[] numbers, int target) {
        List<String> pairs = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    int firstNum = Math.min(numbers[i], numbers[j]);
                    int secondNum = Math.max(numbers[i], numbers[j]);
                    pairs.add(firstNum + " " + secondNum);
                }
            }
        }

        for (String pair : pairs) {
            System.out.println(pair);
        }
	}
}
