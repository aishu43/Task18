package DragandDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver;
		driver = new ChromeDriver();
	    driver.get("https://jqueryui.com/droppable/");
	    driver.manage().window().maximize();	
	    
	    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
	  WebElement drag =  driver.findElement(By.xpath("//p[normalize-space()='Drag me to my target']"))  ;
	  
	  WebElement drop =driver.findElement(By.xpath("//p[normalize-space()='Drop here']"));
	  
	  Actions act = new Actions(driver);
	  act.dragAndDrop(drag, drop).perform();
	  Thread.sleep(1000);
	}

}
