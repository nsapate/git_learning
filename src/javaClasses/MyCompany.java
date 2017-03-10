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

}