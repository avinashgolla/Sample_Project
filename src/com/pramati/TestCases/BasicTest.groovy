package com.pramati.TestCases;

import static org.junit.Assert.*
import geb.Browser
import geb.spock.GebSpec

import org.junit.Test
import org.openqa.selenium.firefox.FirefoxDriver

class BasicTest extends GebSpec{

	@Test
	public void test() {
		
			def browser = new Browser()
	browser.driver = new FirefoxDriver() 
	}

}
