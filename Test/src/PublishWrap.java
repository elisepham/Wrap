import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class PublishWrap {
    // Create WebDriver instance
    WebDriver driver;

    @Before
    public void setUp() throws Exception {
        // Initialize the WebDriver instance using FirefoxDriver and launch the web browser
        driver = new FirefoxDriver();
        
        driver.get("https://authoring.qa.wrapdev.net/#/");
        // Maximize the current window
        driver.manage().window().maximize();
    }
    @Test
    public void testPublishWrap() throws Exception {
    
    	driver.findElement(By.linkText("LOG IN")).click();
        WebElement TB_Username = driver.findElement(By.xpath("//input[@placeholder='Email or username']"));      
        TB_Username.sendKeys("vgboy007");
        
        WebElement TB_Password = driver.findElement(By.xpath("//input[@placeholder='Password']"));            
        TB_Password.sendKeys("Icy07212010");
        
        // Click on login button
        driver.findElement(By.xpath("//button[@type='submit']")).click();  
          
        // Wait
        Thread.sleep(8000);
        //create new wrap
        driver.findElement(By.xpath("//label[text()='Create new wrap']")).click(); 
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Start from scratch']")).click(); 
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@ng-click='ctrl.$close()']")).click(); 
        //add images
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Add Images']")).click(); 
        Thread.sleep(3000);
        driver.findElement(By.xpath("//h4[text()='Icy01JPG.jpg']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()='Add']")).click(); 
        Thread.sleep(3000);
        driver.findElement(By.xpath("//h4[text()='Icy01JPG.jpg']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()='Publish']")).click(); 
     }
    @After
    public void tearDown() {
        // Quit the launched web browser
       // driver.quit();
    }
}