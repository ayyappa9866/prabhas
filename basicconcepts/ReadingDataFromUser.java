/***
After a long time of Covid-19 outbreak, finally you are into your B. Tech Second year, your 
programming faculty wants you to introduce yourself to the class with your name, last five 
digits of your ID Number, Gender, Department/Branch, Phone Number as(111-222-3333), 
Intermediate C.G.P.A., As you are a java aspirant, you want to write a JAVA program which 
takes input and displays all the details asked by your faculty.(Read input from Console using 
Scanner Class). 
S.NO 				Input 			Output
1. 				HITESH DASARI		Name = HITESH DASARI
2.				2050150566			ID Num = 50566
3.				M 					Gender = M
4.				CSE 				Department = CSE
5.				7854136908			Phone Number = 785-413-6908  
6.				9.8					C.G.P.A = 9.8
*/
package basicconcepts;
import java.util.Scanner;// Specific Import
//import java.io.*;// Wild card Import
public class ReadingDataFromUser {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Name Of the Student :");
		String name = input.nextLine();
		System.out.println("Enter IDNUM : ");
		int idNum = input.nextInt();
		System.out.println("Enter Gender Of a Student :");
		char gender = input.next().charAt(0);
		System.out.println("Enter Department : ");
		String dept = input.next();
		System.out.println("Enter Phone Number :");
		long phone = input.nextLong();
		System.out.println("Enter CGPA : ");
		double cgpa = input.nextDouble();
		System.out.println("****************");
		System.out.println("NAME : "+name);
		System.out.println("IDNum : "+(idNum % 100000));
		System.out.println("Gender : "+gender);
		System.out.println("Department : "+dept);
		System.out.println("Phone : "+(phone/10000000)+"-"+(phone/10000)%1000+"-"+(phone%10000));
		System.out.println("CGPA : "+cgpa);
		input.close();
	}
}
