package Main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	
	
	

	public WebDriver driver;
	
	By byUserID = By.name("username");
	By byPassword = By.name("password");
	By byComments = By.name("comments");
	By chkbox1   =  By.xpath("//input[@value='cb1']");
	By chkbox2  = By.xpath("//input[@value='cb2']");
	By chkbox3  = By.xpath("//input[@value='cb3']");
	By rdbtn    =By.xpath("//input[@value='rd1']");
	By selectValue =By.xpath("//option[@value='ms1']");
	By drpbtn      =By.name("dropdown");
	By drpvalue		=By.xpath("//option[@value='dd1']");
	By subBtn		=By.name("submitbutton");
	By text			=By.xpath("//p[contains(text(), 'You submitted a form.')]");
	
	
	
	
	
@Test
	public void scenario1() {
		String AppURL = ("https://testpages.eviltester.com/styled/basic-html-form-test.html");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(AppURL);
		
		driver.findElement(byUserID).sendKeys("QWERTYUSER");
		driver.findElement(byPassword).sendKeys("98765432");
		driver.findElement(byComments).sendKeys("ProspectInfosys");
		driver.findElement(chkbox1).click();
		driver.findElement(chkbox2).click();
		driver.findElement(chkbox3).click();
		driver.findElement(rdbtn).click();
		driver.findElement(selectValue).click();
		driver.findElement(drpbtn).click();
		driver.findElement(drpvalue).click();
		driver.findElement(subBtn).click();
		
		String act=driver.findElement(text).getText();
		String exp="You submitted a form. The details below show the values you entered for processing.";
		
		Assert.assertEquals(exp,act);
		
	      System.out.println("validating msg "+ act);
	      
	      
	      driver.quit();
	    
	     
		
		
	

}
}