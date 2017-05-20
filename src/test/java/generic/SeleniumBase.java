package generic;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumBase {
	

WebDriver myDriver;

	public void selectBrowser(String browserName){
		if(browserName.equalsIgnoreCase("Chrome")){
			WebDriver driver = new ChromeDriver();
			
		}else if(browserName.equalsIgnoreCase("firefox")){
			WebDriver driver = new FirefoxDriver();
			
		}else if(browserName.equalsIgnoreCase("ie")){
			WebDriver driver= new InternetExplorerDriver();
		}
		
	}//select browser
	
	public void launchApp(){
		
	}//launchApp
	public void launchApp(String appName){
		
	}//launchApp
	public void launchApp(String browserNamr, String appName){
		
	}//launchApp
	
	
	public void navigateToUrl(String strUrl){
		
	}//navigateToUrl
	
	public void verifyPage(String pageName){
		
	}//verifyPage
	
	public void closeApp(){
		
	}//closeApp
	public void closeApp(boolean blnFlag){
		
	}//closeApp
	
	
}//class

