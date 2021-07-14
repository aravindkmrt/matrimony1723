package org.community;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
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
	public static Row row;
	public static Sheet sheet;
	Cell cell;
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
		System.out.println(" : "+attribute);
		return attribute;

	}
	public static String Txt(WebElement element) {
		String s1 = element.getText();
		System.out.print(s1);
		return s1;

	}
	public static void waitingWeb() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}
	public static void pageLoadTime() {
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

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
	public static void enable(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println(enabled);
	}
	public static void display(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);
	}
	public static void select(WebElement element) {
		boolean select = element.isSelected();
		System.out.println(select);
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
		for(int i = 0; i<element.size(); i++){
			
			 
		    String s3 = element.get(i).getText();
				

		}
	}
		public static void clickall(List<WebElement> element1) {
			for (WebElement maritalStatus: element1 ) {
				maritalStatus.click();
				 String list = maritalStatus.getAttribute("value");
				 System.out.println(list);
				 }

			}

		public static void btnClick(WebElement element) throws Exception {
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()", element);
		}
		
		public static void alertAccept1() throws AWTException {
			
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ESCAPE);
			robot.keyRelease(KeyEvent.VK_ESCAPE);
//			robot.keyPress(KeyEvent.VK_ENTER);
//			robot.keyRelease(KeyEvent.VK_ENTER);
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
public static void alertAccept2() throws AWTException {
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
public static void switchWindow(int i) {
	Set<String> windowHandles = driver.getWindowHandles();
	a= new ArrayList();
	List<String>listofwindowid =  a ;
	listofwindowid.addAll(windowHandles);
	String index = listofwindowid.get(i);
	driver.switchTo().window(index);
}
public static void switchWindow1(int j) {
	Set<String> windowHandles = driver.getWindowHandles();
	a= new ArrayList();
	List<String>listofwindowid =  a ;
	listofwindowid.addAll(windowHandles);
	String index = listofwindowid.get(j);
	driver.switchTo().window(index);
}

public static void back() {
	driver.navigate().back();
		}
public static void Refresh() {
	driver.navigate().refresh();
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
				System.getProperty("user.dir")+"\\Excel\\Matrimony.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowNum);
		String data = row.getCell(colNum).getStringCellValue();

		return data;
	}

	public static int getExcelData1(String sheetName, int rowNum, int colNum) throws Throwable {
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir")+"\\Excel\\Matrimony.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowNum);
		int data1 = (int) row.getCell(colNum).getNumericCellValue();
		//wb.close();
		return data1;
	}

	public static int getCellCount(String sheetName) throws Throwable {
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir")+"\\Excel\\Matrimony.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(0);
		int cell = row.getLastCellNum();
		return cell;
	}

	public static int getExcelRandomRowNum(String sheetName) throws Throwable {
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir")+"\\Excel\\Matrimony.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Random rand = new Random();
		int rowNum = rand.nextInt(sh.getLastRowNum());
		return rowNum;
	}

	 public static void setExcelData(String sheetName, int rowNum, int colNum,String data) throws Throwable{
		 File f = new File(System.getProperty("user.dir")+"\\Excel\\Matrimony.xlsx");
			FileInputStream filein = new FileInputStream(f);
			
			Workbook w = new XSSFWorkbook(filein);
			Sheet sheet = w.getSheet(sheetName);
			Row row = sheet.getRow(rowNum);
			Cell cell = row.getCell(colNum);
			cell.setCellValue(data);
			
			
			FileOutputStream fileout = new FileOutputStream(f);
			w.write(fileout);
			fileout.close();
			
	 }
	public static int getRowCount(String sheetName) throws Throwable {
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\aravi\\eclipse-workspace\\matrimonytask.com\\Excel\\Matrimony.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int rowIndex = wb.getSheet(sheetName).getLastRowNum();
		return rowIndex;
	}

	public static void setExcelDataInteg(String sheetName, int rowNum, int colNum, int data) throws Throwable {
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir")+"\\Excel\\Matrimony.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowNum);
		Cell cel = row.createCell(colNum);
		cel.setCellValue(data);
		FileOutputStream fos = new FileOutputStream(
				System.getProperty("user.dir")+"\\Excel\\Matrimony.xlsx");
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

	
	
	public static void firstSelected(WebElement element) {
		s = new Select(element);
		// WebElement firstSelected = s.getFirstSelectedOption();
		// System.out.println(firstSelected);
		String firstSelected1 = s.getFirstSelectedOption().getText();

		System.out.println(" : "+firstSelected1);

	}
	public static void firstSelecteddob(WebElement element, String value) {
		s = new Select(element);
		// WebElement firstSelected = s.getFirstSelectedOption();
		// System.out.println(firstSelected);
		String firstSelected1 = s.getFirstSelectedOption().getText();

		System.out.println(value+ " : "+firstSelected1);

	}
	public static void firstSelectedto(WebElement element ,WebElement element1 ) {
		Select s = new Select(element);
		Select s1 = new Select(element1);
		String firstSelected1 = s.getFirstSelectedOption().getText();
		String firstselected2 = s1.getFirstSelectedOption().getText();
		System.out.println(firstSelected1+"to"+firstselected2);

	}
	public static String Txtexcel(WebElement element,String sheetName, int rowNum, int colNum) throws Throwable {
		String s1 = element.getText();
		System.out.print(s1);
		File f = new File(System.getProperty("user.dir")+"\\Excel\\Matrimony.xlsx");
		FileInputStream filein = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(filein);
		Sheet sheet = w.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(colNum);
		cell.setCellValue(s1);
		
		
		FileOutputStream fileout = new FileOutputStream(f);
		w.write(fileout);
		fileout.close();
		return s1;

	}
	public static String ppeditexcel(WebElement element,String sheetName, int rowNum, int colNum) throws Throwable {
		String s1 = element.getText();
		System.out.println(":"+s1);
		File f = new File(System.getProperty("user.dir")+"\\Excel\\Matrimony.xlsx");
		FileInputStream filein = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(filein);
		Sheet sheet = w.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(colNum);
		cell.setCellValue(s1);
		
		
		FileOutputStream fileout = new FileOutputStream(f);
		w.write(fileout);
		fileout.close();
		return s1;

	}
	public static String Txtexcel1(WebElement element,String sheetName, int rowNum, int colNum) throws Throwable {
		String s1 = element.getText();
		System.out.print(s1);
		File f = new File(System.getProperty("user.dir")+"\\Excel\\Matrimony.xlsx");
		FileInputStream filein = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(filein);
		Sheet sheet = w.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(colNum);
		cell.setCellValue(s1);
		
		
		FileOutputStream fileout = new FileOutputStream(f);
		w.write(fileout);
		fileout.close();
		return s1;

	}
	public static String ppeditexcel1(WebElement element,String sheetName, int rowNum, int colNum) throws Throwable {
		String s1 = element.getText();
		System.out.print(":"+s1);
		File f = new File(System.getProperty("user.dir")+"\\Excel\\Matrimony.xlsx");
		FileInputStream filein = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(filein);
		Sheet sheet = w.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(colNum);
		cell.setCellValue(s1);
		
		
		FileOutputStream fileout = new FileOutputStream(f);
		w.write(fileout);
		fileout.close();
		return s1;

	}



	public static void writeDataFromExcelfirstselected(WebElement element,String sheetName, int rowNum, int colNum) throws IOException {
		s = new Select(element);
		
		String firstSelected1 = s.getFirstSelectedOption().getText();

		
		File f = new File(System.getProperty("user.dir")+"\\Excel\\Matrimony.xlsx");
		FileInputStream filein = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(filein);
		Sheet sheet = w.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(colNum);
		cell.setCellValue(firstSelected1);
		
		
		FileOutputStream fileout = new FileOutputStream(f);
		w.write(fileout);
		fileout.close();
	
		
	}
	public static void writeDataFromExcelenteredtxt(WebElement element, String sheetName, int rowNum, int colNum) throws IOException {
		String attribute = element.getAttribute("value");
	
		

		
		File f = new File(System.getProperty("user.dir")+"\\Excel\\Matrimony.xlsx");
		FileInputStream filein = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(filein);
		Sheet sheet = w.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(colNum);
		cell.setCellValue(attribute);
		
		
		FileOutputStream fileout = new FileOutputStream(f);
		w.write(fileout);
		fileout.close();
		
		
		
	}
	public static void writeDataFromExcelselecteddtxt(WebElement element, String sheetName, int rowNum, int colNum) throws IOException {
		String s1 = element.getText();
		
	
		

		
		File f = new File(System.getProperty("user.dir")+"\\Excel\\Matrimony.xlsx");
		FileInputStream filein = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(filein);
		Sheet sheet = w.getSheet(sheetName);
		
		row = sheet.getRow(rowNum);
		Cell cell = row.getCell(colNum);
		cell.setCellValue(s1);
		
		
		FileOutputStream fileout = new FileOutputStream(f);
		w.write(fileout);
		fileout.close();
		
		
		
	}
	public static String printTxt(List<WebElement> li, int i) {
		return (li.get(i).getText());
//		 li.get(i).getAttribute("innerHTML");
}
	
	public static void writeExcel(String sheetName, int rowNo, int cellNo, String cellValue) throws IOException {
		File f = new File(System.getProperty("user.dir")+"\\Excel\\Matrimony.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.createRow(rowNo);
		Cell createCell = row.createCell(cellNo);
		createCell.setCellValue(cellValue);
		FileOutputStream fos = new FileOutputStream(f);
		workbook.write(fos);

	}

	
	
	
		
	
		}
		
	
	

