import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class dashboard {
    public WebDriver driver;
    private String links="//a";

    public dashboard(WebDriver driver){
        this.driver=driver;
    }
    public List<WebElement> getlinks(){
        return driver.findElements(By.xpath(links));

    }
}
