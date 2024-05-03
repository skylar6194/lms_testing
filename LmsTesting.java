import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Sele {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void testGoogleNavigation() {
        driver.navigate().to("http://www.google.com/");
        String pageTitle = driver.getTitle();
        System.out.println("Google Page Title: " + pageTitle);
    }

    @Test(priority = 2)
    public void testUIMSNavigation() {
        driver.navigate().to("https://uims.cuchd.in/");
        String pageTitle = driver.getTitle();
        System.out.println("UIMS Page Title: " + pageTitle);
    }
    @Test(priority = 3)
    public void testForgotPassword() {
    	driver.navigate().to("https://lms.cuchd.in/login/index.php");
        driver.findElement(By.cssSelector("#login > div.col-md-12.text-end > p > a")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
    @Test(priority=4)
    public void getBrowser()
    {
    	  driver = new ChromeDriver();
          driver.manage().window().maximize();
    }

    @Test(priority = 5)
    public void testLogin() {
        driver.navigate().to("https://lms.cuchd.in/login/index.php");
        driver.findElement(By.className("form-floating"));
        driver.findElement(By.xpath("//*[@id=\"validationCustom02\"]")).sendKeys("22bcs14842");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("UR_PASSWORD");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//*[@id=\"loginbtn\"]")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test(priority = 6)
    public void testCourseNavigation() {
        driver.findElement(By.cssSelector("#frontpage-course-list > div > div:nth-child(1) > div:nth-child(3) > div.card-body > h4 > a"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.cssSelector("#frontpage-course-list > div > div:nth-child(1) > div:nth-child(3) > div.card-body > h4 > a")).click();
        driver.findElement(By.cssSelector("#action-menu-toggle-1")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.cssSelector("#actionmenuaction-1")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
    @Test(priority=7)
    public void profileNavigation()
    {
    	driver.findElement(By.cssSelector("#course-60171 > div > div.media-body.col-md-9.col-sm-6 > a > h5")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test(priority=8)
    public void testCalenderNavigation()
    {
    	 driver.findElement(By.cssSelector("#nav-drawer > ul:nth-child(2) > li:nth-child(3) > a")).click();
    	 try {
             Thread.sleep(5000);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
    	 
    }
    @Test(priority=9)
    public void testGrades()
    {
    	 
    	 driver.findElement(By.cssSelector("#nav-drawer > ul:nth-child(1) > li > a")).click();
    	 try {
             Thread.sleep(5000);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
    	 
    }
    @Test(priority=10)
    public void testNotifications()
    {
    	driver.findElement(By.cssSelector("#nav-drawer > ul:nth-child(2) > li:nth-child(1) > a")).click();
    	try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    	driver.findElement(By.cssSelector("#nav-notification-popover-container > div.popover-region-toggle.nav-link.icon-no-margin > i")).click();
    	try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    	
    }
    @Test(priority=11)
    public void Logout()
    {
    	driver.findElement(By.cssSelector("#action-menu-toggle-1")).click();
    	try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    	driver.findElement(By.cssSelector("#action-menu-1-menu > a:nth-child(9)")).click();
    	try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }




    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}