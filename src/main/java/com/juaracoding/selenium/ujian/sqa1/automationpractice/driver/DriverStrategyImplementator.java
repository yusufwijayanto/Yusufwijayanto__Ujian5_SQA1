package com.juaracoding.selenium.ujian.sqa1.automationpractice.driver;

public class DriverStrategyImplementator {
	
	
	public static DriverStrategy chooseStrategy(String strategy) {
		
		switch (strategy) {
		case "chrome":
			  return new Chrome();
	
		case "firefox":
			 return new Firefox();
        
		default:
			return null;
		}
		
		
	}

}
