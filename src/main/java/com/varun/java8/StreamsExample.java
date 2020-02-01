package com.varun.java8;

import java.util.Arrays;
import java.util.List;

public class StreamsExample {

	public static void main(String[] args) {
		System.out.println("Unsorted array");
		List<Integer> integers = Arrays.asList(4,5,6,1,2,7,9,8);
		System.out.println(integers.toString());
		System.out.println("----Sorted----");
		integers.stream().sorted().forEach(System.out::print);
		System.out.println("\n----Max----");
		int max = integers.stream().max(Integer::compareTo).get();
		System.out.println(max);
		System.out.println("----Min----");
		int min = integers.stream().min(Integer::compare).get();
		System.out.println(min);
		
		System.out.println("-----Sequential Streams------");
		integers.stream().sorted().sequential().forEach(System.out::print);
		System.out.println("\n-----Parallel Streams-------");
		integers.stream().sorted().parallel().forEach(System.out::print);
		
	}
}
