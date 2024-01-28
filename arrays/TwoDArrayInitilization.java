package com.prabhas.learning;
public class TwoDArrayInitilization {
	public static void main(String[] args) {
		int arr[][] = {{1,2,3,4},{4,5,6,7},{7,8,9,6}};
		int [][]brr = new int[][] {{1,2,3,4},{4,5,6,7},{7,8,9,6}};
		int[][] crr = new int[][] {new int[] {1,2,3},new int[] {4,5,6},new int[] {7,8,9}};
		System.out.println("Array Elemens Are : ");
		for(int i = 0;i < arr.length;i++) {
			for(int j = 0;j < arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Array Elemens Are : ");
		for(int i = 0;i < brr.length;i++) {
			for(int j = 0;j < brr[i].length;j++) {
				System.out.print(brr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Array Elemens Are : ");
		for(int i = 0;i < crr.length;i++) {
			for(int j = 0;j < crr[i].length;j++) {
				System.out.print(crr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
