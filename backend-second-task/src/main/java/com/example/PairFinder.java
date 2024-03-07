package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PairFinder {
	public static void findPairsSummingToTarget(int[] numbers, int target) {
        Set<Integer> seen = new HashSet<>();
        List<Pair> pairs = new ArrayList<>();

        for (int num : numbers) {
            int complement = target - num;
            if (seen.contains(complement)) {
                int smaller = Math.min(num, complement);
                int larger = Math.max(num, complement);
                pairs.add(new Pair(smaller, larger));
            }
            seen.add(num);
        }

        Collections.sort(pairs, new Comparator<Pair>() {
            public int compare(Pair p1, Pair p2) {
                if (p1.first != p2.first)
                    return p1.first - p2.first;
                return p1.second - p2.second;
            }
        });

        for (Pair pair : pairs) {
            System.out.println(pair.first + " " + pair.second);
        }
	}
}
