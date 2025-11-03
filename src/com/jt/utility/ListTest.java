package com.jt.utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.StringTokenizer;
import java.util.TreeSet;

import com.jt.sunil.Parent1;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent1 p = new Parent1();

		List<String> list = new ArrayList<String>();
		list.add("Hyderabad");
		list.add("Pune");
		list.add("Chennai");
		list.add("Bengaluru");
		list.add("Kolkata");
		
		list.forEach(l -> System.out.println(l));
		
		StringTokenizer stringTokenizer = new StringTokenizer("Languages -- Java,"
				+ "multi-threading,"
				+ "race conditions,"
				+ "deadlock,"
				+ "semaphores,"
				+ "Heap/Thread dump analysis,"
				+ "Startup parameter tuning and Garbage collections,"
				+ "Python,"
				+ "Python,"
				+ "Scripting,"
				+ "React Js,"
				+ "Next Js,"
				+ "Node Js,"
				+ "Typescript,"
				+ "Angular,"
				+ "JavaScript,"
				+ "Angular JS,"
				+ "NoSQL,"
				+ "Cassandra,"
				+ "Mongo DB,"
				+ "Hadoop,"
				+ "Database,"
				+ "Postgres,"
				+ "Sybase,"
				+ "DB2,"
				+ "My SQL,"
				+ "Oracle,"
				+ "MS SQLServer",",");
		String str[] = new String[stringTokenizer.countTokens()];
		int i =0;
		while(stringTokenizer.hasMoreElements()) {
			str[i] = stringTokenizer.nextToken();
			i++;
		}
		
		System.out.println("List of elements");
		List<String> names = Arrays.asList(str);
		names.forEach(l -> System.out.println(l));
		
		System.out.println();
		
		System.out.println("Set of elements");
		Set<String> set = new HashSet<String>(names);
		set.forEach(l -> System.out.println(l));
		
		System.out.println();
		
		System.out.println("Sorted of elements");
		SortedSet<String> set2 = new TreeSet<String>(names);
		set2.forEach(l -> System.out.println(l));
		
	}

}
