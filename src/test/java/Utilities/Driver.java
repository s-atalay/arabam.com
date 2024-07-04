package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import hooks.Base;

import java.time.Duration;

import java.util.concurrent.TimeUnit;


public class Driver {

    private Driver(){}
    private static WebDriver driver; // value is null by default
    public static WebDriver getDriver(){

        if (driver == null){
            String browserType = ConfigReader.getProperty("browser");
            switch (browserType){
                case "chrome":

                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    Base.initialize();
                    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    Base.initialize();
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
                    break;
            }
        }
        return driver;
    }

    public static void quitDriver(){
        driver.quit();
        if (driver!=null){
            driver=null;
        }
    }
    public static void closeDriver(){
        driver.close();
        if (driver!=null){
            driver=null;
        }
    }


}