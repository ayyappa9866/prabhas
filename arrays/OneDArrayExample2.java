package com.prabhas.learning;
import java.util.Scanner;
public class OneDArrayExample2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int arr[] = new int[10];
		System.out.println("Enter 10 Elements :");
		for(int i = 0;i < arr.length;i++) {
			arr[i] = input.nextInt();
		}
		System.out.println("Array Elements Are : ");
		for(int i = 0; i < arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		input.close();
	}
}
