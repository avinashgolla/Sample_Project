package com.pramati.TestCases
import geb.spock.GebSpec

class Spock1 extends GebSpec{
 	
def "login"() {
        when:
        go "login"
        username = "me"
        report "login screen" // take a report of the login screen
        login().click()
 
        then:
        title == "Logged in!"

}
}