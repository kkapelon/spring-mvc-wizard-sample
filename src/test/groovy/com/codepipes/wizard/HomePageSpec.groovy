
package com.codepipes.wizard;

import geb.spock.GebSpec
import spock.lang.*
import geb.spock.GebReportingSpec
import geb.Browser

/**
 * Trivial Geb test
 * @author Kostis
 *
 */
class HomePageSpec extends GebSpec {

	def "Trivial Geb test with Google"() {
		when: "I go to homepage"
		Browser.drive {
			go "http://localhost:8080/wizard/index.html"
		}
		
		then: "First page should load"
		Browser.drive {
			// make sure we actually got to the page
			title == "Spring Wizard"
		}
		
	}

	
}
