/*
	This is the Geb configuration file.
	
	See: http://www.gebish.org/manual/current/configuration.html
*/

import org.openqa.selenium.phantomjs.PhantomJSDriver
import org.openqa.selenium.remote.DesiredCapabilities
driver = {
    new PhantomJSDriver(new DesiredCapabilities())
}

baseUrl = "http://gebish.org"