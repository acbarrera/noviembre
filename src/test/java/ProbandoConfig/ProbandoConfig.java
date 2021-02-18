package ProbandoConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utilities.GetProperties;

public class ProbandoConfig {

    @Test
    public void probando(){
        GetProperties properties = new GetProperties();

        String chromeDriverURL = properties.getString("CHROMEDRIVER_PATH");
        //System.setProperty("webdriver.chrome.driver",chromeDriverURL);
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aynel Cruz\\Documents\\noviembre\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        WebElement p = driver.findElement(By.id("input"));
        p.;
        driver.close();
    }



}
