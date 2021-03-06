package com.tostring;

public class Employee {
		int emp_id;
		String emp_name;
	public Employee(int emp_id, String emp_name) {
			super();
			this.emp_id = emp_id;
			this.emp_name = emp_name;
			System.out.println(this.emp_id + " " +this.emp_name);
 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stubz
		Employee e1 = new Employee(1,"Sushant");
		Employee e2 = new Employee(2,"Vinit");
		Employee e3 = new Employee(3,"Prathamesh");
		
	}

}
