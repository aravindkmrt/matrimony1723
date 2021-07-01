package org.pojo;



import java.util.List;


import org.community.Baseclassregistermatrimony;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Pojom extends Baseclassregistermatrimony   {
	public Pojom() {
	
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"spokenLanguages\"]") 
	private List<WebElement> Spoken;

	public List<WebElement> getSpoken() {
		return Spoken;
	}

	
	

	

	

}