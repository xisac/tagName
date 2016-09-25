package tagName;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class tagnames {

	public static void main(String[] args) {
		
		browserSelect tmp= browserSelect.getinstance();
		//tmp.demomethod();
	    WebDriver driver;
	    String tag;
	    String browse;
	    
	    
	    
	    Scanner input= new Scanner(System.in);
	    System.out.println("firefox or chrome?");
	    browse= input.nextLine();
	    driver=tmp.getBrowser(browse);
	    
	    System.out.println("url? :");
	    
		
		String baseUrl = input.nextLine();
		driver.get(baseUrl);
		
		System.out.println("Enter Locator");
		String locator = input.nextLine();
		System.out.println("Enter "+ locator);
		String in = input.nextLine();
		
		input.close();
		
		if(locator.equalsIgnoreCase("id")){
			tag = driver.findElement(By.id(in)).getTagName();
			System.out.println(tag);
		}
		else if(locator.equalsIgnoreCase("className")){
			tag = driver.findElement(By.className(in)).getTagName();
			System.out.println(tag);
		}
		else if (locator.equalsIgnoreCase("css")){
			tag = driver.findElement(By.cssSelector(in)).getTagName();
			System.out.println(tag);
		}
		else if (locator.equalsIgnoreCase("xPath")){
			tag = driver.findElement(By.xpath(in)).getTagName();
			System.out.println(tag);
		}
		
	    
		
	    
	    
	    System.exit(0);
	}

}
