package com.tostring;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Test2 t=new Test2();
		 int x=t.m1(10);
		 int y=t.m2(5);
		 System.out.println(x);
		 System.out.println(y);

	}
	int m1(int x) {
		int result=x+10;
		return result;
	}
	int m2(int y) {
		int result=y*10;
		return result;
				
	}
}
