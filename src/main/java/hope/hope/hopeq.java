package hope.hope;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class hopeq {
	
	public static void main(String[] args) {
		
		String main="https://eazydiner.com";
		
		//Setting the properties and the path 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\M1073124\\Desktop\\selenuim\\chromedriver.exe");
		
	
		ChromeOptions option = new ChromeOptions ();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		
		//getting the to the url //Question No.1 (Solution)
		driver.get(main);
		
		
		driver.get("https://www.eazydiner.com/");
		
		driver.findElement(By.id("srchbar")).click();
		
		driver.findElement(By.xpath("//*[@id=\"search_city_content\"]/div[1]/ul/li[2]/div/a")).click();
		
		driver.findElement(By.xpath("/html/body/section[2]/div/div/div/div[1]/div[1]/a/div")).click();
		
		driver.get("https://www.eazydiner.com/restaurants?location=k-star-mall-chembur&takeaway_delivery=1&near-me=true");
		
		driver.findElement(By.xpath("//*[@id=\"restaurants\"]/div[1]/div/div[3]/div[2]/div[2]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"eazy-booking\"]/div/div/div/div/ul/li[1]/input")).click();
		
		
		driver.findElement(By.xpath("/html/body/div[20]/div/table/tbody/tr[5]/td[3]")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"eazy-booking\"]/div/div/div/div/ul/li[2]/select")).click();
		
		WebElement textbox = driver.findElement(By.xpath("//*[@id=\"eazy-booking\"]/div/div/div/div/ul/li[2]/select"));
		int Guest=6;
		for(int i=0;i<Guest;i++) {
			textbox.sendKeys(Keys.ARROW_DOWN);
				
		}
		textbox.sendKeys(Keys.ENTER);
		
		driver.get("https://www.eazydiner.com/mumbai/china-bistro-chembur-222750?deal_types[]=postpaid");
		
		
		driver.findElement(By.id("slotForm")).click();
	}

}
