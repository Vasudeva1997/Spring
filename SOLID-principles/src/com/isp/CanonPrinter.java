package com.isp;

// 3 IN 1 PRINTER 
public class CanonPrinter implements faxFunction,scanFunction,printFunction{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Printing Functionality from Canon Printer");
	}

	@Override
	public void getSpoolDetails() {
		// TODO Auto-generated method stub
		System.out.println("Print Spool Details from Canon Printer");
	}

	@Override
	public void scan() {
		// TODO Auto-generated method stub
		System.out.println("Scan Functionality from Canon Printer");
	}

	@Override
	public void scanPhoto() {
		// TODO Auto-generated method stub
		System.out.println("Scan Photo Functionality from Canon Printer");
	}

	@Override
	public void fax() {
		// TODO Auto-generated method stub
		System.out.println("Fax Functionality from Canon Printer");
	}

	@Override
	public void internetFax() {
		// TODO Auto-generated method stub
		System.out.println("Internet Fax Functionality from Canon Printer");
	}

}
