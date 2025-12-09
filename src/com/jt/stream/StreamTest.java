package com.jt.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(5,4,6,3,7,1,9,2);
		
//		Stream<Integer> stream = numbers.stream();
		
		Stream<Integer> stream1 =numbers.stream()
		.filter(n -> {
			System.out.println("filter (sequential): "+n);
			return n%2 == 0;
		});
		stream1.forEach(n -> System.out.println("forEach: "+n));
		
		numbers.parallelStream()
		.filter(n -> {
			System.out.println("filter (parallel): "+n);
			return n%2 == 0;
		})
		.forEach(n -> System.out.println("forEach:"+n));
		
//		numbers.stream()
//		.sorted((a,b) -> {
//			System.out.println("sorted comparing (paralle): "+a);
//			return Integer.compare(a, b);
//		}).forEach(n -> System.out.println("forEach: "+n));
		
//		numbers.parallelStream()
//		.distinct()
//		.forEach(n -> System.out.println("distinct: "+n));
		
	}

}
