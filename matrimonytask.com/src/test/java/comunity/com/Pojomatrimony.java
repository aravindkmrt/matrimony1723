package comunity.com;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Pojomatrimony extends Baseclassregistermatrimony   {
	public Pojomatrimony() {
	
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="idEmail")
	public WebElement matrimonyname;
	@FindBy(id="passwordClear1")
	public WebElement matrimonypass;
	@FindBy(xpath = "//input[@value='LOGIN']") 
	public WebElement btnLoginMATRIMONY;
	public WebElement getMatrimonyname() {
		return matrimonyname;
	}

	public WebElement getMatrimonypass() {
		return matrimonypass;
	}

	public WebElement getBtnLoginMATRIMONY() {
		return btnLoginMATRIMONY;
	}
	

}
