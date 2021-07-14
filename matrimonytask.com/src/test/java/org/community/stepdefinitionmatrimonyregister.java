package org.community;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.util.SystemOutLogger;
import org.apache.hc.core5.http.io.BHttpConnection;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.pojo.Pojom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefinitionmatrimonyregister extends Baseclassregistermatrimony {
	Pojom pj;

	@Given("user have to enter into comunity matrimony page")
	public void user_have_to_enter_into_comunity_matrimony_page() {
		launchBrowser();

	}

	@When("user have to select the community site")
	public void user_have_to_select_the_community_site() throws InterruptedException {
		loadUrl("https://www.communitymatrimony.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@data-content='register_free']")).click();
		WebElement w1 = driver.findElement(By.xpath("//*[@id='domainName']"));
		selectValue(w1, "sikhmatrimony");
		WebElement f = driver.findElement(By.xpath("//*[@id=\"domainErr\"]"));
		if (f.isDisplayed()) {
			System.out.println(driver.findElement(By.xpath("//*[@id=\"domainErr\"]")).getText());

		} else {
			System.out.println("Domain selected");
		}

	}

	@When("user have to select Profile created")
	public void user_have_to_select_Profile_created() {
		WebElement w2 = driver.findElement(By.xpath("//select[@id='profile']"));
		selectIndex(w2, 1);
		WebElement f1 = driver.findElement(By.xpath("//*[@id=\"profileErr\"]"));
		if (f1.isDisplayed()) {
			System.out.println(driver.findElement(By.xpath("//*[@id=\"profileErr\"]")).getText());

		} else {
			System.out.println("Profile selected");
		}

	}

	@When("user have to enter the name")
	public void user_have_to_enter_the_name() {
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("kavinkumar");
		WebElement f2 = driver.findElement(By.xpath("//*[@id=\"nameErr\"]"));
		if (f2.isDisplayed()) {
			System.out.println(driver.findElement(By.xpath("//*[@id=\"nameErr\"]")).getText());

		} else {
			System.out.println("Name typed");
		}

	}

	@When("user have to select the gender")
	public void user_have_to_select_the_gender() {
		driver.findElement(By.xpath("(//*[@for='gendermale'])[3]")).click();
		// driver.findElement(By.xpath("(//*[@for='genderfemale'])")).click();
		WebElement f3 = driver.findElement(By.xpath("(//*[@id=\"genderErr\"])[2]"));
		if (f3.isDisplayed()) {
			System.out.println(driver.findElement(By.xpath("(//*[@id=\"genderErr\"])[2]")).getText());

		} else {
			System.out.println("Gender selected");
		}
	}

	@When("user have to select the date of birth")
	public void user_have_to_select_the_date_of_birth() {
		WebElement w3 = driver.findElement(By.xpath("//*[@id='dobDay']"));
		selectIndex(w3, 24);
		WebElement w4 = driver.findElement(By.xpath("//*[@id='dobMonth']"));
		selectIndex(w4, 9);
		WebElement w5 = driver.findElement(By.xpath("//*[@id='dobYear']"));
		selectValue(w5, "1997");
		WebElement f4 = driver.findElement(By.xpath("//*[@id=\"dobErr\"]"));
		if (f4.isDisplayed()) {
			System.out.println(driver.findElement(By.xpath("//*[@id=\"dobErr\"]")).getText());

		} else {
			System.out.println("Date of birth entered");
		}
	}

	@When("user have to select the Marital Status")
	public void user_have_to_select_the_Marital_Status() {
		WebElement w6 = driver.findElement(By.xpath("//*[@id='maritalStatus']"));
		selectIndex(w6, 1);
		WebElement f5 = driver.findElement(By.xpath("//*[@id=\"maritalErr\"]"));
		if (f5.isDisplayed()) {
			System.out.println(driver.findElement(By.xpath("//*[@id=\"maritalErr\"]")).getText());

		} else {
			System.out.println("marital status selected");
		}
	}

	@When("user have to select the appearance")
	public void user_have_to_select_the_appearance() {
		driver.findElement(By.xpath("//*[@id='appearance_lbl1']")).click();
		WebElement f6 = driver.findElement(By.xpath("//*[@id=\"appearanceErr\"]"));
		if (f6.isDisplayed()) {
			System.out.println(driver.findElement(By.xpath("//*[@id=\"appearanceErr\"]")).getText());

		} else {
			System.out.println("appearance selected");
		}
	}

	@When("user have to select the caste")
	public void user_have_to_select_the_caste() {
		WebElement w12 = driver.findElement(By.xpath("//*[@id=\"caste\"]"));
		selectIndex(w12, 1);
		WebElement f7 = driver.findElement(By.xpath("//*[@id=\"castespan\"]"));
		if (f7.isDisplayed()) {
			System.out.println(driver.findElement(By.xpath("//*[@id=\"castespan\"]")).getText());

		} else {
			System.out.println("caste selected");
		}
	}

	@When("user have to enter the subcaste")
	public void user_have_to_enter_the_subcaste() {
		driver.findElement(By.xpath("//*[@id=\"subCasteText\"]")).sendKeys("gola");

	}

	@When("user have to select Mother tongue")
	public void user_have_to_select_Mother_tongue() {
		WebElement w8 = driver.findElement(By.xpath("//*[@id='motherTongue']"));
		selectValue(w8, "Tamil");
		WebElement f8 = driver.findElement(By.xpath("//*[@id=\"motherTongueErr\"]"));
		if (f8.isDisplayed()) {
			System.out.println(driver.findElement(By.xpath("//*[@id=\"motherTongueErr\"]")).getText());

		} else {
			System.out.println("Mother tongue selected");
		}
	}

	@When("user have to select the Country living in")
	public void user_have_to_select_the_Country_living_in() {
		WebElement w14 = driver.findElement(By.xpath("//*[@id='country']"));
		selectValue(w14, "India");

	}

	@When("user have to enter Mobile No")
	public void user_have_to_enter_Mobile_No() {
		driver.findElement(By.xpath("//*[@id='mobileNo']")).sendKeys("8220553047");
		WebElement f9 = driver.findElement(By.xpath("//*[@id=\"mobileErr\"]"));
		if (f9.isDisplayed()) {
			System.out.println(driver.findElement(By.xpath("//*[@id=\"mobileErr\"]")).getText());

		} else {
			System.out.println("Phone number entered");
		}
	}

	@When("user have to enter the password")
	public void user_have_to_enter_the_password() {
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Kk8220553047");
		WebElement f10 = driver.findElement(By.xpath("//*[@id=\"passwordErr\"]"));
		if (f10.isDisplayed()) {
			System.out.println(driver.findElement(By.xpath("//*[@id=\"passwordErr\"]")).getText());

		} else {
			System.out.println("Password entered");
		}
	}

	@When("user have to click the registration")
	public void user_have_to_click_the_registration() throws InterruptedException {
		driver.findElement(By.xpath("(//*[@type='submit'])[2]")).click();
		Thread.sleep(5000);

	}

	@When("user have to enter the mail id")
	public void user_have_to_enter_the_mail_id() throws Exception {
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("kaviselva6@gmail.com");

		WebElement g11 = driver.findElement(By.xpath("(//*[@class='error'])[1]"));
		if (g11.isDisplayed()) {
			System.out.println(driver.findElement(By.xpath("(//*[@class='error'])[1]")).getText());

		} else {
			System.out.println("email entered");
		}
	}

	@When("user have to select height")
	public void user_have_to_select_height() {
		WebElement w15 = driver.findElement(By.xpath("//*[@id=\"heightFeet\"]"));
		selectValue(w15, "5 feet");
		WebElement f12 = driver.findElement(By.xpath("//*[@for=\"heightFeet\"]"));
		if (f12.isDisplayed()) {
			System.out.println(driver.findElement(By.xpath("//*[@for=\"heightFeet\"]")).getText());

		} else {
			System.out.println("height selected");
		}
	}

	@When("user have to select physical status")
	public void user_have_to_select_physical_status() {
		driver.findElement(By.xpath("//*[@id='physicalStatuss0']")).click();
		// driver.findElement(By.xpath("//*[@id='physicalStatuss1']")).click();

	}

	@When("user have to select location")
	public void user_have_to_select_location() {
		WebElement w16 = driver.findElement(By.xpath("//*[@id=\"residingState\"]"));
		selectValue(w16, "Tamil Nadu");
		WebElement f13 = driver.findElement(By.xpath("//*[@for=\"residingState\"]"));
		if (f13.isDisplayed()) {
			System.out.println(driver.findElement(By.xpath("//*[@for=\"residingState\"]")).getText());

		} else {
			System.out.println("resing state selected");
		}
		WebElement w17 = driver.findElement(By.xpath("//*[@id=\"residingCityMainDistId\"]"));
		selectValue(w17, "Chennai");
		WebElement f14 = driver.findElement(By.xpath("//*[@for=\"residingCityId\"]"));
		if (f14.isDisplayed()) {
			System.out.println(driver.findElement(By.xpath("//*[@for=\"residingCityId\"]")).getText());

		} else {
			System.out.println("residingcity selected");
		}
		WebElement w18 = driver.findElement(By.xpath("//*[@id=\"citizenship\"]"));
		selectValue(w18, "India");
		// WebElement f15 = driver.findElement(By.xpath("//*[@for=\"citizenship\"]"));
		// if (f15.isDisplayed()) {
		// System.out.println(driver.findElement(By.xpath("//*[@for=\"citizenship\"]")).getText());
		//
		// } else {
		// System.out.println("citizenship selected");
		// }
	}

	@When("user have to select religious information")
	public void user_have_to_select_religious_information() {
		driver.findElement(By.xpath("//*[@id=\"labelsamecaste1\"]")).click();
		// driver.findElement(By.xpath("//*[@id=\"labelsamecaste2\"]")).click();

	}

	@When("user have to select education and profession")
	public void user_have_to_select_education_and_profession() {
		WebElement w19 = driver.findElement(By.xpath("//*[@id='educationCategory']"));
		selectValue(w19, "BE");
		WebElement f16 = driver.findElement(By.xpath("//*[@for=\"educationCategory\"]"));
		if (f16.isDisplayed()) {
			System.out.println(driver.findElement(By.xpath("//*[@for=\"educationCategory\"]")).getText());

		} else {
			System.out.println("education category selected");
		}

		// driver.findElement(By.xpath("//*[@id=\"employmentCategorys1\"]")).click();
		// driver.findElement(By.xpath("//*[@id=\"employmentCategorys2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"employmentCategorys3\"]")).click();
		// driver.findElement(By.xpath("//*[@id=\"employmentCategorys4\"]")).click();
		// driver.findElement(By.xpath("//*[@id=\"employmentCategorys6\"]")).click();
		// driver.findElement(By.xpath("//*[@id=\"employmentCategorys7\"]")).click();

		WebElement f17 = driver.findElement(By.xpath("(//*[@class='error'])[7]"));
		if (f17.isDisplayed()) {
			System.out.println(driver.findElement(By.xpath("(//*[@class='error'])[7]")).getText());

		} else {
			System.out.println("employement category selected");
		}

		WebElement w20 = driver.findElement(By.xpath("//*[@id='occupation']"));
		selectValue(w20, "Manager");
		WebElement f18 = driver.findElement(By.xpath("//*[@for=\"occupation\"]"));
		if (f18.isDisplayed()) {
			System.out.println(driver.findElement(By.xpath("//*[@for=\"occupation\"]")).getText());

		} else {
			System.out.println("occupation selected");
		}

		WebElement w21 = driver.findElement(By.xpath("//*[@name=\"annualIncome\"]"));
		selectValue(w21, "5 - 6 Lakhs");
		WebElement f19 = driver.findElement(By.xpath("//*[@for=\"annualIncome\"]"));
		if (f19.isDisplayed()) {
			System.out.println(driver.findElement(By.xpath("//*[@for=\"annualIncome\"]")).getText());

		} else {
			System.out.println("annual income selected");
		}

	}

	@When("user have to select family information")
	public void user_have_to_select_family_information() throws Exception {
		Thread.sleep(5000);
		// driver.findElement(By.xpath("//*[@id=\"parentContact\"]")).sendKeys("6578965780");
		driver.findElement(By.xpath("//*[@id='familyValues1']")).click();
		// driver.findElement(By.xpath("//*[@id='familyValues2']")).click();
		// driver.findElement(By.xpath("//*[@id='familyValues3']")).click();
		// driver.findElement(By.xpath("//*[@id='familyValues4']")).click();

		// WebElement f20 = driver.findElement(By.xpath("(//*[@class=\"error\"])[10]"));
		// if (f20.isDisplayed()) {
		// System.out.println(driver.findElement(By.xpath("(//*[@class=\"error\"])[10]")).getText());
		//
		// } else {
		// System.out.println("Family value selected");
		// }

		// driver.findElement(By.xpath("//*[@id='familyTypes1']")).click();
		driver.findElement(By.xpath("//*[@id='familyTypes2']")).click();
		// WebElement f21 =
		// driver.findElement(By.xpath("//*[@id='familyTypes2']/following-sibling::*"));
		// if (f21.isDisplayed()) {
		// System.out.println(driver.findElement(By.xpath("//*[@id='familyTypes2']/following-sibling::*")).getText());
		//
		// } else {
		// System.out.println("Family type selected");
		//
		// }

		// driver.findElement(By.xpath("//*[@id='familyStatuss1']")).click();
		driver.findElement(By.xpath("//*[@id='familyStatuss2']")).click();
		// driver.findElement(By.xpath("//*[@id='familyStatuss3']")).click();

		// WebElement f22 =
		// driver.findElement(By.xpath("//*[@id='familyStatuss4']/following-sibling::*"));
		// if (f22.isDisplayed()) {
		// System.out.println(driver.findElement(By.xpath("//*[@id='familyStatuss4']/following-sibling::*")).getText());
		//
		// } else {
		// System.out.println("family status selected");
		// }
		//
	}

	@When("user have to enter about")
	public void user_have_to_enter_about() {
		System.out.println(driver.findElement(By.xpath("//*[@id='DESCDET']")).getText());

		// WebElement f23 = driver.findElement(By.xpath("(//*[@class='error'])[13]"));
		// if (f23.isDisplayed()) {
		// System.out.println(driver.findElement(By.xpath("(//*[@class='error'])[13]")).getText());
		//
		// } else {
		// System.out.println("about");
		// }

	}

	@When("user have to enter the complete registration")
	public void user_have_to_enter_the_complete_registration() {
		driver.findElement(By.xpath("//*[@value=\"COMPLETE REGISTRATION\"]")).click();

	}

	@Then("user should be invalid credentials page")
	public void user_should_be_invalid_credentials_page() {

	}

	// another registration method

	@When("user have to enter matrimony")
	public void user_have_to_enter_matrimony() throws InterruptedException {
		loadUrl("https://www.agarwalmatrimony.com");

	}

	@When("user have to select Matrimony Profile")
	public void user_have_to_select_Matrimony_Profile() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"selectprofile\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='genderflag1']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"gender_male\"]/preceding-sibling::*")).click();

	}

	@When("user have to enter name")
	public void user_have_to_enter_name() {
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("abcdfgyje");
	}

	@When("user have to enter Mobile Number")
	public void user_have_to_enter_Mobile_Number() {
		driver.findElement(By.xpath("//*[@id=\"mobileNo\"]")).sendKeys("7894563786");

	}

	@When("user have to click register")
	public void user_have_to_click_register() {
		driver.findElement(By.xpath("(//*[@type=\"submit\"])[1]")).click();

	}

	@When("user have to select the date of birth page")
	public void user_have_to_select_the_date_of_birth_page() throws InterruptedException {
		driver.findElement(By.id("DOB")).click();

		WebElement w25 = driver.findElement(By.xpath("//*[@class=\"ui-datepicker-year\"]"));
		selectValue(w25, "1997");

		WebElement w26 = driver.findElement(By.xpath("//*[@class=\"ui-datepicker-month\"]"));

		selectValue(w26, "Sep");

		driver.findElement(By.xpath("(//*[@href='#'])[17]")).click();
		WebElement f = driver.findElement(By.xpath("//*[@id=\"dobErrMsg\"]"));
		if (f.isDisplayed()) {
			System.out.println(driver.findElement(By.xpath("//*[@id=\"dobErrMsg\"]")).getText());

		} else {
			System.out.println("correct age");
		}

	}

	@When("user have to select the appearance page")
	public void user_have_to_select_the_appearance_page() {
		// driver.findElement(By.xpath("//*[@id=\"appearance1\"]")).click();
		// driver.findElement(By.xpath("//*[@id=\"appearance2\"]")).click();

	}

	@When("user have to select the caste page")
	public void user_have_to_select_the_caste_page() {
		// WebElement w27 = driver.findElement(By.xpath("//*[@id=\"caste\"]"));
		// selectValue(w27, "Ghumar");
		WebElement w27 = driver.findElement(By.xpath("//*[@id=\"religion\"]"));
		selectValue(w27, "Hindu");

	}

	@When("user have to enter subcaste")
	public void user_have_to_enter_subcaste() {

		WebElement l = driver.findElement(By.xpath("//*[@id=\"subCaste\"]"));
		selectIndex(l, 1);
		// driver.findElement(By.xpath("//*[@id=\"subCasteText\"]")).sendKeys("gothra");
	}

	@When("user have to select mother tongue")
	public void user_have_to_select_mother_tongue() {
		WebElement w28 = driver.findElement(By.xpath("//*[@id=\"motherTongue\"]"));
		selectValue(w28, "Tamil");

	}

	@When("user have to enter email")
	public void user_have_to_enter_email() {
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("abceudwehghfgi@gmail.com");
	}

	@When("user have to enter password")
	public void user_have_to_enter_password() {
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("afgagh");

	}

	@When("user have to click continue")
	public void user_have_to_click_continue() {
		driver.findElement(By.xpath("(//*[@type=\"submit\"])[2]")).click();
	}

	@When("user have to enter the astrology details")
	public void user_have_to_enter_the_astrology_details() throws InterruptedException {
		WebElement w40 = driver.findElement(By.xpath("//*[@id=\"star\"]"));
		selectValue(w40, "Swathi");
		JavascriptExecutor j = (JavascriptExecutor) driver;

		WebElement w41 = driver.findElement(By.xpath("//*[@id ='raasi']"));
		selectValue(w41, "Kumbh (Aquarius)");
		// driver.findElement(By.xpath("//*[@for=\"manglik1\"]")).click();
		driver.findElement(By.xpath("//*[@for=\"manglik2\"]")).click();
		// driver.findElement(By.xpath("//*[@for=\"manglik3\"]")).click();

		WebElement w43 = driver.findElement(By.xpath("//*[@id ='hours']"));

		j.executeScript("arguments[0].scrollIntoView(true);", w43);
		selectValue(w43, "12");
		WebElement w44 = driver.findElement(By.xpath("//*[@id ='mins']"));
		j.executeScript("arguments[0].scrollIntoView(true);", w44);

		selectValue(w44, "35");
		WebElement w45 = driver.findElement(By.xpath("//*[@id ='meridiem']"));
		j.executeScript("arguments[0].scrollIntoView(true);", w45);
		selectValue(w45, "AM");

		WebElement w46 = driver.findElement(By.xpath("//*[@id ='birth_country']"));

		j.executeScript("arguments[0].scrollIntoView(true);", w46);
		selectValue(w46, "India");
		Thread.sleep(3000);
		WebElement w47 = driver.findElement(By.xpath("//*[@id ='birth_state']"));
		j.executeScript("arguments[0].scrollIntoView(true);", w47);
		selectText(w47, "Tamil Nadu");

		Thread.sleep(5000);
		WebElement w48 = driver.findElement(By.xpath("//*[@id=\"birth_city\"]"));
		j.executeScript("arguments[0].scrollIntoView(true);", w48);
		selectText(w48, "Coimbatore");
		Thread.sleep(3000);
		WebElement hid1 = driver.findElement(By.xpath("(//*[@class=\"mediumtxt padt20 padb20 clr07 font20\"])[1]"));
		j.executeScript("arguments[0].scrollIntoView(true);", hid1);
		Thread.sleep(3000);

		WebElement w52 = driver.findElement(By.xpath("//*[@href=\"#next\"]"));
		j.executeScript("arguments[0].click();", w52);

	}

	@When("user have to select caste")
	public void user_have_to_select_caste() throws InterruptedException {
		Thread.sleep(5000);
		// driver.findElement(By.xpath("//*[@id=\"labelsamecaste1\"]")).click();
		// driver.findElement(By.xpath("//*[@id=\"labelsamecaste2\"]")).click();
		// driver.findElement(By.xpath("//*[@href=\"#next\"]")).click();

	}

	@When("user have to select Personal details will fetch better matching results")
	public void user_have_to_select_Personal_details_will_fetch_better_matching_results() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"mStatus1\"]")).click();
		// driver.findElement(By.xpath("//*[@id=\"mStatus2\"]")).click();
		// driver.findElement(By.xpath("//*[@id=\"mStatus3\"]")).click();
		// driver.findElement(By.xpath("//*[@id=\"mStatus4\"]")).click();
		WebElement w29 = driver.findElement(By.xpath("//*[@id=\"heightFeet\"]"));
		selectValue(w29, "5 feet");
		driver.findElement(By.xpath("//*[@id=\"familyStatuss1\"]")).click();
		// driver.findElement(By.xpath("//*[@id=\"familyStatuss2\"]")).click();
		// driver.findElement(By.xpath("//*[@id=\"familyStatuss4\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"familyTypes1\"]")).click();
		// driver.findElement(By.xpath("//*[@id=\"familyTypes2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"physicalStatuss0\"]")).click();
		// driver.findElement(By.xpath("//*[@id=\"physicalStatuss1\"]")).click();
		driver.findElement(By.xpath("//*[@href=\"#next\"]")).click();

	}

	@When("user have to select Professional details help to get like-minded matches")
	public void user_have_to_select_Professional_details_help_to_get_like_minded_matches() throws InterruptedException {
		WebElement w30 = driver.findElement(By.xpath("//*[@id = 'educationCategory']"));
		selectValue(w30, "BE");
		// driver.findElement(By.xpath("//*[@id = 'employmentCategorys1']")).click();
		// driver.findElement(By.xpath("//*[@id = 'employmentCategorys2']")).click();
		driver.findElement(By.xpath("//*[@id = 'employmentCategorys3']")).click();
		// driver.findElement(By.xpath("//*[@id = 'employmentCategorys4']")).click();
		// driver.findElement(By.xpath("//*[@id = 'employmentCategorys6']")).click();
		// driver.findElement(By.xpath("//*[@id = 'employmentCategorys7']")).click();
		WebElement w31 = driver.findElement(By.xpath("//*[@id = 'occupation']"));
		selectValue(w31, "Manager");
		WebElement w32 = driver.findElement(By.xpath("//*[@id = 'annualIncomeCurrency']"));
		selectValue(w32, "India - Rs.");
		WebElement w33 = driver.findElement(By.xpath("(//*[@id = 'annualIncome'])[1]"));
		selectValue(w33, "5 - 6 Lakhs");
		WebElement w34 = driver.findElement(By.xpath("//*[@id = 'country']"));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].scrollIntoView(true);", w34);
		selectValue(w34, "India");
		WebElement w35 = driver.findElement(By.xpath("//*[@id=\"residingState\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", w35);

		selectValue(w35, "Tamil Nadu");
		WebElement w36 = driver.findElement(By.xpath("//*[@id ='residingCityMainDistId']"));
		j.executeScript("arguments[0].scrollIntoView(true);", w36);

		selectValue(w36, "Chennai");
		WebElement hid2 = driver.findElement(By.xpath("(//*[@class=\"mediumtxt padt20 padb20 clr07 font20\"])[3]"));
		j.executeScript("arguments[0].scrollIntoView(true);", hid2);
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@href=\"#next\"]")).click();
	}

	@When("user have to Write a brief introduction about you in your own words")
	public void user_have_to_Write_a_brief_introduction_about_you_in_your_own_words() {
		WebElement w37 = driver.findElement(By.xpath("//*[@id=\"DESCDET\"]"));
		enteredTxt(w37);

	}

	@When("user have to click complete registration")
	public void user_have_to_click_complete_registration() {
		driver.findElement(By.xpath("//*[@href=\"#finish\"]")).click();
	}

	@Then("user should be invalid credentials pagetwo")
	public void user_should_be_invalid_credentials_pagetwo() {

	}

	// login module
	@When("user have to enter the login url")
	public void user_have_to_enter_the_login_url() throws Throwable {
		loadUrl("https://www.communitymatrimony.com/login/");
		Thread.sleep(4000);

	}

	@When("user have to enter valid username and password")
	public void user_have_to_enter_valid_username_and_password() {
		driver.findElement(By.xpath("//*[@id='idEmail']")).sendKeys("Aravindkmrt@gmail.com");
		WebElement pass = driver.findElement(By.xpath("//*[@id='password']"));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].setAttribute('value','Aravind1723')", pass);

	}

	@When("user have to click the submit button")
	public void user_have_to_click_the_submit_button() {
		driver.findElement(By.xpath("(//*[@value='Login'])[2]")).click();
	}

	@When("user have to enter skip")
	public void user_have_to_enter_skip() throws Throwable {
		Thread.sleep(5000);
alertAccept2();
//		driver.findElement(By.xpath("//*[@class=\"clr7 font16\"]")).click();
		Thread.sleep(5000);
		alertAccept1();
		// driver.findElement(By.xpath("//*[@alt='close']")).click();
		// Thread.sleep(5000);

	}

	@When("user have to click profile")
	public void user_have_to_click_profile() {
		WebElement w12 = driver.findElement(By.xpath("//*[@class='prfile_icon']"));
		toMove(w12);

	}

	@When("user have to click edit profile")
	public void user_have_to_click_edit_profile() throws Exception {
		WebElement cli = driver.findElement(By.xpath("//*[@class='settings-editprofile']"));
		btnClick(cli);
	}

	@When("user have to click edit profile created by")
	public void user_have_to_click_edit_profile_created_by() throws Throwable {
		setExcelData("aravind", 1, 1, "before changed");
		System.out.println("Before changed");
		setExcelData("aravind", 1, 2, "After changed");
		WebElement name = driver.findElement(By.xpath("//*[@for='createdfor']"));
		Txtexcel(name, "aravind", 0, 2);
		WebElement get1 = driver.findElement(By.xpath("//*[@id=\"createdfor\"]"));
		firstSelected(get1);
		writeDataFromExcelfirstselected(get1, "aravind", 1, 2);
		System.out.println("After changed");
		selectIndex(get1, 2);
		Txt(name);
		firstSelected(get1);
		writeDataFromExcelfirstselected(get1, "aravind", 2, 2);	}

	@When("user have to click edit profile name")
	public void user_have_to_click_edit_profile_name() throws Throwable {
		System.out.println("Before changed");
		WebElement name = driver.findElement(By.xpath("//*[@id=\"frmProfile\"]/dl[3]/dt/label"));
		Txtexcel(name, "aravind", 0, 3);
		WebElement get2 = driver.findElement(By.xpath("//*[@id=\"name\"]"));
		enteredTxt(get2);
		writeDataFromExcelenteredtxt(get2, "aravind", 1, 3);
		System.out.println("After changed");
		get2.clear();
		toInput(get2, "manoj");
		Txt(name);
		enteredTxt(get2);
		writeDataFromExcelenteredtxt(get2, "aravind", 2, 3);

	}

	@When("user have to click edit profile date of birth")
	public void user_have_to_click_edit_profile_date_of_birth() throws Throwable {
		String s7 = "date";
		setExcelData("aravind", 0, 4, s7);
		System.out.println("Before changed");
		WebElement get3 = driver.findElement(By.xpath("//*[@id=\"dobDay\"]"));
		firstSelecteddob(get3, s7);
		writeDataFromExcelfirstselected(get3, "aravind", 1, 4);
		System.out.println("After changed");

		selectIndex(get3, 3);
		firstSelecteddob(get3, s7);
		writeDataFromExcelfirstselected(get3, "aravind", 2, 4);
		String s8 = "month";
		setExcelData("aravind", 0, 5, s8);
		System.out.println("Before changed");
		WebElement get4 = driver.findElement(By.xpath("//*[@id=\"dobMonth\"]"));
		firstSelecteddob(get4, s8);
		writeDataFromExcelfirstselected(get4, "aravind", 1, 5);
		System.out.println("After changed");
		selectIndex(get4, 4);
		firstSelecteddob(get4, s8);
		writeDataFromExcelfirstselected(get4, "aravind", 2, 5);
		String s9 = "year";
		setExcelData("aravind", 0, 6, s9);
		System.out.println("Before changed");
		WebElement get5 = driver.findElement(By.xpath("//*[@id=\"dobYear\"]"));
		firstSelecteddob(get5, s9);
		writeDataFromExcelfirstselected(get5, "aravind", 1, 6);
		System.out.println("After changed");
		selectValue(get5, "1998");
		firstSelecteddob(get5, s9);
		writeDataFromExcelfirstselected(get5, "aravind", 2, 6);

	}

	@When("user have to click edit profile marital status")
	public void user_have_to_click_edit_profile_marital_status() throws Throwable {
		// List<WebElement> radios =
		// driver.findElements(By.xpath("//*[@name=\"maritalStatus\"]"));
		//
		// clickall(radios);
		System.out.println("Before changed");
		WebElement bol1 = driver.findElement(By.xpath("//*[@id='maritalStatus1']"));

		boolean ab1 = bol1.isSelected();
		if (ab1 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"maritalStatusDivId\"]/dl[2]/dt/label"));
			Txtexcel(name, "aravind", 0, 7);
			WebElement bolsib1 = driver.findElement(By.xpath("//*[@id='maritalStatus1']/following-sibling::*"));

			String s1 = bolsib1.getText();
			System.out.println(":" + s1);
			writeDataFromExcelselecteddtxt(bolsib1, "aravind", 1, 7);
		}

		WebElement bol2 = driver.findElement(By.xpath("//*[@id='maritalStatus2']"));

		boolean ab2 = bol2.isSelected();
		if (ab2 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"maritalStatusDivId\"]/dl[2]/dt/label"));
			Txtexcel(name, "aravind", 0, 7);
			WebElement bolsib2 = driver.findElement(By.xpath("//*[@id='maritalStatus2']/following-sibling::*"));
			String s2 = bolsib2.getText();
			System.out.println(":" + s2);
			writeDataFromExcelselecteddtxt(bolsib2, "aravind", 1, 7);
		}

		WebElement bol3 = driver.findElement(By.xpath("//*[@id='maritalStatus3']"));
		boolean ab3 = bol3.isSelected();
		if (ab3 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"maritalStatusDivId\"]/dl[2]/dt/label"));
			Txtexcel(name, "aravind", 0, 7);
			WebElement bolsib3 = driver.findElement(By.xpath("//*[@id='maritalStatus3']/following-sibling::*"));
			String s3 = bolsib3.getText();
			System.out.println(":" + s3);
			writeDataFromExcelselecteddtxt(bolsib3, "aravind", 1, 7);
		}

		WebElement bol4 = driver.findElement(By.xpath("//*[@id='maritalStatus4']"));
		boolean ab4 = bol4.isSelected();
		if (ab4 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"maritalStatusDivId\"]/dl[2]/dt/label"));
			Txtexcel(name, "aravind", 0, 7);
			WebElement bolsib4 = driver.findElement(By.xpath("//*[@id='maritalStatus4']/following-sibling::*"));
			String s4 = bolsib4.getText();
			System.out.println(":" + s4);
			writeDataFromExcelselecteddtxt(bolsib4, "aravind", 1, 7);
		}

	}

	@When("user have to click edit profile marital status edit")
	public void user_have_to_click_edit_profile_marital_status_edit() throws Throwable {
		System.out.println("After changed");
		WebElement bol1 = driver.findElement(By.xpath("//*[@id='maritalStatus2']"));
		toClick(bol1);

		boolean ab1 = bol1.isSelected();
		if (ab1 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"maritalStatusDivId\"]/dl[2]/dt/label"));
			Txtexcel(name, "aravind", 0, 7);
			WebElement bolsib1 = driver.findElement(By.xpath("//*[@id='maritalStatus2']/following-sibling::*"));

			String s1 = bolsib1.getText();
			System.out.println(":" + s1);
			writeDataFromExcelselecteddtxt(bolsib1, "aravind", 2, 7);
		}

		WebElement bol2 = driver.findElement(By.xpath("//*[@id='maritalStatus1']"));

		boolean ab2 = bol2.isSelected();
		if (ab2 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"maritalStatusDivId\"]/dl[2]/dt/label"));
			Txtexcel(name, "aravind", 0, 7);
			WebElement bolsib2 = driver.findElement(By.xpath("//*[@id='maritalStatus1']/following-sibling::*"));
			String s2 = bolsib2.getText();
			System.out.println(":" + s2);
			writeDataFromExcelselecteddtxt(bolsib2, "aravind", 2, 8);
		}

		WebElement bol3 = driver.findElement(By.xpath("//*[@id='maritalStatus3']"));
		boolean ab3 = bol3.isSelected();
		if (ab3 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"maritalStatusDivId\"]/dl[2]/dt/label"));
			Txtexcel(name, "aravind", 0, 7);
			WebElement bolsib3 = driver.findElement(By.xpath("//*[@id='maritalStatus3']/following-sibling::*"));
			String s3 = bolsib3.getText();
			System.out.println(":" + s3);
			writeDataFromExcelselecteddtxt(bolsib3, "aravind", 2, 9);

		}

		WebElement bol4 = driver.findElement(By.xpath("//*[@id='maritalStatus4']"));
		boolean ab4 = bol4.isSelected();
		if (ab4 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"maritalStatusDivId\"]/dl[2]/dt/label"));
			Txtexcel(name, "aravind", 0, 7);
			WebElement bolsib4 = driver.findElement(By.xpath("//*[@id='maritalStatus4']/following-sibling::*"));
			String s4 = bolsib4.getText();
			System.out.println(":" + s4);
			writeDataFromExcelselecteddtxt(bolsib4, "aravind", 2, 10);
		}

	}

	@When("user have to click edit profile height")
	public void user_have_to_click_edit_profile_height() throws Throwable {
		System.out.println("Before changed");
		WebElement name = driver.findElement(By.xpath("//*[@id=\"frmProfile\"]/dl[7]/dt/label"));
		Txtexcel(name, "aravind", 0, 11);
		WebElement get7 = driver.findElement(By.xpath("//*[@id=\"heightFeet\"]"));
		firstSelected(get7);
		writeDataFromExcelfirstselected(get7, "aravind", 1, 11);
		System.out.println("After changed");
		selectValue(get7, "4 feet");

		Txt(name);
		firstSelected(get7);
		writeDataFromExcelfirstselected(get7, "aravind", 2, 11);

	}

	@When("user have to click edit profile weight")
	public void user_have_to_click_edit_profile_weight() throws Throwable {
		System.out.println("Before changed");
		WebElement name = driver.findElement(By.xpath("//*[@id=\"frmProfile\"]/dl[9]/dt/label"));
		Txtexcel(name, "aravind", 0, 12);
		WebElement get8 = driver.findElement(By.xpath("//*[@id=\"weightKgs\"]"));
		firstSelected(get8);
		writeDataFromExcelfirstselected(get8, "aravind", 1, 12);
		System.out.println("After changed");
		selectIndex(get8, 9);
		Txt(name);
		firstSelected(get8);
		writeDataFromExcelfirstselected(get8, "aravind", 2, 12);
	}

	@When("user have to click edit profile physical status")
	public void user_have_to_click_edit_profile_physical_status() throws Throwable {
		System.out.println("Before changed");
		WebElement get10 = driver.findElement(By.xpath("//*[@id=\"physicalStatus0\"]"));
		boolean ab1 = get10.isSelected();
		if (ab1 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"frmProfile\"]/dl[11]/dt/label"));
			Txtexcel(name, "aravind", 0, 13);

			WebElement physi = driver.findElement(By.xpath("//*[@id=\"physicalStatus0\"]/following-sibling::*"));

			String s1 = physi.getText();
			System.out.println(":" + s1);
			writeDataFromExcelselecteddtxt(physi, "aravind", 1, 13);
		}

		WebElement get9 = driver.findElement(By.xpath("//*[@id=\"physicalStatus1\"]"));
		toClick(get9);
		boolean ab2 = get9.isSelected();
		if (ab2 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"frmProfile\"]/dl[11]/dt/label"));
			Txtexcel(name, "aravind", 0, 13);
			WebElement physi1 = driver.findElement(By.xpath("//*[@id=\"physicalStatus1\"]/following-sibling::*"));

			String s1 = physi1.getText();
			System.out.println(":" + s1);
			writeDataFromExcelselecteddtxt(physi1, "aravind", 2, 13);
		}

	}

	@When("user have to click edit profile subcaste")
	public void user_have_to_click_edit_profile_subcaste() throws Throwable {
		System.out.println("Before changed");
		WebElement name = driver.findElement(By.xpath("//*[@id=\"subcastelbl\"]/label"));
		Txtexcel(name, "aravind", 0, 14);
		WebElement get11 = driver.findElement(By.xpath("//*[@id=\"subCaste\"]"));
		firstSelected(get11);
		writeDataFromExcelfirstselected(get11, "aravind", 1, 14);
		System.out.println("After changed");
		selectIndex(get11, 4);
		Txt(name);
		firstSelected(get11);
		writeDataFromExcelfirstselected(get11, "aravind", 2, 14);

	}

	@When("user have to click edit profile mother tongue")
	public void user_have_to_click_edit_profile_mother_tongue() throws Throwable {
		System.out.println("Before changed");
		WebElement name = driver.findElement(By.xpath("//*[@id=\"mtonglbl\"]/label"));
		Txtexcel(name, "aravind", 0, 15);
		WebElement get12 = driver.findElement(By.xpath("//*[@id=\"motherTongue\"]"));
		firstSelected(get12);
		writeDataFromExcelfirstselected(get12, "aravind", 1, 15);
		System.out.println("After changed");
		selectIndex(get12, 6);
		Txt(name);
		firstSelected(get12);
		writeDataFromExcelfirstselected(get12, "aravind", 2, 15);

	}

	@When("user have to click edit profile languages known")
	public void user_have_to_click_edit_profile_languages_known() throws IOException {

		// Pojom pj = new Pojom();
		// PageFactory.initElements(driver, Pojom.class);
		// int j = 0;
		// List<WebElement> spoken = pj.getSpoken();
		// for (int i = 1; i < spoken.size(); i++) {
		// String s1 = spoken.get(i).getText();
		// createExcel("spoken", "list", 0, 0);
		// writeExcel("spoken", i, j, s1);
		// System.out.println(s1);
		// System.out.println("Done!");
		// }

	}
	// WebElement lang =
	// driver.findElement(By.xpath("//*[@id=\"spokenLanguagesTemp\"]"));
	// selectIndex(lang, 5);
	// for (int j = 0; j < radios.size(); j++) {
	//
	// System.out.println(radios.get(j).getText());
	// String string1 = radios.get(j).getAttribute("value");
	// System.out.println(string1);
	//
	// }

	@When("user have to click edit profile gothra")
	public void user_have_to_click_edit_profile_gothra() throws Throwable {
		System.out.println("Before changed");
		WebElement name = driver.findElement(By.xpath("//*[@id=\"frmProfile\"]/dl[15]/dt/label"));
		Txtexcel(name, "aravind", 0, 16);
		WebElement get14 = driver.findElement(By.xpath("//*[@id=\"gothramOthers\"]"));
		enteredTxt(get14);
		writeDataFromExcelenteredtxt(get14, "aravind", 1, 16);
		System.out.println("After changed");
		get14.clear();
		toInput(get14, "siva");
		Txt(name);
		enteredTxt(get14);
		writeDataFromExcelenteredtxt(get14, "aravind", 2, 16);

	}

	@When("user have to click edit profile star")
	public void user_have_to_click_edit_profile_star() throws Throwable {
		System.out.println("Before changed");
		WebElement name = driver.findElement(By.xpath("//*[@id=\"frmProfile\"]/dl[17]/dt/label"));
		Txtexcel(name, "aravind", 0, 17);
		WebElement get15 = driver.findElement(By.xpath("//*[@id=\"star\"]"));
		firstSelected(get15);
		writeDataFromExcelfirstselected(get15, "aravind", 1, 17);
		System.out.println("After changed");
		selectIndex(get15, 6);
		Txt(name);
		firstSelected(get15);
		writeDataFromExcelfirstselected(get15, "aravind", 2, 17);
	}

	@When("user have to click edit profile rasi")
	public void user_have_to_click_edit_profile_rasi() throws Throwable {
		System.out.println("Before changed");
		WebElement name = driver.findElement(By.xpath("//*[@id=\"frmProfile\"]/dl[19]/dt/label"));
		Txtexcel(name, "aravind", 0, 18);
		WebElement get16 = driver.findElement(By.xpath("//*[@id=\"raasi\"]"));
		firstSelected(get16);
		writeDataFromExcelfirstselected(get16, "aravind", 1, 18);
		System.out.println("After changed");
		selectIndex(get16, 8);
		Txt(name);
		firstSelected(get16);
		writeDataFromExcelfirstselected(get16, "aravind", 2, 18);
	}

	@When("user have to click edit profile chevvai dosham")
	public void user_have_to_click_edit_profile_chevvai_dosham() throws Throwable {
		System.out.println("Before changed");
		WebElement get17 = driver.findElement(By.xpath("//*[@id=\"dosham1\"]"));
		boolean ab2 = get17.isSelected();
		if (ab2 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"ChevvaiDoshamDiv\"]/div[1]/dt/label"));
			Txtexcel(name, "aravind", 0, 19);
			WebElement dosh = driver.findElement(By.xpath("//*[@id=\"dosham1\"]/following-sibling::*"));

			String s1 = dosh.getText();
			System.out.println(":" + s1);
			writeDataFromExcelselecteddtxt(dosh, "aravind", 1, 19);
		}

		WebElement get19 = driver.findElement(By.xpath("//*[@id=\"dosham2\"]"));
		boolean ab1 = get19.isSelected();
		if (ab1 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"ChevvaiDoshamDiv\"]/div[1]/dt/label"));
			Txtexcel(name, "aravind", 0, 19);
			WebElement dosh1 = driver.findElement(By.xpath("//*[@id=\"dosham2\"]/following-sibling::*"));

			String s2 = dosh1.getText();
			System.out.println(":" + s2);
			writeDataFromExcelselecteddtxt(dosh1, "aravind", 1, 19);
		}

		WebElement get20 = driver.findElement(By.xpath("//*[@id=\"dosham3\"]"));
		boolean ab3 = get20.isSelected();
		if (ab3 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"ChevvaiDoshamDiv\"]/div[1]/dt/label"));
			Txtexcel(name, "aravind", 0, 19);
			WebElement dosh2 = driver.findElement(By.xpath("//*[@id=\"dosham3\"]/following-sibling::*"));

			String s3 = dosh2.getText();
			System.out.println(":" + s3);
			writeDataFromExcelselecteddtxt(dosh2, "aravind", 1, 19);
		}

	}

	@When("user have to click edit profile chevvai dosham edit")
	public void user_have_to_click_edit_profile_chevvai_dosham_edit() throws Throwable {
		System.out.println("After changed");
		WebElement get20 = driver.findElement(By.xpath("//*[@id=\"dosham3\"]"));
		toClick(get20);
		boolean ab3 = get20.isSelected();
		if (ab3 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"ChevvaiDoshamDiv\"]/div[1]/dt/label"));
			Txtexcel(name, "aravind", 0, 19);
			WebElement dosh2 = driver.findElement(By.xpath("//*[@id=\"dosham3\"]/following-sibling::*"));

			String s3 = dosh2.getText();
			System.out.println(":" + s3);
			writeDataFromExcelselecteddtxt(dosh2, "aravind", 2, 19);
		}

		WebElement get19 = driver.findElement(By.xpath("//*[@id=\"dosham2\"]"));
		boolean ab1 = get19.isSelected();
		if (ab1 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"ChevvaiDoshamDiv\"]/div[1]/dt/label"));
			Txtexcel(name, "aravind", 0, 19);
			WebElement dosh1 = driver.findElement(By.xpath("//*[@id=\"dosham2\"]/following-sibling::*"));

			String s2 = dosh1.getText();
			System.out.println(":" + s2);
			writeDataFromExcelselecteddtxt(dosh1, "aravind", 2, 19);
		}

		WebElement get17 = driver.findElement(By.xpath("//*[@id=\"dosham1\"]"));
		boolean ab2 = get17.isSelected();
		if (ab2 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"ChevvaiDoshamDiv\"]/div[1]/dt/label"));
			Txtexcel(name, "aravind", 0, 19);
			WebElement dosh = driver.findElement(By.xpath("//*[@id=\"dosham1\"]/following-sibling::*"));

			String s1 = dosh.getText();
			System.out.println(":" + s1);
			writeDataFromExcelselecteddtxt(dosh, "aravind", 2, 19);
		}

	}

	@When("user have to click edit profile eating habits")
	public void user_have_to_click_edit_profile_eating_habits() throws Throwable {
		System.out.println("Before changed");
		WebElement get18 = driver.findElement(By.xpath("//*[@id=\"eatingHabits1\"]"));
		boolean ab3 = get18.isSelected();
		if (ab3 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"frmProfile\"]/dl[21]/dt/label"));
			Txtexcel(name, "aravind", 0, 20);
			WebElement eatsib1 = driver.findElement(By.xpath("//*[@id=\"eatingHabits1\"]/following-sibling::*"));

			String s1 = eatsib1.getText();
			System.out.println(":" + s1);
			writeDataFromExcelselecteddtxt(eatsib1, "aravind", 1, 20);
		}

		WebElement eat1 = driver.findElement(By.xpath("//*[@id=\"eatingHabits2\"]"));
		boolean ab1 = eat1.isSelected();
		if (ab1 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"frmProfile\"]/dl[21]/dt/label"));
			Txtexcel(name, "aravind", 0, 20);
			WebElement eatsib2 = driver.findElement(By.xpath("//*[@id=\"eatingHabits2\"]/following-sibling::*"));

			String s2 = eatsib2.getText();
			System.out.println(s2);
			writeDataFromExcelselecteddtxt(eatsib2, "aravind", 1, 20);
		}
		WebElement eat2 = driver.findElement(By.xpath("//*[@id=\"eatingHabits3\"]"));

		boolean ab4 = eat2.isSelected();
		if (ab4 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"frmProfile\"]/dl[21]/dt/label"));
			Txtexcel(name, "aravind", 0, 20);
			WebElement eatsib3 = driver.findElement(By.xpath("//*[@id=\"eatingHabits3\"]/following-sibling::*"));

			String s3 = eatsib3.getText();
			System.out.println(s3);
			writeDataFromExcelselecteddtxt(eatsib3, "aravind", 1, 20);
		}

		WebElement eat3 = driver.findElement(By.xpath("//*[@id=\"eatingHabits4\"]"));
		boolean ab2 = eat3.isSelected();
		if (ab2 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"frmProfile\"]/dl[21]/dt/label"));
			Txtexcel(name, "aravind", 0, 20);
			WebElement eatsib4 = driver.findElement(By.xpath("//*[@id=\"eatingHabits4\"]/following-sibling::*"));

			String s4 = eatsib4.getText();
			System.out.println(s4);
			writeDataFromExcelselecteddtxt(eatsib4, "aravind", 1, 20);
		}

	}

	@When("user have to click edit profile eating habits edit")
	public void user_have_to_click_edit_profile_eating_habits_edit() throws Throwable {
		System.out.println("After changed");
		WebElement eat2 = driver.findElement(By.xpath("//*[@id=\"eatingHabits3\"]"));
		toClick(eat2);
		boolean ab4 = eat2.isSelected();
		if (ab4 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"frmProfile\"]/dl[21]/dt/label"));
			Txtexcel(name, "aravind", 0, 20);
			WebElement eatsib3 = driver.findElement(By.xpath("//*[@id=\"eatingHabits3\"]/following-sibling::*"));

			String s3 = eatsib3.getText();
			System.out.println(s3);
			writeDataFromExcelselecteddtxt(eatsib3, "aravind", 2, 20);
		}

		WebElement eat1 = driver.findElement(By.xpath("//*[@id=\"eatingHabits2\"]"));
		boolean ab1 = eat1.isSelected();
		if (ab1 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"frmProfile\"]/dl[21]/dt/label"));
			Txtexcel(name, "aravind", 0, 20);
			WebElement eatsib2 = driver.findElement(By.xpath("//*[@id=\"eatingHabits2\"]/following-sibling::*"));

			String s2 = eatsib2.getText();
			System.out.println(s2);
			writeDataFromExcelselecteddtxt(eatsib2, "aravind", 2, 20);
		}
		WebElement get18 = driver.findElement(By.xpath("//*[@id=\"eatingHabits1\"]"));
		boolean ab3 = get18.isSelected();
		if (ab3 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"frmProfile\"]/dl[21]/dt/label"));
			Txtexcel(name, "aravind", 0, 20);
			WebElement eatsib1 = driver.findElement(By.xpath("//*[@id=\"eatingHabits1\"]/following-sibling::*"));

			String s1 = eatsib1.getText();
			System.out.println(":" + s1);
			writeDataFromExcelselecteddtxt(eatsib1, "aravind", 2, 20);
		}

		WebElement eat3 = driver.findElement(By.xpath("//*[@id=\"eatingHabits4\"]"));
		boolean ab2 = eat3.isSelected();
		if (ab2 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"frmProfile\"]/dl[21]/dt/label"));
			Txtexcel(name, "aravind", 0, 20);
			WebElement eatsib4 = driver.findElement(By.xpath("//*[@id=\"eatingHabits4\"]/following-sibling::*"));

			String s4 = eatsib4.getText();
			System.out.println(":" + s4);
			writeDataFromExcelselecteddtxt(eatsib4, "aravind", 2, 20);
		}

	}

	@When("user have to click edit profile smoiking habits")
	public void user_have_to_click_edit_profile_smoiking_habits() throws Throwable {
		System.out.println("Before changed");
		WebElement smo1 = driver.findElement(By.xpath("//*[@id=\"smoke1\"]"));
		boolean ab1 = smo1.isSelected();
		if (ab1 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"frmProfile\"]/dl[23]/dt/label"));
			Txtexcel(name, "aravind", 0, 21);
			WebElement smosib1 = driver.findElement(By.xpath("//*[@id=\"smoke1\"]/following-sibling::*"));

			String s1 = smosib1.getText();

			System.out.println(":" + s1);
			writeDataFromExcelselecteddtxt(smosib1, "aravind", 1, 21);
		}

		WebElement smo2 = driver.findElement(By.xpath("//*[@id=\"smoke2\"]"));

		boolean ab2 = smo2.isSelected();
		if (ab2 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"frmProfile\"]/dl[23]/dt/label"));
			Txtexcel(name, "aravind", 0, 21);
			WebElement smosib2 = driver.findElement(By.xpath("//*[@id=\"smoke2\"]/following-sibling::*"));

			String s2 = smosib2.getText();
			System.out.println(":" + s2);
			writeDataFromExcelselecteddtxt(smosib2, "aravind", 1, 21);
		}

		WebElement smo3 = driver.findElement(By.xpath("//*[@id=\"smoke3\"]"));
		boolean ab3 = smo3.isSelected();
		if (ab3 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"frmProfile\"]/dl[23]/dt/label"));
			Txtexcel(name, "aravind", 0, 21);
			WebElement smosib3 = driver.findElement(By.xpath("//*[@id=\"smoke3\"]/following-sibling::*"));

			String s3 = smosib3.getText();
			System.out.println(":" + s3);
			writeDataFromExcelselecteddtxt(smosib3, "aravind", 1, 21);
		}

	}

	@When("user have to click edit profile smoiking habits edit")
	public void user_have_to_click_edit_profile_smoiking_habits_edit() throws Throwable {
		System.out.println("After changed");
		WebElement smo2 = driver.findElement(By.xpath("//*[@id=\"smoke2\"]"));
		toClick(smo2);
		boolean ab2 = smo2.isSelected();
		if (ab2 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"frmProfile\"]/dl[23]/dt/label"));
			Txtexcel(name, "aravind", 0, 21);
			WebElement smosib2 = driver.findElement(By.xpath("//*[@id=\"smoke2\"]/following-sibling::*"));

			String s2 = smosib2.getText();
			System.out.println(":" + s2);
			writeDataFromExcelselecteddtxt(smosib2, "aravind", 2, 21);
		}

		WebElement smo1 = driver.findElement(By.xpath("//*[@id=\"smoke1\"]"));
		boolean ab1 = smo1.isSelected();
		if (ab1 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"frmProfile\"]/dl[23]/dt/label"));
			Txtexcel(name, "aravind", 0, 21);
			WebElement smosib1 = driver.findElement(By.xpath("//*[@id=\"smoke1\"]/following-sibling::*"));

			String s1 = smosib1.getText();

			System.out.println(":" + s1);
			writeDataFromExcelselecteddtxt(smosib1, "aravind", 1, 21);
		}
		WebElement smo3 = driver.findElement(By.xpath("//*[@id=\"smoke3\"]"));
		boolean ab3 = smo3.isSelected();
		if (ab3 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"frmProfile\"]/dl[23]/dt/label"));
			Txtexcel(name, "aravind", 0, 21);
			WebElement smosib3 = driver.findElement(By.xpath("//*[@id=\"smoke3\"]/following-sibling::*"));

			String s3 = smosib3.getText();
			System.out.println(":" + s3);
			writeDataFromExcelselecteddtxt(smosib3, "aravind", 2, 21);
		}

	}

	@When("user have to click edit profile drinking habits")
	public void user_have_to_click_edit_profile_drinking_habits() throws Throwable {
		System.out.println("Before changed");
		WebElement smo1 = driver.findElement(By.xpath("//*[@id=\"drink1\"]"));
		boolean ab1 = smo1.isSelected();
		if (ab1 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"frmProfile\"]/dl[25]/dt/label"));
			Txtexcel(name, "aravind", 0, 22);
			WebElement drisib1 = driver.findElement(By.xpath("//*[@id=\"drink1\"]/following-sibling::*"));

			String s1 = drisib1.getText();
			System.out.println(":" + s1);
			writeDataFromExcelselecteddtxt(drisib1, "aravind", 1, 22);
		}

		WebElement smo2 = driver.findElement(By.xpath("//*[@id=\"drink2\"]"));

		boolean ab2 = smo2.isSelected();
		if (ab2 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"frmProfile\"]/dl[25]/dt/label"));
			Txtexcel(name, "aravind", 0, 22);
			WebElement drisib2 = driver.findElement(By.xpath("//*[@id=\"drink2\"]/following-sibling::*"));

			String s2 = drisib2.getText();
			System.out.println(":" + s2);
			writeDataFromExcelselecteddtxt(drisib2, "aravind", 1, 22);
		}

		WebElement smo3 = driver.findElement(By.xpath("//*[@id=\"drink3\"]"));
		boolean ab3 = smo3.isSelected();
		if (ab3 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"frmProfile\"]/dl[25]/dt/label"));
			Txtexcel(name, "aravind", 0, 22);
			WebElement drisib3 = driver.findElement(By.xpath("//*[@id=\"drink3\"]/following-sibling::*"));

			String s3 = drisib3.getText();
			System.out.println(":" + s3);
			writeDataFromExcelselecteddtxt(drisib3, "aravind", 1, 22);
		}
	}

	@When("user have to click edit profile drinking habits edit")
	public void user_have_to_click_edit_profile_drinking_habits_edit() throws Throwable {
		System.out.println("After changed");
		WebElement smo2 = driver.findElement(By.xpath("//*[@id=\"drink2\"]"));
		toClick(smo2);
		boolean ab2 = smo2.isSelected();
		if (ab2 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"frmProfile\"]/dl[25]/dt/label"));
			Txtexcel(name, "aravind", 0, 22);
			WebElement drisib2 = driver.findElement(By.xpath("//*[@id=\"drink2\"]/following-sibling::*"));

			String s2 = drisib2.getText();
			System.out.println(":" + s2);
			writeDataFromExcelselecteddtxt(drisib2, "aravind", 2, 22);
		}
		WebElement smo1 = driver.findElement(By.xpath("//*[@id=\"drink1\"]"));
		boolean ab1 = smo1.isSelected();
		if (ab1 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"frmProfile\"]/dl[25]/dt/label"));
			Txtexcel(name, "aravind", 0, 22);
			WebElement drisib1 = driver.findElement(By.xpath("//*[@id=\"drink1\"]/following-sibling::*"));

			String s1 = drisib1.getText();
			System.out.println(":" + s1);
			writeDataFromExcelselecteddtxt(drisib1, "aravind", 2, 22);
		}

		WebElement smo3 = driver.findElement(By.xpath("//*[@id=\"drink3\"]"));
		boolean ab3 = smo3.isSelected();
		if (ab3 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"frmProfile\"]/dl[25]/dt/label"));
			Txtexcel(name, "aravind", 0, 22);
			WebElement drisib3 = driver.findElement(By.xpath("//*[@id=\"drink3\"]/following-sibling::*"));

			String s3 = drisib3.getText();
			System.out.println(":" + s3);
			writeDataFromExcelselecteddtxt(drisib3, "aravind", 2, 22);
		}

	}

	@When("user have to click edit profile about")
	public void user_have_to_click_edit_profile_about() throws Throwable {
		System.out.println("Before changed");
		WebElement name = driver.findElement(By.xpath("//*[@id=\"frmProfile\"]/dl[27]/dt/label"));
		Txtexcel(name, "aravind", 0, 23);
		WebElement get22 = driver.findElement(By.xpath("//*[@id=\"description\"]"));
		enteredTxt(get22);
		writeDataFromExcelenteredtxt(get22, "aravind", 1, 23);
		System.out.println("After changed");
		get22.clear();
		toInput(get22,
				"My name is manoj and I work in the Private Sector as a Software Professional. I belong to a Upper Middle Class, Joint Family with Traditional Values. I have completed my BE.");
		Txt(name);
		enteredTxt(get22);
		writeDataFromExcelenteredtxt(get22, "aravind", 2, 23);
	}

	@When("user have to click edit profile save")
	public void user_have_to_click_edit_profile_save() {

	}

	@When("user have to click edit profile education and occupation")
	public void user_have_to_click_edit_profile_education_and_occupation() throws Exception {

		WebElement edu1 = driver.findElement(By.xpath("(//*[@class=\"title-link\"])[2]"));

		Thread.sleep(3000);
		toMove(edu1);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", edu1);
		Thread.sleep(5000);

	}

	@When("user have to click edit profile Highest Education")
	public void user_have_to_click_edit_profile_Highest_Education() throws Throwable {
		System.out.println("Before changed");
		WebElement name = driver.findElement(By.xpath("//*[@id=\"frmEducation\"]/dl[1]/dt/label/strong"));
		Txtexcel(name, "aravind", 0, 24);
		WebElement edu2 = driver.findElement(By.xpath("//*[@id=\"educationCategory\"]"));
		firstSelected(edu2);
		writeDataFromExcelfirstselected(edu2, "aravind", 1, 24);
		System.out.println("After changed");
		selectIndex(edu2, 6);
		Txt(name);
		firstSelected(edu2);
		writeDataFromExcelfirstselected(edu2, "aravind", 2, 24);

	}

	@When("user have to click edit profile College or Institution")
	public void user_have_to_click_edit_profile_College_or_Institution() throws Throwable {
		System.out.println("Before changed");
		WebElement name = driver.findElement(By.xpath("//*[@id=\"frmEducation\"]/dl[3]/dt/label/strong"));
		Txtexcel(name, "aravind", 0, 25);
		WebElement edu2 = driver.findElement(By.xpath("//*[@id=\"institutionName\"]"));
		enteredTxt(edu2);
		writeDataFromExcelenteredtxt(edu2, "aravind", 1, 25);
		System.out.println("After changed");
		edu2.clear();
		toInput(edu2, "university college of engineering panruti");
		Txt(name);
		enteredTxt(edu2);
		writeDataFromExcelenteredtxt(edu2, "aravind", 2, 25);

	}

	@When("user have to click edit profile Education in Detail")
	public void user_have_to_click_edit_profile_Education_in_Detail() throws Throwable {
		System.out.println("Before changed");
		WebElement name = driver.findElement(By.xpath("//*[@id=\"frmEducation\"]/dl[5]/dt/label/strong"));
		Txtexcel(name, "aravind", 0, 26);
		WebElement edu3 = driver.findElement(By.xpath("//*[@id=\"educationInDetail\"]"));
		enteredTxt(edu3);
		writeDataFromExcelenteredtxt(edu3, "aravind", 1, 26);
		System.out.println("After changed");
		edu3.clear();
		toInput(edu3, "b.ed");
		Txt(name);
		enteredTxt(edu3);
		writeDataFromExcelenteredtxt(edu3, "aravind", 2, 26);

	}

	@When("user have to click edit profile Employed In")
	public void user_have_to_click_edit_profile_Employed_In() throws Throwable {
		System.out.println("Before changed");
		WebElement emp = driver.findElement(By.xpath("//*[@id=\"employmentCategory1\"]"));
		boolean ab3 = emp.isSelected();
		if (ab3 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"employedInDiv\"]/dt/label/strong"));
			Txtexcel(name, "aravind", 0, 27);
			WebElement empsib1 = driver.findElement(By.xpath("//*[@id=\"employmentCategory1\"]/following-sibling::*"));

			String s1 = empsib1.getText();

			System.out.println(":" + s1);
			writeDataFromExcelselecteddtxt(empsib1, "aravind", 1, 27);
		}

		WebElement emp1 = driver.findElement(By.xpath("//*[@id=\"employmentCategory2\"]"));
		boolean ab1 = emp1.isSelected();
		if (ab1 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"employedInDiv\"]/dt/label/strong"));
			Txtexcel(name, "aravind", 0, 27);
			WebElement empsib2 = driver.findElement(By.xpath("//*[@id=\"employmentCategory2\"]/following-sibling::*"));

			String s2 = empsib2.getText();
			System.out.println(":" + s2);
			writeDataFromExcelselecteddtxt(empsib2, "aravind", 1, 27);
		}
		WebElement emp2 = driver.findElement(By.xpath("//*[@id=\"employmentCategory3\"]"));
		boolean ab4 = emp2.isSelected();
		if (ab4 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"employedInDiv\"]/dt/label/strong"));
			Txtexcel(name, "aravind", 0, 27);
			WebElement empsib3 = driver.findElement(By.xpath("//*[@id=\"employmentCategory3\"]/following-sibling::*"));

			String s3 = empsib3.getText();
			System.out.println(":" + s3);
			writeDataFromExcelselecteddtxt(empsib3, "aravind", 1, 27);
		}

		WebElement emp3 = driver.findElement(By.xpath("//*[@id=\"employmentCategory4\"]"));
		boolean ab2 = emp3.isSelected();
		if (ab2 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"employedInDiv\"]/dt/label/strong"));
			Txtexcel(name, "aravind", 0, 27);
			WebElement empsib4 = driver.findElement(By.xpath("//*[@id=\"employmentCategory4\"]/following-sibling::*"));

			String s4 = empsib4.getText();
			System.out.println(":" + s4);
			writeDataFromExcelselecteddtxt(empsib4, "aravind", 1, 27);
		}
		WebElement emp4 = driver.findElement(By.xpath("//*[@id=\"employmentCategory6\"]"));
		boolean ab5 = emp4.isSelected();
		if (ab5 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"employedInDiv\"]/dt/label/strong"));
			Txtexcel(name, "aravind", 0, 27);
			WebElement empsib6 = driver.findElement(By.xpath("//*[@id=\"employmentCategory6\"]/following-sibling::*"));

			String s6 = empsib6.getText();
			System.out.println(":" + s6);
			writeDataFromExcelselecteddtxt(empsib6, "aravind", 1, 27);
		}

		WebElement emp6 = driver.findElement(By.xpath("//*[@id=\"employmentCategory7\"]"));
		boolean ab6 = emp6.isSelected();
		if (ab6 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"employedInDiv\"]/dt/label/strong"));
			Txtexcel(name, "aravind", 0, 27);
			WebElement empsib7 = driver.findElement(By.xpath("//*[@id=\"employmentCategory7\"]/following-sibling::*"));

			String s7 = empsib7.getText();
			System.out.println(":" + s7);
			writeDataFromExcelselecteddtxt(empsib7, "aravind", 1, 27);
		}

	}

	@When("user have to click edit profile Employed In edit")
	public void user_have_to_click_edit_profile_Employed_In_edit() throws Throwable {
		System.out.println("After changed");
		WebElement emp = driver.findElement(By.xpath("//*[@id=\"employmentCategory1\"]"));
		toClick(emp);
		boolean ab3 = emp.isSelected();

		if (ab3 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"employedInDiv\"]/dt/label/strong"));
			Txtexcel(name, "aravind", 0, 27);
			WebElement empsib1 = driver.findElement(By.xpath("//*[@id=\"employmentCategory1\"]/following-sibling::*"));

			String s1 = empsib1.getText();

			System.out.println(":" + s1);
			writeDataFromExcelselecteddtxt(empsib1, "aravind", 2, 27);
		}

		WebElement emp1 = driver.findElement(By.xpath("//*[@id=\"employmentCategory2\"]"));
		boolean ab1 = emp1.isSelected();
		if (ab1 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"employedInDiv\"]/dt/label/strong"));
			Txtexcel(name, "aravind", 0, 27);
			WebElement empsib2 = driver.findElement(By.xpath("//*[@id=\"employmentCategory2\"]/following-sibling::*"));

			String s2 = empsib2.getText();
			System.out.println(":" + s2);
			writeDataFromExcelselecteddtxt(empsib2, "aravind", 2, 27);
		}
		WebElement emp2 = driver.findElement(By.xpath("//*[@id=\"employmentCategory3\"]"));
		boolean ab4 = emp2.isSelected();
		if (ab4 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"employedInDiv\"]/dt/label/strong"));
			Txtexcel(name, "aravind", 0, 27);
			WebElement empsib3 = driver.findElement(By.xpath("//*[@id=\"employmentCategory3\"]/following-sibling::*"));

			String s3 = empsib3.getText();
			System.out.println(":" + s3);
			writeDataFromExcelselecteddtxt(empsib3, "aravind", 2, 27);
		}

		WebElement emp3 = driver.findElement(By.xpath("//*[@id=\"employmentCategory4\"]"));
		boolean ab2 = emp3.isSelected();
		if (ab2 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"employedInDiv\"]/dt/label/strong"));
			Txtexcel(name, "aravind", 0, 27);
			WebElement empsib4 = driver.findElement(By.xpath("//*[@id=\"employmentCategory4\"]/following-sibling::*"));

			String s4 = empsib4.getText();
			System.out.println(":" + s4);
			writeDataFromExcelselecteddtxt(empsib4, "aravind", 2, 27);
		}
		WebElement emp4 = driver.findElement(By.xpath("//*[@id=\"employmentCategory6\"]"));
		boolean ab5 = emp4.isSelected();
		if (ab5 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"employedInDiv\"]/dt/label/strong"));
			Txtexcel(name, "aravind", 0, 27);
			WebElement empsib6 = driver.findElement(By.xpath("//*[@id=\"employmentCategory6\"]/following-sibling::*"));

			String s6 = empsib6.getText();
			System.out.println(":" + s6);
			writeDataFromExcelselecteddtxt(empsib6, "aravind", 2, 27);
		}

		WebElement emp6 = driver.findElement(By.xpath("//*[@id=\"employmentCategory7\"]"));
		boolean ab6 = emp6.isSelected();
		if (ab6 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"employedInDiv\"]/dt/label/strong"));
			Txtexcel(name, "aravind", 0, 27);
			WebElement empsib7 = driver.findElement(By.xpath("//*[@id=\"employmentCategory7\"]/following-sibling::*"));

			String s7 = empsib7.getText();
			System.out.println(":" + s7);
			writeDataFromExcelselecteddtxt(empsib7, "aravind", 2, 27);
		}

	}

	@When("user have to click edit profile Occupation")
	public void user_have_to_click_edit_profile_Occupation() throws Throwable {
		System.out.println("Before changed");
		WebElement name = driver.findElement(By.xpath("//*[@id=\"occupationBlock\"]/dt/label/strong"));
		Txtexcel(name, "aravind", 0, 28);
		WebElement ocu = driver.findElement(By.xpath("//*[@id=\"occupation\"]"));
		firstSelected(ocu);
		writeDataFromExcelfirstselected(ocu, "aravind", 1, 28);
		System.out.println("After changed");
		selectIndex(ocu, 6);
		Txt(name);
		firstSelected(ocu);
		writeDataFromExcelfirstselected(ocu, "aravind", 2, 28);

	}

	@When("user have to click edit profile Occupation in Detail")
	public void user_have_to_click_edit_profile_Occupation_in_Detail() throws Throwable {
		System.out.println("Before changed");
		WebElement name = driver.findElement(By.xpath("//*[@id=\"occdet\"]"));
		Txtexcel(name, "aravind", 0, 29);
		WebElement ocupd = driver.findElement(By.xpath("//*[@id=\"occupationInDetail1\"]"));
		enteredTxt(ocupd);
		writeDataFromExcelenteredtxt(ocupd, "aravind", 1, 29);
		System.out.println("After changed");
		ocupd.clear();
		toInput(ocupd, "software professional");
		Txt(name);
		enteredTxt(ocupd);
		writeDataFromExcelenteredtxt(ocupd, "aravind", 2, 29);

	}

	@When("user have to click edit profile Annual Income")
	public void user_have_to_click_edit_profile_Annual_Income() throws Throwable {
		// WebElement anual =
		// driver.findElement(By.xpath("//*[@id=\"annualIncomeCurrency\"]"));
		// firstSelected(anual);
		// selectIndex(anual, 6);
		// firstSelected(anual);
		System.out.println("Before changed");
		WebElement name = driver.findElement(By.xpath("//*[@id=\"divIncometype\"]/dt/label/strong"));
		Txtexcel(name, "aravind", 0, 30);
		WebElement anual1 = driver.findElement(By.xpath("(//*[@id=\"annualIncome\"])[1]"));
		firstSelected(anual1);
		writeDataFromExcelfirstselected(anual1, "aravind", 1, 30);
		System.out.println("After changed");
		selectIndex(anual1, 8);
		Txt(name);
		firstSelected(anual1);
		writeDataFromExcelfirstselected(anual1, "aravind", 2, 30);

	}

	@When("user have to click edit profile click family details")
	public void user_have_to_click_edit_profile_click_family_details() throws Exception {
		WebElement edu1 = driver.findElement(By.xpath("(//*[@class=\"title-link\"])[3]"));

		Thread.sleep(3000);
		toMove(edu1);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", edu1);
		Thread.sleep(5000);

	}

	@When("user have to click edit profile Parent's Contact No:")
	public void user_have_to_click_edit_profile_Parent_s_Contact_No() throws Throwable {
		System.out.println("Before changed");
		WebElement name = driver.findElement(By.xpath("//*[@id=\"frmFamily\"]/dl[1]/dt/label/strong"));
		Txtexcel(name, "aravind", 0, 31);
		WebElement parno = driver.findElement(By.xpath("//*[@id=\"parentContact\"]"));
		enteredTxt(parno);
		writeDataFromExcelenteredtxt(parno, "aravind", 1, 31);
		System.out.println("After changed");
		parno.clear();
		toInput(parno, "8126789876");
		Txt(name);
		enteredTxt(parno);
		writeDataFromExcelenteredtxt(parno, "aravind", 2, 31);

	}

	@When("user have to click edit profile  Family Value")
	public void user_have_to_click_edit_profile_Family_Value() throws Throwable {
		System.out.println("Before changed");
		WebElement emp1 = driver.findElement(By.xpath("//*[@id=\"familyValue1\"]"));
		boolean ab1 = emp1.isSelected();
		if (ab1 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"frmFamily\"]/dl[3]/dt/label/strong"));
			Txtexcel(name, "aravind", 0, 32);
			WebElement empsib1 = driver.findElement(By.xpath("//*[@id=\"familyValue1\"]/following-sibling::*"));
			String s1 = empsib1.getText();
			System.out.println(":" + s1);
			writeDataFromExcelselecteddtxt(empsib1, "aravind", 1, 32);
		}
		WebElement emp2 = driver.findElement(By.xpath("//*[@id=\"familyValue2\"]"));
		boolean ab4 = emp2.isSelected();
		if (ab4 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"frmFamily\"]/dl[3]/dt/label/strong"));
			Txtexcel(name, "aravind", 0, 32);
			WebElement empsib2 = driver.findElement(By.xpath("//*[@id=\"familyValue2\"]/following-sibling::*"));
			String s2 = empsib2.getText();
			System.out.println(":" + s2);
			writeDataFromExcelselecteddtxt(empsib2, "aravind", 1, 32);
		}

		WebElement emp3 = driver.findElement(By.xpath("//*[@id=\"familyValue3\"]"));
		boolean ab2 = emp3.isSelected();
		if (ab2 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"frmFamily\"]/dl[3]/dt/label/strong"));
			Txtexcel(name, "aravind", 0, 32);
			WebElement empsib3 = driver.findElement(By.xpath("//*[@id=\"familyValue3\"]/following-sibling::*"));
			String s3 = empsib3.getText();
			System.out.println(":" + s3);
			writeDataFromExcelselecteddtxt(empsib3, "aravind", 1, 32);
		}
		WebElement emp4 = driver.findElement(By.xpath("//*[@id=\"familyValue4\"]"));
		boolean ab5 = emp4.isSelected();
		if (ab5 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"frmFamily\"]/dl[3]/dt/label/strong"));
			Txtexcel(name, "aravind", 0, 32);
			WebElement empsib4 = driver.findElement(By.xpath("//*[@id=\"familyValue4\"]/following-sibling::*"));
			String s4 = empsib4.getText();
			System.out.println(":" + s4);
			writeDataFromExcelselecteddtxt(empsib4, "aravind", 1, 32);
		}

	}

	@When("user have to click edit profile  Family Value after")
	public void user_have_to_click_edit_profile_Family_Value_after() throws Throwable {
		System.out.println("After changed");
		WebElement emp1 = driver.findElement(By.xpath("//*[@id=\"familyValue1\"]"));
		toClick(emp1);
		boolean ab1 = emp1.isSelected();
		if (ab1 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"frmFamily\"]/dl[3]/dt/label/strong"));
			Txtexcel(name, "aravind", 0, 32);
			WebElement empsib1 = driver.findElement(By.xpath("//*[@id=\"familyValue1\"]/following-sibling::*"));
			String s1 = empsib1.getText();
			System.out.println(":" + s1);
			writeDataFromExcelselecteddtxt(empsib1, "aravind", 2, 32);
		}
		WebElement emp2 = driver.findElement(By.xpath("//*[@id=\"familyValue2\"]"));
		boolean ab4 = emp2.isSelected();
		if (ab4 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"frmFamily\"]/dl[3]/dt/label/strong"));
			Txtexcel(name, "aravind", 0, 32);
			WebElement empsib2 = driver.findElement(By.xpath("//*[@id=\"familyValue2\"]/following-sibling::*"));
			String s2 = empsib2.getText();
			System.out.println(":" + s2);
			writeDataFromExcelselecteddtxt(empsib2, "aravind", 2, 32);
		}

		WebElement emp3 = driver.findElement(By.xpath("//*[@id=\"familyValue3\"]"));
		boolean ab2 = emp3.isSelected();
		if (ab2 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"frmFamily\"]/dl[3]/dt/label/strong"));
			Txtexcel(name, "aravind", 0, 32);
			WebElement empsib3 = driver.findElement(By.xpath("//*[@id=\"familyValue3\"]/following-sibling::*"));
			String s3 = empsib3.getText();
			System.out.println(":" + s3);
			writeDataFromExcelselecteddtxt(empsib3, "aravind", 2, 32);
		}
		WebElement emp4 = driver.findElement(By.xpath("//*[@id=\"familyValue4\"]"));
		boolean ab5 = emp4.isSelected();
		if (ab5 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"frmFamily\"]/dl[3]/dt/label/strong"));
			Txtexcel(name, "aravind", 0, 32);
			WebElement empsib4 = driver.findElement(By.xpath("//*[@id=\"familyValue4\"]/following-sibling::*"));
			String s4 = empsib4.getText();
			System.out.println(":" + s4);
			writeDataFromExcelselecteddtxt(empsib4, "aravind", 2, 32);
		}

	}

	@When("user have to click edit profile  Family Type")
	public void user_have_to_click_edit_profile_Family_Type() throws Throwable {
		System.out.println("Before changed");
		WebElement fam1 = driver.findElement(By.xpath("//*[@id=\"familyType1\"]"));
		boolean ab1 = fam1.isSelected();
		if (ab1 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"frmFamily\"]/dl[5]/dt/label/strong"));
			Txtexcel(name, "aravind", 0, 33);
			WebElement famib1 = driver.findElement(By.xpath("//*[@id=\"familyType1\"]/following-sibling::*"));
			String s1 = famib1.getText();
			System.out.println(":" + s1);
			writeDataFromExcelselecteddtxt(famib1, "aravind", 1, 33);
		}
		WebElement fam2 = driver.findElement(By.xpath("//*[@id=\"familyType2\"]"));
		toClick(fam2);
		boolean ab4 = fam2.isSelected();
		if (ab4 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"frmFamily\"]/dl[5]/dt/label/strong"));
			Txtexcel(name, "aravind", 0, 33);
			WebElement famsib2 = driver.findElement(By.xpath("//*[@id=\"familyType2\"]/following-sibling::*"));
			String s2 = famsib2.getText();
			System.out.println(":" + s2);
			writeDataFromExcelselecteddtxt(famsib2, "aravind", 1, 33);

		}

	}

	@When("user have to click edit profile  Family Type after")
	public void user_have_to_click_edit_profile_Family_Type_after() throws Throwable {
		System.out.println("After changed");
		WebElement fam1 = driver.findElement(By.xpath("//*[@id=\"familyType1\"]"));
		toClick(fam1);
		boolean ab1 = fam1.isSelected();
		if (ab1 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"frmFamily\"]/dl[5]/dt/label/strong"));
			Txtexcel(name, "aravind", 0, 33);
			WebElement famib1 = driver.findElement(By.xpath("//*[@id=\"familyType1\"]/following-sibling::*"));
			String s1 = famib1.getText();
			System.out.println(":" + s1);
			writeDataFromExcelselecteddtxt(famib1, "aravind", 2, 33);
		}
		WebElement fam2 = driver.findElement(By.xpath("//*[@id=\"familyType2\"]"));

		boolean ab4 = fam2.isSelected();
		if (ab4 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"frmFamily\"]/dl[5]/dt/label/strong"));
			Txtexcel(name, "aravind", 0, 33);
			WebElement famsib2 = driver.findElement(By.xpath("//*[@id=\"familyType2\"]/following-sibling::*"));
			String s2 = famsib2.getText();
			System.out.println(":" + s2);
			writeDataFromExcelselecteddtxt(famsib2, "aravind", 2, 33);

		}

	}

	@When("user have to click edit profile  Family Status")
	public void user_have_to_click_edit_profile_Family_Status() throws Throwable {
		System.out.println("Before changed");
		WebElement fams1 = driver.findElement(By.xpath("//*[@id=\"familyStatus1\"]"));
		boolean ab1 = fams1.isSelected();
		if (ab1 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"frmFamily\"]/dl[7]/dt/label/strong"));
			Txtexcel(name, "aravind", 0, 34);
			WebElement famsib1 = driver.findElement(By.xpath("//*[@id=\"familyStatus1\"]/following-sibling::*"));
			String s1 = famsib1.getText();
			System.out.println(":" + s1);
			writeDataFromExcelselecteddtxt(famsib1, "aravind", 1, 34);
		}
		WebElement fams2 = driver.findElement(By.xpath("//*[@id=\"familyStatus2\"]"));
		boolean ab4 = fams2.isSelected();
		if (ab4 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"frmFamily\"]/dl[7]/dt/label/strong"));
			Txtexcel(name, "aravind", 0, 34);
			WebElement famssib2 = driver.findElement(By.xpath("//*[@id=\"familyStatus2\"]/following-sibling::*"));
			String s2 = famssib2.getText();
			System.out.println(":" + s2);
			writeDataFromExcelselecteddtxt(famssib2, "aravind", 1, 34);
		}
		WebElement fams3 = driver.findElement(By.xpath("//*[@id=\"familyStatus4\"]"));
		boolean ab2 = fams3.isSelected();
		if (ab2 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"frmFamily\"]/dl[7]/dt/label/strong"));
			Txtexcel(name, "aravind", 0, 34);
			WebElement famssib3 = driver.findElement(By.xpath("//*[@id=\"familyStatus4\"]/following-sibling::*"));
			String s3 = famssib3.getText();
			System.out.println(":" + s3);
			writeDataFromExcelselecteddtxt(famssib3, "aravind", 1, 34);
		}

	}

	@When("user have to click edit profile  Family Status after")
	public void user_have_to_click_edit_profile_Family_Status_after() throws Throwable {
		System.out.println("After changed");
		WebElement fams2 = driver.findElement(By.xpath("//*[@id=\"familyStatus2\"]"));
		toClick(fams2);
		boolean ab4 = fams2.isSelected();
		if (ab4 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"frmFamily\"]/dl[7]/dt/label/strong"));
			Txtexcel(name, "aravind", 0, 34);
			WebElement famssib2 = driver.findElement(By.xpath("//*[@id=\"familyStatus2\"]/following-sibling::*"));
			String s2 = famssib2.getText();
			System.out.println(":" + s2);
			writeDataFromExcelselecteddtxt(famssib2, "aravind", 2, 34);
		}
		WebElement fams1 = driver.findElement(By.xpath("//*[@id=\"familyStatus1\"]"));
		boolean ab1 = fams1.isSelected();
		if (ab1 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"frmFamily\"]/dl[7]/dt/label/strong"));
			Txtexcel(name, "aravind", 0, 34);
			WebElement famsib1 = driver.findElement(By.xpath("//*[@id=\"familyStatus1\"]/following-sibling::*"));
			String s1 = famsib1.getText();
			System.out.println(":" + s1);
			writeDataFromExcelselecteddtxt(famsib1, "aravind", 2, 34);
		}
		WebElement fams3 = driver.findElement(By.xpath("//*[@id=\"familyStatus4\"]"));
		boolean ab2 = fams3.isSelected();
		if (ab2 == true) {
			WebElement name = driver.findElement(By.xpath("//*[@id=\"frmFamily\"]/dl[7]/dt/label/strong"));
			Txtexcel(name, "aravind", 0, 34);
			WebElement famssib3 = driver.findElement(By.xpath("//*[@id=\"familyStatus4\"]/following-sibling::*"));
			String s3 = famssib3.getText();
			System.out.println(":" + s3);
			writeDataFromExcelselecteddtxt(famssib3, "aravind", 2, 34);
		}

	}

	@When("user have to click edit profile  Native Place")
	public void user_have_to_click_edit_profile_Native_Place() throws Throwable {
		System.out.println("Before changed");
		WebElement name = driver.findElement(By.xpath("//*[@id=\"frmFamily\"]/dl[9]/dt/label/strong"));
		Txtexcel(name, "aravind", 0, 35);
		WebElement nativ = driver.findElement(By.xpath("//*[@id=\"ancestralOrigin\"]"));
		enteredTxt(nativ);
		writeDataFromExcelenteredtxt(nativ, "aravind", 1, 35);
		System.out.println("After changed");
		nativ.clear();
		toInput(nativ, "chennai");
		Txt(name);
		enteredTxt(nativ);
		writeDataFromExcelenteredtxt(nativ, "aravind", 2, 35);

	}

	@When("user have to click edit profile  Father's Occupation")
	public void user_have_to_click_edit_profile_Father_s_Occupation() throws Throwable {
		System.out.println("Before changed");
		WebElement name = driver.findElement(By.xpath("//*[@id=\"frmFamily\"]/dl[11]/dt/label/strong"));
		Txtexcel(name, "aravind", 0, 36);
		WebElement fo = driver.findElement(By.xpath("//*[@id=\"fatherOccupation\"]"));
		enteredTxt(fo);
		writeDataFromExcelenteredtxt(fo, "aravind", 1, 36);
		System.out.println("After changed");
		fo.clear();
		toInput(fo, "truk driver");
		Txt(name);
		enteredTxt(fo);
		writeDataFromExcelenteredtxt(fo, "aravind", 2, 36);

	}

	@When("user have to click edit profile  Mother's Occupation")
	public void user_have_to_click_edit_profile_Mother_s_Occupation() throws Throwable {
		System.out.println("Before changed");
		WebElement name = driver.findElement(By.xpath("//*[@id=\"frmFamily\"]/dl[13]/dt/label/strong"));
		Txtexcel(name, "aravind", 0, 37);
		WebElement mo = driver.findElement(By.xpath("//*[@id=\"motherOccupation\"]"));
		enteredTxt(mo);
		writeDataFromExcelenteredtxt(mo, "aravind", 1, 37);
		System.out.println("After changed");
		mo.clear();
		toInput(mo, "home queen");
		Txt(name);
		enteredTxt(mo);
		writeDataFromExcelenteredtxt(mo, "aravind", 2, 37);

	}

	@When("user have to click edit profile  No. of Brothers")
	public void user_have_to_click_edit_profile_No_of_Brothers() throws Throwable {
		System.out.println("Before changed");
		WebElement name = driver.findElement(By.xpath("//*[@id=\"frmFamily\"]/dl[15]/dt/label/strong"));
		Txtexcel(name, "aravind", 0, 38);
		WebElement bro = driver.findElement(By.xpath("//*[@id=\"brothers\"]"));
		firstSelected(bro);
		writeDataFromExcelfirstselected(bro, "aravind", 1, 38);
		System.out.println("After changed");
		selectIndex(bro, 2);
		Txt(name);
		firstSelected(bro);
		writeDataFromExcelfirstselected(bro, "aravind", 2, 38);

	}

	@When("user have to click edit profile  Brothers Married")
	public void user_have_to_click_edit_profile_Brothers_Married() throws Throwable {
		System.out.println("Before changed");
		WebElement name = driver.findElement(By.xpath("//*[@id=\"brother\"]/dl[2]/dt/label/strong"));
		Txtexcel(name, "aravind", 0, 39);
		WebElement brom = driver.findElement(By.xpath("//*[@id=\"marriedBrothers\"]"));
		firstSelected(brom);
		writeDataFromExcelfirstselected(brom, "aravind", 1, 39);
		System.out.println("After changed");
		selectIndex(brom, 2);
		Txt(name);
		firstSelected(brom);
		writeDataFromExcelfirstselected(brom, "aravind", 2, 39);

	}

	@When("user have to click edit profile  No. of Sisters")
	public void user_have_to_click_edit_profile_No_of_Sisters() throws Throwable {
		System.out.println("Before changed");
		WebElement name = driver.findElement(By.xpath("//*[@id=\"frmFamily\"]/dl[17]/dt/label/strong"));
		Txtexcel(name, "aravind", 0, 40);
		WebElement sis = driver.findElement(By.xpath("//*[@id=\"sisters\"]"));
		firstSelected(sis);
		writeDataFromExcelfirstselected(sis, "aravind", 1, 40);
		System.out.println("After changed");
		selectIndex(sis, 2);
		Txt(name);
		firstSelected(sis);
		writeDataFromExcelselecteddtxt(sis, "aravind", 2, 40);

	}

	@When("user have to click edit profile  Sisters Married")
	public void user_have_to_click_edit_profile_Sisters_Married() throws Throwable {
		System.out.println("Before changed");
		WebElement name = driver.findElement(By.xpath("//*[@id=\"sister\"]/dl[2]/dt/label/strong"));
		Txtexcel(name, "aravind", 0, 41);
		WebElement sism = driver.findElement(By.xpath("//*[@id=\"marriedSisters\"]"));
		firstSelected(sism);
		writeDataFromExcelfirstselected(sism, "aravind", 1, 41);
		System.out.println("After changed");
		selectIndex(sism, 1);
		Txt(name);
		firstSelected(sism);
		writeDataFromExcelfirstselected(sism, "aravind", 2, 41);
	}

	@When("user have to click edit profile  About My Family")
	public void user_have_to_click_edit_profile_About_My_Family() throws Throwable {
		System.out.println("Before changed");
		WebElement name = driver.findElement(By.xpath("//*[@id=\"frmFamily\"]/dl[19]/dt/label/strong"));
		Txtexcel(name, "aravind", 0, 42);
		WebElement aboutfam = driver.findElement(By.xpath("//*[@id=\"familyDescription\"]"));
		enteredTxt(aboutfam);
		writeDataFromExcelenteredtxt(aboutfam, "aravind", 1, 42);
		System.out.println("After changed");
		aboutfam.clear();
		toInput(aboutfam, "my family always great . joint family .have a two properties in villupuram");
		Txt(name);
		enteredTxt(aboutfam);
		writeDataFromExcelenteredtxt(aboutfam, "aravind", 2, 42);
	}

	@When("user have to click edit profile Click hobbies and interest")
	public void user_have_to_click_edit_profile_Click_hobbies_and_interest() throws Exception {
		WebElement edu1 = driver.findElement(By.xpath("(//*[@class=\"title-link\"])[4]"));

		Thread.sleep(3000);
		toMove(edu1);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", edu1);
		Thread.sleep(5000);

	}

	@When("user have to click edit profile  What are your Hobbies and Interest?")
	public void user_have_to_click_edit_profile_What_are_your_Hobbies_and_Interest() throws Throwable {
		System.out.println("Before changed");

		WebElement name1 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[1]"));
		Txtexcel(name1, "aravind", 1, 43);

		WebElement empsi1 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[1]/span/label"));
		writeDataFromExcelselecteddtxt(empsi1, "aravind", 0, 44);
		WebElement emp = driver.findElement(By.xpath("//*[@id=\"hobbies4\"]"));
		boolean ab3 = emp.isSelected();
		if (ab3 == true) {

			WebElement empsib1 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[1]/span/label"));

			String s1 = empsib1.getText();

			System.out.print(":" + s1);
			setExcelData("aravind", 1, 44, "selected");

		} else {
			setExcelData("aravind", 1, 44, "not selected");
		}
		WebElement empsi2 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[2]/span/label"));
		writeDataFromExcelselecteddtxt(empsi2, "aravind", 0, 45);
		WebElement emp1 = driver.findElement(By.xpath("//*[@id=\"hobbies6\"]"));
		boolean ab1 = emp1.isSelected();
		if (ab1 == true) {

			WebElement empsib2 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[2]/span/label"));

			String s2 = empsib2.getText();
			System.out.print("," + s2);
			setExcelData("aravind", 1, 45, "selected");
		} else {
			setExcelData("aravind", 1, 45, "not selected");
		}
		WebElement empsi3 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[3]/span/label"));
		writeDataFromExcelselecteddtxt(empsi3, "aravind", 0, 46);
		WebElement emp2 = driver.findElement(By.xpath("//*[@id=\"hobbies8\"]"));
		boolean ab4 = emp2.isSelected();
		if (ab4 == true) {

			WebElement empsib3 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[3]/span/label"));

			String s3 = empsib3.getText();
			System.out.print("," + s3);
			setExcelData("aravind", 1, 46, "selected");
		} else {
			setExcelData("aravind", 1, 46, "not selected");
		}
		WebElement empsi4 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[4]/span/label"));
		writeDataFromExcelselecteddtxt(empsi4, "aravind", 0, 47);
		WebElement emp3 = driver.findElement(By.xpath("//*[@id=\"hobbies11\"]"));
		boolean ab2 = emp3.isSelected();
		if (ab2 == true) {

			WebElement empsib4 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[4]/span/label"));

			String s4 = empsib4.getText();
			System.out.print("," + s4);
			setExcelData("aravind", 1, 47, "selected");
		} else {
			setExcelData("aravind", 1, 47, "not selected");
		}
		WebElement empsi6 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[5]/span/label"));
		writeDataFromExcelselecteddtxt(empsi6, "aravind", 0, 48);
		WebElement emp4 = driver.findElement(By.xpath("//*[@id=\"hobbies13\"]"));
		boolean ab5 = emp4.isSelected();
		if (ab5 == true) {

			WebElement empsib6 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[5]/span/label"));

			String s6 = empsib6.getText();
			System.out.print("," + s6);
			setExcelData("aravind", 1, 48, "selected");
		} else {
			setExcelData("aravind", 1, 48, "not selected");
		}
		WebElement empsi7 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[6]/span/label"));
		writeDataFromExcelselecteddtxt(empsi7, "aravind", 0, 49);
		WebElement emp6 = driver.findElement(By.xpath("//*[@id=\"hobbies15\"]"));
		boolean ab6 = emp6.isSelected();
		if (ab6 == true) {

			WebElement empsib7 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[6]/span/label"));

			String s7 = empsib7.getText();
			System.out.print("," + s7);
			setExcelData("aravind", 1, 49, "selected");
		} else {
			setExcelData("aravind", 1, 49, "not selected");
		}
		WebElement empsi8 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[7]/span/label"));
		writeDataFromExcelselecteddtxt(empsi8, "aravind", 0, 50);
		WebElement emp8 = driver.findElement(By.xpath("//*[@id=\"hobbies17\"]"));
		boolean ab8 = emp8.isSelected();
		if (ab8 == true) {

			WebElement empsib8 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[7]/span/label"));

			String s8 = empsib8.getText();

			System.out.print("," + s8);
			setExcelData("aravind", 1, 50, "selected");
		} else {
			setExcelData("aravind", 1, 50, "not selected");
		}
		WebElement empsi9 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[8]/span/label"));
		writeDataFromExcelselecteddtxt(empsi9, "aravind", 0, 51);
		WebElement emp9 = driver.findElement(By.xpath("//*[@id=\"hobbies18\"]"));
		boolean ab9 = emp9.isSelected();
		if (ab9 == true) {

			WebElement empsib9 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[8]/span/label"));

			String s9 = empsib9.getText();
			System.out.print("," + s9);
			setExcelData("aravind", 1, 51, "selected");
		} else {
			setExcelData("aravind", 1, 51, "not selected");

		}
		WebElement empsi10 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[9]/span/label"));
		writeDataFromExcelselecteddtxt(empsi10, "aravind", 0, 52);
		WebElement emp10 = driver.findElement(By.xpath("//*[@id=\"hobbies19\"]"));
		boolean ab10 = emp10.isSelected();
		if (ab10 == true) {

			WebElement empsib10 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[9]/span/label"));

			String s10 = empsib10.getText();
			System.out.print("," + s10);
			setExcelData("aravind", 1, 52, "selected");
		} else {
			setExcelData("aravind", 1, 52, "not selected");

		}
		WebElement empsi11 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[10]/span/label"));
		writeDataFromExcelselecteddtxt(empsi11, "aravind", 0, 53);
		WebElement emp11 = driver.findElement(By.xpath("//*[@id=\"hobbies20\"]"));
		boolean ab11 = emp11.isSelected();
		if (ab11 == true) {

			WebElement empsib11 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[10]/span/label"));

			String s11 = empsib11.getText();
			System.out.print("," + s11);
			setExcelData("aravind", 1, 53, "selected");
		} else {
			setExcelData("aravind", 1, 53, "not selected");
		}
		WebElement empsi12 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[11]/span/label"));
		writeDataFromExcelselecteddtxt(empsi12, "aravind", 0, 54);
		WebElement emp12 = driver.findElement(By.xpath("//*[@id=\"interest5\"]"));
		boolean ab12 = emp12.isSelected();
		if (ab12 == true) {

			WebElement empsib12 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[11]/span/label"));

			String s12 = empsib12.getText();
			System.out.print("," + s12);
			setExcelData("aravind", 1, 54, "selected");
		} else {
			setExcelData("aravind", 1, 54, "selected");
		}
		WebElement empsi13 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[12]/span/label"));
		writeDataFromExcelselecteddtxt(empsi13, "aravind", 0, 55);
		WebElement emp13 = driver.findElement(By.xpath("//*[@id=\"interest8\"]"));
		boolean ab13 = emp13.isSelected();
		if (ab13 == true) {

			WebElement empsib13 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[12]/span/label"));

			String s13 = empsib13.getText();
			System.out.print("," + s13);
			setExcelData("aravind", 1, 55, "selected");
		} else {
			setExcelData("aravind", 1, 55, "not selected");
		}
		WebElement empsi14 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[13]/span/label"));
		writeDataFromExcelselecteddtxt(empsi14, "aravind", 0, 56);
		WebElement emp14 = driver.findElement(By.xpath("//*[@id=\"interest7\"]"));
		boolean ab14 = emp14.isSelected();
		if (ab14 == true) {

			WebElement empsib14 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[13]/span/label"));

			String s14 = empsib14.getText();
			System.out.print("," + s14);
			setExcelData("aravind", 1, 56, "selected");
		} else {
			setExcelData("aravind", 1, 56, "not selected");
		}
		WebElement empsi15 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[14]/span/label"));
		writeDataFromExcelselecteddtxt(empsi15, "aravind", 0, 57);

		WebElement emp15 = driver.findElement(By.xpath("//*[@id=\"interest15\"]"));
		boolean ab15 = emp15.isSelected();
		if (ab15 == true) {

			WebElement empsib15 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[14]/span/label"));

			String s15 = empsib15.getText();
			System.out.println("," + s15);
			setExcelData("aravind", 1, 57, "selected");
		} else {
			setExcelData("aravind", 1, 57, "not selected");
		}
	}

	@When("user have to click edit profile  What are your Hobbies and Interest? after")
	public void user_have_to_click_edit_profile_What_are_your_Hobbies_and_Interest_after() throws Throwable {
		System.out.println("After changed");
		WebElement name1 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[1]"));
		Txtexcel(name1, "aravind", 1, 43);
		WebElement empsi1 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[1]/span/label"));
		writeDataFromExcelselecteddtxt(empsi1, "aravind", 0, 44);
		WebElement emp = driver.findElement(By.xpath("//*[@id=\"hobbies4\"]"));
		toClick(emp);
		boolean ab3 = emp.isSelected();
		if (ab3 == true) {

			WebElement empsib1 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[1]/span/label"));

			String s1 = empsib1.getText();

			System.out.print(":" + s1);
			setExcelData("aravind", 2, 44, "selected");
		} else {
			setExcelData("aravind", 2, 44, "not selected");
		}
		WebElement empsi2 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[2]/span/label"));
		writeDataFromExcelselecteddtxt(empsi2, "aravind", 0, 45);
		WebElement emp1 = driver.findElement(By.xpath("//*[@id=\"hobbies6\"]"));
		toClick(emp1);
		boolean ab1 = emp1.isSelected();
		if (ab1 == true) {

			WebElement empsib2 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[2]/span/label"));

			String s2 = empsib2.getText();
			System.out.print("," + s2);
			setExcelData("aravind", 2, 45, "selected");
		} else {
			setExcelData("aravind", 2, 45, "not selected");
		}
		WebElement empsi3 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[3]/span/label"));
		writeDataFromExcelselecteddtxt(empsi3, "aravind", 0, 46);
		WebElement emp2 = driver.findElement(By.xpath("//*[@id=\"hobbies8\"]"));
		toClick(emp2);
		boolean ab4 = emp2.isSelected();
		if (ab4 == true) {

			WebElement empsib3 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[3]/span/label"));

			String s3 = empsib3.getText();
			System.out.print("," + s3);
			setExcelData("aravind", 2, 46, "selected");
		} else {
			setExcelData("aravind", 2, 46, "not selected");
		}
		WebElement empsi4 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[4]/span/label"));
		writeDataFromExcelselecteddtxt(empsi4, "aravind", 0, 47);
		WebElement emp3 = driver.findElement(By.xpath("//*[@id=\"hobbies11\"]"));
		toClick(emp3);
		boolean ab2 = emp3.isSelected();
		if (ab2 == true) {

			WebElement empsib4 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[4]/span/label"));

			String s4 = empsib4.getText();
			System.out.print("," + s4);
			setExcelData("aravind", 2, 47, "selected");
		} else {
			setExcelData("aravind", 2, 47, "not selected");
		}
		WebElement empsi6 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[5]/span/label"));
		writeDataFromExcelselecteddtxt(empsi6, "aravind", 0, 48);
		WebElement emp4 = driver.findElement(By.xpath("//*[@id=\"hobbies13\"]"));
		toClick(emp4);
		boolean ab5 = emp4.isSelected();
		if (ab5 == true) {

			WebElement empsib6 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[5]/span/label"));

			String s6 = empsib6.getText();
			System.out.print("," + s6);
			setExcelData("aravind", 2, 48, "selected");
		} else {
			setExcelData("aravind", 2, 48, "not selected");
		}
		WebElement empsi7 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[6]/span/label"));
		writeDataFromExcelselecteddtxt(empsi7, "aravind", 0, 49);
		WebElement emp6 = driver.findElement(By.xpath("//*[@id=\"hobbies15\"]"));
		toClick(emp6);
		boolean ab6 = emp6.isSelected();
		if (ab6 == true) {

			WebElement empsib7 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[6]/span/label"));

			String s7 = empsib7.getText();
			System.out.print("," + s7);
			setExcelData("aravind", 2, 49, "selected");
		} else {
			setExcelData("aravind", 2, 49, "not selected");
		}
		WebElement empsi8 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[7]/span/label"));
		writeDataFromExcelselecteddtxt(empsi8, "aravind", 0, 50);
		WebElement emp8 = driver.findElement(By.xpath("//*[@id=\"hobbies17\"]"));
		toClick(emp8);
		boolean ab8 = emp8.isSelected();
		if (ab8 == true) {

			WebElement empsib8 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[7]/span/label"));

			String s8 = empsib8.getText();

			System.out.print("," + s8);
			setExcelData("aravind", 2, 50, "selected");
		} else {
			setExcelData("aravind", 2, 50, "not selected");
		}
		WebElement empsi9 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[8]/span/label"));
		writeDataFromExcelselecteddtxt(empsi9, "aravind", 0, 51);
		WebElement emp9 = driver.findElement(By.xpath("//*[@id=\"hobbies18\"]"));
		toClick(emp9);
		boolean ab9 = emp9.isSelected();
		if (ab9 == true) {

			WebElement empsib9 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[8]/span/label"));

			String s9 = empsib9.getText();
			System.out.print("," + s9);
			setExcelData("aravind", 2, 51, "selected");
		} else {
			setExcelData("aravind", 2, 51, "not selected");

		}
		WebElement empsi10 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[9]/span/label"));
		writeDataFromExcelselecteddtxt(empsi10, "aravind", 0, 52);
		WebElement emp10 = driver.findElement(By.xpath("//*[@id=\"hobbies19\"]"));
		toClick(emp10);
		boolean ab10 = emp10.isSelected();
		if (ab10 == true) {

			WebElement empsib10 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[9]/span/label"));

			String s10 = empsib10.getText();
			System.out.print("," + s10);
			setExcelData("aravind", 2, 52, "selected");
		} else {
			setExcelData("aravind", 2, 52, "not selected");

		}
		WebElement empsi11 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[10]/span/label"));
		writeDataFromExcelselecteddtxt(empsi11, "aravind", 0, 53);
		WebElement emp11 = driver.findElement(By.xpath("//*[@id=\"hobbies20\"]"));
		toClick(emp11);
		boolean ab11 = emp11.isSelected();
		if (ab11 == true) {

			WebElement empsib11 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[10]/span/label"));

			String s11 = empsib11.getText();
			System.out.print("," + s11);
			setExcelData("aravind", 2, 53, "selected");
		} else {
			setExcelData("aravind", 2, 53, "not selected");
		}
		WebElement empsi12 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[11]/span/label"));
		writeDataFromExcelselecteddtxt(empsi12, "aravind", 0, 54);
		WebElement emp12 = driver.findElement(By.xpath("//*[@id=\"interest5\"]"));
		boolean ab12 = emp12.isSelected();
		if (ab12 == true) {

			WebElement empsib12 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[11]/span/label"));

			String s12 = empsib12.getText();
			System.out.print("," + s12);
			setExcelData("aravind", 2, 54, "selected");
		} else {
			setExcelData("aravind", 2, 54, "selected");
		}
		WebElement empsi13 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[12]/span/label"));
		writeDataFromExcelselecteddtxt(empsi13, "aravind", 0, 55);
		WebElement emp13 = driver.findElement(By.xpath("//*[@id=\"interest8\"]"));
		toClick(emp13);
		boolean ab13 = emp13.isSelected();
		if (ab13 == true) {

			WebElement empsib13 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[12]/span/label"));

			String s13 = empsib13.getText();
			System.out.print("," + s13);
			setExcelData("aravind", 2, 55, "selected");
		} else {
			setExcelData("aravind", 2, 55, "not selected");
		}
		WebElement empsi14 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[13]/span/label"));
		writeDataFromExcelselecteddtxt(empsi14, "aravind", 0, 56);
		WebElement emp14 = driver.findElement(By.xpath("//*[@id=\"interest7\"]"));
		boolean ab14 = emp14.isSelected();
		if (ab14 == true) {

			WebElement empsib14 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[13]/span/label"));

			String s14 = empsib14.getText();
			System.out.print("," + s14);
			setExcelData("aravind", 2, 56, "selected");
		} else {
			setExcelData("aravind", 2, 56, "not selected");
		}
		WebElement empsi15 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[14]/span/label"));
		writeDataFromExcelselecteddtxt(empsi15, "aravind", 0, 57);

		WebElement emp15 = driver.findElement(By.xpath("//*[@id=\"interest15\"]"));
		boolean ab15 = emp15.isSelected();
		if (ab15 == true) {

			WebElement empsib15 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[14]/span/label"));

			String s15 = empsib15.getText();
			System.out.println("," + s15);
			setExcelData("aravind", 2, 57, "selected");
		} else {
			setExcelData("aravind", 2, 57, "not selected");
		}
	}

	@When("user have to click edit profile  Others")
	public void user_have_to_click_edit_profile_Others() throws Throwable {
		System.out.println("Before changed");
		WebElement name1 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[15]"));
		Txtexcel(name1, "aravind", 0, 58);
		WebElement others = driver.findElement(By.xpath("//*[@id=\"hobbiesDesc\"]"));
		enteredTxt(others);
		writeDataFromExcelenteredtxt(others, "aravind", 1, 58);
		System.out.println("After changed");
		others.clear();
		toInput(others, "villupuram");
		Txt(name1);
		enteredTxt(others);
		writeDataFromExcelenteredtxt(others, "aravind", 2, 58);
	}

	@When("user have to click edit profile  Your favourite music")
	public void user_have_to_click_edit_profile_Your_favourite_music() throws Throwable {
		System.out.println("Before changed");
		WebElement name1 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[4]"));
		Txtexcel(name1, "aravind", 0, 59);
		WebElement empsi2 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[6]/div[1]/span/label"));
		writeDataFromExcelselecteddtxt(empsi2, "aravind", 0, 60);
		WebElement emp1 = driver.findElement(By.xpath("//*[@id=\"music4\"]"));
		boolean ab1 = emp1.isSelected();
		if (ab1 == true) {
			WebElement empsib2 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[6]/div[1]/span/label"));

			String s2 = empsib2.getText();
			System.out.print("," + s2);
			setExcelData("aravind", 1, 60, "selected");
		} else {
			setExcelData("aravind", 1, 60, "not selected");
		}
		WebElement empsi3 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[6]/div[2]/span/label"));
		writeDataFromExcelselecteddtxt(empsi3, "aravind", 0, 61);
		WebElement emp2 = driver.findElement(By.xpath("//*[@id=\"music9\"]"));
		boolean ab4 = emp2.isSelected();
		if (ab4 == true) {
			WebElement empsib3 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[6]/div[2]/span/label"));

			String s3 = empsib3.getText();
			System.out.print(s3);
			setExcelData("aravind", 1, 61, "selected");
		} else {
			setExcelData("aravind", 1, 61, "not selected");

		}
		WebElement empsi4 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[6]/div[3]/span/label"));
		writeDataFromExcelselecteddtxt(empsi4, "aravind", 0, 62);
		WebElement emp3 = driver.findElement(By.xpath("//*[@id=\"music18\"]"));
		boolean ab2 = emp3.isSelected();
		if (ab2 == true) {

			WebElement empsib4 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[6]/div[3]/span/label"));

			String s4 = empsib4.getText();
			System.out.println("," + s4);
			setExcelData("aravind", 1, 62, "selected");
		} else {
			setExcelData("aravind", 1, 62, "not selected");

		}
	}

	@When("user have to click edit profile  Your favourite music after")
	public void user_have_to_click_edit_profile_Your_favourite_music_after() throws Throwable {
		WebElement name1 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[4]"));
		Txtexcel(name1, "aravind", 0, 59);
		WebElement empsi2 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[6]/div[1]/span/label"));
		writeDataFromExcelselecteddtxt(empsi2, "aravind", 0, 60);
		WebElement emp1 = driver.findElement(By.xpath("//*[@id=\"music4\"]"));
		boolean ab1 = emp1.isSelected();
		if (ab1 == true) {
			WebElement empsib2 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[6]/div[1]/span/label"));

			String s2 = empsib2.getText();
			System.out.print("," + s2);
			setExcelData("aravind", 2, 60, "selected");
		} else {
			setExcelData("aravind", 2, 60, "not selected");
		}
		WebElement empsi3 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[6]/div[2]/span/label"));
		writeDataFromExcelselecteddtxt(empsi3, "aravind", 0, 61);
		WebElement emp2 = driver.findElement(By.xpath("//*[@id=\"music9\"]"));
		toClick(emp2);
		boolean ab4 = emp2.isSelected();
		if (ab4 == true) {
			WebElement empsib3 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[6]/div[2]/span/label"));

			String s3 = empsib3.getText();
			System.out.print(s3);
			setExcelData("aravind", 2, 61, "selected");
		} else {
			setExcelData("aravind", 2, 61, "not selected");

		}
		WebElement empsi4 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[6]/div[3]/span/label"));
		writeDataFromExcelselecteddtxt(empsi4, "aravind", 0, 62);
		WebElement emp3 = driver.findElement(By.xpath("//*[@id=\"music18\"]"));
		toClick(emp3);
		boolean ab2 = emp3.isSelected();
		if (ab2 == true) {

			WebElement empsib4 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[6]/div[3]/span/label"));

			String s4 = empsib4.getText();
			System.out.println("," + s4);
			setExcelData("aravind", 2, 62, "selected");
		} else {
			setExcelData("aravind", 2, 62, "not selected");
		}
	}

	@When("user have to click edit profile  Others music")
	public void user_have_to_click_edit_profile_Others_music() throws Throwable {
		System.out.println("Before changed");
		WebElement name1 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[6]/div[4]"));
		Txtexcel(name1, "aravind", 0, 63);
		WebElement others = driver.findElement(By.xpath("//*[@id=\"musicDesc\"]"));
		enteredTxt(others);
		writeDataFromExcelenteredtxt(others, "aravind", 1, 63);
		System.out.println("After changed");
		others.clear();
		toInput(others, "clasic");
		Txt(name1);
		enteredTxt(others);
		writeDataFromExcelenteredtxt(others, "aravind", 2, 63);

	}

	@When("user have to click edit profile  Sports you like")
	public void user_have_to_click_edit_profile_Sports_you_like() throws Throwable {
		System.out.println("Before changed");
		WebElement name1 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[7]"));
		Txtexcel(name1, "aravind", 0, 64);
		WebElement empsi1 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[9]/div[1]/span/label"));
		writeDataFromExcelselecteddtxt(empsi1, "aravind", 0, 65);
		WebElement emp = driver.findElement(By.xpath("//*[@id=\"sports4\"]"));
		boolean ab3 = emp.isSelected();
		if (ab3 == true) {

			WebElement empsib1 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[9]/div[1]/span/label"));

			String s1 = empsib1.getText();

			System.out.print("," + s1);
			setExcelData("aravind", 1, 65, "selected");
		} else {
			setExcelData("aravind", 1, 65, "not selected");

		}
		WebElement empsi2 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[9]/div[2]/span/label"));
		writeDataFromExcelselecteddtxt(empsi2, "aravind", 0, 66);
		WebElement emp1 = driver.findElement(By.xpath("//*[@id=\"sports10\"]"));
		boolean ab1 = emp1.isSelected();
		if (ab1 == true) {
			WebElement empsib2 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[9]/div[2]/span/label"));

			String s2 = empsib2.getText();
			System.out.print("," + s2);
			setExcelData("aravind", 1, 66, "selected");
		} else {
			setExcelData("aravind", 1, 66, "not selected");
		}
		WebElement empsi3 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[9]/div[3]/span/label"));
		writeDataFromExcelselecteddtxt(empsi3, "aravind", 0, 67);
		WebElement emp2 = driver.findElement(By.xpath("//*[@id=\"sports11\"]"));
		boolean ab4 = emp2.isSelected();
		if (ab4 == true) {
			WebElement empsib3 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[9]/div[3]/span/label"));

			String s3 = empsib3.getText();
			System.out.print("," + s3);
			setExcelData("aravind", 1, 67, "selected");
		} else {
			setExcelData("aravind", 1, 67, "not selected");

		}
		WebElement empsi4 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[9]/div[4]/span/label"));
		writeDataFromExcelselecteddtxt(empsi4, "aravind", 0, 68);
		WebElement emp3 = driver.findElement(By.xpath("//*[@id=\"sports7\"]"));
		boolean ab2 = emp3.isSelected();
		if (ab2 == true) {

			WebElement empsib4 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[9]/div[4]/span/label"));

			String s4 = empsib4.getText();
			System.out.print("," + s4);
			setExcelData("aravind", 1, 68, "selected");
		} else {
			setExcelData("aravind", 1, 68, "not selected");
		}
		WebElement empsi6 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[9]/div[5]/span/label"));
		writeDataFromExcelselecteddtxt(empsi6, "aravind", 0, 69);
		WebElement emp4 = driver.findElement(By.xpath("//*[@id=\"sports12\"]"));
		boolean ab5 = emp4.isSelected();
		if (ab5 == true) {
			WebElement empsib6 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[9]/div[5]/span/label"));

			String s6 = empsib6.getText();
			System.out.print("," + s6);
			setExcelData("aravind", 1, 69, "selected");
		} else {
			setExcelData("aravind", 1, 69, "not selected");
		}
		WebElement empsi7 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[9]/div[6]/span/label"));
		writeDataFromExcelselecteddtxt(empsi7, "aravind", 0, 70);
		WebElement emp6 = driver.findElement(By.xpath("//*[@id=\"sports15\"]"));
		boolean ab6 = emp6.isSelected();
		if (ab6 == true) {
			WebElement empsib7 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[9]/div[6]/span/label"));

			String s7 = empsib7.getText();
			System.out.print("," + s7);
			setExcelData("aravind", 1, 70, "selected");
		} else {
			setExcelData("aravind", 1, 70, "not selected");
		}
		WebElement empsi8 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[9]/div[7]/span/label"));
		writeDataFromExcelselecteddtxt(empsi8, "aravind", 0, 71);
		WebElement emp8 = driver.findElement(By.xpath("//*[@id=\"sports19\"]"));
		boolean ab8 = emp8.isSelected();
		if (ab8 == true) {

			WebElement empsib8 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[9]/div[7]/span/label"));

			String s8 = empsib8.getText();

			System.out.println("," + s8);
			setExcelData("aravind", 1, 71, "selected");
		} else {
			setExcelData("aravind", 1, 71, "not selected");
		}
	}

	@When("user have to click edit profile  Sports you like after")
	public void user_have_to_click_edit_profile_Sports_you_like_after() throws Throwable {
		WebElement name1 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[7]"));
		Txtexcel(name1, "aravind", 0, 64);
		WebElement empsi1 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[9]/div[1]/span/label"));
		writeDataFromExcelselecteddtxt(empsi1, "aravind", 0, 65);
		WebElement emp = driver.findElement(By.xpath("//*[@id=\"sports4\"]"));
		boolean ab3 = emp.isSelected();
		if (ab3 == true) {

			WebElement empsib1 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[9]/div[1]/span/label"));

			String s1 = empsib1.getText();

			System.out.print("," + s1);
			setExcelData("aravind", 2, 65, "selected");
		} else {
			setExcelData("aravind", 2, 65, "not selected");

		}
		WebElement empsi2 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[9]/div[2]/span/label"));
		writeDataFromExcelselecteddtxt(empsi2, "aravind", 0, 66);
		WebElement emp1 = driver.findElement(By.xpath("//*[@id=\"sports10\"]"));
		toClick(emp1);
		boolean ab1 = emp1.isSelected();
		if (ab1 == true) {
			WebElement empsib2 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[9]/div[2]/span/label"));

			String s2 = empsib2.getText();
			System.out.print("," + s2);
			setExcelData("aravind", 2, 66, "selected");
		} else {
			setExcelData("aravind", 2, 66, "not selected");
		}
		WebElement empsi3 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[9]/div[3]/span/label"));
		writeDataFromExcelselecteddtxt(empsi3, "aravind", 0, 67);
		WebElement emp2 = driver.findElement(By.xpath("//*[@id=\"sports11\"]"));
		toClick(emp2);
		boolean ab4 = emp2.isSelected();
		if (ab4 == true) {
			WebElement empsib3 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[9]/div[3]/span/label"));

			String s3 = empsib3.getText();
			System.out.print("," + s3);
			setExcelData("aravind", 2, 67, "selected");
		} else {
			setExcelData("aravind", 2, 67, "not selected");

		}
		WebElement empsi4 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[9]/div[4]/span/label"));
		writeDataFromExcelselecteddtxt(empsi4, "aravind", 0, 68);
		WebElement emp3 = driver.findElement(By.xpath("//*[@id=\"sports7\"]"));
		toClick(emp3);
		boolean ab2 = emp3.isSelected();
		if (ab2 == true) {

			WebElement empsib4 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[9]/div[4]/span/label"));

			String s4 = empsib4.getText();
			System.out.print("," + s4);
			setExcelData("aravind", 2, 68, "selected");
		} else {
			setExcelData("aravind", 2, 68, "not selected");
		}
		WebElement empsi6 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[9]/div[5]/span/label"));
		writeDataFromExcelselecteddtxt(empsi6, "aravind", 0, 69);
		WebElement emp4 = driver.findElement(By.xpath("//*[@id=\"sports12\"]"));
		boolean ab5 = emp4.isSelected();
		if (ab5 == true) {
			WebElement empsib6 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[9]/div[5]/span/label"));

			String s6 = empsib6.getText();
			System.out.print("," + s6);
			setExcelData("aravind", 2, 69, "selected");
		} else {
			setExcelData("aravind", 2, 69, "not selected");
		}
		WebElement empsi7 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[9]/div[6]/span/label"));
		writeDataFromExcelselecteddtxt(empsi7, "aravind", 0, 70);
		WebElement emp6 = driver.findElement(By.xpath("//*[@id=\"sports15\"]"));
		toClick(emp6);
		boolean ab6 = emp6.isSelected();
		if (ab6 == true) {
			WebElement empsib7 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[9]/div[6]/span/label"));

			String s7 = empsib7.getText();
			System.out.print("," + s7);
			setExcelData("aravind", 2, 70, "selected");
		} else {
			setExcelData("aravind", 2, 70, "not selected");
		}
		WebElement empsi8 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[9]/div[7]/span/label"));
		writeDataFromExcelselecteddtxt(empsi8, "aravind", 0, 71);
		WebElement emp8 = driver.findElement(By.xpath("//*[@id=\"sports19\"]"));
		boolean ab8 = emp8.isSelected();
		if (ab8 == true) {

			WebElement empsib8 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[9]/div[7]/span/label"));

			String s8 = empsib8.getText();

			System.out.println("," + s8);
			setExcelData("aravind", 2, 71, "selected");
		} else {
			setExcelData("aravind", 2, 71, "not selected");
		}

	}

	@When("user have to click edit profile  Others sports")
	public void user_have_to_click_edit_profile_Others_sports() throws Throwable {
		System.out.println("Before changed");
		WebElement name1 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[9]/div[8]"));
		Txtexcel(name1, "aravind", 0, 72);
		WebElement others = driver.findElement(By.xpath("//*[@id=\"sportsDesc\"]"));
		enteredTxt(others);
		writeDataFromExcelenteredtxt(others, "aravind", 1, 72);
		System.out.println("After changed");
		others.clear();
		toInput(others, "throw ball");
		Txt(name1);
		enteredTxt(others);
		writeDataFromExcelenteredtxt(others, "aravind", 2, 72);

	}

	@When("user have to click edit profile  Your favourite food")
	public void user_have_to_click_edit_profile_Your_favourite_food() throws Throwable {
		System.out.println("Before changed");
		WebElement name1 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[10]"));
		Txtexcel(name1, "aravind", 0, 73);
		WebElement empsi1 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[1]/span/label"));
		writeDataFromExcelselecteddtxt(empsi1, "aravind", 0, 74);
		WebElement emp = driver.findElement(By.xpath("//*[@id=\"food1\"]"));
		boolean ab3 = emp.isSelected();
		if (ab3 == true) {

			WebElement empsib1 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[1]/span/label"));

			String s1 = empsib1.getText();

			System.out.print("," + s1);
			setExcelData("aravind", 1, 74, "selected");
		} else {
			setExcelData("aravind", 1, 74, "not selected");
		}
		WebElement empsi2 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[2]/span/label"));
		writeDataFromExcelselecteddtxt(empsi2, "aravind", 0, 75);
		WebElement emp1 = driver.findElement(By.xpath("//*[@id=\"food2\"]"));
		boolean ab1 = emp1.isSelected();
		if (ab1 == true) {
			WebElement empsib2 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[2]/span/label"));

			String s2 = empsib2.getText();
			System.out.print("," + s2);
			setExcelData("aravind", 1, 75, "selected");
		} else {
			setExcelData("aravind", 1, 75, "not selected");
		}
		WebElement empsi3 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[3]/span/label"));
		writeDataFromExcelselecteddtxt(empsi3, "aravind", 0, 76);
		WebElement emp2 = driver.findElement(By.xpath("//*[@id=\"food3\"]"));
		boolean ab4 = emp2.isSelected();
		if (ab4 == true) {
			WebElement empsib3 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[3]/span/label"));

			String s3 = empsib3.getText();
			System.out.print("," + s3);
			setExcelData("aravind", 1, 76, "selected");
		} else {
			setExcelData("aravind", 1, 76, "not selected");
		}
		WebElement empsi4 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[4]/span/label"));
		writeDataFromExcelselecteddtxt(empsi4, "aravind", 0, 77);
		WebElement emp3 = driver.findElement(By.xpath("//*[@id=\"food4\"]"));
		boolean ab2 = emp3.isSelected();
		if (ab2 == true) {

			WebElement empsib4 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[4]/span/label"));

			String s4 = empsib4.getText();
			System.out.print("," + s4);
			setExcelData("aravind", 1, 77, "selected");
		} else {
			setExcelData("aravind", 1, 77, "not selected");
		}
		WebElement empsi6 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[5]/span/label"));
		writeDataFromExcelselecteddtxt(empsi6, "aravind", 0, 78);
		WebElement emp4 = driver.findElement(By.xpath("//*[@id=\"food17\"]"));
		boolean ab5 = emp4.isSelected();
		if (ab5 == true) {
			WebElement empsib6 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[5]/span/label"));

			String s6 = empsib6.getText();
			System.out.print("," + s6);
			setExcelData("aravind", 1, 78, "selected");
		} else {
			setExcelData("aravind", 1, 78, "not selected");
		}
		WebElement empsi7 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[6]/span/label"));
		writeDataFromExcelselecteddtxt(empsi7, "aravind", 0, 79);
		WebElement emp6 = driver.findElement(By.xpath("//*[@id=\"food5\"]"));
		boolean ab6 = emp6.isSelected();
		if (ab6 == true) {
			WebElement empsib7 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[6]/span/label"));

			String s7 = empsib7.getText();
			System.out.print("," + s7);
			setExcelData("aravind", 1, 79, "selected");
		} else {
			setExcelData("aravind", 1, 79, "not selected");
		}
		WebElement empsi8 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[7]/span/label"));
		writeDataFromExcelselecteddtxt(empsi8, "aravind", 0, 80);
		WebElement emp8 = driver.findElement(By.xpath("//*[@id=\"food6\"]"));
		boolean ab8 = emp8.isSelected();
		if (ab8 == true) {

			WebElement empsib8 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[7]/span/label"));

			String s8 = empsib8.getText();

			System.out.print("," + s8);
			setExcelData("aravind", 1, 80, "selected");
		} else {
			setExcelData("aravind", 1, 80, "not selected");

		}
		WebElement empsi9 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[8]/span/label"));
		writeDataFromExcelselecteddtxt(empsi9, "aravind", 0, 81);
		WebElement emp9 = driver.findElement(By.xpath("//*[@id=\"food7\"]"));
		boolean ab9 = emp9.isSelected();
		if (ab9 == true) {
			WebElement empsib9 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[8]/span/label"));

			String s9 = empsib9.getText();
			System.out.print("," + s9);
			setExcelData("aravind", 1, 81, "selected");
		} else {
			setExcelData("aravind", 1, 81, "not selected");
		}
		WebElement empsi10 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[9]/span/label"));
		writeDataFromExcelselecteddtxt(empsi10, "aravind", 0, 82);
		WebElement emp10 = driver.findElement(By.xpath("//*[@id=\"food8\"]"));
		boolean ab10 = emp10.isSelected();
		if (ab10 == true) {
			WebElement empsib10 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[9]/span/label"));

			String s10 = empsib10.getText();
			System.out.print("," + s10);
			setExcelData("aravind", 1, 82, "selected");
		} else {
			setExcelData("aravind", 1, 82, "not selected");
		}
		WebElement empsi11 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[10]/span/label"));
		writeDataFromExcelselecteddtxt(empsi11, "aravind", 0, 83);
		WebElement emp11 = driver.findElement(By.xpath("//*[@id=\"food9\"]"));
		boolean ab11 = emp11.isSelected();
		if (ab11 == true) {

			WebElement empsib11 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[10]/span/label"));

			String s11 = empsib11.getText();
			System.out.print("," + s11);
			setExcelData("aravind", 1, 83, "selected");
		} else {
			setExcelData("aravind", 1, 83, "not selected");
		}
		WebElement empsi12 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[11]/span/label"));
		writeDataFromExcelselecteddtxt(empsi12, "aravind", 0, 84);
		WebElement emp12 = driver.findElement(By.xpath("//*[@id=\"food11\"]"));
		boolean ab12 = emp12.isSelected();
		if (ab12 == true) {
			WebElement empsib12 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[11]/span/label"));

			String s12 = empsib12.getText();
			System.out.print("," + s12);
			setExcelData("aravind", 1, 84, "selected");
		} else {
			setExcelData("aravind", 1, 84, "not selected");

		}
		WebElement empsi13 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[12]/span/label"));
		writeDataFromExcelselecteddtxt(empsi13, "aravind", 0, 85);
		WebElement emp13 = driver.findElement(By.xpath("//*[@id=\"food12\"]"));
		boolean ab13 = emp13.isSelected();
		if (ab13 == true) {
			WebElement empsib13 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[12]/span/label"));

			String s13 = empsib13.getText();
			System.out.print("," + s13);
			setExcelData("aravind", 1, 85, "selected");
		} else {
			setExcelData("aravind", 1, 85, "not selected");
		}
		WebElement empsi14 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[13]/span/label"));
		writeDataFromExcelselecteddtxt(empsi14, "aravind", 0, 86);
		WebElement emp14 = driver.findElement(By.xpath("//*[@id=\"food13\"]"));
		boolean ab14 = emp14.isSelected();
		if (ab14 == true) {
			WebElement empsib14 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[13]/span/label"));

			String s14 = empsib14.getText();
			System.out.print("," + s14);
			setExcelData("aravind", 1, 86, "selected");
		} else {
			setExcelData("aravind", 1, 86, "selected");
		}
		WebElement empsi15 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[14]/span/label"));
		writeDataFromExcelselecteddtxt(empsi15, "aravind", 0, 87);
		WebElement emp15 = driver.findElement(By.xpath("//*[@id=\"food18\"]"));
		boolean ab15 = emp15.isSelected();
		if (ab15 == true) {
			WebElement empsib15 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[14]/span/label"));

			String s15 = empsib15.getText();
			System.out.print("," + s15);
			setExcelData("aravind", 1, 88, "selected");
		} else {
			setExcelData("aravind", 1, 88, "not selected");
		}
		WebElement empsi16 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[15]/span/label"));
		writeDataFromExcelselecteddtxt(empsi16, "aravind", 0, 89);
		WebElement emp16 = driver.findElement(By.xpath("//*[@id=\"food14\"]"));
		boolean ab16 = emp16.isSelected();
		if (ab16 == true) {
			WebElement empsib16 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[15]/span/label"));

			String s16 = empsib16.getText();
			System.out.println("," + s16);
			setExcelData("aravind", 1, 89, "selected");
		} else {
			setExcelData("aravind", 1, 89, " not selected");
		}

	}

	@When("user have to click edit profile  Your favourite food others")
	public void user_have_to_click_edit_profile_Your_favourite_food_others() throws Throwable {
		System.out.println("After changed");
		WebElement name1 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[10]"));
		Txtexcel(name1, "aravind", 0, 73);

		WebElement empsi1 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[1]/span/label"));
		writeDataFromExcelselecteddtxt(empsi1, "aravind", 0, 74);
		WebElement emp = driver.findElement(By.xpath("//*[@id=\"food1\"]"));
		boolean ab3 = emp.isSelected();
		if (ab3 == true) {

			WebElement empsib1 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[1]/span/label"));

			String s1 = empsib1.getText();

			System.out.print("," + s1);
			setExcelData("aravind", 2, 74, "selected");
		} else {
			setExcelData("aravind", 2, 74, "not selected");
		}
		WebElement empsi2 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[2]/span/label"));
		writeDataFromExcelselecteddtxt(empsi2, "aravind", 0, 75);
		WebElement emp1 = driver.findElement(By.xpath("//*[@id=\"food2\"]"));
		boolean ab1 = emp1.isSelected();
		if (ab1 == true) {
			WebElement empsib2 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[2]/span/label"));

			String s2 = empsib2.getText();
			System.out.print("," + s2);
			setExcelData("aravind", 2, 75, "selected");
		} else {
			setExcelData("aravind", 2, 75, "not selected");
		}
		WebElement empsi3 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[3]/span/label"));
		writeDataFromExcelselecteddtxt(empsi3, "aravind", 0, 76);
		WebElement emp2 = driver.findElement(By.xpath("//*[@id=\"food3\"]"));
		boolean ab4 = emp2.isSelected();
		if (ab4 == true) {
			WebElement empsib3 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[3]/span/label"));

			String s3 = empsib3.getText();
			System.out.print("," + s3);
			setExcelData("aravind", 2, 76, "selected");
		} else {
			setExcelData("aravind", 2, 76, "not selected");
		}
		WebElement empsi4 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[4]/span/label"));
		writeDataFromExcelselecteddtxt(empsi4, "aravind", 0, 77);
		WebElement emp3 = driver.findElement(By.xpath("//*[@id=\"food4\"]"));
		boolean ab2 = emp3.isSelected();
		if (ab2 == true) {

			WebElement empsib4 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[4]/span/label"));

			String s4 = empsib4.getText();
			System.out.print("," + s4);
			setExcelData("aravind", 2, 77, "selected");
		} else {
			setExcelData("aravind", 2, 77, "not selected");
		}
		WebElement empsi6 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[5]/span/label"));
		writeDataFromExcelselecteddtxt(empsi6, "aravind", 0, 78);
		WebElement emp4 = driver.findElement(By.xpath("//*[@id=\"food17\"]"));
		boolean ab5 = emp4.isSelected();
		if (ab5 == true) {
			WebElement empsib6 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[5]/span/label"));

			String s6 = empsib6.getText();
			System.out.print("," + s6);
			setExcelData("aravind", 2, 78, "selected");
		} else {
			setExcelData("aravind", 2, 78, "not selected");
		}
		WebElement empsi7 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[6]/span/label"));
		writeDataFromExcelselecteddtxt(empsi7, "aravind", 0, 79);
		WebElement emp6 = driver.findElement(By.xpath("//*[@id=\"food5\"]"));
		boolean ab6 = emp6.isSelected();
		if (ab6 == true) {
			WebElement empsib7 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[6]/span/label"));

			String s7 = empsib7.getText();
			System.out.print("," + s7);
			setExcelData("aravind", 2, 79, "selected");
		} else {
			setExcelData("aravind", 2, 79, "not selected");
		}
		WebElement empsi8 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[7]/span/label"));
		writeDataFromExcelselecteddtxt(empsi8, "aravind", 0, 80);
		WebElement emp8 = driver.findElement(By.xpath("//*[@id=\"food6\"]"));
		boolean ab8 = emp8.isSelected();
		if (ab8 == true) {

			WebElement empsib8 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[7]/span/label"));

			String s8 = empsib8.getText();

			System.out.print("," + s8);
			setExcelData("aravind", 2, 80, "selected");
		} else {
			setExcelData("aravind", 2, 80, "not selected");

		}
		WebElement empsi9 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[8]/span/label"));
		writeDataFromExcelselecteddtxt(empsi9, "aravind", 0, 81);
		WebElement emp9 = driver.findElement(By.xpath("//*[@id=\"food7\"]"));
		boolean ab9 = emp9.isSelected();
		if (ab9 == true) {
			WebElement empsib9 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[8]/span/label"));

			String s9 = empsib9.getText();
			System.out.print("," + s9);
			setExcelData("aravind", 2, 81, "selected");
		} else {
			setExcelData("aravind", 2, 81, "not selected");
		}
		WebElement empsi10 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[9]/span/label"));
		writeDataFromExcelselecteddtxt(empsi10, "aravind", 0, 82);
		WebElement emp10 = driver.findElement(By.xpath("//*[@id=\"food8\"]"));
		boolean ab10 = emp10.isSelected();
		if (ab10 == true) {
			WebElement empsib10 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[9]/span/label"));

			String s10 = empsib10.getText();
			System.out.print("," + s10);
			setExcelData("aravind", 2, 82, "selected");
		} else {
			setExcelData("aravind", 2, 82, "not selected");
		}
		WebElement empsi11 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[10]/span/label"));
		writeDataFromExcelselecteddtxt(empsi11, "aravind", 0, 83);
		WebElement emp11 = driver.findElement(By.xpath("//*[@id=\"food9\"]"));
		boolean ab11 = emp11.isSelected();
		if (ab11 == true) {

			WebElement empsib11 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[10]/span/label"));

			String s11 = empsib11.getText();
			System.out.print("," + s11);
			setExcelData("aravind", 2, 83, "selected");
		} else {
			setExcelData("aravind", 2, 83, "not selected");
		}
		WebElement empsi12 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[11]/span/label"));
		writeDataFromExcelselecteddtxt(empsi12, "aravind", 0, 84);
		WebElement emp12 = driver.findElement(By.xpath("//*[@id=\"food11\"]"));
		boolean ab12 = emp12.isSelected();
		if (ab12 == true) {
			WebElement empsib12 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[11]/span/label"));

			String s12 = empsib12.getText();
			System.out.print("," + s12);
			setExcelData("aravind", 2, 84, "selected");
		} else {
			setExcelData("aravind", 2, 84, "not selected");

		}
		WebElement empsi13 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[12]/span/label"));
		writeDataFromExcelselecteddtxt(empsi13, "aravind", 0, 85);
		WebElement emp13 = driver.findElement(By.xpath("//*[@id=\"food12\"]"));
		boolean ab13 = emp13.isSelected();
		if (ab13 == true) {
			WebElement empsib13 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[12]/span/label"));

			String s13 = empsib13.getText();
			System.out.print("," + s13);
			setExcelData("aravind", 2, 85, "selected");
		} else {
			setExcelData("aravind", 2, 85, "not selected");
		}
		WebElement empsi14 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[13]/span/label"));
		writeDataFromExcelselecteddtxt(empsi14, "aravind", 0, 86);
		WebElement emp14 = driver.findElement(By.xpath("//*[@id=\"food13\"]"));
		boolean ab14 = emp14.isSelected();
		if (ab14 == true) {
			WebElement empsib14 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[13]/span/label"));

			String s14 = empsib14.getText();
			System.out.print("," + s14);
			setExcelData("aravind", 2, 86, "selected");
		} else {
			setExcelData("aravind", 2, 86, "selected");
		}
		WebElement empsi15 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[14]/span/label"));
		writeDataFromExcelselecteddtxt(empsi15, "aravind", 0, 87);
		WebElement emp15 = driver.findElement(By.xpath("//*[@id=\"food18\"]"));
		boolean ab15 = emp15.isSelected();
		if (ab15 == true) {
			WebElement empsib15 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[14]/span/label"));

			String s15 = empsib15.getText();
			System.out.print("," + s15);
			setExcelData("aravind", 2, 88, "selected");
		} else {
			setExcelData("aravind", 2, 88, "not selected");
		}
		WebElement empsi16 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[15]/span/label"));
		writeDataFromExcelselecteddtxt(empsi16, "aravind", 0, 89);
		WebElement emp16 = driver.findElement(By.xpath("//*[@id=\"food14\"]"));
		toClick(emp16);
		boolean ab16 = emp16.isSelected();
		if (ab16 == true) {
			WebElement empsib16 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[15]/span/label"));

			String s16 = empsib16.getText();
			System.out.println("," + s16);
			setExcelData("aravind", 2, 89, "selected");
		} else {
			setExcelData("aravind", 2, 89, " not selected");
		}

	}

	@When("user have to click edit profile  Others favourite food")
	public void user_have_to_click_edit_profile_Others_favourite_food() throws Throwable {
		WebElement name1 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[16]"));
		Txtexcel(name1, "aravind", 0, 90);
		WebElement others = driver.findElement(By.xpath("//*[@id=\"foodDesc\"]"));
		enteredTxt(others);
		writeDataFromExcelenteredtxt(others, "aravind", 1, 90);
		System.out.println("After changed");
		others.clear();
		toInput(others, "chicken rice");
		Txt(name1);
		enteredTxt(others);
		writeDataFromExcelenteredtxt(others, "aravind", 2, 90);
	}

	@When("user have to click edit profile  save")
	public void user_have_to_click_edit_profile_save1() {

	}

	@When("user have to click edit profile  edit partner preference")
	public void user_have_to_click_edit_profile_edit_partner_preference() throws Throwable {
		WebElement edu1 = driver.findElement(By.xpath("(//*[@class=\"title-link\"])[5]"));

		Thread.sleep(3000);
		toMove(edu1);
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click()", edu1);
		Thread.sleep(5000);
		System.out.println("Before changed");
		WebElement pp = driver.findElement(By.xpath("(//*[@class='clr7 padb10'])[1]"));

		Txtexcel1(pp, "aravind", 0, 91);
		WebElement pp1 = driver.findElement(By.xpath("((//*[@class=\"clr7 padb10\"])[1]/following-sibling::*)[1]"));

		ppeditexcel(pp1, "aravind", 1, 91);
		WebElement pp2 = driver.findElement(By.xpath("(//*[@class='clr7 padb10'])[2]"));

		Txtexcel1(pp2, "aravind", 0, 92);
		WebElement pp3 = driver.findElement(By.xpath("(//*[@class=\"clr7 padb10\"])[2]/following-sibling::*"));

		ppeditexcel(pp3, "aravind", 1, 92);
		WebElement pp4 = driver.findElement(By.xpath("(//*[@class='clr7 padb10'])[3]"));

		Txtexcel1(pp4, "aravind", 0, 93);
		WebElement pp5 = driver.findElement(By.xpath("(//*[@class=\"clr7 padb10\"])[3]/following-sibling::*"));

		ppeditexcel(pp5, "aravind", 1, 93);
		WebElement pp6 = driver.findElement(By.xpath("(//*[@class='clr7 padb10'])[4]"));

		Txtexcel1(pp6, "aravind", 0, 94);
		WebElement pp7 = driver.findElement(By.xpath("(//*[@class=\"clr7 padb10\"])[4]/following-sibling::*"));

		ppeditexcel(pp7, "aravind", 1, 94);
		WebElement pp8 = driver.findElement(By.xpath("(//*[@class='clr7 padb10'])[5]"));

		Txtexcel1(pp8, "aravind", 0, 95);
		WebElement pp9 = driver.findElement(By.xpath("(//*[@class=\"clr7 padb10\"])[5]/following-sibling::*"));

		ppeditexcel(pp9, "aravind", 1, 95);
		WebElement pp10 = driver.findElement(By.xpath("(//*[@class='clr7 padb10'])[6]"));

		Txtexcel1(pp10, "aravind", 0, 96);
		WebElement pp11 = driver.findElement(By.xpath("(//*[@class=\"clr7 padb10\"])[6]/following-sibling::*"));

		ppeditexcel(pp11, "aravind", 1, 96);
		WebElement pp12 = driver.findElement(By.xpath("(//*[@class='clr7 padb10'])[7]"));

		Txtexcel1(pp12, "aravind", 0, 97);
		WebElement pp13 = driver.findElement(By.xpath("(//*[@class=\"clr7 padb10\"])[7]/following-sibling::*"));

		ppeditexcel(pp13, "aravind", 1, 97);
		WebElement pp14 = driver.findElement(By.xpath("(//*[@class='clr7 padb10'])[8]"));

		Txtexcel1(pp14, "aravind", 0, 98);
		WebElement pp15 = driver.findElement(By.xpath("(//*[@class=\"clr7 padb10\"])[8]/following-sibling::*"));

		ppeditexcel(pp15, "aravind", 1, 98);
		WebElement pp16 = driver.findElement(By.xpath("(//*[@class='clr7 padb10'])[9]"));

		Txtexcel1(pp16, "aravind", 0, 99);
		WebElement pp17 = driver.findElement(By.xpath("(//*[@class=\"clr7 padb10\"])[9]/following-sibling::*"));

		ppeditexcel(pp17, "aravind", 1, 99);
		WebElement pp18 = driver.findElement(By.xpath("(//*[@class='clr7 padb10'])[10]"));

		Txtexcel1(pp18, "aravind", 0, 100);
		WebElement pp19 = driver.findElement(By.xpath("(//*[@class=\"clr7 padb10\"])[10]/following-sibling::*"));

		ppeditexcel(pp19, "aravind", 1, 100);
		WebElement pp20 = driver.findElement(By.xpath("(//*[@class='clr7 padb10'])[11]"));

		Txtexcel1(pp20, "aravind", 0, 101);
		WebElement pp21 = driver.findElement(By.xpath("(//*[@class=\"clr7 padb10\"])[11]/following-sibling::*"));

		ppeditexcel(pp21, "aravind", 1, 101);
		WebElement pp22 = driver.findElement(By.xpath("(//*[@class='clr7 padb10'])[12]"));

		Txtexcel1(pp22, "aravind", 0, 102);
		WebElement pp23 = driver.findElement(By.xpath("(//*[@class=\"clr7 padb10\"])[12]/following-sibling::*"));

		ppeditexcel(pp23, "aravind", 1, 102);
		WebElement pp24 = driver.findElement(By.xpath("(//*[@class='clr7 padb10'])[13]"));

		Txtexcel1(pp24, "aravind", 0, 103);
		WebElement pp25 = driver.findElement(By.xpath("(//*[@class=\"clr7 padb10\"])[13]/following-sibling::*"));

		ppeditexcel(pp25, "aravind", 1, 103);
		WebElement pp26 = driver.findElement(By.xpath("(//*[@class='clr7 padb10'])[14]"));

		Txtexcel1(pp26, "aravind", 0, 104);
		WebElement pp27 = driver.findElement(By.xpath("(//*[@class=\"clr7 padb10\"])[14]/following-sibling::*"));

		ppeditexcel(pp27, "aravind", 1, 104);
		WebElement pp28 = driver.findElement(By.xpath("(//*[@class='clr7 padb10'])[15]"));

		Txtexcel1(pp28, "aravind", 0, 105);
		WebElement pp29 = driver.findElement(By.xpath("(//*[@class=\"clr7 padb10\"])[15]/following-sibling::*"));

		ppeditexcel(pp29, "aravind", 1, 105);
		WebElement pp30 = driver.findElement(By.xpath("(//*[@class='clr7 padb10'])[16]"));

		Txtexcel1(pp30, "aravind", 0, 106);
		WebElement pp31 = driver.findElement(By.xpath("(//*[@class=\"clr7 padb10\"])[16]/following-sibling::*"));

		ppeditexcel(pp31, "aravind", 1, 106);
		WebElement pp32 = driver.findElement(By.xpath("(//*[@class='clr7 padb10'])[17]"));

		Txtexcel1(pp32, "aravind", 0, 107);
		WebElement pp33 = driver.findElement(By.xpath("(//*[@class=\"clr7 padb10\"])[17]/following-sibling::*"));

		ppeditexcel(pp33, "aravind", 1, 107);
		WebElement pp34 = driver.findElement(By.xpath("(//*[@class='clr7 padb10'])[18]"));

		Txtexcel1(pp34, "aravind", 0, 108);
		WebElement pp35 = driver.findElement(By.xpath("(//*[@class=\"clr7 padb10\"])[18]/following-sibling::*"));

		ppeditexcel(pp35, "aravind", 1, 108);
		WebElement pp36 = driver.findElement(By.xpath("(//*[@class='clr7 padb10'])[19]"));

		Txtexcel1(pp36, "aravind", 0, 109);
		WebElement pp37 = driver.findElement(By.xpath("(//*[@class=\"clr7 padb10\"])[19]/following-sibling::*"));

		ppeditexcel(pp37, "aravind", 1, 109);
		WebElement pp38 = driver.findElement(By.xpath("(//*[@class='clr7 padb10'])[20]"));

		Txtexcel1(pp38, "aravind", 0, 110);
		WebElement pp39 = driver.findElement(By.xpath("(//*[@class=\"clr7 padb10\"])[20]/following-sibling::*"));

		ppeditexcel(pp39, "aravind", 1, 110);
		Thread.sleep(5000);

		WebElement w47 = driver.findElement(By.xpath("//*[@id=\"show_partner\"]/a"));
		Thread.sleep(3000);

		toMove(w47);
		j.executeScript("arguments[0].click()", w47);
		Thread.sleep(6000);

	}

	@When("user have to click edit profile partner preference  marital status")
	public void user_have_to_click_edit_profile_partner_preference_marital_status() {

		WebElement bol1 = driver.findElement(By.xpath("//*[@id=\"lookingStatus1\"]"));

		boolean ab1 = bol1.isSelected();
		if (ab1 == true) {
			WebElement bolsib1 = driver.findElement(By.xpath("//*[@id=\"lookingStatus1\"]/following-sibling::*"));

			String s1 = bolsib1.getText();

		}

		WebElement bol2 = driver.findElement(By.xpath("//*[@id=\"lookingStatus2\"]"));

		boolean ab2 = bol2.isSelected();
		if (ab2 == true) {
			WebElement bolsib2 = driver.findElement(By.xpath("//*[@id=\"lookingStatus2\"]/following-sibling::*"));
			String s2 = bolsib2.getText();

		}

		WebElement bol3 = driver.findElement(By.xpath("//*[@id=\"lookingStatus3\"]"));
		boolean ab3 = bol3.isSelected();
		if (ab3 == true) {
			WebElement bolsib3 = driver.findElement(By.xpath("//*[@id=\"lookingStatus3\"]/following-sibling::*"));
			String s3 = bolsib3.getText();

		}

		WebElement bol4 = driver.findElement(By.xpath("//*[@id=\"lookingStatus4\"]"));
		boolean ab4 = bol4.isSelected();
		if (ab4 == true) {
			WebElement bolsib4 = driver.findElement(By.xpath("//*[@id=\"lookingStatus4\"]/following-sibling::*"));
			String s4 = bolsib4.getText();

		}
		WebElement bol5 = driver.findElement(By.xpath("//*[@id=\"lookingStatus0\"]"));
		boolean ab5 = bol5.isSelected();
		if (ab5 == true) {
			WebElement bolsib5 = driver.findElement(By.xpath("//*[@id=\"lookingStatus0\"]/following-sibling::*"));
			String s5 = bolsib5.getText();

		}

	}

	@When("user have to click edit profile partner preference  age")
	public void user_have_to_click_edit_profile_partner_preference_age() {
		WebElement age = driver.findElement(By.xpath("//*[@id=\"fage\"]"));
		WebElement age1 = driver.findElement(By.xpath("//*[@id=\"tage\"]"));

		selectIndex(age, 2);
		selectIndex(age1, 4);

	}

	@When("user have to click edit profile partner preference  height")
	public void user_have_to_click_edit_profile_partner_preference_height() {
		WebElement hei = driver.findElement(By.xpath("//*[@id=\"heightFrom\"]"));
		WebElement hei1 = driver.findElement(By.xpath("//*[@id=\"heightTo\"]"));

		selectIndex(hei, 2);
		selectIndex(hei1, 9);

	}

	@When("user have to click edit profile partner preference physical status")
	public void user_have_to_click_edit_profile_partner_preference_physical_status() {
		WebElement get10 = driver.findElement(By.xpath("//*[@id=\"physicalStatus0\"]"));
		boolean ab1 = get10.isSelected();
		if (ab1 == true) {
			WebElement physi = driver.findElement(By.xpath("//*[@id=\"physicalStatus0\"]/following-sibling::*"));

			String s1 = physi.getText();

		}

		WebElement get9 = driver.findElement(By.xpath("//*[@id=\"physicalStatus1\"]"));
		toClick(get9);
		boolean ab2 = get9.isSelected();
		if (ab2 == true) {
			WebElement physi1 = driver.findElement(By.xpath("//*[@id=\"physicalStatus1\"]/following-sibling::*"));

			String s1 = physi1.getText();

		}
		WebElement phy1 = driver.findElement(By.xpath("//*[@id=\"physicalStatus2\"]"));
		toClick(phy1);
		boolean physic = phy1.isSelected();
		if (physic == true) {
			WebElement physi1 = driver.findElement(By.xpath("//*[@id=\"physicalStatus2\"]/following-sibling::*"));

			String s1 = physi1.getText();

		}

	}

	@When("user have to click edit profile partner preference  mother tongue")
	public void user_have_to_click_edit_profile_partner_preference_mother_tongue() {
		WebElement get12 = driver.findElement(By.xpath("//*[@id=\"motherTongue\"]"));

		selectIndex(get12, 6);
		List<WebElement> radios = driver
				.findElements(By.xpath("//*[@id=\"frmPartner\"]/div/dl[10]/dd/div[1]/span/span[1]/span/ul"));
		allSelectedOption(radios);

	}

	@When("user have to click edit profile partner preference subcaste")
	public void user_have_to_click_edit_profile_partner_preference_subcaste() {
		WebElement get12 = driver.findElement(By.xpath("//*[@id=\"subCaste\"]"));

		selectIndex(get12, 6);
		List<WebElement> radios = driver
				.findElements(By.xpath("//*[@id=\"frmPartner\"]/div/dl[12]/dd/div[1]/span/span[1]/span/ul"));
		allSelectedOption(radios);

	}

	@When("user have to click edit profile partner preference star")
	public void user_have_to_click_edit_profile_partner_preference_star() {
		WebElement get12 = driver.findElement(By.xpath("//*[@id=\"star\"]"));

		selectIndex(get12, 6);
		List<WebElement> radios = driver
				.findElements(By.xpath("//*[@id=\"frmPartner\"]/div/dl[14]/dd/div[1]/span/span[1]/span/ul"));
		allSelectedOption(radios);

	}

	@When("user have to click edit profile partner preference  chevvai dosham")
	public void user_have_to_click_edit_profile_partner_preference_chevvai_dosham() {
		WebElement get17 = driver.findElement(By.xpath("//*[@id=\"manglik3\"]"));
		boolean ab2 = get17.isSelected();
		if (ab2 == true) {
			WebElement dosh = driver.findElement(By.xpath("//*[@id=\"manglik3\"]/following-sibling::*"));

			String s1 = dosh.getText();

		}

		WebElement get19 = driver.findElement(By.xpath("//*[@id=\"manglik1\"]"));
		boolean ab1 = get19.isSelected();
		if (ab1 == true) {
			WebElement dosh1 = driver.findElement(By.xpath("//*[@id=\"manglik1\"]/following-sibling::*"));

			String s2 = dosh1.getText();

		}

		WebElement get20 = driver.findElement(By.xpath("//*[@id=\"manglik2\"]"));
		toClick(get20);
		boolean ab3 = get20.isSelected();
		if (ab3 == true) {
			WebElement dosh2 = driver.findElement(By.xpath("//*[@id=\"manglik2\"]/following-sibling::*"));

			String s3 = dosh2.getText();

		}

	}

	@When("user have to click edit profile partner preference  educationm")
	public void user_have_to_click_edit_profile_partner_preference_educationm() {
		WebElement bol1 = driver.findElement(By.xpath("//*[@id=\"educationTempradio1\"]"));

		boolean ab1 = bol1.isSelected();
		if (ab1 == true) {
			WebElement bolsib1 = driver.findElement(By.xpath("//*[@id=\"educationTempradio1\"]/following-sibling::*"));

			String s1 = bolsib1.getText();

		}

		WebElement bol2 = driver.findElement(By.xpath("//*[@id=\"educationTempradio2\"]"));
		toClick(bol2);
		boolean ab2 = bol2.isSelected();
		if (ab2 == true) {
			WebElement bolsib2 = driver.findElement(By.xpath("//*[@id=\"educationTempradio2\"]/following-sibling::*"));
			String s2 = bolsib2.getText();

			List<WebElement> radios = driver
					.findElements(By.xpath("//*[@id=\"EducationTypeDivId\"]/div/span/span[1]/span/ul"));
			allSelectedOption(radios);

		}

		WebElement bol3 = driver.findElement(By.xpath("//*[@id=\"educationTempradio3\"]"));
		boolean ab3 = bol3.isSelected();
		if (ab3 == true) {
			WebElement bolsib3 = driver.findElement(By.xpath("//*[@id=\"educationTempradio3\"]/following-sibling::*"));
			String s3 = bolsib3.getText();

			List<WebElement> radios1 = driver
					.findElements(By.xpath("//*[@id=\"EducationTypeDivId\"]/div/span/span[1]/span/ul"));
			allSelectedOption(radios1);

		}

		WebElement bol4 = driver.findElement(By.xpath("//*[@id=\"educationTempradio4\"]"));
		boolean ab4 = bol4.isSelected();
		if (ab4 == true) {
			WebElement bolsib4 = driver.findElement(By.xpath("//*[@id=\"educationTempradio4\"]/following-sibling::*"));
			String s4 = bolsib4.getText();

			List<WebElement> radios2 = driver
					.findElements(By.xpath("//*[@id=\"EducationTypeDivId\"]/div/span/span[1]/span/ul"));
			allSelectedOption(radios2);

		}

	}

	@When("user have to click edit profile partner preference employedIn")
	public void user_have_to_click_edit_profile_partner_preference_employedIn() {
		WebElement get12 = driver.findElement(By.xpath("//*[@id=\"employedin\"]"));

		selectIndex(get12, 5);
		List<WebElement> radios = driver
				.findElements(By.xpath("//*[@id=\"frmPartner\"]/div/dl[20]/dd/div[1]/span/span[1]/span/ul"));
		allSelectedOption(radios);

	}

	@When("user have to click edit profile partner preference occupation")
	public void user_have_to_click_edit_profile_partner_preference_occupation() {
		WebElement get12 = driver.findElement(By.xpath("//*[@id=\"occupation\"]"));

		selectIndex(get12, 6);
		List<WebElement> radios = driver
				.findElements(By.xpath("//*[@id=\"frmPartner\"]/div/dl[23]/dd/div[1]/span/span[1]/span/ul"));
		allSelectedOption(radios);

	}

	@When("user have to click edit profile partner preference citzenship")
	public void user_have_to_click_edit_profile_partner_preference_citzenship() {
		WebElement get12 = driver.findElement(By.xpath("//*[@id=\"citizenship\"]"));

		selectIndex(get12, 6);
		List<WebElement> radios = driver
				.findElements(By.xpath("//*[@id=\"frmPartner\"]/div/dl[24]/dd/div[1]/span/span[1]/span/ul"));
		allSelectedOption(radios);

	}

	@When("user have to click edit profile partner preference country living")
	public void user_have_to_click_edit_profile_partner_preference_country_living() {
		WebElement get12 = driver.findElement(By.xpath("//*[@id=\"countryLivingIn\"]"));

		selectIndex(get12, 6);
		List<WebElement> radios = driver
				.findElements(By.xpath("//*[@id=\"frmPartner\"]/div/dl[25]/dd/div[1]/span/span[1]/span/ul"));
		allSelectedOption(radios);

	}

	@When("user have to click edit profile partner preference residing state in india")
	public void user_have_to_click_edit_profile_partner_preference_residing_state_in_india() {
		WebElement get12 = driver.findElement(By.xpath("//*[@id=\"residingIndia\"]"));

		selectIndex(get12, 6);
		List<WebElement> radios = driver
				.findElements(By.xpath("//*[@id=\"inadiaState\"]/dl[1]/dd/div[1]/span/span[1]/span/ul"));
		allSelectedOption(radios);

	}

	@When("user have to click edit profile partner preference  residing district")
	public void user_have_to_click_edit_profile_partner_preference_residing_district() {
		waitingWeb();
		WebElement get123 = driver.findElement(By.xpath("//*[@id=\"residingCity\"]"));

		selectIndex(get123, 6);
	

	}

	@When("user have to click edit profilepartner preference  food habits")
	public void user_have_to_click_edit_profilepartner_preference_food_habits() {
		WebElement get18 = driver.findElement(By.xpath("//*[@id=\"eatingHabits1\"]"));
		boolean ab3 = get18.isSelected();
		if (ab3 == true) {
			WebElement eatsib1 = driver.findElement(By.xpath("//*[@id=\"eatingHabits1\"]/following-sibling::*"));

			String s1 = eatsib1.getText();

		}

		WebElement eat1 = driver.findElement(By.xpath("//*[@id=\"eatingHabits2\"]"));
		boolean ab1 = eat1.isSelected();
		if (ab1 == true) {
			WebElement eatsib2 = driver.findElement(By.xpath("//*[@id=\"eatingHabits2\"]/following-sibling::*"));

			String s2 = eatsib2.getText();

		}
		WebElement eat2 = driver.findElement(By.xpath("//*[@id=\"eatingHabits3\"]"));
		toClick(eat2);
		boolean ab4 = eat2.isSelected();
		if (ab4 == true) {
			WebElement eatsib3 = driver.findElement(By.xpath("//*[@id=\"eatingHabits3\"]/following-sibling::*"));

			String s3 = eatsib3.getText();

		}

		WebElement eat3 = driver.findElement(By.xpath("//*[@id=\"eatingHabits4\"]"));
		boolean ab2 = eat3.isSelected();
		if (ab2 == true) {
			WebElement eatsib4 = driver.findElement(By.xpath("//*[@id=\"eatingHabits4\"]/following-sibling::*"));

			String s4 = eatsib4.getText();

		}
		WebElement eat5 = driver.findElement(By.xpath("//*[@id=\"eatingHabits0\"]"));
		boolean ab5 = eat5.isSelected();
		if (ab5 == true) {
			WebElement eatsib5 = driver.findElement(By.xpath("//*[@id=\"eatingHabits0\"]/following-sibling::*"));

			String s5 = eatsib5.getText();
		}

	}

	@When("user have to click edit profile partner preference smoking habits")
	public void user_have_to_click_edit_profile_partner_preference_smoking_habits() {
		WebElement smo1 = driver.findElement(By.xpath("//*[@id=\"smokingHabits1\"]"));
		boolean ab1 = smo1.isSelected();
		if (ab1 == true) {
			WebElement smosib1 = driver.findElement(By.xpath("//*[@id=\"smokingHabits1\"]/following-sibling::*"));

			String s1 = smosib1.getText();

		}

		WebElement smo2 = driver.findElement(By.xpath("//*[@id=\"smokingHabits2\"]"));
		toClick(smo2);
		boolean ab2 = smo2.isSelected();
		if (ab2 == true) {
			WebElement smosib2 = driver.findElement(By.xpath("//*[@id=\"smokingHabits2\"]/following-sibling::*"));

			String s2 = smosib2.getText();

		}

		WebElement smo3 = driver.findElement(By.xpath("//*[@id=\"smokingHabits3\"]"));
		boolean ab3 = smo3.isSelected();
		if (ab3 == true) {
			WebElement smosib3 = driver.findElement(By.xpath("//*[@id=\"smokingHabits3\"]/following-sibling::*"));

			String s3 = smosib3.getText();

		}
		WebElement smo4 = driver.findElement(By.xpath("//*[@id=\"smokingHabits0\"]"));
		boolean ab4 = smo4.isSelected();
		if (ab4 == true) {
			WebElement smosib4 = driver.findElement(By.xpath("//*[@id=\"smokingHabits0\"]/following-sibling::*"));

			String s4 = smosib4.getText();

		}

	}

	@When("user have to click edit profile  partner preference drinking habits")
	public void user_have_to_click_edit_profile_partner_preference_drinking_habits() {
		WebElement smo1 = driver.findElement(By.xpath("//*[@id=\"drinkingHabits1\"]"));
		boolean ab1 = smo1.isSelected();
		if (ab1 == true) {
			WebElement drisib1 = driver.findElement(By.xpath("//*[@id=\"drinkingHabits1\"]/following-sibling::*"));

			String s1 = drisib1.getText();

		}

		WebElement smo2 = driver.findElement(By.xpath("//*[@id=\"drinkingHabits2\"]"));
		toClick(smo2);
		boolean ab2 = smo2.isSelected();
		if (ab2 == true) {
			WebElement drisib2 = driver.findElement(By.xpath("//*[@id=\"drinkingHabits2\"]/following-sibling::*"));

			String s2 = drisib2.getText();

		}

		WebElement smo3 = driver.findElement(By.xpath("//*[@id=\"drinkingHabits3\"]"));
		boolean ab3 = smo3.isSelected();
		if (ab3 == true) {
			WebElement drisib3 = driver.findElement(By.xpath("//*[@id=\"drinkingHabits3\"]/following-sibling::*"));

			String s3 = drisib3.getText();

		}
		WebElement smo4 = driver.findElement(By.xpath("//*[@id=\"drinkingHabits0\"]"));
		boolean ab4 = smo4.isSelected();
		if (ab4 == true) {
			WebElement drisib4 = driver.findElement(By.xpath("//*[@id=\"drinkingHabits0\"]/following-sibling::*"));

			String s4 = drisib4.getText();

		}

	}

	@When("user have to click edit profile  partner preference annual income")
	public void user_have_to_click_edit_profile_partner_preference_annual_income() {
		WebElement in = driver.findElement(By.xpath("//*[@id=\"fromIncomeINR\"]"));
		WebElement in1 = driver.findElement(By.xpath("//*[@id=\"toIncomeINR\"]"));

		selectIndex(in, 4);
		selectIndex(in1, 6);

	}

	@When("user have to click edit profile  partner preference about my partner")
	public void user_have_to_click_edit_profile_partner_preference_about_my_partner() {

		WebElement pdes = driver.findElement(By.xpath("//*[@id=\"partnerDescription\"]"));
		String attribute = pdes.getAttribute("value");

		pdes.clear();
		toInput(pdes,
				"My name is manoj and I work in the Private Sector as a Software Professional. I belong to a Upper Middle Class, Joint Family with Traditional Values. I have completed my BE.");

	}

	@When("user have to click edit profile  partner preference save")
	public void user_have_to_click_edit_profile_partner_preference_save() throws Throwable {
		WebElement click = driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]"));
		Thread.sleep(3000);
		toMove(click);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", click);
		Thread.sleep(5000);

		Thread.sleep(8000);
		System.out.println("After changed");
		WebElement pp = driver.findElement(By.xpath("(//*[@class='clr7 padb10'])[1]"));

		Txtexcel1(pp, "aravind", 0, 91);
		WebElement pp1 = driver.findElement(By.xpath("((//*[@class=\"clr7 padb10\"])[1]/following-sibling::*)[1]"));

		ppeditexcel(pp1, "aravind", 2, 91);
		WebElement pp2 = driver.findElement(By.xpath("(//*[@class='clr7 padb10'])[2]"));

		Txtexcel1(pp2, "aravind", 0, 92);
		WebElement pp3 = driver.findElement(By.xpath("(//*[@class=\"clr7 padb10\"])[2]/following-sibling::*"));

		ppeditexcel(pp3, "aravind", 2, 92);
		WebElement pp4 = driver.findElement(By.xpath("(//*[@class='clr7 padb10'])[3]"));

		Txtexcel1(pp4, "aravind", 0, 93);
		WebElement pp5 = driver.findElement(By.xpath("(//*[@class=\"clr7 padb10\"])[3]/following-sibling::*"));

		ppeditexcel(pp5, "aravind", 2, 93);
		WebElement pp6 = driver.findElement(By.xpath("(//*[@class='clr7 padb10'])[4]"));

		Txtexcel1(pp6, "aravind", 0, 94);
		WebElement pp7 = driver.findElement(By.xpath("(//*[@class=\"clr7 padb10\"])[4]/following-sibling::*"));

		ppeditexcel(pp7, "aravind", 2, 94);
		WebElement pp8 = driver.findElement(By.xpath("(//*[@class='clr7 padb10'])[5]"));

		Txtexcel1(pp8, "aravind", 0, 95);
		WebElement pp9 = driver.findElement(By.xpath("(//*[@class=\"clr7 padb10\"])[5]/following-sibling::*"));

		ppeditexcel(pp9, "aravind", 2, 95);
		WebElement pp10 = driver.findElement(By.xpath("(//*[@class='clr7 padb10'])[6]"));

		Txtexcel1(pp10, "aravind", 0, 96);
		WebElement pp11 = driver.findElement(By.xpath("(//*[@class=\"clr7 padb10\"])[6]/following-sibling::*"));

		ppeditexcel(pp11, "aravind", 2, 96);
		WebElement pp12 = driver.findElement(By.xpath("(//*[@class='clr7 padb10'])[7]"));

		Txtexcel1(pp12, "aravind", 0, 97);
		WebElement pp13 = driver.findElement(By.xpath("(//*[@class=\"clr7 padb10\"])[7]/following-sibling::*"));

		ppeditexcel(pp13, "aravind", 2, 97);
		WebElement pp14 = driver.findElement(By.xpath("(//*[@class='clr7 padb10'])[8]"));

		Txtexcel1(pp14, "aravind", 0, 98);
		WebElement pp15 = driver.findElement(By.xpath("(//*[@class=\"clr7 padb10\"])[8]/following-sibling::*"));

		ppeditexcel(pp15, "aravind", 2, 98);
		WebElement pp16 = driver.findElement(By.xpath("(//*[@class='clr7 padb10'])[9]"));

		Txtexcel1(pp16, "aravind", 0, 99);
		WebElement pp17 = driver.findElement(By.xpath("(//*[@class=\"clr7 padb10\"])[9]/following-sibling::*"));

		ppeditexcel(pp17, "aravind", 2, 99);
		WebElement pp18 = driver.findElement(By.xpath("(//*[@class='clr7 padb10'])[10]"));

		Txtexcel1(pp18, "aravind", 0, 100);
		WebElement pp19 = driver.findElement(By.xpath("(//*[@class=\"clr7 padb10\"])[10]/following-sibling::*"));

		ppeditexcel(pp19, "aravind", 2, 100);
		WebElement pp20 = driver.findElement(By.xpath("(//*[@class='clr7 padb10'])[11]"));

		Txtexcel1(pp20, "aravind", 0, 101);
		WebElement pp21 = driver.findElement(By.xpath("(//*[@class=\"clr7 padb10\"])[11]/following-sibling::*"));

		ppeditexcel(pp21, "aravind", 2, 101);
		WebElement pp22 = driver.findElement(By.xpath("(//*[@class='clr7 padb10'])[12]"));

		Txtexcel1(pp22, "aravind", 0, 102);
		WebElement pp23 = driver.findElement(By.xpath("(//*[@class=\"clr7 padb10\"])[12]/following-sibling::*"));

		ppeditexcel(pp23, "aravind", 2, 102);
		WebElement pp24 = driver.findElement(By.xpath("(//*[@class='clr7 padb10'])[13]"));

		Txtexcel1(pp24, "aravind", 0, 103);
		WebElement pp25 = driver.findElement(By.xpath("(//*[@class=\"clr7 padb10\"])[13]/following-sibling::*"));

		ppeditexcel(pp25, "aravind", 2, 103);
		WebElement pp26 = driver.findElement(By.xpath("(//*[@class='clr7 padb10'])[14]"));

		Txtexcel1(pp26, "aravind", 0, 104);
		WebElement pp27 = driver.findElement(By.xpath("(//*[@class=\"clr7 padb10\"])[14]/following-sibling::*"));

		ppeditexcel(pp27, "aravind", 2, 104);
		WebElement pp28 = driver.findElement(By.xpath("(//*[@class='clr7 padb10'])[15]"));

		Txtexcel1(pp28, "aravind", 0, 105);
		WebElement pp29 = driver.findElement(By.xpath("(//*[@class=\"clr7 padb10\"])[15]/following-sibling::*"));

		ppeditexcel(pp29, "aravind", 2, 105);
		WebElement pp30 = driver.findElement(By.xpath("(//*[@class='clr7 padb10'])[16]"));

		Txtexcel1(pp30, "aravind", 0, 106);
		WebElement pp31 = driver.findElement(By.xpath("(//*[@class=\"clr7 padb10\"])[16]/following-sibling::*"));

		ppeditexcel(pp31, "aravind", 2, 106);
		WebElement pp32 = driver.findElement(By.xpath("(//*[@class='clr7 padb10'])[17]"));

		Txtexcel1(pp32, "aravind", 0, 107);
		WebElement pp33 = driver.findElement(By.xpath("(//*[@class=\"clr7 padb10\"])[17]/following-sibling::*"));

		ppeditexcel(pp33, "aravind", 2, 107);
		WebElement pp34 = driver.findElement(By.xpath("(//*[@class='clr7 padb10'])[18]"));

		Txtexcel1(pp34, "aravind", 0, 108);
		WebElement pp35 = driver.findElement(By.xpath("(//*[@class=\"clr7 padb10\"])[18]/following-sibling::*"));

		ppeditexcel(pp35, "aravind", 2, 108);
		WebElement pp36 = driver.findElement(By.xpath("(//*[@class='clr7 padb10'])[19]"));

		Txtexcel1(pp36, "aravind", 0, 109);
		WebElement pp37 = driver.findElement(By.xpath("(//*[@class=\"clr7 padb10\"])[19]/following-sibling::*"));

		ppeditexcel(pp37, "aravind", 2, 109);
		WebElement pp38 = driver.findElement(By.xpath("(//*[@class='clr7 padb10'])[20]"));

		Txtexcel1(pp38, "aravind", 0, 110);
		WebElement pp39 = driver.findElement(By.xpath("(//*[@class=\"clr7 padb10\"])[20]/following-sibling::*"));

		ppeditexcel(pp39, "aravind", 2, 110);
	}

	@Then("user invalid details")
	public void user_invalid_details() {
		// WebElement f = driver.findElement(By.xpath("(//*[contains(text(),'Invalid
		// Matrimony')])[2]"));
		// if (f.isDisplayed()) {
		// System.out.println("incorrect password");
		//
		// } else {
		// System.out.println("correct password");
		// }

	}

}
