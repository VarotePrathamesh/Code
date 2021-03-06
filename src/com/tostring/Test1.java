package com.tostring;

public class Test1 {
	static int a=10;
	static int b=15;
	
	
	int m1(int x,int y) {
		int result=x+y;
		return result;
	}
	int m2(int p,int q) {
		int result=q-p;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t=new Test1();
		int x=t.m1(a,b);
		int y=t.m2(a,b);
		System.out.println(x);
		System.out.println(y);
		

	}
	

}
