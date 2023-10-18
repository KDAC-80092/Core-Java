package com.app;



public class Employee {

	private int empno;
	private String name;
	private double salary;
	
	public Employee() {
		
	}

	public Employee(int empno, String name, double salary) {
		this.empno = empno;
		this.name = name;
		this.salary = salary;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getEmpno() {
		return empno;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}
	
	@Override
	public String toString()
	{
		return "[EmpNo = "+empno + ", Name = " + name + ", Salary = "+ salary + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if(obj == null)
		{
			return false;
		}
		
		if (obj instanceof Employee) {
			Employee other = (Employee) obj;
			if(this.empno==other.empno)
				return true;
		}
		return false;
	}

	
	
				
	
	
	
	

	
	
	
	
	
	
}
