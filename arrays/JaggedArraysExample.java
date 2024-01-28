package com.prabhas.learning;

public class JaggedArraysExample {

	public static void main(String[] args) {
		
//		int arr[][] = {{1,2},{3,4,5},{6,7,8,9}};
		
		int arr[][] = new int[3][];
		arr[0] = new int[] {1,2};
		arr[1] = new int[] {1,2,3};
		arr[2] = new int[] {1,2,3,4};
		System.out.println("Array Elemens Are : ");
		for(int i = 0;i < arr.length;i++) {
			for(int j = 0;j < arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
