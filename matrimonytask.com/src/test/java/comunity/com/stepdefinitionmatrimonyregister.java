package comunity.com;

import java.util.List;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

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
	//	driver.findElement(By.xpath("(//*[@for='genderfemale'])")).click();
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
		//driver.findElement(By.xpath("//*[@id='physicalStatuss1']")).click();
		
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
//		WebElement f15 = driver.findElement(By.xpath("//*[@for=\"citizenship\"]"));
//		if (f15.isDisplayed()) {
//			System.out.println(driver.findElement(By.xpath("//*[@for=\"citizenship\"]")).getText());
//
//		} else {
//			System.out.println("citizenship selected");
//		}
	}

	@When("user have to select religious information")
	public void user_have_to_select_religious_information() {
		driver.findElement(By.xpath("//*[@id=\"labelsamecaste1\"]")).click();
		//driver.findElement(By.xpath("//*[@id=\"labelsamecaste2\"]")).click();
		
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
		
//		WebElement f20 = driver.findElement(By.xpath("(//*[@class=\"error\"])[10]"));
//		if (f20.isDisplayed()) {
//			System.out.println(driver.findElement(By.xpath("(//*[@class=\"error\"])[10]")).getText());
//
//		} else {
//			System.out.println("Family value selected");
//		}
		
		
		// driver.findElement(By.xpath("//*[@id='familyTypes1']")).click();
		driver.findElement(By.xpath("//*[@id='familyTypes2']")).click();
//		WebElement f21 = driver.findElement(By.xpath("//*[@id='familyTypes2']/following-sibling::*"));
//		if (f21.isDisplayed()) {
//			System.out.println(driver.findElement(By.xpath("//*[@id='familyTypes2']/following-sibling::*")).getText());
//
//		} else {
//			System.out.println("Family type selected");
//			
//		}
		
		// driver.findElement(By.xpath("//*[@id='familyStatuss1']")).click();
		driver.findElement(By.xpath("//*[@id='familyStatuss2']")).click();
		// driver.findElement(By.xpath("//*[@id='familyStatuss3']")).click();
		
//		WebElement f22 = driver.findElement(By.xpath("//*[@id='familyStatuss4']/following-sibling::*"));
//		if (f22.isDisplayed()) {
//			System.out.println(driver.findElement(By.xpath("//*[@id='familyStatuss4']/following-sibling::*")).getText());
//
//		} else {
//			System.out.println("family status selected");
//		}
//		
	}

	@When("user have to enter about")
	public void user_have_to_enter_about() {
		System.out.println(driver.findElement(By.xpath("//*[@id='DESCDET']")).getText());
		
//		WebElement f23 = driver.findElement(By.xpath("(//*[@class='error'])[13]"));
//		if (f23.isDisplayed()) {
//			System.out.println(driver.findElement(By.xpath("(//*[@class='error'])[13]")).getText());
//
//		} else {
//			System.out.println("about");
//		}

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
		loadUrl("https://www.addharmimatrimony.com/");
		Thread.sleep(3000);

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

	}

	@When("user have to enter subcaste")
	public void user_have_to_enter_subcaste() {
		driver.findElement(By.xpath("//*[@id=\"subCasteText\"]")).sendKeys("gothra");
//		WebElement l = driver.findElement(By.xpath("//*[@id=\"subCaste\"]"));
//		selectIndex(l, 3);
		
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
		//driver.findElement(By.xpath("//*[@for=\"manglik1\"]")).click();
		driver.findElement(By.xpath("//*[@for=\"manglik2\"]")).click();
		// driver.findElement(By.xpath("//*[@for=\"manglik3\"]")).click();
		
		WebElement w43 = driver.findElement(By.xpath("//*[@id ='hours']"));
		selectValue(w43, "12");
		WebElement w44 = driver.findElement(By.xpath("//*[@id ='mins']"));
		selectValue(w44, "35");
		WebElement w45 = driver.findElement(By.xpath("//*[@id ='meridiem']"));
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
	//	driver.findElement(By.xpath("//*[@id=\"labelsamecaste2\"]")).click();
		//driver.findElement(By.xpath("//*[@href=\"#next\"]")).click();

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
	public void user_have_to_select_Professional_details_help_to_get_like_minded_matches() {
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
		WebElement w35 = driver.findElement(By.xpath("//*[@id = 'residingState']"));
		j.executeScript("arguments[0].scrollIntoView(true);", w35);
		selectValue(w35, "Tamil Nadu");
		WebElement w36 = driver.findElement(By.xpath("//*[@id ='residingCityMainDistId']"));
		j.executeScript("arguments[0].scrollIntoView(true);", w36);
		
		selectValue(w36, "Chennai");
		WebElement hid2 = driver.findElement(By.xpath("(//*[@class=\"mediumtxt padt20 padb20 clr07 font20\"])[3]"));
		j.executeScript("arguments[0].scrollIntoView(true);", hid2);
		
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

	//login module
	
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
		driver.navigate().refresh();
		driver.navigate().refresh();
		driver.navigate().refresh();
		
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
		firstSelected(get1, 1, 3);	
		selectIndex(get1, 2);
		firstSelected(get1, 4, 4);
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
		firstSelected(get3, 2, 3);
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
		//List<WebElement> radios = driver.findElements(By.xpath("//*[@name=\"maritalStatus\"]"));
		WebElement bol1 = driver.findElement(By.xpath("//*[@id='maritalStatus1']"));
		
	boolean ab1 = bol1.isSelected();
		if (ab1==true) {
			String s1 = bol1.getText();
		System.out.println("unmarried"+s1);
		} 
		else {
		System.out.println("unselected unmarried");
	}
		
		WebElement bol2 = driver.findElement(By.xpath("//*[@id='maritalStatus2']"));
		toClick(bol2);
		boolean ab2 = bol2.isSelected();
		if (ab2==true) {
			System.out.println("widow");
			} 
			else {
			System.out.println("unselected widow");
		}
		

		WebElement bol3 = driver.findElement(By.xpath("//*[@id='maritalStatus3']"));
		boolean ab3 = bol3.isSelected();
		if (ab3==true) {
			System.out.println("divorced");
			} 
			else {
			System.out.println("unselected divorced");
		}

		WebElement bol4 = driver.findElement(By.xpath("//*[@id='maritalStatus4']"));
		boolean ab4 = bol4.isSelected();
		if (ab4==true) {
			System.out.println("seperated");
			} 
			else {
			System.out.println("unselected seperated");
		}

		

		//for (WebElement maritalStatus: radios ) {
		//	radios.
		//	   System.out.println(maritalStatus.getAttribute("value"));
		    

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
		if (ab1==true) {
			String s1 = get10.getText();
		System.out.println("normal"+s1);
		} 
		else {
		System.out.println("unselected physical challanged");
	}
		WebElement get9 = driver.findElement(By.xpath("//*[@id=\"physicalStatus1\"]"));
		toClick(get9);
		boolean ab2 = get9.isSelected();
		if (ab2==true) {
			String s1 = get10.getText();
		System.out.println("selected physically challanged"+s1);
		} 
		else {
		System.out.println("unselected normal");
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
	public void user_have_to_click_edit_profile_mother_tongue() throws Throwable {
		WebElement get12 = driver.findElement(By.xpath("//*[@id=\"motherTongue\"]"));
		firstSelected(get12);
		selectIndex(get12, 6);
		firstSelected(get12);
		setExcelData("aravind", 1, 1, "firstSelected1");
	  
	}

	@When("user have to click edit profile languages known")
	public void user_have_to_click_edit_profile_languages_known() {
		List<WebElement> radios = driver.findElements(By.xpath("//*[@id=\"spokenLanguages\"]"));
		for(int i = 0; i<radios.size(); i++){
		
	 
    System.out.println(radios.get(i).getText());
		    System.out.println(radios.get(i).getAttribute("value"));
		}
		    WebElement lang = driver.findElement(By.xpath("//*[@id=\"spokenLanguagesTemp\"]"));
		    selectIndex(lang, 5);
		    for(int j = 0; j<radios.size(); j++){
				
		   	 
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
		if (ab2==true) {
			String s1 = get17.getText();
		System.out.println("selected yes"+s1);
		} 
		else {
		System.out.println("unselected no,i dont know");
	}
		WebElement get19 = driver.findElement(By.xpath("//*[@id=\"dosham2\"]"));
		boolean ab1 = get19.isSelected();
		if (ab1==true) {
			String s1 = get19.getText();
		System.out.println("selected no"+s1);
		} 
		else {
		System.out.println("unselected yes,i dont know");
	}
		WebElement get20 = driver.findElement(By.xpath("//*[@id=\"dosham3\"]"));
		toClick(get20);
		boolean ab3 = get20.isSelected();
		if (ab3==true) {
			String s1 = get20.getText();
		System.out.println("selected i dont know"+s1);
		} 
		else {
		System.out.println("unselected no,yes");
	}
		
	    
	}

	@When("user have to click edit profile eating habits")
	public void user_have_to_click_edit_profile_eating_habits() {
		WebElement get18 = driver.findElement(By.xpath("//*[@id=\"eatingHabits1\"]"));
		boolean ab3 = get18.isSelected();
		if (ab3==true) {
			String s1 = get18.getText();
		System.out.println("vegetarian"+s1);
		} 
		else {
		System.out.println("unselected vegetarian");
	}
		WebElement eat1 = driver.findElement(By.xpath("//*[@id=\"eatingHabits2\"]"));
		boolean ab1 = eat1.isSelected();
		if (ab1==true) {
			String s2 = eat1.getText();
		System.out.println("non vegetarian"+s2);
		} 
		else {
		System.out.println("unselected non vegetarian");
	}
		WebElement eat2 = driver.findElement(By.xpath("//*[@id=\"eatingHabits3\"]"));
		toClick(eat2);
		boolean ab4 = eat2.isSelected();
		if (ab4==true) {
			String s3 = eat2.getText();
		System.out.println("eggetarian"+s3);
		} 
		else {
		System.out.println("unselected eggetarian");
	}
		WebElement eat3 = driver.findElement(By.xpath("//*[@id=\"eatingHabits4\"]"));
		boolean ab2 = eat3.isSelected();
		if (ab2==true) {
			String s4 = eat3.getText();
		System.out.println("vegan"+s4);
		} 
		else {
		System.out.println("unselected vegan");
	}
	}
	@When("user have to click edit profile smoiking habits")
	public void user_have_to_click_edit_profile_smoiking_habits() {
		WebElement smo1 = driver.findElement(By.xpath("//*[@id=\"smoke1\"]"));
		boolean ab1 = smo1.isSelected();
		if (ab1==true) {
			String s1 = smo1.getText();
		System.out.println("Non-smoker"+s1);
		} 
		else {
		System.out.println("unselected Non-smoker");
	}
		WebElement smo2 = driver.findElement(By.xpath("//*[@id=\"smoke2\"]"));
		toClick(smo2);
	boolean ab2 = smo2.isSelected();
	if (ab2==true) {
		String s2 = smo2.getText();
	System.out.println("Light / Social smoker"+s2);
	} 
	else {
	System.out.println("unselected Light / Social smoker");
}
	WebElement smo3 = driver.findElement(By.xpath("//*[@id=\"smoke3\"]"));
boolean ab3 = smo3.isSelected();
if (ab3==true) {
	String s3 = smo3.getText();
System.out.println("Regular smoker"+s3);
} 
else {
System.out.println("unselected Regular smoker");
}

	    
	}

	@When("user have to click edit profile drinking habits")
	public void user_have_to_click_edit_profile_drinking_habits() {
		
		WebElement smo1 = driver.findElement(By.xpath("//*[@id=\"drink1\"]"));
		boolean ab1 = smo1.isSelected();
		if (ab1==true) {
			String s1 = smo1.getText();
		System.out.println("Non-drinker"+s1);
		} 
		else {
		System.out.println("unselected Non-drinker");
	}
		WebElement smo2 = driver.findElement(By.xpath("//*[@id=\"drink2\"]"));
		toClick(smo2);
	boolean ab2 = smo2.isSelected();
	if (ab2==true) {
		String s2 = smo2.getText();
	System.out.println("Light / Social drinker"+s2);
	} 
	else {
	System.out.println("unselected Light / Social drinker");
}
	WebElement smo3 = driver.findElement(By.xpath("//*[@id=\"drink3\"]"));
boolean ab3 = smo3.isSelected();
if (ab3==true) {
	String s3 = smo3.getText();
System.out.println("Regular drinker"+s3);
} 
else {
System.out.println("unselected Regular drinker");
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



	@Then("user invalid details")
	public void user_invalid_details() {
//		WebElement f = driver.findElement(By.xpath("(//*[contains(text(),'Invalid Matrimony')])[2]"));
//		if (f.isDisplayed()) {
//			System.out.println("incorrect password");
//
//		} else {
//			System.out.println("correct password");
//		}
	   
	}


}
