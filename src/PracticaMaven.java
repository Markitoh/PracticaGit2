import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticaMaven {

	public static void main(String[] args) {
		
		String ruta = new File("Drivers/geckodriver.exe").getAbsolutePath();
		System.out.println(ruta);
		System.setProperty("webdriver.gecko.driver",ruta);	
		WebDriver driver = new FirefoxDriver();						
		//String url = "https://www.phptravels.net/";
		driver.get("https://www.phptravels.net/");
		
		
		
		
		//driver.findElement(By.xpath('//li[@class='text-center go-right']/a[.='Blog      ']')).click();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//li[@class='text-center go-right']/a[.='Blog      ']")).click();
		driver.findElement(By.xpath("//div[@class='input-group RTL']")).click();
		WebElement buscar = driver.findElement(By.name("s"));
		buscar.sendKeys("South Africa");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click(); ;
		driver.close();
	
	
}
}