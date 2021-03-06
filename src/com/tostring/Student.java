package com.tostring;

public class Student {
	int Rollno;
	String Name;

	public int getRollno() {
		return Rollno;
	}

	public void setRollno(int rollno) {
		Rollno = rollno;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student S1=new Student();
		S1.setRollno(1);
		S1.setName("Prathamesh");
		S1.getRollno();
		S1.getName();
		System.out.println(S1.getRollno()+S1.getName());
	}
}
