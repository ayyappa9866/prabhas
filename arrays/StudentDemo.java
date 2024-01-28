package com.prabhas.learning;
import java.util.Scanner;
public class StudentDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Student Idnum,Name,Gender And Dept");
		long id =input.nextLong();
		input.nextLine();
		String name = input.nextLine();
		char gen = input.next().charAt(0);
		String dept = input.next();
		Student s1 = new Student(id,name,gen,dept);
		System.out.println(s1);
		input.close();
	}
}
