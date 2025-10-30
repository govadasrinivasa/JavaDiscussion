package com.jt.io;

import java.util.StringTokenizer;

public class VarargsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer stringTokenizer = new StringTokenizer("Languages -- Java,"
				+ "multi-threading, race conditions, deadlock, semaphores,"
				+ "Heap/Thread dump analysis, Startup parameter tuning and Garbage collections,"
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
		applyVarargs(str);
	}
	
	static void applyVarargs(String...strs) {
		
		for(String str:strs) {
			System.out.println(str);
		}
		
	}

}
