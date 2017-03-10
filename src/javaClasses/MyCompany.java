package javaClasses;

import javaInterface.Company;

public class MyCompany implements Company{

	/**
	 * Work culture at my company
	 */
	@Override
	public void work_culture() {
		System.out.println("SAP have an amazing work culture");
	}

	/**
	 * This is a fun parameter
	 */
	@Override
	public String fun() {
		return "In SAP you can have a lot of Fun";
	}

}