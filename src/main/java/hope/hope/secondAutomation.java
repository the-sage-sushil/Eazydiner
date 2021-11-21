package hope.hope;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class secondAutomation {

	public static void main(String[] args) {
		

String main="https://eazydiner.com";
		
		//Setting the properties and the path 
		System.setProperty("webdriver.chrome.driver","D:\\ORCHID\\selenium\\chromedriver.exe");
		
	
		ChromeOptions option = new ChromeOptions ();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		
		//getting the to the url //Question No.1 (Solution)
		driver.get(main);
		
		driver.findElement(By.id("home-search")).sendKeys("Lord Of The Drinks" + Keys.ENTER);
		
		WebElement textbox = driver.findElement(By.id("home-search"));
		textbox.sendKeys(Keys.ENTER);
		
		driver.get("https://www.eazydiner.com/mumbai/restaurants/lord-of-the-drinks-mumbai");
		
		driver.findElement(By.xpath("//*[@id=\"restaurants\"]/div[3]/div/div[3]/div[2]/div/a")).click();
		
		driver.get("https://www.eazydiner.com/mumbai/lord-of-the-drinks-powai-central-mumbai-669801?deal_types[]=postpaid");
		
		
	
		driver.findElement(By.xpath("//*[@id='eazy-booking']/div/div/div/div/ul/li[1]/input")).click();
		
		driver.findElement(By.xpath("/html/body/div[20]/div/table/tbody/tr[4]/td[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"eazy-booking\"]/div/div/div/div/ul/li[2]/select"));
		
		WebElement textbox1 = driver.findElement(By.xpath("//*[@id=\"eazy-booking\"]/div/div/div/div/ul/li[2]/select"));
		textbox1.click();
		int Guest=6;
		for(int i=0;i<Guest;i++) {
			textbox1.sendKeys(Keys.ARROW_DOWN);
			
		}
		textbox1.sendKeys(Keys.ENTER);
		
		driver.get("https://www.eazydiner.com/mumbai/lord-of-the-drinks-powai-central-mumbai-669801?deal_types[]=postpaid");
		
		
		driver.findElement(By.id("slotForm")).click();
		
		
		
		System.out.println("Script one run successfully");
		
	}

}
