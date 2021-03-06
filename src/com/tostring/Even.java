package com.tostring;

public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Even []=new int [100];
		 for(int i=0;i<Even.length;i++) {
			 Even[i]=i+1;		
		 }
		 arr(Even);
	}	
	static void arr(int []x) {
	//	int[] arr;
		for(int i = 0;i<x.length; i++) 
			if(x[i]%2==0) {
				System.out.print(x[i]+" "); 
			}
		}
	}
		