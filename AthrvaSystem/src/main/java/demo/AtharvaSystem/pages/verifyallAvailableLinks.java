package demo.AtharvaSystem.pages;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;

import demo.AthrvaSystem.utility.CommonDriverUtils;
import net.thucydides.core.annotations.findby.By;

public class verifyallAvailableLinks extends CommonDriverUtils {
	
	java.util.List<WebElement> links;
	
	public void launchBrowser(){
		getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		getDriver().manage().window().maximize();
	}
	
	public void fatchAllAvailableLinks(){
		links = getDriver().findElements(By.tagName("a"));
	}
	
	public void iterateTheListandHitTheLinks() throws IOException{
		for(int i=0; i<links.size();i++){
			String url = links.get(i).getAttribute("href");
			verifyLinks(url);
			
		}
	}
	
	public static void verifyLinks(String testurl) throws IOException{
		
		try {
			URL url = new URL(testurl);
			
			HttpURLConnection httpURLconnect =(HttpURLConnection)url.openConnection();
			httpURLconnect.setConnectTimeout(5000);
			httpURLconnect.connect();
			if((httpURLconnect).getResponseCode()==200){
				System.out.println("Response :" + httpURLconnect.getResponseMessage());
			}else{
				System.out.println("Response is brken:" + httpURLconnect.getResponseMessage());
			}
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
