package com.prabhas.learning;
public class OneDArrays {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		System.out.println("arr "+arr.length);
		int []brr = new int[] {1,2,3,4,5,6};
		System.out.println("brr "+brr.length);
		int[] crr = new int[10];
		for(int i = 0;i < crr.length;i++) {
			crr[i] = i + 10;
		}
		System.out.println("ARray Elements Are :");
		for(int i = 0;i < crr.length;i++) {
			System.out.print(crr[i]+" ");
		}
	}
}
