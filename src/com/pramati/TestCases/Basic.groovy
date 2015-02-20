package com.pramati.TestCases

import geb.Browser
import org.openqa.selenium.firefox.FirefoxDriver

class Basic {
   static void main(def args){
	   
	/*   def mylist= [1,2,"Lars","4"]
	   mylist.each{ println it }  */
	   
	def browser = new Browser()
	browser.driver = new FirefoxDriver()  
}
}

/*import geb.Browser
import geb.Configuration
import geb.ConfigurationLoader



 
def loader = new ConfigurationLoader("GebConfig.groovy")
def config = loader.conf
def browser = new Browser(config)*/

