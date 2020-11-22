package com.vidvaan.bean;
	public class Employee {
		private int eno = 1;
			private String name = "none";
			private double salary = 0.0;
			private String designation = "clerk";

				
				public Employee(int eno, String name) {
					System.out.println("Employee(int eno, String name)");
				
				this.eno = eno;
				this.name = name;
			}
				public Employee(double salary, String designation) {
					System.out.println("Employee(double salary, String designation)");
				
				this.salary = salary;
				this.designation = designation;
			}
				public void displayInjectedValues() {
								System.out.println("Eno : " + eno);
								System.out.println("name : " + name);
								System.out.println("salary : " + salary);
								System.out.println("designation : " + designation);
							}


		
	}
