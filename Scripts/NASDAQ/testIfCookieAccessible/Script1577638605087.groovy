import org.openqa.selenium.WebDriver

import com.kazurayam.ks.thoughtful.ChromeDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

ChromeDriverFactory cdFactory = new ChromeDriverFactory()
WebDriver driver = cdFactory.openChromeDriverWithProfile('Katalon')
assert driver != null
DriverFactory.changeWebDriver(driver)

WebUI.navigateToUrl('https://www.nasdaq.com/user/login')

WebUI.delay(3)
WebUI.closeBrowser()

