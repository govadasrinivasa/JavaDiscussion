package com.jt;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		// single dimensional array
//		int x[] = new int[50];
//		int y[] = {10,20,30,110,120};
//		
//		for(int i=0;i<x.length;i++)
//			System.out.println(x[i]);
//		
//		for(int i=0;i<y.length;i++)
//			System.out.println(y[i]);
		
		// two dimensional arrays
		
		int t[][] = new int [5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++)
			 t[i][j] = i+j;
		}
		
		for(int a=0;a<5;a++) {
			for(int b=0;b<5;b++) {
			  System.out.print(t[a][b]);
			}
			System.out.println();
		}
		

	}
}
