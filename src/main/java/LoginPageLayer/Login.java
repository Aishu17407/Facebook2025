package LoginPageLayer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseApiLayer.BaseClass;

public class Login extends BaseClass{

	public void dataentry(String fullname,String surname,String date,String month, String year, String gender, String mobile, String password) throws InterruptedException
	{
	   Thread.sleep(3000);
	WebElement fname=driver.findElement(By.name("firstname"));
		//WebElementUtils.sendKeys(fname,fullname);
		
		WebElement lastname=driver.findElement(By.name("lastname"));
		//WebElementUtils.sendKeys(lastname,surname);
		
		WebElement dt=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		//handleDropDown.dropdown(dt,date);
		   Thread.sleep(3000);

		WebElement mnth=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		//handleDropDown.dropdown(mnth,month);
		
		WebElement yr=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		//handleDropDown.dropdown(yr,year);
		   Thread.sleep(3000);

		List<WebElement>GenderRadio=driver.findElements(By.xpath("//label[@class='_58mt']"));
		//WebElementUtils.handleRadioButton(GenderRadio,gender);
		
		WebElement mob=driver.findElement(By.name("reg_email__"));
		//WebElementUtils.sendKeys(mob, mobile);
		   Thread.sleep(3000);

		WebElement pass=driver.findElement(By.xpath("//input[@id='password_step_input']"));
		//WebElementUtils.sendKeys(pass, password);
		
		
		
	}
	
}
