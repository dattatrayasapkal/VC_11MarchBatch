package PageObject_WithoutDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DasboardPage {

	WebDriver driver;
	//1.
	@FindBy(xpath="//p[@class=\"oxd-userdropdown-name\"]")
	WebElement Name;
	@FindBy(xpath="//p[@class=\"oxd-text oxd-text--p\"]")
	WebElement Time;
	//2.
	public DasboardPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	
	}
	//3.
	public void NameValidation() {
		String Text= Name.getText();
		if(Text.equals("Ajay Singh")) {
		
	System.out.println("Correct username");
	
	}
	else {
	System.out.println("Incorrect username");
	}}
public void TimeAt() {
	boolean Time1= Time.isDisplayed();
	System.out.println(Time1);
}
}