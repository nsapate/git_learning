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


	@Override
	public String self_dev() {
		// TODO Auto-generated method stub
		return "IN SAP we get to learn at lot, specially in XM team";
	}
	/**
	 * This is a fun parameter
	 */
	@Override
	public String fun() {
		return "In SAP you can have a lot of Fun";

	}

}