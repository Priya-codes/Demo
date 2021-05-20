import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\Eclipse_Codes\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://google.com");//hit on the URL
		System.out.println (driver.getTitle());//validate page title
System.out.println(driver.getCurrentUrl());//validate the URL
//System.out.println(driver.getPageSource()); to get page source
driver.get("http://yahoo.com");
driver.navigate().back();//navigate from google to yahoo and back
//driver.navigate().forward();// navigate forward
driver.close();//to close the current broswer
//driver.quit();//to close all the browser opened by selenium
	}

}
