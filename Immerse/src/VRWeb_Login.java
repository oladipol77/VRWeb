
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VRWeb_Login {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tua\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://prism-staging.immerse.io/s/SJ81j6iEb/"); 
        Thread.sleep(5000L);
	    driver.findElement(By.id("guestnameinput")).sendKeys("QA_Test");
	    driver.findElement(By.id("guestproceedbutton")).click();
	    Thread.sleep(20000L);
	    driver.findElement(By.xpath("//*[@id=\"devices-continue\"]")).click();
	    
	   
	}

		
	
	
	
	
	}

    
