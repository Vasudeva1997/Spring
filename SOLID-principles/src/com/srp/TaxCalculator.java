package com.srp;

public class TaxCalculator {

	public long getTax(Employee employee) {
		// TODO Auto-generated method stub
		long salary = employee.getSalary();
		if (salary < 250000)
			return 0;
		else if (salary > 250000 && salary < 500000) {
			return (long) (salary * 0.05);
		} else if (salary < 750000 && salary > 500000) {
			return (long) (salary * 0.1);
		} else if (salary > 750000 && salary < 1000000) {
			return (long) (salary * 0.15);
		}
		else {
			return (long) (salary*0.2);
		}
	}

}
