package com.tostring;

public class Vehicle {
	int topspeed;
	String company_name;
	int torque;
	int cc;
	
	
	
	
	
	public Vehicle(int topspeed, String company_name, int torque, int cc) {
		super();
		this.topspeed = topspeed;
		this.company_name = company_name;
		this.torque = torque;
		this.cc = cc;
	System.out.println("Topspeed="+this.topspeed+"  "+"Company_name="+this.company_name+"  "+"Torque="+this.torque+"  "+"CC=h"+this.cc);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle hayabusa=new Vehicle(292,"Suzuki",45,1000);
		Vehicle mto3=new Vehicle(199,"Yamaha",29,321);
		Vehicle mt07=new Vehicle(245,"Yamaha",49,713);
		Vehicle CBR=new Vehicle(199,"Honda",36,300);
		

	}

}
