package Testdata;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readthedata {

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		int	noOfLinks=links.size();
		XSSFWorkbook book=new XSSFWorkbook();
		XSSFSheet sheet=book.createSheet("Flipkartlinks");
		for(int i=0;i<noOfLinks;i++)
		{
			WebElement link=links.get(i);
			String url=link.getAttribute("href");
			XSSFRow row=sheet.createRow(i);
			XSSFCell cel=row.createCell(0);
			cel.setCellValue(url);
		}
		FileOutputStream fos=new FileOutputStream("./Testdata/FT Credentials.xlsx");
		book.write(fos);
		book.close();
		fos.close();

	}

}