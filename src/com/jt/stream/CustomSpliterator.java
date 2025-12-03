package com.jt.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.stream.StreamSupport;

public class CustomSpliterator {

	static class MyIntegerSpliterator implements Spliterator<Integer> {

		private final List<Integer> list;
		private int current = 0;
		private final int end;
		
		public MyIntegerSpliterator(List<Integer> list) {
			this.list = list;
			this.end = list.size();
		}
		
		public MyIntegerSpliterator(List<Integer> list, int start, int end) {
			this.list=list;
			this.current=start;
			this.end=end;
		}
		
		@Override
		public boolean tryAdvance(Consumer<? super Integer> action) {
			if(current < end) {
				action.accept(list.get(current++));
				return true;
			}
			return false;
		}

		@Override
		public Spliterator<Integer> trySplit() {
			int remaining = end - current;
			if(remaining < 4)
				return null;
			
			int mid = current+remaining/2;
			Spliterator<Integer> prefix = new MyIntegerSpliterator(list,current, end);
			current = mid;
			return prefix;
		}

		@Override
		public long estimateSize() {
			return end - current;
		}

		@Override
		public int characteristics() {
			return Spliterator.ORDERED |
					Spliterator.SIZED |
					Spliterator.SUBSIZED |
					Spliterator.IMMUTABLE |
					Spliterator.NONNULL;
		}
		
	}
	public static void main(String[] args) {
		List<Integer> data = new ArrayList<>();
		for (int i = 1; i<=20;i++) {
			data.add(i);
		}
		
		System.out.println("--- Characterstics of the Splititerator ---");
		
		MyIntegerSpliterator spliterator = new MyIntegerSpliterator(data);
		printCharacteristics(spliterator);
		
		System.out.println("\n=== Sequential Stream using Custom Spliterator ===");
        StreamSupport.stream(spliterator, false)
                     .map(n -> {
                         System.out.println("Sequential map: " + n);
                         return n * 2;
                     })
                     .forEach(System.out::println);

        System.out.println("\n=== Parallel Stream using Custom Spliterator ===");
        MyIntegerSpliterator spliterator2 = new MyIntegerSpliterator(data);
        
        StreamSupport.stream(spliterator2, true)
        .map(n -> {
            System.out.println(
                "Parallel map: " + n +
                " | Thread: " + Thread.currentThread().getName());
            return n * 2;
        })
        .forEach(n -> System.out.println(
                "Output: " + n +
                " | Thread: " + Thread.currentThread().getName()));
	}

	private static void printCharacteristics(Spliterator<?> s) {
		int c = s.characteristics();
		System.out.println("ORDERED :" + ((c & Spliterator.ORDERED) != 0));
		System.out.println("SIZED :" + ((c & Spliterator.SIZED) != 0));
		System.out.println("SUBSIZED :" + ((c & Spliterator.SUBSIZED) != 0));
		System.out.println("CONCURRENT :" + ((c & Spliterator.CONCURRENT) != 0));
		System.out.println("IMMUTABLE :" + ((c & Spliterator.IMMUTABLE) != 0));
		System.out.println("NONNULL :" + ((c & Spliterator.NONNULL) != 0));
	}
}
