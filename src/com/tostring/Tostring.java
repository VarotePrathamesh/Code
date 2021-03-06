package com.tostring;

public class Tostring {
	int rollno;
	String name;
	
	@Override
	public String toString() {
		return " [rollno=" + rollno + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Tostring t1=new Tostring();
		t1.rollno=5;	
		t1.name="Prathamesh";
Tostring t2=new Tostring();
		t2.rollno=6;
		t2.name="Sushant";
Tostring t3=new Tostring();
		t3.rollno=7;
		t3.name="Adinath";
Tostring t4=new Tostring();
		t4.rollno=8;
		t4.name="Vinit";
Tostring t5=new Tostring();
        t5.rollno=9;
        t5.name="Rahul";

        System.out.println(t1.toString());
	System.out.println(t2.toString());
	System.out.println(t3.toString());
	System.out.println(t4.toString());
	System.out.println(t5.toString());

	}


}
