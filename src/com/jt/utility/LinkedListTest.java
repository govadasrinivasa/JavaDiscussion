package com.jt.utility;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("Java");
		list.add("Python");
		list.add("NodeJs");
		list.add("Oracle");
		list.add("SpringFramework");
		list.add("Windows");
		list.add("AWS");
		
		System.out.println("Initial LinkedList "+list);
		
		System.out.println("Last element "+list.getLast());
		System.out.println("First element "+list.getFirst());
		System.out.println("Second element "+list.get(2));
		list.add(2, "Azure");
		System.out.println("Second element "+list.get(2));
		list.removeFirst();
		System.out.println("First element "+list.getFirst());
		
		System.out.println("Initial LinkedList "+list);
		Queue<String> queue = list;
		
		System.out.println("Queue (FIFO): " + queue);

        // Dequeue elements (remove from front)
        System.out.println("Removed: " + queue.poll()); // A
        System.out.println("After poll: " + queue);

        // Peek – view front element
        System.out.println("Front Element: " + queue.peek());

        // Removing all elements
        while (!queue.isEmpty()) {
            System.out.println("Removed: " + queue.poll());
        }
	}

}
