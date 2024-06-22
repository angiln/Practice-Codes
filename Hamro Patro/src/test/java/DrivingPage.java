import org.junit.jupiter.api.AfterAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class DrivingPage {
    private WebDriver driver;
   private dashboard dbpage;

    @BeforeTest
    public void beginning() throws InterruptedException {
        System.setProperty("web-driver.chrome.driver","D://browserdrivers//chromedriver//chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.hamropatro.com/");
        driver.manage().window().maximize();
        dbpage = new dashboard(driver);
    }

    @Test
    public void first() throws InterruptedException {
        Thread.sleep(1000);
        List<WebElement> thearray= dbpage.getlinks();
        int size=thearray.size();
        System.out.println("There are " +" "+size+" "+" Links in The Homepage");
        Thread.sleep(1000);
        for(int i=0;i<size;i++){
            int randomindex=(int)Math.floor(Math.random()*size);
            System.out.println(randomindex);
           WebElement ele=thearray.get(randomindex);
            System.out.println("Clicked the link "+ele+"by the random indexnumber "+randomindex);
            ele.click();
            Thread.sleep(2000);
            driver.navigate().to("https://www.hamropatro.com/");
            Thread.sleep(2000);

        }


        // Add code to close the WebDriver instance after all tests are done
    }
    @AfterAll
    public void endtab(){

        driver.quit();
    }

}
