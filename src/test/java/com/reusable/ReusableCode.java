package com.reusable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReusableCode {
	public static WebDriver driver;

	public static void getdrive() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void loadURL(String URL) {// 1
		driver.get(URL);
	}

	public static void maximize() {// 2
		driver.manage().window().maximize();
	}

	public void type(WebElement element, String data) {// 3
		element.sendKeys(data);
	}

	public void click(WebElement element) {// 4
		element.click();
	}

	public String getTitle() {// 5
		String title = driver.getTitle();
		return title;
	}

	public WebElement linkedText(String value) {// 6
		WebElement element = driver.findElement(By.linkText(value));
		return element;
	}

	public WebElement partialLinkedTest(String value) {// 7
		WebElement element = driver.findElement(By.partialLinkText(value));
		return element;
	}

	public WebElement findElementbyTagName(String attributevalue) {// 8
		WebElement findElement = driver.findElement(By.tagName(attributevalue));
		return findElement;
	}

	public WebElement findElementbyId(String value) {// 9
		WebElement element = driver.findElement(By.id(value));
		return element;
	}

	public WebElement findElementbyClassName(String attributevalue) {// 10
		WebElement findElement = driver.findElement(By.className(attributevalue));
		return findElement;
	}

	public void moveToElement(WebElement element) {// 11
		Actions ac = new Actions(driver);
		ac.moveToElement(element).perform();
	}

	public void contextClick(WebElement element) {// 12
		Actions ac = new Actions(driver);
		ac.contextClick(element).perform();
	}

	public void doubleClick(WebElement element) {// 13
		Actions ac = new Actions(driver);
		ac.doubleClick(element).perform();
	}

	public void navigateString(String URL) {// 14
		driver.navigate().to(URL);
	}

	public void back() {// 15
		driver.navigate().back();
	}

	public void forward() {// 16
		driver.navigate().forward();
	}

	public void refresh() {// 17
		driver.navigate().refresh();
	}

	public boolean isEnabled(WebElement element) {// 18
		boolean enabled = element.isEnabled();
		return enabled;
	}

	public boolean isDisplayed(WebElement element) {// 19
		boolean displayed = element.isDisplayed();
		return displayed;
	}

	public boolean isSelected(WebElement element) {// 20
		boolean selected = element.isSelected();
		return selected;
	}

	public File getScreenshot(WebElement element, String type) {// 21
		File screenshotAs = element.getScreenshotAs(OutputType.FILE);
		return screenshotAs;
	}

	public static void quit() {// 22
		driver.quit();
	}

	public void close() {// 23
		driver.close();
	}

	public Dimension size(WebElement element) {// 24
		Dimension size = element.getSize();
		return size;
	}

	public String getWindowHandle() {// 25
		String windowHandle = driver.getWindowHandle();
		return windowHandle;
	}

	public Set<String> getWindowHandles() {// 26
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;
	}

	public void typeJs(String data, WebElement element) {// 27
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setAttribute('value', 'data')", element);
	}

	public void txtClear(WebElement element) {// 28
		element.clear();
	}

	public String getText(WebElement element) {// 29
		String text = element.getText();
		return text;
	}

	public void dragDrop(WebElement s, WebElement d) {// 30
		Actions ac = new Actions(driver);
		ac.dragAndDrop(s, d).perform();
	}

	public Alert switchToAlert() {// 31
		Alert alert = driver.switchTo().alert();
		return alert;
	}

	public void acceptAlert() {// 32
		Alert acceptAlert = driver.switchTo().alert();
		acceptAlert.accept();

	}

	public void cancelAlert(Alert alert) {// 33
		alert.dismiss();
	}

	public WebElement findElementbyName(String attributevalue) {// 34
		WebElement findElement = driver.findElement(By.name(attributevalue));
		return findElement;
	}

	public WebElement findElementByXpath(String value) {// 35
		WebElement element = driver.findElement(By.xpath(value));
		return element;
	}

	public String getURL() {// 36
		String url = driver.getCurrentUrl();
		return url;
	}

	public void selectOptionsByText(WebElement element, String text) {// 37
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}

	public void selectOptionsByAttribute(WebElement element, String value) {// 38
		Select s = new Select(element);
		s.selectByValue(value);
	}

	public void selectOptionsByIndex(WebElement element, int IndexNo) {// 39
		Select se = new Select(element);
		se.selectByIndex(IndexNo);
	}

	public void deselectByIndex(WebElement element, int indexNo) {// 40
		Select s = new Select(element);
		s.deselectByIndex(indexNo);
	}

	public List<WebElement> getOptions(WebElement element) {// 41
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		return options;
	}

	public List<WebElement> getAllSelectedOptions(WebElement element) {// 42
		Select se = new Select(element);
		List<WebElement> allSelectedOptions = se.getAllSelectedOptions();
		return allSelectedOptions;
	}

	public WebElement getFirstSelectedOptions(WebElement element) {// 43
		Select s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		return firstSelectedOption;
	}

	public void deselectByValue(WebElement element, String value) {// 44
		Select s = new Select(element);
		s.deselectByValue(value);
	}


	public String getAttribute(WebElement element, String value) {//45
		String attribute = element.getAttribute("value");
		return attribute;
	}

	public String getAttribute(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
		

	}

	public void deselectByText(WebElement element, String text) {//46
		Select se = new Select(element);
		se.deselectByVisibleText(text);
	}

	// To get Data
	public String getData(String sheetName, int rowNo, int cellNo) throws IOException {
		String res = null;
		File file = new File("C:\\Users\\Ms\\eclipse-workspace\\FrameWork\\Excel Sheet\\Hotel Login.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		CellType cellType = cell.getCellType();

		switch (cellType) {

		case STRING:
			res = cell.getStringCellValue();
			break;

		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
				res = dateFormat.format(dateCellValue);
			} else {
				double numericCellValue = cell.getNumericCellValue();
				long d=(long)numericCellValue;
				BigDecimal valueOf = BigDecimal.valueOf(d);
				res = valueOf.toString();
			}
			break;
			
		default:
			break;
		}
		workbook.close();
		return res;
		
	}

	// To update Value in cell
	public void updateData(String SheetName, int rowNo, int cellNo, String oldData, String Newdata) throws IOException {
		File file = new File("C:\\Users\\Ms\\eclipse-workspace\\FrameWork\\Excel Sheet\\Test Excel Sheet.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet(SheetName);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		String value = cell.getStringCellValue();
		if (value.equals(oldData)) {
			cell.setCellValue(Newdata);
		}
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		workbook.write(fileOutputStream);
		workbook.close();
	}

	// To insert value in cell

	public void writeData(String SheetName, int rowNo, int cellNo, String Data) throws IOException {
		File file = new File("C:\\Users\\Ms\\eclipse-workspace\\FrameWork\\Excel Sheet\\Hotel Login.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet(SheetName);
		Row row = sheet.getRow(rowNo);
		Cell createCell = row.createCell(cellNo);
		createCell.setCellValue(Data);
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		workbook.write(fileOutputStream);
		workbook.close();

		System.out.println("done!!!");
	}
	public static void threadsleep(int millis) throws InterruptedException {
		Thread.sleep(millis);
	}

	public static void implicitlyWait() {
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	}

	//To read value from property file
	public String getPropertyFileValue(String key) throws IOException {
		FileInputStream stream = new FileInputStream(System.getProperty("user.dir") + "\\config.properties");
		Properties properties = new Properties();
		properties.load(stream);
		Object name = properties.get(key);
		String value = (String) name;
		return value;
	}

	//Browser Type
	
	public static void getDriverType(String browserType) {
		switch (browserType) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
			
		case "ie":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;
			
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		default:
			driver.manage().window().maximize();
			break;
		}

	}
}
