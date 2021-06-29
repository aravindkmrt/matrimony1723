package comunity.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefinitionmatrimonyregister extends Baseclassregistermatrimony {
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
	public void user_have_to_enter_the_login_url() throws Exception {

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
	public void user_have_to_enter_skip() throws InterruptedException {
		Thread.sleep(5000);
	

		driver.findElement(By.xpath("//*[@href=\"https://www.vanniyarmatrimony.com/myhome/index.php/?promo=yes\"]")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@alt='close']")).click();
		Thread.sleep(5000);

	}

	@When("user have to click profile")
	public void user_have_to_click_profile() {
		WebElement w12 = driver.findElement(By.xpath("//*[@class='prfile_icon']"));
		toMove(w12);

	}

	@When("user have to click edit profile")
	public void user_have_to_click_edit_profile() {
		driver.findElement(By.xpath("//*[@class='settings-editprofile']")).click();

	}

	@When("user have to click edit profile created by")
	public void user_have_to_click_edit_profile_created_by() throws Throwable {
		WebElement get1 = driver.findElement(By.xpath("//*[@id=\"createdfor\"]"));
		firstSelected(get1);

		selectIndex(get1, 2);
		firstSelected(get1);
	}

	@When("user have to click edit profile name")
	public void user_have_to_click_edit_profile_name() {
		WebElement get2 = driver.findElement(By.xpath("//*[@id=\"name\"]"));
		enteredTxt(get2);
		get2.clear();
		toInput(get2, "manoj");
		enteredTxt(get2);

	}

	@When("user have to click edit profile date of birth")
	public void user_have_to_click_edit_profile_date_of_birth() {
		WebElement get3 = driver.findElement(By.xpath("//*[@id=\"dobDay\"]"));
		firstSelected(get3);
		selectIndex(get3, 3);
		firstSelected(get3);
		WebElement get4 = driver.findElement(By.xpath("//*[@id=\"dobMonth\"]"));
		firstSelected(get4);
		selectIndex(get4, 4);
		WebElement get5 = driver.findElement(By.xpath("//*[@id=\"dobYear\"]"));
		firstSelected(get5);
		selectValue(get5, "1998");

	}

	@When("user have to click edit profile marital status")
	public void user_have_to_click_edit_profile_marital_status() {
		// List<WebElement> radios =
		// driver.findElements(By.xpath("//*[@name=\"maritalStatus\"]"));
		WebElement bol1 = driver.findElement(By.xpath("//*[@id='maritalStatus1']"));

		boolean ab1 = bol1.isSelected();
		if (ab1 == true) {
			WebElement bolsib1 = driver.findElement(By.xpath("//*[@id='maritalStatus1']/following-sibling::*"));

			String s1 = bolsib1.getText();
			System.out.println(s1);
		}

		WebElement bol2 = driver.findElement(By.xpath("//*[@id='maritalStatus2']"));
		toClick(bol2);
		boolean ab2 = bol2.isSelected();
		if (ab2 == true) {
			WebElement bolsib2 = driver.findElement(By.xpath("//*[@id='maritalStatus2']/following-sibling::*"));
			String s2 = bolsib2.getText();
			System.out.println(s2);
		}

		WebElement bol3 = driver.findElement(By.xpath("//*[@id='maritalStatus3']"));
		boolean ab3 = bol3.isSelected();
		if (ab3 == true) {
			WebElement bolsib3 = driver.findElement(By.xpath("//*[@id='maritalStatus3']/following-sibling::*"));
			String s3 = bolsib3.getText();
			System.out.println(s3);
		}

		WebElement bol4 = driver.findElement(By.xpath("//*[@id='maritalStatus4']"));
		boolean ab4 = bol4.isSelected();
		if (ab4 == true) {
			WebElement bolsib4 = driver.findElement(By.xpath("//*[@id='maritalStatus4']/following-sibling::*"));
			String s4 = bolsib4.getText();
			System.out.println(s4);
		}

		// for (WebElement maritalStatus: radios ) {
		// radios.
		// System.out.println(maritalStatus.getAttribute("value"));

	}

	@When("user have to click edit profile height")
	public void user_have_to_click_edit_profile_height() {
		WebElement get7 = driver.findElement(By.xpath("//*[@id=\"heightFeet\"]"));
		firstSelected(get7);
		selectValue(get7, "4 feet");
		firstSelected(get7);

	}

	@When("user have to click edit profile weight")
	public void user_have_to_click_edit_profile_weight() {
		WebElement get8 = driver.findElement(By.xpath("//*[@id=\"weightKgs\"]"));
		firstSelected(get8);
		selectIndex(get8, 9);
	}

	@When("user have to click edit profile physical status")
	public void user_have_to_click_edit_profile_physical_status() {
		WebElement get10 = driver.findElement(By.xpath("//*[@id=\"physicalStatus0\"]"));
		boolean ab1 = get10.isSelected();
		if (ab1 == true) {
			WebElement physi = driver.findElement(By.xpath("//*[@id=\"physicalStatus0\"]/following-sibling::*"));

			String s1 = physi.getText();
			System.out.println(s1);
		}

		WebElement get9 = driver.findElement(By.xpath("//*[@id=\"physicalStatus1\"]"));
		toClick(get9);
		boolean ab2 = get9.isSelected();
		if (ab2 == true) {
			WebElement physi1 = driver.findElement(By.xpath("//*[@id=\"physicalStatus1\"]/following-sibling::*"));

			String s1 = physi1.getText();
			System.out.println(s1);
		}

	}

	@When("user have to click edit profile subcaste")
	public void user_have_to_click_edit_profile_subcaste() {
		WebElement get11 = driver.findElement(By.xpath("//*[@id=\"subCaste\"]"));
		firstSelected(get11);
		selectIndex(get11, 4);
		firstSelected(get11);

	}

	@When("user have to click edit profile mother tongue")
	public void user_have_to_click_edit_profile_mother_tongue() {
		WebElement get12 = driver.findElement(By.xpath("//*[@id=\"motherTongue\"]"));
		firstSelected(get12);
		selectIndex(get12, 6);
		firstSelected(get12);

	}

	@When("user have to click edit profile languages known")
	public void user_have_to_click_edit_profile_languages_known() {
		List<WebElement> radios = driver.findElements(By.xpath("//*[@id=\"spokenLanguages\"]"));
		for (int i = 0; i < radios.size(); i++) {

			System.out.println(radios.get(i).getText());
			System.out.println(radios.get(i).getAttribute("value"));
		}
		WebElement lang = driver.findElement(By.xpath("//*[@id=\"spokenLanguagesTemp\"]"));
		selectIndex(lang, 5);
		for (int j = 0; j < radios.size(); j++) {

			System.out.println(radios.get(j).getText());
			System.out.println(radios.get(j).getAttribute("value"));
		}

	}

	@When("user have to click edit profile gothra")
	public void user_have_to_click_edit_profile_gothra() {
		WebElement get14 = driver.findElement(By.xpath("//*[@id=\"gothramOthers\"]"));
		enteredTxt(get14);
		get14.clear();
		toInput(get14, "siva");

	}

	@When("user have to click edit profile star")
	public void user_have_to_click_edit_profile_star() {
		WebElement get15 = driver.findElement(By.xpath("//*[@id=\"star\"]"));
		firstSelected(get15);
		selectIndex(get15, 6);
		firstSelected(get15);
	}

	@When("user have to click edit profile rasi")
	public void user_have_to_click_edit_profile_rasi() {
		WebElement get16 = driver.findElement(By.xpath("//*[@id=\"raasi\"]"));
		firstSelected(get16);
		selectIndex(get16, 8);

	}

	@When("user have to click edit profile chevvai dosham")
	public void user_have_to_click_edit_profile_chevvai_dosham() {
		WebElement get17 = driver.findElement(By.xpath("//*[@id=\"dosham1\"]"));
		boolean ab2 = get17.isSelected();
		if (ab2 == true) {
			WebElement dosh = driver.findElement(By.xpath("//*[@id=\"dosham1\"]/following-sibling::*"));

			String s1 = dosh.getText();
			System.out.println(s1);
		}

		WebElement get19 = driver.findElement(By.xpath("//*[@id=\"dosham2\"]"));
		boolean ab1 = get19.isSelected();
		if (ab1 == true) {
			WebElement dosh1 = driver.findElement(By.xpath("//*[@id=\"dosham2\"]/following-sibling::*"));

			String s2 = dosh1.getText();
			System.out.println(s2);
		}

		WebElement get20 = driver.findElement(By.xpath("//*[@id=\"dosham3\"]"));
		toClick(get20);
		boolean ab3 = get20.isSelected();
		if (ab3 == true) {
			WebElement dosh2 = driver.findElement(By.xpath("//*[@id=\"dosham3\"]/following-sibling::*"));

			String s3 = dosh2.getText();
			System.out.println(s3);
		}

	}

	@When("user have to click edit profile eating habits")
	public void user_have_to_click_edit_profile_eating_habits() {
		WebElement get18 = driver.findElement(By.xpath("//*[@id=\"eatingHabits1\"]"));
		boolean ab3 = get18.isSelected();
		if (ab3 == true) {
			WebElement eatsib1 = driver.findElement(By.xpath("//*[@id=\"eatingHabits1\"]/following-sibling::*"));

			String s1 = eatsib1.getText();
			System.out.println(s1);
		}

		WebElement eat1 = driver.findElement(By.xpath("//*[@id=\"eatingHabits2\"]"));
		boolean ab1 = eat1.isSelected();
		if (ab1 == true) {
			WebElement eatsib2 = driver.findElement(By.xpath("//*[@id=\"eatingHabits2\"]/following-sibling::*"));

			String s2 = eatsib2.getText();
			System.out.println(s2);
		} else {
			System.out.println("unselected non vegetarian");
		}
		WebElement eat2 = driver.findElement(By.xpath("//*[@id=\"eatingHabits3\"]"));
		toClick(eat2);
		boolean ab4 = eat2.isSelected();
		if (ab4 == true) {
			WebElement eatsib3 = driver.findElement(By.xpath("//*[@id=\"eatingHabits3\"]/following-sibling::*"));

			String s3 = eatsib3.getText();
			System.out.println(s3);
		}

		WebElement eat3 = driver.findElement(By.xpath("//*[@id=\"eatingHabits4\"]"));
		boolean ab2 = eat3.isSelected();
		if (ab2 == true) {
			WebElement eatsib4 = driver.findElement(By.xpath("//*[@id=\"eatingHabits4\"]/following-sibling::*"));

			String s4 = eatsib4.getText();
			System.out.println(s4);
		}

	}

	@When("user have to click edit profile smoiking habits")
	public void user_have_to_click_edit_profile_smoiking_habits() {
		WebElement smo1 = driver.findElement(By.xpath("//*[@id=\"smoke1\"]"));
		boolean ab1 = smo1.isSelected();
		if (ab1 == true) {
			WebElement smosib1 = driver.findElement(By.xpath("//*[@id=\"smoke1\"]/following-sibling::*"));

			String s1 = smosib1.getText();

			System.out.println(s1);
		}

		WebElement smo2 = driver.findElement(By.xpath("//*[@id=\"smoke2\"]"));
		toClick(smo2);
		boolean ab2 = smo2.isSelected();
		if (ab2 == true) {
			WebElement smosib2 = driver.findElement(By.xpath("//*[@id=\"smoke2\"]/following-sibling::*"));

			String s2 = smosib2.getText();
			System.out.println(s2);
		}

		WebElement smo3 = driver.findElement(By.xpath("//*[@id=\"smoke3\"]"));
		boolean ab3 = smo3.isSelected();
		if (ab3 == true) {
			WebElement smosib3 = driver.findElement(By.xpath("//*[@id=\"smoke3\"]/following-sibling::*"));

			String s3 = smosib3.getText();
			System.out.println(s3);
		}

	}

	@When("user have to click edit profile drinking habits")
	public void user_have_to_click_edit_profile_drinking_habits() {

		WebElement smo1 = driver.findElement(By.xpath("//*[@id=\"drink1\"]"));
		boolean ab1 = smo1.isSelected();
		if (ab1 == true) {
			WebElement drisib1 = driver.findElement(By.xpath("//*[@id=\"drink1\"]/following-sibling::*"));

			String s1 = drisib1.getText();
			System.out.println(s1);
		}

		WebElement smo2 = driver.findElement(By.xpath("//*[@id=\"drink2\"]"));
		toClick(smo2);
		boolean ab2 = smo2.isSelected();
		if (ab2 == true) {
			WebElement drisib2 = driver.findElement(By.xpath("//*[@id=\"drink2\"]/following-sibling::*"));

			String s2 = drisib2.getText();
			System.out.println(s2);
		}

		WebElement smo3 = driver.findElement(By.xpath("//*[@id=\"drink3\"]"));
		boolean ab3 = smo3.isSelected();
		if (ab3 == true) {
			WebElement drisib3 = driver.findElement(By.xpath("//*[@id=\"drink3\"]/following-sibling::*"));

			String s3 = drisib3.getText();
			System.out.println(s3);
		}
	}

	@When("user have to click edit profile about")
	public void user_have_to_click_edit_profile_about() {
		
		WebElement get22 = driver.findElement(By.xpath("//*[@id=\"description\"]"));
		enteredTxt(get22);

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
	public void user_have_to_click_edit_profile_Highest_Education() {
		WebElement edu2 = driver.findElement(By.xpath("//*[@id=\"educationCategory\"]"));
		firstSelected(edu2);
		selectIndex(edu2, 6);
		firstSelected(edu2);

	}

	@When("user have to click edit profile College or Institution")
	public void user_have_to_click_edit_profile_College_or_Institution() {
		WebElement edu2 = driver.findElement(By.xpath("//*[@id=\"institutionName\"]"));
		enteredTxt(edu2);
		edu2.clear();
		toInput(edu2, "university college of engineering panruti");
		enteredTxt(edu2);

	}

	@When("user have to click edit profile Education in Detail")
	public void user_have_to_click_edit_profile_Education_in_Detail() {
		WebElement edu3 = driver.findElement(By.xpath("//*[@id=\"educationInDetail\"]"));
		enteredTxt(edu3);
		edu3.clear();
		toInput(edu3, "b.ed");
		enteredTxt(edu3);

	}

	@When("user have to click edit profile Employed In")
	public void user_have_to_click_edit_profile_Employed_In() {
		WebElement emp = driver.findElement(By.xpath("//*[@id=\"employmentCategory1\"]"));
		boolean ab3 = emp.isSelected();
		if (ab3 == true) {

			WebElement empsib1 = driver.findElement(By.xpath("//*[@id=\"employmentCategory1\"]/following-sibling::*"));

			String s1 = empsib1.getText();

			System.out.println(s1);
		}

		WebElement emp1 = driver.findElement(By.xpath("//*[@id=\"employmentCategory2\"]"));
		boolean ab1 = emp1.isSelected();
		if (ab1 == true) {
			WebElement empsib2 = driver.findElement(By.xpath("//*[@id=\"employmentCategory2\"]/following-sibling::*"));

			String s2 = empsib2.getText();
			System.out.println(s2);
		}
		WebElement emp2 = driver.findElement(By.xpath("//*[@id=\"employmentCategory3\"]"));
		boolean ab4 = emp2.isSelected();
		if (ab4 == true) {
			WebElement empsib3 = driver.findElement(By.xpath("//*[@id=\"employmentCategory3\"]/following-sibling::*"));

			String s3 = empsib3.getText();
			System.out.println(s3);
		}

		WebElement emp3 = driver.findElement(By.xpath("//*[@id=\"employmentCategory4\"]"));
		boolean ab2 = emp3.isSelected();
		if (ab2 == true) {

			WebElement empsib4 = driver.findElement(By.xpath("//*[@id=\"employmentCategory4\"]/following-sibling::*"));

			String s4 = empsib4.getText();
			System.out.println(s4);
		}
		WebElement emp4 = driver.findElement(By.xpath("//*[@id=\"employmentCategory6\"]"));
		boolean ab5 = emp4.isSelected();
		if (ab5 == true) {
			WebElement empsib6 = driver.findElement(By.xpath("//*[@id=\"employmentCategory6\"]/following-sibling::*"));

			String s6 = empsib6.getText();
			System.out.println("private" + s6);
		}

		WebElement emp6 = driver.findElement(By.xpath("//*[@id=\"employmentCategory7\"]"));
		boolean ab6 = emp6.isSelected();
		if (ab6 == true) {
			WebElement empsib7 = driver.findElement(By.xpath("//*[@id=\"employmentCategory7\"]/following-sibling::*"));

			String s7 = empsib7.getText();
			System.out.println(s7);
		}

	}

	@When("user have to click edit profile Occupation")
	public void user_have_to_click_edit_profile_Occupation() {
		WebElement ocu = driver.findElement(By.xpath("//*[@id=\"occupation\"]"));
		firstSelected(ocu);
		selectIndex(ocu, 6);
		firstSelected(ocu);

	}

	@When("user have to click edit profile Occupation in Detail")
	public void user_have_to_click_edit_profile_Occupation_in_Detail() {
		WebElement ocupd = driver.findElement(By.xpath("//*[@id=\"occupationInDetail1\"]"));
		enteredTxt(ocupd);
		ocupd.clear();
		toInput(ocupd, "software professional");
		enteredTxt(ocupd);

	}

	@When("user have to click edit profile Annual Income")
	public void user_have_to_click_edit_profile_Annual_Income() {
		// WebElement anual =
		// driver.findElement(By.xpath("//*[@id=\"annualIncomeCurrency\"]"));
		// firstSelected(anual);
		// selectIndex(anual, 6);
		// firstSelected(anual);
		WebElement anual1 = driver.findElement(By.xpath("(//*[@id=\"annualIncome\"])[1]"));
		firstSelected(anual1);
		selectIndex(anual1, 8);
		firstSelected(anual1);

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
	public void user_have_to_click_edit_profile_Parent_s_Contact_No() {
		WebElement parno = driver.findElement(By.xpath("//*[@id=\"parentContact\"]"));
		enteredTxt(parno);
		parno.clear();
		toInput(parno, "8126789876");
		enteredTxt(parno);

	}

	@When("user have to click edit profile  Family Value")
	public void user_have_to_click_edit_profile_Family_Value() {
		WebElement emp1 = driver.findElement(By.xpath("//*[@id=\"familyValue1\"]"));
		boolean ab1 = emp1.isSelected();
		if (ab1 == true) {
			WebElement empsib1 = driver.findElement(By.xpath("//*[@id=\"familyValue1\"]/following-sibling::*"));
			String s1 = empsib1.getText();
			System.out.println(s1);
		}
		WebElement emp2 = driver.findElement(By.xpath("//*[@id=\"familyValue2\"]"));
		boolean ab4 = emp2.isSelected();
		if (ab4 == true) {
			WebElement empsib2 = driver.findElement(By.xpath("//*[@id=\"familyValue2\"]/following-sibling::*"));
			String s2 = empsib2.getText();
			System.out.println(s2);
		}

		WebElement emp3 = driver.findElement(By.xpath("//*[@id=\"familyValue3\"]"));
		boolean ab2 = emp3.isSelected();
		if (ab2 == true) {
			WebElement empsib3 = driver.findElement(By.xpath("//*[@id=\"familyValue3\"]/following-sibling::*"));
			String s3 = empsib3.getText();
			System.out.println(s3);
		}
		WebElement emp4 = driver.findElement(By.xpath("//*[@id=\"familyValue4\"]"));
		boolean ab5 = emp4.isSelected();
		if (ab5 == true) {
			WebElement empsib4 = driver.findElement(By.xpath("//*[@id=\"familyValue4\"]/following-sibling::*"));
			String s4 = empsib4.getText();
			System.out.println(s4);
		}

	}

	@When("user have to click edit profile  Family Type")
	public void user_have_to_click_edit_profile_Family_Type() {
		WebElement fam1 = driver.findElement(By.xpath("//*[@id=\"familyType1\"]"));
		boolean ab1 = fam1.isSelected();
		if (ab1 == true) {
			WebElement famib1 = driver.findElement(By.xpath("//*[@id=\"familyType1\"]/following-sibling::*"));
			String s1 = famib1.getText();
			System.out.println(s1);
		}
		WebElement fam2 = driver.findElement(By.xpath("//*[@id=\"familyType2\"]"));
		boolean ab4 = fam2.isSelected();
		if (ab4 == true) {
			WebElement famsib2 = driver.findElement(By.xpath("//*[@id=\"familyType2\"]/following-sibling::*"));
			String s2 = famsib2.getText();
			System.out.println(s2);
		}

	}

	@When("user have to click edit profile  Family Status")
	public void user_have_to_click_edit_profile_Family_Status() {
		WebElement fams1 = driver.findElement(By.xpath("//*[@id=\"familyStatus1\"]"));
		boolean ab1 = fams1.isSelected();
		if (ab1 == true) {
			WebElement famsib1 = driver.findElement(By.xpath("//*[@id=\"familyStatus1\"]/following-sibling::*"));
			String s1 = famsib1.getText();
			System.out.println(s1);
		}
		WebElement fams2 = driver.findElement(By.xpath("//*[@id=\"familyStatus2\"]"));
		boolean ab4 = fams2.isSelected();
		if (ab4 == true) {
			WebElement famssib2 = driver.findElement(By.xpath("//*[@id=\"familyStatus2\"]/following-sibling::*"));
			String s2 = famssib2.getText();
			System.out.println(s2);
		}
		WebElement fams3 = driver.findElement(By.xpath("//*[@id=\"familyStatus4\"]"));
		boolean ab2 = fams3.isSelected();
		if (ab2 == true) {
			WebElement famssib3 = driver.findElement(By.xpath("//*[@id=\"familyStatus4\"]/following-sibling::*"));
			String s3 = famssib3.getText();
			System.out.println(s3);
		}

	}

	@When("user have to click edit profile  Native Place")
	public void user_have_to_click_edit_profile_Native_Place() {
		WebElement nativ = driver.findElement(By.xpath("//*[@id=\"ancestralOrigin\"]"));
		enteredTxt(nativ);
		nativ.clear();
		toInput(nativ, "chennai");
		enteredTxt(nativ);

	}

	@When("user have to click edit profile  Father's Occupation")
	public void user_have_to_click_edit_profile_Father_s_Occupation() {
		WebElement fo = driver.findElement(By.xpath("//*[@id=\"fatherOccupation\"]"));
		enteredTxt(fo);
		fo.clear();
		toInput(fo, "truk driver");
		enteredTxt(fo);

	}

	@When("user have to click edit profile  Mother's Occupation")
	public void user_have_to_click_edit_profile_Mother_s_Occupation() {
		WebElement mo = driver.findElement(By.xpath("//*[@id=\"motherOccupation\"]"));
		enteredTxt(mo);
		mo.clear();
		toInput(mo, "home queen");
		enteredTxt(mo);

	}

	@When("user have to click edit profile  No. of Brothers")
	public void user_have_to_click_edit_profile_No_of_Brothers() {
		WebElement bro = driver.findElement(By.xpath("//*[@id=\"brothers\"]"));
		firstSelected(bro);
		selectIndex(bro, 2);
		firstSelected(bro);

	}

	@When("user have to click edit profile  Brothers Married")
	public void user_have_to_click_edit_profile_Brothers_Married() {
		WebElement brom = driver.findElement(By.xpath("//*[@id=\"marriedBrothers\"]"));
		firstSelected(brom);
		selectIndex(brom, 2);
		firstSelected(brom);

	}

	@When("user have to click edit profile  No. of Sisters")
	public void user_have_to_click_edit_profile_No_of_Sisters() {
		WebElement sis = driver.findElement(By.xpath("//*[@id=\"sisters\"]"));
		firstSelected(sis);
		selectIndex(sis, 2);
		firstSelected(sis);

	}

	@When("user have to click edit profile  Sisters Married")
	public void user_have_to_click_edit_profile_Sisters_Married() {
		WebElement sism = driver.findElement(By.xpath("//*[@id=\"marriedSisters\"]"));
		firstSelected(sism);
		selectIndex(sism, 1);
		firstSelected(sism);

	}

	@When("user have to click edit profile  About My Family")
	public void user_have_to_click_edit_profile_About_My_Family() {
		WebElement aboutfam = driver.findElement(By.xpath("//*[@id=\"motherOccupation\"]"));
		enteredTxt(aboutfam);
		aboutfam.clear();
		toInput(aboutfam, "my family always great . joint family .have a two properties in villupuram");
		enteredTxt(aboutfam);

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
	public void user_have_to_click_edit_profile_What_are_your_Hobbies_and_Interest() {
		WebElement emp = driver.findElement(By.xpath("//*[@id=\"hobbies4\"]"));
		boolean ab3 = emp.isSelected();
		if (ab3 == true) {

			WebElement empsib1 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[1]/span/label"));

			String s1 = empsib1.getText();

			System.out.println(s1);
		}

		WebElement emp1 = driver.findElement(By.xpath("//*[@id=\"hobbies6\"]"));
		boolean ab1 = emp1.isSelected();
		if (ab1 == true) {
			WebElement empsib2 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[2]/span/label"));

			String s2 = empsib2.getText();
			System.out.println(s2);
		}
		WebElement emp2 = driver.findElement(By.xpath("//*[@id=\"hobbies8\"]"));
		boolean ab4 = emp2.isSelected();
		if (ab4 == true) {
			WebElement empsib3 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[3]/span/label"));

			String s3 = empsib3.getText();
			System.out.println(s3);
		}

		WebElement emp3 = driver.findElement(By.xpath("//*[@id=\"hobbies11\"]"));
		boolean ab2 = emp3.isSelected();
		if (ab2 == true) {

			WebElement empsib4 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[4]/span/label"));

			String s4 = empsib4.getText();
			System.out.println(s4);
		}
		WebElement emp4 = driver.findElement(By.xpath("//*[@id=\"hobbies13\"]"));
		boolean ab5 = emp4.isSelected();
		if (ab5 == true) {
			WebElement empsib6 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[5]/span/label"));

			String s6 = empsib6.getText();
			System.out.println("private" + s6);
		}

		WebElement emp6 = driver.findElement(By.xpath("//*[@id=\"hobbies15\"]"));
		boolean ab6 = emp6.isSelected();
		if (ab6 == true) {
			WebElement empsib7 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[6]/span/label"));

			String s7 = empsib7.getText();
			System.out.println(s7);
		}
		WebElement emp8 = driver.findElement(By.xpath("//*[@id=\"hobbies17\"]"));
		boolean ab8 = emp8.isSelected();
		if (ab8 == true) {

			WebElement empsib8 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[7]/span/label"));

			String s8 = empsib8.getText();

			System.out.println(s8);
		}

		WebElement emp9 = driver.findElement(By.xpath("//*[@id=\"hobbies18\"]"));
		boolean ab9 = emp9.isSelected();
		if (ab9 == true) {
			WebElement empsib9 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[8]/span/label"));

			String s9 = empsib9.getText();
			System.out.println(s9);
		}
		WebElement emp10 = driver.findElement(By.xpath("//*[@id=\"hobbies19\"]"));
		boolean ab10 = emp10.isSelected();
		if (ab10 == true) {
			WebElement empsib10 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[9]/span/label"));

			String s10 = empsib10.getText();
			System.out.println(s10);
		}

		WebElement emp11 = driver.findElement(By.xpath("//*[@id=\"hobbies20\"]"));
		boolean ab11 = emp11.isSelected();
		if (ab11 == true) {

			WebElement empsib11 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[10]/span/label"));

			String s11 = empsib11.getText();
			System.out.println(s11);
		}
		WebElement emp12 = driver.findElement(By.xpath("//*[@id=\"interest5\"]"));
		boolean ab12 = emp12.isSelected();
		if (ab12 == true) {
			WebElement empsib12 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[11]/span/label"));

			String s12 = empsib12.getText();
			System.out.println("private" + s12);
		}

		WebElement emp13 = driver.findElement(By.xpath("//*[@id=\"interest8\"]"));
		boolean ab13 = emp13.isSelected();
		if (ab13 == true) {
			WebElement empsib13 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[12]/span/label"));

			String s13 = empsib13.getText();
			System.out.println(s13);
		}
		WebElement emp14 = driver.findElement(By.xpath("//*[@id=\"interest7\"]"));
		boolean ab14 = emp14.isSelected();
		if (ab14 == true) {
			WebElement empsib14 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[13]/span/label"));

			String s14 = empsib14.getText();
			System.out.println(s14);
		}
		WebElement emp15 = driver.findElement(By.xpath("//*[@id=\"interest15\"]"));
		boolean ab15 = emp15.isSelected();
		if (ab15 == true) {
			WebElement empsib15 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[3]/div[14]/span/label"));

			String s15 = empsib15.getText();
			System.out.println(s15);
		}

	}

	@When("user have to click edit profile  Others")
	public void user_have_to_click_edit_profile_Others() {
		WebElement others = driver.findElement(By.xpath("//*[@id=\"hobbiesDesc\"]"));
		enteredTxt(others);
		others.clear();
		toInput(others, "villupuram");
		enteredTxt(others);

	}

	@When("user have to click edit profile  Your favourite music")
	public void user_have_to_click_edit_profile_Your_favourite_music() {

		WebElement emp1 = driver.findElement(By.xpath("//*[@id=\"music4\"]"));
		boolean ab1 = emp1.isSelected();
		if (ab1 == true) {
			WebElement empsib2 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[6]/div[1]/span/label"));

			String s2 = empsib2.getText();
			System.out.println(s2);
		}
		WebElement emp2 = driver.findElement(By.xpath("//*[@id=\"music9\"]"));
		boolean ab4 = emp2.isSelected();
		if (ab4 == true) {
			WebElement empsib3 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[6]/div[2]/span/label"));

			String s3 = empsib3.getText();
			System.out.println(s3);
		}
		WebElement emp3 = driver.findElement(By.xpath("//*[@id=\"music18\"]"));
		boolean ab2 = emp3.isSelected();
		if (ab2 == true) {

			WebElement empsib4 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[6]/div[3]/span/label"));

			String s4 = empsib4.getText();
			System.out.println(s4);
		}

	}

	@When("user have to click edit profile  Sports you like")
	public void user_have_to_click_edit_profile_Sports_you_like() {
		WebElement emp = driver.findElement(By.xpath("//*[@id=\"sports4\"]"));
		boolean ab3 = emp.isSelected();
		if (ab3 == true) {

			WebElement empsib1 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[9]/div[1]/span/label"));

			String s1 = empsib1.getText();

			System.out.println(s1);
		}

		WebElement emp1 = driver.findElement(By.xpath("//*[@id=\"sports10\"]"));
		boolean ab1 = emp1.isSelected();
		if (ab1 == true) {
			WebElement empsib2 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[9]/div[2]/span/label"));

			String s2 = empsib2.getText();
			System.out.println(s2);
		}
		WebElement emp2 = driver.findElement(By.xpath("//*[@id=\"sports11\"]"));
		boolean ab4 = emp2.isSelected();
		if (ab4 == true) {
			WebElement empsib3 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[9]/div[3]/span/label"));

			String s3 = empsib3.getText();
			System.out.println(s3);
		}

		WebElement emp3 = driver.findElement(By.xpath("//*[@id=\"sports7\"]"));
		boolean ab2 = emp3.isSelected();
		if (ab2 == true) {

			WebElement empsib4 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[9]/div[4]/span/label"));

			String s4 = empsib4.getText();
			System.out.println(s4);
		}
		WebElement emp4 = driver.findElement(By.xpath("//*[@id=\"sports12\"]"));
		boolean ab5 = emp4.isSelected();
		if (ab5 == true) {
			WebElement empsib6 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[9]/div[5]/span/label"));

			String s6 = empsib6.getText();
			System.out.println("private" + s6);
		}

		WebElement emp6 = driver.findElement(By.xpath("//*[@id=\"sports15\"]"));
		boolean ab6 = emp6.isSelected();
		if (ab6 == true) {
			WebElement empsib7 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[9]/div[6]/span/label"));

			String s7 = empsib7.getText();
			System.out.println(s7);
		}
		WebElement emp8 = driver.findElement(By.xpath("//*[@id=\"sports19\"]"));
		boolean ab8 = emp8.isSelected();
		if (ab8 == true) {

			WebElement empsib8 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[9]/div[7]/span/label"));

			String s8 = empsib8.getText();

			System.out.println(s8);
		}

	}

	@When("user have to click edit profile  Your favourite food")
	public void user_have_to_click_edit_profile_Your_favourite_food() {
		WebElement emp = driver.findElement(By.xpath("//*[@id=\"food1\"]"));
		boolean ab3 = emp.isSelected();
		if (ab3 == true) {

			WebElement empsib1 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[1]/span/label"));

			String s1 = empsib1.getText();

			System.out.println(s1);
		}

		WebElement emp1 = driver.findElement(By.xpath("//*[@id=\"food2\"]"));
		boolean ab1 = emp1.isSelected();
		if (ab1 == true) {
			WebElement empsib2 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[2]/span/label"));

			String s2 = empsib2.getText();
			System.out.println(s2);
		}
		WebElement emp2 = driver.findElement(By.xpath("//*[@id=\"food3\"]"));
		boolean ab4 = emp2.isSelected();
		if (ab4 == true) {
			WebElement empsib3 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[3]/span/label"));

			String s3 = empsib3.getText();
			System.out.println(s3);
		}

		WebElement emp3 = driver.findElement(By.xpath("//*[@id=\"food4\"]"));
		boolean ab2 = emp3.isSelected();
		if (ab2 == true) {

			WebElement empsib4 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[4]/span/label"));

			String s4 = empsib4.getText();
			System.out.println(s4);
		}
		WebElement emp4 = driver.findElement(By.xpath("//*[@id=\"food17\"]"));
		boolean ab5 = emp4.isSelected();
		if (ab5 == true) {
			WebElement empsib6 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[5]/span/label"));

			String s6 = empsib6.getText();
			System.out.println("private" + s6);
		}

		WebElement emp6 = driver.findElement(By.xpath("//*[@id=\"food5\"]"));
		boolean ab6 = emp6.isSelected();
		if (ab6 == true) {
			WebElement empsib7 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[6]/span/label"));

			String s7 = empsib7.getText();
			System.out.println(s7);
		}
		WebElement emp8 = driver.findElement(By.xpath("//*[@id=\"food6\"]"));
		boolean ab8 = emp8.isSelected();
		if (ab8 == true) {

			WebElement empsib8 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[7]/span/label"));

			String s8 = empsib8.getText();

			System.out.println(s8);
		}

		WebElement emp9 = driver.findElement(By.xpath("//*[@id=\"food7\"]"));
		boolean ab9 = emp9.isSelected();
		if (ab9 == true) {
			WebElement empsib9 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[8]/span/label"));

			String s9 = empsib9.getText();
			System.out.println(s9);
		}
		WebElement emp10 = driver.findElement(By.xpath("//*[@id=\"food8\"]"));
		boolean ab10 = emp10.isSelected();
		if (ab10 == true) {
			WebElement empsib10 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[9]/span/label"));

			String s10 = empsib10.getText();
			System.out.println(s10);
		}

		WebElement emp11 = driver.findElement(By.xpath("//*[@id=\"food9\"]"));
		boolean ab11 = emp11.isSelected();
		if (ab11 == true) {

			WebElement empsib11 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[10]/span/label"));

			String s11 = empsib11.getText();
			System.out.println(s11);
		}
		WebElement emp12 = driver.findElement(By.xpath("//*[@id=\"food11\"]"));
		boolean ab12 = emp12.isSelected();
		if (ab12 == true) {
			WebElement empsib12 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[11]/span/label"));

			String s12 = empsib12.getText();
			System.out.println("private" + s12);
		}

		WebElement emp13 = driver.findElement(By.xpath("//*[@id=\"food12\"]"));
		boolean ab13 = emp13.isSelected();
		if (ab13 == true) {
			WebElement empsib13 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[12]/span/label"));

			String s13 = empsib13.getText();
			System.out.println(s13);
		}
		WebElement emp14 = driver.findElement(By.xpath("//*[@id=\"food13\"]"));
		boolean ab14 = emp14.isSelected();
		if (ab14 == true) {
			WebElement empsib14 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[13]/span/label"));

			String s14 = empsib14.getText();
			System.out.println(s14);
		}
		WebElement emp15 = driver.findElement(By.xpath("//*[@id=\"food18\"]"));
		boolean ab15 = emp15.isSelected();
		if (ab15 == true) {
			WebElement empsib15 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[14]/span/label"));

			String s15 = empsib15.getText();
			System.out.println(s15);
		}
		WebElement emp16 = driver.findElement(By.xpath("//*[@id=\"food14\"]"));
		boolean ab16 = emp16.isSelected();
		if (ab16 == true) {
			WebElement empsib16 = driver.findElement(By.xpath("//*[@id=\"frmHobbies\"]/div[12]/div[15]/span/label"));

			String s16 = empsib16.getText();
			System.out.println(s16);
		}

	}

	@When("user have to click edit profile  save")
	public void user_have_to_click_edit_profile_save1() {

	}

	@When("user have to click edit profile  edit partner preference")
	public void user_have_to_click_edit_profile_edit_partner_preference() throws Exception {
		WebElement edu1 = driver.findElement(By.xpath("(//*[@class=\"title-link\"])[5]"));

		Thread.sleep(3000);
		toMove(edu1);
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click()", edu1);
		Thread.sleep(5000);
		WebElement w47 = driver.findElement(By.xpath("//*[@id=\"show_partner\"]/a"));
		Thread.sleep(3000);

		toMove(w47);
		j.executeScript("arguments[0].click()", w47);

	}

	@When("user have to click edit profile partner preference  marital status")
	public void user_have_to_click_edit_profile_partner_preference_marital_status() {

		WebElement bol1 = driver.findElement(By.xpath("//*[@id=\"lookingStatus1\"]"));

		boolean ab1 = bol1.isSelected();
		if (ab1 == true) {
			WebElement bolsib1 = driver.findElement(By.xpath("//*[@id=\"lookingStatus1\"]/following-sibling::*"));

			String s1 = bolsib1.getText();
			System.out.println(s1);
		}

		WebElement bol2 = driver.findElement(By.xpath("//*[@id=\"lookingStatus2\"]"));
		toClick(bol2);
		boolean ab2 = bol2.isSelected();
		if (ab2 == true) {
			WebElement bolsib2 = driver.findElement(By.xpath("//*[@id=\"lookingStatus2\"]/following-sibling::*"));
			String s2 = bolsib2.getText();
			System.out.println(s2);
		}

		WebElement bol3 = driver.findElement(By.xpath("//*[@id=\"lookingStatus3\"]"));
		boolean ab3 = bol3.isSelected();
		if (ab3 == true) {
			WebElement bolsib3 = driver.findElement(By.xpath("//*[@id=\"lookingStatus3\"]/following-sibling::*"));
			String s3 = bolsib3.getText();
			System.out.println(s3);
		}

		WebElement bol4 = driver.findElement(By.xpath("//*[@id=\"lookingStatus4\"]"));
		boolean ab4 = bol4.isSelected();
		if (ab4 == true) {
			WebElement bolsib4 = driver.findElement(By.xpath("//*[@id=\"lookingStatus4\"]/following-sibling::*"));
			String s4 = bolsib4.getText();
			System.out.println(s4);
		}
		WebElement bol5 = driver.findElement(By.xpath("//*[@id=\"lookingStatus0\"]"));
		boolean ab5 = bol5.isSelected();
		if (ab5 == true) {
			WebElement bolsib5 = driver.findElement(By.xpath("//*[@id=\"lookingStatus0\"]/following-sibling::*"));
			String s5 = bolsib5.getText();
			System.out.println(s5);
		}

	}

	@When("user have to click edit profile partner preference  age")
	public void user_have_to_click_edit_profile_partner_preference_age() {
		WebElement age = driver.findElement(By.xpath("//*[@id=\"fage\"]"));
		WebElement age1 = driver.findElement(By.xpath("//*[@id=\"tage\"]"));
		firstSelectedto(age, age1);
		selectIndex(age, 2);
		selectIndex(age1, 4);
		firstSelectedto(age, age1);

	}

	@When("user have to click edit profile partner preference  height")
	public void user_have_to_click_edit_profile_partner_preference_height() {
		WebElement hei = driver.findElement(By.xpath("//*[@id=\"heightFrom\"]"));
		WebElement hei1 = driver.findElement(By.xpath("//*[@id=\"heightTo\"]"));
		firstSelectedto(hei, hei1);
		selectIndex(hei, 2);
		selectIndex(hei1, 4);
		firstSelectedto(hei, hei1);

	}

	@When("user have to click edit profile partner preference physical status")
	public void user_have_to_click_edit_profile_partner_preference_physical_status() {
		WebElement get10 = driver.findElement(By.xpath("//*[@id=\"physicalStatus0\"]"));
		boolean ab1 = get10.isSelected();
		if (ab1 == true) {
			WebElement physi = driver.findElement(By.xpath("//*[@id=\"physicalStatus0\"]/following-sibling::*"));

			String s1 = physi.getText();
			System.out.println(s1);
		}

		WebElement get9 = driver.findElement(By.xpath("//*[@id=\"physicalStatus1\"]"));
		toClick(get9);
		boolean ab2 = get9.isSelected();
		if (ab2 == true) {
			WebElement physi1 = driver.findElement(By.xpath("//*[@id=\"physicalStatus1\"]/following-sibling::*"));

			String s1 = physi1.getText();
			System.out.println(s1);
		}
		WebElement phy1 = driver.findElement(By.xpath("//*[@id=\"physicalStatus2\"]"));
		toClick(phy1);
		boolean physic = phy1.isSelected();
		if (physic == true) {
			WebElement physi1 = driver.findElement(By.xpath("//*[@id=\"physicalStatus2\"]/following-sibling::*"));

			String s1 = physi1.getText();
			System.out.println(s1);
		}

	}

	@When("user have to click edit profile partner preference  mother tongue")
	public void user_have_to_click_edit_profile_partner_preference_mother_tongue() {
		WebElement get12 = driver.findElement(By.xpath("//*[@id=\"motherTongue\"]"));
		firstSelected(get12);

		selectIndex(get12, 6);
		List<WebElement> radios = driver
				.findElements(By.xpath("//*[@id=\"frmPartner\"]/div/dl[10]/dd/div[1]/span/span[1]/span/ul"));
		allSelectedOption(radios);

	}

	@When("user have to click edit profile partner preference subcaste")
	public void user_have_to_click_edit_profile_partner_preference_subcaste() {
		WebElement get12 = driver.findElement(By.xpath("//*[@id=\"subCaste\"]"));
		firstSelected(get12);

		selectIndex(get12, 6);
		List<WebElement> radios = driver
				.findElements(By.xpath("//*[@id=\"frmPartner\"]/div/dl[12]/dd/div[1]/span/span[1]/span/ul"));
		allSelectedOption(radios);

	}

	@When("user have to click edit profile partner preference star")
	public void user_have_to_click_edit_profile_partner_preference_star() {
		WebElement get12 = driver.findElement(By.xpath("//*[@id=\"star\"]"));
		firstSelected(get12);

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
			System.out.println(s1);
		}

		WebElement get19 = driver.findElement(By.xpath("//*[@id=\"manglik1\"]"));
		boolean ab1 = get19.isSelected();
		if (ab1 == true) {
			WebElement dosh1 = driver.findElement(By.xpath("//*[@id=\"manglik1\"]/following-sibling::*"));

			String s2 = dosh1.getText();
			System.out.println(s2);
		}

		WebElement get20 = driver.findElement(By.xpath("//*[@id=\"manglik2\"]"));
		toClick(get20);
		boolean ab3 = get20.isSelected();
		if (ab3 == true) {
			WebElement dosh2 = driver.findElement(By.xpath("//*[@id=\"manglik2\"]/following-sibling::*"));

			String s3 = dosh2.getText();
			System.out.println(s3);
		}

	}

	@When("user have to click edit profile partner preference  educationm")
	public void user_have_to_click_edit_profile_partner_preference_educationm() {
		WebElement bol1 = driver.findElement(By.xpath("//*[@id=\"educationTempradio1\"]"));

		boolean ab1 = bol1.isSelected();
		if (ab1 == true) {
			WebElement bolsib1 = driver.findElement(By.xpath("//*[@id=\"educationTempradio1\"]/following-sibling::*"));

			String s1 = bolsib1.getText();
			System.out.println(s1);
		}

		WebElement bol2 = driver.findElement(By.xpath("//*[@id=\"educationTempradio2\"]"));
		toClick(bol2);
		boolean ab2 = bol2.isSelected();
		if (ab2 == true) {
			WebElement bolsib2 = driver.findElement(By.xpath("//*[@id=\"educationTempradio2\"]/following-sibling::*"));
			String s2 = bolsib2.getText();
			System.out.println(s2);
			List<WebElement> radios = driver
					.findElements(By.xpath("//*[@id=\"EducationTypeDivId\"]/div/span/span[1]/span/ul"));
			allSelectedOption(radios);

		}

		WebElement bol3 = driver.findElement(By.xpath("//*[@id=\"educationTempradio3\"]"));
		boolean ab3 = bol3.isSelected();
		if (ab3 == true) {
			WebElement bolsib3 = driver.findElement(By.xpath("//*[@id=\"educationTempradio3\"]/following-sibling::*"));
			String s3 = bolsib3.getText();
			System.out.println(s3);
			List<WebElement> radios1 = driver
					.findElements(By.xpath("//*[@id=\"EducationTypeDivId\"]/div/span/span[1]/span/ul"));
			allSelectedOption(radios1);

		}

		WebElement bol4 = driver.findElement(By.xpath("//*[@id=\"educationTempradio4\"]"));
		boolean ab4 = bol4.isSelected();
		if (ab4 == true) {
			WebElement bolsib4 = driver.findElement(By.xpath("//*[@id=\"educationTempradio4\"]/following-sibling::*"));
			String s4 = bolsib4.getText();
			System.out.println(s4);
			List<WebElement> radios2 = driver
					.findElements(By.xpath("//*[@id=\"EducationTypeDivId\"]/div/span/span[1]/span/ul"));
			allSelectedOption(radios2);

		}

	}

	@When("user have to click edit profile partner preference employedIn")
	public void user_have_to_click_edit_profile_partner_preference_employedIn() {
		WebElement get12 = driver.findElement(By.xpath("//*[@id=\"employedin\"]"));
		firstSelected(get12);

		selectIndex(get12, 5);
		List<WebElement> radios = driver
				.findElements(By.xpath("//*[@id=\"frmPartner\"]/div/dl[20]/dd/div[1]/span/span[1]/span/ul"));
		allSelectedOption(radios);

	}

	@When("user have to click edit profile partner preference occupation")
	public void user_have_to_click_edit_profile_partner_preference_occupation() {
		WebElement get12 = driver.findElement(By.xpath("//*[@id=\"occupation\"]"));
		firstSelected(get12);

		selectIndex(get12, 6);
		List<WebElement> radios = driver
				.findElements(By.xpath("//*[@id=\"frmPartner\"]/div/dl[23]/dd/div[1]/span/span[1]/span/ul"));
		allSelectedOption(radios);

	}

	@When("user have to click edit profile partner preference citzenship")
	public void user_have_to_click_edit_profile_partner_preference_citzenship() {
		WebElement get12 = driver.findElement(By.xpath("//*[@id=\"citizenship\"]"));
		firstSelected(get12);

		selectIndex(get12, 6);
		List<WebElement> radios = driver
				.findElements(By.xpath("//*[@id=\"frmPartner\"]/div/dl[24]/dd/div[1]/span/span[1]/span/ul"));
		allSelectedOption(radios);

	}

	@When("user have to click edit profile partner preference country living")
	public void user_have_to_click_edit_profile_partner_preference_country_living() {
		WebElement get12 = driver.findElement(By.xpath("//*[@id=\"countryLivingIn\"]"));
		firstSelected(get12);

		selectIndex(get12, 6);
		List<WebElement> radios = driver
				.findElements(By.xpath("//*[@id=\"frmPartner\"]/div/dl[25]/dd/div[1]/span/span[1]/span/ul"));
		allSelectedOption(radios);

	}

	@When("user have to click edit profile partner preference residing state in india")
	public void user_have_to_click_edit_profile_partner_preference_residing_state_in_india() {
		WebElement get12 = driver.findElement(By.xpath("//*[@id=\"residingIndia\"]"));
		firstSelected(get12);

		selectIndex(get12, 6);
		List<WebElement> radios = driver
				.findElements(By.xpath("//*[@id=\"inadiaState\"]/dl[1]/dd/div[1]/span/span[1]/span/ul"));
		allSelectedOption(radios);

	}

	@When("user have to click edit profile partner preference  residing district")
	public void user_have_to_click_edit_profile_partner_preference_residing_district() {
		WebElement resid1 = driver.findElement(By.xpath("//*[@name=\"residingCity[]\"]"));
		firstSelected(resid1);

		selectIndex(resid1, 6);
		List<WebElement> radios1 = driver
				.findElements(By.xpath("//*[@id=\"indianCity\"]/dl[1]/dd/div[1]/span/span[1]/span/ul"));
		allSelectedOption(radios1);

	}

	@When("user have to click edit profilepartner preference  food habits")
	public void user_have_to_click_edit_profilepartner_preference_food_habits() {
		WebElement get18 = driver.findElement(By.xpath("//*[@id=\"eatingHabits1\"]"));
		boolean ab3 = get18.isSelected();
		if (ab3 == true) {
			WebElement eatsib1 = driver.findElement(By.xpath("//*[@id=\"eatingHabits1\"]/following-sibling::*"));

			String s1 = eatsib1.getText();
			System.out.println(s1);
		}

		WebElement eat1 = driver.findElement(By.xpath("//*[@id=\"eatingHabits2\"]"));
		boolean ab1 = eat1.isSelected();
		if (ab1 == true) {
			WebElement eatsib2 = driver.findElement(By.xpath("//*[@id=\"eatingHabits2\"]/following-sibling::*"));

			String s2 = eatsib2.getText();
			System.out.println(s2);
		} else {
			System.out.println("unselected non vegetarian");
		}
		WebElement eat2 = driver.findElement(By.xpath("//*[@id=\"eatingHabits3\"]"));
		toClick(eat2);
		boolean ab4 = eat2.isSelected();
		if (ab4 == true) {
			WebElement eatsib3 = driver.findElement(By.xpath("//*[@id=\"eatingHabits3\"]/following-sibling::*"));

			String s3 = eatsib3.getText();
			System.out.println(s3);
		}

		WebElement eat3 = driver.findElement(By.xpath("//*[@id=\"eatingHabits4\"]"));
		boolean ab2 = eat3.isSelected();
		if (ab2 == true) {
			WebElement eatsib4 = driver.findElement(By.xpath("//*[@id=\"eatingHabits4\"]/following-sibling::*"));

			String s4 = eatsib4.getText();
			System.out.println(s4);
		}
		WebElement eat5 = driver.findElement(By.xpath("//*[@id=\"eatingHabits0\"]"));
		boolean ab5 = eat5.isSelected();
		if (ab5 == true) {
			WebElement eatsib5 = driver.findElement(By.xpath("//*[@id=\"eatingHabits0\"]/following-sibling::*"));

			String s5 = eatsib5.getText();
			System.out.println(s5);
		}

	}

	@When("user have to click edit profile partner preference smoking habits")
	public void user_have_to_click_edit_profile_partner_preference_smoking_habits() {
		WebElement smo1 = driver.findElement(By.xpath("//*[@id=\"smokingHabits1\"]"));
		boolean ab1 = smo1.isSelected();
		if (ab1 == true) {
			WebElement smosib1 = driver.findElement(By.xpath("//*[@id=\"smokingHabits1\"]/following-sibling::*"));

			String s1 = smosib1.getText();

			System.out.println(s1);
		}

		WebElement smo2 = driver.findElement(By.xpath("//*[@id=\"smokingHabits2\"]"));
		toClick(smo2);
		boolean ab2 = smo2.isSelected();
		if (ab2 == true) {
			WebElement smosib2 = driver.findElement(By.xpath("//*[@id=\"smokingHabits2\"]/following-sibling::*"));

			String s2 = smosib2.getText();
			System.out.println(s2);
		}

		WebElement smo3 = driver.findElement(By.xpath("//*[@id=\"smokingHabits3\"]"));
		boolean ab3 = smo3.isSelected();
		if (ab3 == true) {
			WebElement smosib3 = driver.findElement(By.xpath("//*[@id=\"smokingHabits3\"]/following-sibling::*"));

			String s3 = smosib3.getText();
			System.out.println(s3);
		}
		WebElement smo4 = driver.findElement(By.xpath("//*[@id=\"smokingHabits0\"]"));
		boolean ab4 = smo4.isSelected();
		if (ab4 == true) {
			WebElement smosib4 = driver.findElement(By.xpath("//*[@id=\"smokingHabits0\"]/following-sibling::*"));

			String s4 = smosib4.getText();
			System.out.println(s4);
		}


	}

	@When("user have to click edit profile  partner preference drinking habits")
	public void user_have_to_click_edit_profile_partner_preference_drinking_habits() {
		WebElement smo1 = driver.findElement(By.xpath("//*[@id=\"drinkingHabits1\"]"));
		boolean ab1 = smo1.isSelected();
		if (ab1 == true) {
			WebElement drisib1 = driver.findElement(By.xpath("//*[@id=\"drinkingHabits1\"]/following-sibling::*"));

			String s1 = drisib1.getText();
			System.out.println(s1);
		}

		WebElement smo2 = driver.findElement(By.xpath("//*[@id=\"drinkingHabits2\"]"));
		toClick(smo2);
		boolean ab2 = smo2.isSelected();
		if (ab2 == true) {
			WebElement drisib2 = driver.findElement(By.xpath("//*[@id=\"drinkingHabits2\"]/following-sibling::*"));

			String s2 = drisib2.getText();
			System.out.println(s2);
		}

		WebElement smo3 = driver.findElement(By.xpath("//*[@id=\"drinkingHabits3\"]"));
		boolean ab3 = smo3.isSelected();
		if (ab3 == true) {
			WebElement drisib3 = driver.findElement(By.xpath("//*[@id=\"drinkingHabits3\"]/following-sibling::*"));

			String s3 = drisib3.getText();
			System.out.println(s3);
		}		
		WebElement smo4 = driver.findElement(By.xpath("//*[@id=\"drinkingHabits0\"]"));
		boolean ab4 = smo4.isSelected();
		if (ab4 == true) {
			WebElement drisib4 = driver.findElement(By.xpath("//*[@id=\"drinkingHabits0\"]/following-sibling::*"));

			String s4 = drisib4.getText();
			System.out.println(s4);
		}		

	}

	@When("user have to click edit profile  partner preference annual income")
	public void user_have_to_click_edit_profile_partner_preference_annual_income() {
		WebElement in = driver.findElement(By.xpath("//*[@id=\"fromIncomeDOL\"]"));
		WebElement in1 = driver.findElement(By.xpath("//*[@id=\"toIncomeDOL\"]"));
		firstSelectedto(in, in1);
		
		selectIndex(in, 4);
		selectIndex(in1, 6);
		firstSelectedto(in, in1);


	}

	@When("user have to click edit profile  partner preference about my partner")
	public void user_have_to_click_edit_profile_partner_preference_about_my_partner() {
		WebElement pdes = driver.findElement(By.xpath("//*[@id=\"partnerDescription\"]"));
		enteredTxt(pdes);

	
		

	}

	@When("user have to click edit profile  partner preference save")
	public void user_have_to_click_edit_profile_partner_preference_save() {

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
