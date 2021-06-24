package comunity.com;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.apache.commons.io.FileUtils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclassregistermatrimony {
	public static WebDriver driver;
	public static Actions ac;
	public static Alert al;
	public static TakesScreenshot ts;
	public static JavascriptExecutor js;
	public static Select s;
	public static ArrayList<String> a;
	//
	// public static ExtentReports report;
	// public static ExtentTest logger;
	public static String domain;
	public static String error;
	public static String expt, ex, exp, e, expti, exptio, status;
	String html = "MyReport.html";

	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	public static void launchfirefox() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}

	public static void loadUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	public static void toGetTitle() {
		String Title = driver.getTitle();
		System.out.println(Title);

	}

	public static String currentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		return currentUrl;

	}

	public static String enteredTxt(WebElement element) {
		String attribute = element.getAttribute("value");
		System.out.println(attribute);
		return attribute;

	}

	public static void toClick(WebElement element) {
		element.click();
	}

	public static void toInput(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void toMove(WebElement element) {
		ac = new Actions(driver);
		ac.moveToElement(element).perform();
	}

	public static void toContext(WebElement element) {
		ac = new Actions(driver);
		ac.contextClick(element).perform();

	}

	public static void toDrop(WebElement src, WebElement dest) {
		ac = new Actions(driver);
		ac.dragAndDrop(src, dest).perform();

	}

	public static void alertAccept() {
		al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		driver.switchTo().defaultContent();

	}

	public static void alertDismiss() {
		al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.dismiss();
		driver.switchTo().defaultContent();

	}

	public static void alertType(String value) {
		al = driver.switchTo().alert();
		al.sendKeys(value);

	}

	public static void alertGetTxt() {
		al = driver.switchTo().alert();
		al.getText();

	}

	public static void screenshot(String value) throws IOException {
		ts = (TakesScreenshot) driver;
		File dest = new File("C:\\Users\\aravi\\eclipse-workspace\\screenshot");
		File src = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, dest);

	}

	public static void frameName(String name) {
		driver.switchTo().frame(name);

	}

	public static void frameIndex(int i) {
		driver.switchTo().frame(i);

	}

	public static void frameWebElement(WebElement element) {
		driver.switchTo().frame(element);
	}

	public static void frameParent() {
		driver.switchTo().parentFrame();

	}

	public static void framedefault() {
		driver.switchTo().defaultContent();

	}

	public static void selectIndex(WebElement element, int i) {
		s = new Select(element);
		s.selectByIndex(i);
	}

	public static void selectText(WebElement element, String value) {
		s = new Select(element);
		s.selectByVisibleText(value);
	}

	public static void selectValue(WebElement element, String value) {
		s = new Select(element);
		s.selectByVisibleText(value);
	}

	public static void multiple(WebElement element) {
		s = new Select(element);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
	}

	public static void allSelectedOption(List<WebElement> element) {
		s = new Select((WebElement) element);
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			System.out.println(options.get(i).getText());

		}

	}

	public String getValueFromDropDown(WebElement element, String compareText) {
		List<WebElement> options = new Select(element).getAllSelectedOptions();
		for (WebElement option : options) {
			if (option.getText().equals(compareText)) {
				return option.getText();
			}
		}
		return null;
	}

	// public static void firstSelected1(WebElement element, boolean text , String
	// value ) {
	// boolean b1 = element.isSelected();
	// if (b==true) {
	// String s1 = element.getAttribute(value);
	// System.out.println(s1);
	// }
	// else {
	// System.out.println("unselected");
	// }
	//// s = new Select(element);
	//// WebElement firstSelected = s.getFirstSelectedOption();
	//// System.out.println(firstSelected);
	//// String firstSelected1 = s.getFirstSelectedOption().getText();
	//// System.out.println(firstSelected1);
	//
	// }

	public static void deselectIndex(WebElement element, int i) {
		s = new Select(element);
		System.out.println(i);

	}

	public static void deselectVisibleText(WebElement element, String text) {
		s = new Select(element);
		s.deselectByVisibleText(text);
	}

	public static void deselectValue(WebElement element, String text) {
		s = new Select(element);
		s.deselectByValue(text);

	}

	public static void windowsId() {
		Set<String> windowsId = driver.getWindowHandles();
		System.out.println(windowsId);

	}

	public static void windowId() {
		String windowId = driver.getWindowHandle();
		System.out.println(windowId);
	}

	////////////////////// Screen SHot //////////////////////////////////////

	// Creating a method getScreenshot and passing two parameters
	// driver and screenshotName
	public static String getScreenshot(WebDriver driver, String screenshotName) throws Exception {
		// below line is just to append the date format with the screenshot name to
		// avoid duplicate names
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		// after execution, you could see a folder "FailedTestsScreenshots" under src
		// folder
		String destination = "C:\\Users\\CBS Testing\\workspace\\Niresh\\Negative\\screenshots\\" + screenshotName
				+ ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		// Returns the captured file path
		return destination;
	}

	////////// Excel COde ///////////////////////

	public static String getExcelData(String sheetName, int rowNum, int colNum) throws Throwable {
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\aravi\\eclipse-workspace\\matrimonytask.com\\Excel\\Matrimony.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowNum);
		String data = row.getCell(colNum).getStringCellValue();

		return data;
	}

	public static int getExcelData1(String sheetName, int rowNum, int colNum) throws Throwable {
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\aravi\\eclipse-workspace\\matrimonytask.com\\Excel\\Matrimony.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowNum);
		int data1 = (int) row.getCell(colNum).getNumericCellValue();
		// wb.close();
		return data1;
	}

	public static int getCellCount(String sheetName) throws Throwable {
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\aravi\\eclipse-workspace\\matrimonytask.com\\Excel\\Matrimony.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(0);
		int cell = row.getLastCellNum();
		return cell;
	}

	public static int getExcelRandomRowNum(String sheetName) throws Throwable {
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\aravi\\eclipse-workspace\\matrimonytask.com\\Excel\\Matrimony.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Random rand = new Random();
		int rowNum = rand.nextInt(sh.getLastRowNum());
		return rowNum;
	}

	// public static void setExcelData(String sheetName, int rowNum, int
	// colNum,String data) throws Throwable{
	// File f = new
	// File("C:\\Users\\aravi\\eclipse-workspace\\matrimonytask.com\\Excel\\Matrimony.xlsx");
	// FileInputStream fis = new FileInputStream(f);
	// Workbook wb = new XSSFWorkbook(fis);
	// Sheet sh = wb.getSheet(sheetName);
	// Row row = sh.getRow(rowNum);
	// Cell cel = row.createCell(colNum);
	// cel.setCellValue(data);
	// FileOutputStream fos = new FileOutputStream(f);
	// wb.write(fos);
	//// wb.close();
	// }
	public static int getRowCount(String sheetName) throws Throwable {
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\aravi\\eclipse-workspace\\matrimonytask.com\\Excel\\Matrimony.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int rowIndex = wb.getSheet(sheetName).getLastRowNum();
		return rowIndex;
	}

	public static void setExcelDataInteg(String sheetName, int rowNum, int colNum, int data) throws Throwable {
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\aravi\\eclipse-workspace\\matrimonytask.com\\Excel\\Matrimony.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowNum);
		Cell cel = row.createCell(colNum);
		cel.setCellValue(data);
		FileOutputStream fos = new FileOutputStream(
				"C:\\Users\\aravi\\eclipse-workspace\\matrimonytask.com\\Excel\\Matrimony.xlsx");
		wb.write(fos);
		// wb.close();

	}

	public static String randomSelection(WebDriver driver) {

		List<WebElement> links = driver.findElements(By.cssSelector(
				"html body div.innerdiv.margin-reset div.bgclr2 div.pad7 div.bgclr5.pad10.smalltxt form dl.nomargpad dd.fleft.padb5.mediumhdrtxt.domainlist a.clr4"));
		List<WebElement> visited = new ArrayList<WebElement>();
		WebElement random = links.get(new Random().nextInt(links.size()));
		String randomId = random.getText();
		System.out.println("No.of ID's.. " + links.size());
		if (!visited.contains(random)) {
			random.click();
			visited.add(random);
			// driver.navigate().back();
		}
		return randomId;
	}

	public static List<HashMap<String, String>> readValueFromExcelSheet() throws NullPointerException {
		List<HashMap<String, String>> mapDatasList = new ArrayList<HashMap<String, String>>();
		try {
			File excelLocaltion = new File(
					"C:\\Users\\CBS Testing\\workspace\\Niresh\\Negative\\excel\\Registration1.xls");

			String sheetName = "Sheet1";

			FileInputStream f = new FileInputStream(excelLocaltion.getAbsolutePath());
			Workbook w = new XSSFWorkbook(f);
			Sheet sheet = w.getSheet(sheetName);
			Row headerRow = sheet.getRow(0);
			for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
				Row currentRow = sheet.getRow(i);
				HashMap<String, String> mapDatas = new HashMap<String, String>();
				for (int j = 0; j < headerRow.getPhysicalNumberOfCells(); j++) {
					Cell currentCell = currentRow.getCell(j);

					switch (currentCell.getCellType()) {
					case Cell.CELL_TYPE_STRING:
						mapDatas.put(headerRow.getCell(j).getStringCellValue(), currentCell.getStringCellValue());
						break;
					case Cell.CELL_TYPE_NUMERIC:
						mapDatas.put(headerRow.getCell(j).getStringCellValue(),
								String.valueOf(currentCell.getNumericCellValue()));

						break;

					}
				}

				mapDatasList.add(mapDatas);
			}

		} catch (Throwable e) {
			e.printStackTrace();
		}
		return mapDatasList;

	}

	public static void firstSelected(WebElement element) {
		s = new Select(element);
		// WebElement firstSelected = s.getFirstSelectedOption();
		// System.out.println(firstSelected);
		String firstSelected1 = s.getFirstSelectedOption().getText();

		System.out.println(firstSelected1);

	}

	public static void writeDataFromExcel(int rowcount, int columncount, String Sheetname, String data) throws Throwable {
		
			File f = new File("C:\\Users\\aravi\\eclipse-workspace\\matrimonytask.com\\Excel\\Matrimony.xlsx");

			FileOutputStream out = new FileOutputStream(f);
			Workbook w = new XSSFWorkbook();
			Sheet sheet = w.createSheet(Sheetname);
			Row row = sheet.createRow(rowcount);
			Cell cell = row.createCell(columncount);
			cell.setCellValue(data);
			w.write(out);
			System.out.println("done");

		
	}

	/////////////////////////// SMS CODE ////////////////////////////////////////
	public static void sendVFSms1() throws Exception {
		String message = "PASS : CBS-Login-Desktop-Adyar,Chennai";
		String mobileno = "918098882244,916302165648,";
		String[] s = mobileno.split(",");
		for (int i = 0; i < s.length; i++) {

			String url = "http://api.myvaluefirst.com/psms/servlet/psms.Eservice2";
			URL obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();

			// add reuqest header
			con.setRequestMethod("POST");
			// con.setRequestProperty("User-Agent", USER_AGENT);
			con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

			String urlParameters = "data=<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?><!DOCTYPE MESSAGE SYSTEM \"http://127.0.0.1/psms/dtd/message.dtd\" ><MESSAGE><USER USERNAME=\"matrimony2\" PASSWORD=\"matrimony02\"/><SMS UDH=\"0\" CODING=\"1\" TEXT=\""
					+ message + "\" PROPERTY=\"0\" ID=\"1\"><ADDRESS FROM=\"CMATRI\" TO=\"" + s[i]
					+ "\" SEQ=\"1\" TAG=\"some clientside random data\" /></SMS></MESSAGE>&action=send";

			// Send post request
			con.setDoOutput(true);
			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			wr.writeBytes(urlParameters);
			wr.flush();
			wr.close();

			int responseCode = con.getResponseCode();
			System.out.println("\nSending 'POST' request to URL : " + url);
			System.out.println("Post parameters : " + urlParameters);
			System.out.println("Response Code : " + responseCode);

			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();

			// print result
			System.out.println(response.toString());

		}
	}

	public static void sendVFSms() throws Exception {
		String message = "FAIL : CBS_Login-Desktop-Adyar,Chennai";

		String mobileno = "918098882244,916302165648";
		String[] s = mobileno.split(",");
		for (int i = 0; i < s.length; i++) {
			String url = "http://api.myvaluefirst.com/psms/servlet/psms.Eservice2";
			URL obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();

			// add reuqest header
			con.setRequestMethod("POST");
			// con.setRequestProperty("User-Agent", USER_AGENT);
			con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

			String urlParameters = "data=<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?><!DOCTYPE MESSAGE SYSTEM \"http://127.0.0.1/psms/dtd/message.dtd\" ><MESSAGE><USER USERNAME=\"matrimony2\" PASSWORD=\"matrimony02\"/><SMS UDH=\"0\" CODING=\"1\" TEXT=\""
					+ message + "\" PROPERTY=\"0\" ID=\"1\"><ADDRESS FROM=\"CMATRI\" TO=\"" + s[i]
					+ "\" SEQ=\"1\" TAG=\"some clientside random data\" /></SMS></MESSAGE>&action=send";

			// Send post request
			con.setDoOutput(true);
			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			wr.writeBytes(urlParameters);
			wr.flush();
			wr.close();

			int responseCode = con.getResponseCode();
			System.out.println("\nSending 'POST' request to URL : " + url);
			System.out.println("Post parameters : " + urlParameters);
			System.out.println("Response Code : " + responseCode);

			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();

			// print result
			System.out.println(response.toString());

		}
	}

	///////////////////////////// Mail ////////////

	// public static void reportflush()
	// {
	// report.flush();
	// final String username = "mohantest.mm@gmail.com";
	// final String password = "mohanmmteam";
	//
	// Properties props = new Properties();
	// props.put("mail.smtp.auth", true);
	// props.put("mail.smtp.starttls.enable", true);
	// props.put("mail.smtp.host", "smtp.gmail.com");
	// props.put("mail.smtp.port", "587");
	//
	// Session session = Session.getInstance(props, new javax.mail.Authenticator() {
	// protected PasswordAuthentication getPasswordAuthentication() {
	// return new PasswordAuthentication(username, password);
	// }
	// });
	// Message message = new MimeMessage(session);
	//
	// try {
	//
	// message.setFrom(new InternetAddress("mohantest.mm@gmail.com"));
	//
	// message.setSubject("CBS Desktop Automation Report "); /// Global Module
	// Content
	//
	// message.setRecipients(Message.RecipientType.TO,
	// InternetAddress.parse("cbsautomationreport@gmail.com")); // Add Email Address
	// To Whom Mail Need to be Send
	//// ,thanikachalam.thirunanasambandan@matrimony.com
	// Multipart multipart = new MimeMultipart();
	//
	// MimeBodyPart messageBodyPart = new MimeBodyPart();
	// messageBodyPart.setText("CBS Automation Report");
	// MimeBodyPart attachmentBodyPart = new MimeBodyPart();
	//
	//
	// String file = "C:\\Users\\CBS
	// Testing\\workspace\\Niresh\\Nepali2\\Report.html";
	//// HtMALReport File Bath --- EXtent Report
	// String fileName = "CBS-AutomationReport-Desktop"; // Change CBS to Global or
	// Individual Domain
	// DataSource source = new FileDataSource(file);
	//// messageBodyPart.setDataHandler(new DataHandler(source));
	// attachmentBodyPart.setDataHandler(new DataHandler(source));
	// attachmentBodyPart.setFileName("Report.html");
	//
	//
	// multipart.addBodyPart(messageBodyPart);
	// multipart.addBodyPart(attachmentBodyPart);
	//
	// message.setContent(multipart);
	//
	// System.out.println("Sending....");
	//
	// Transport.send(message);
	//
	// System.out.println("Mail Sent Successfully");
	//
	// } catch (MessagingException e) {
	// e.printStackTrace();
	// }

	// }

	@BeforeSuite
	public void htmlReport() {

		// extent = new
		// ExtentHtmlReporter("C:\\Users\\amuthan\\eclipse-workspace\\com.mobile\\ScreenShot");

		// report=new ExtentReports("C:\\Users\\CBS
		// Testing\\workspace\\Niresh\\Nepali2\\Report\\"+html,true);
		// report.loadConfig(new File("C:\\Users\\CBS
		// Testing\\workspace\\Niresh\\Nepali2\\extent-config.xml"));
		//// test=reports.startTest("Android Registeration Test");

	}

}
