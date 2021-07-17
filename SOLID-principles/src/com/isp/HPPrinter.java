package com.isp;

public class HPPrinter implements printFunction, scanFunction{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Printing Functionality from HP Printer");
	}

	@Override
	public void getSpoolDetails() {
		// TODO Auto-generated method stub
		System.out.println("Print Spool Details from HP Printer");
	}

	@Override
	public void scan() {
		// TODO Auto-generated method stub
		System.out.println("Scan Functionality from HP Printer");
	}

	@Override
	public void scanPhoto() {
		// TODO Auto-generated method stub
		System.out.println("Scan Photo Functionality from HP Printer");
	}

}
