package com.srp;

public class Employee {

	private String id;
	private String name;
	private long salary;

	public Employee(String id, String name, long salary) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public long calculateTax() {
		return new TaxCalculator().getTax(new Employee(id, name, salary));
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

}
