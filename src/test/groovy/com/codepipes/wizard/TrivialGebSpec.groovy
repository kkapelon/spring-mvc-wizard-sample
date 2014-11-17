
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
class TrivialGebSpec extends GebSpec {

	def "Trivial Geb test with Google"() {
		when: "I go to Google"
		Browser.drive {
			go "http://google.com/ncr"
		}
		
		then: "Gooogle should load"
		Browser.drive {
			// make sure we actually got to the page
			title == "Google"
		}
		
		when: "I enter wikipedia in the search link"
		Browser.drive {
			$("input", name: "q").value("wikipedia")

			// wait for the change to results page to happen
			// (google updates the page dynamically without a new request)
			waitFor { title.endsWith("Google Search") }
		}


		then: "First link should be wikipedia"
		Browser.drive {
			def firstLink = $("li.g", 0).find("a.l")
			firstLink.text() == "Wikipedia"
		}
	}

	
}
