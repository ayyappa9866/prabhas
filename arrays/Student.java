package com.prabhas.learning;
public class Student {
	private long idNum;
	private String name;
	private String dept;
	private char gender;
	public Student(long idNum,String name,char gender,String dept) {
		if(setIdNum(idNum)&& setName(name)&&setGender(gender)&&setDept(dept) ) {
			this.idNum = idNum;
			this.name = name;
			this.dept = dept;
			this.gender = gender;
		}else {
			System.out.println("Object is Not Initialized Due To InValid Data");
		}
	}
	public boolean setIdNum(long idNum) {
		long digits = (long)Math.log10(idNum) + 1;
		if(digits == 10) {
			
			return true;
		}
		return false;
	}
	public boolean setName(String name) {
		int flag = 0;
		for(int i = 0; i < name.length();i++) {
			char ch = name.charAt(i);
			if((ch >= 'a' && ch <= 'z') ||(ch >= 'A' && ch <= 'Z') || ch == ' ') {
				continue;
			}else {
				flag = 1;
				break;
			}
		}
		if(flag == 0) {
			
			return true;
		}
		return false;
	}
	public boolean setGender(char gender) {
		if(gender == 'M' || gender == 'm' || gender == 'F' || gender == 'f') {
			
			return true;
		}
		return false;
	}
	public boolean setDept(String dept) {
		if(dept.equals("CE") ||dept.equals("CSE") || dept.equals("ECE")||dept.equals("MECH")||dept.equals("EEE")||dept.equals("MBA")) {
			
			return true;
		}
		return false;
	}
	public String toString() {
		System.out.println("******Student Data*****");
		return "IDNUM : "+idNum+"\nNAME : "+name+"\nGENDER : "+gender+"\nDEPT : "+dept;
	}
}
