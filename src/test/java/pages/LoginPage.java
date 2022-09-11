package pages;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//**************************************** Objects ***********************************
	
	WebDriver driver;
	
	@FindBy(linkText = "Log in")
	WebElement LoginLink;
	
	@FindBy(name = "user_login")
	WebElement UserName;
	
	@FindBy(id = "password")
	WebElement Password;
	
	@FindBy(className = "rememberMe")
	WebElement Checkbox;
	
	@FindBy(name = "btn_login")
	WebElement LoginBtn;
	
	// ***************************************** Methods ***********************************
	
	public LoginPage(WebDriver baseDriver) {
		
		this.driver = baseDriver;
		PageFactory.initElements(baseDriver, this);
	}
	
	public void Login(String UsernameVal, String PassVal) {
		
		//Step1: Select Login
//		WebElement LoginLink= driver.findElement(By.linkText("Log in"));
		LoginLink.click();
				
		//Step2: Enter User name
//		WebElement UserName=driver.findElement(By.name("user_login"));		
		UserName.sendKeys(UsernameVal);
				
		//Step3: Enter Password
//		WebElement Password=driver.findElement(By.id("password"))		
		Password.sendKeys(PassVal);
					
		//Step4 Click Remember Me checkbox
//		WebElement Checkbox=driver.findElement(By.className("rememberMe"));
		Checkbox.click();
						
		//Step5: Click pn Login Button
//		WebElement Loginbtn=driver.findElement(By.name("btn_login"));
		LoginBtn.click();
	}

}
