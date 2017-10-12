package IOStest;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;

public class TestDemo {
	private static IOSDriver driver;
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("appium-version", "1.6");
		cap.setCapability("platformName", "iOS");
		cap.setCapability("platformVersion", "10.0");
		cap.setCapability("deviceName", "iPhone 7 Plus");
		cap.setCapability("udid", "A7FF72F4-E207-411A-8100-1F0A8CF51A2B");
		cap.setCapability("automationName", "XCUITest");
		cap.setCapability("xcodeConfigFile", "/Users/tatralab/Desktop/myConfig.xcconfig");
		//cap.setCapability("deviceName", "iPhone");
		//cap.setCapability("udid", "bcab19cb79ea0ec8c93d153e86f4036984e16bce");
		cap.setCapability("app", "/Users/tatralab/Library/Developer/Xcode/DerivedData/WebDriverAgent-brdadhpuduowllgivnnvuygpwhzy/Build/Products/Debug-iphonesimulator/IntegrationApp.app");	
		//cap.setCapability("deviceName", "iPhone 7 Plus");
		//cap.setCapability("udid", "A7FF72F4-E207-411A-8100-1F0A8CF51A2B");
		//cap.setCapability("app", "/Users/tatralab/Library/Developer/Xcode/DerivedData/WebDriverAgent-amgeehujlktbxwbnwssuctnvcscd/Build/Products/Debug-iphonesimulator/IntegrationApp.app");	
		cap.setCapability("bundleId", "com.facebook.IntegrationApp");
		//cap.setCapability("app", "/Users/tatralab/Documents/Appium Utilities/Sample IPA and APP files for IOS/iOnHands.app");
		//cap.setCapability("bundleId", "com.softcare.iOnHands");
		driver=new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(5000);
		//driver.findElementByName("Alerts").click();
		driver.findElementByAccessibilityId("Alerts").click();
		//driver.findElement(By.xpath("/AppiumAUT/XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton[2]")).click();
		Thread.sleep(5000);
		driver.findElementByAccessibilityId("Back").click();
		Thread.sleep(3000);
		driver.quit();

	}

}
