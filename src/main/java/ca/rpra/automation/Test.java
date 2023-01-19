package ca.rpra.automation;

import ca.rpra.automation.utils.ReadProperties;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReadProperties rp = new ReadProperties();
		System.out.println(rp.getValue("huburl"));
		System.out.println("====="+rp.getValue("xcodeSigningId"));
		

	}

}
