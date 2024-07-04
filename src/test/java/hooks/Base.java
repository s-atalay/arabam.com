package hooks;

import Page.HomePage;
import Page.MotorcyclePage;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import Utilities.Driver;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public abstract class Base {
    public Base(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    public static WebDriver driver;
    public static HomePage homePage;
    public static MotorcyclePage mtrcyclePage;
    public static Actions actions;
    public static int timeout = 5;
    public static List<WebElement> visibleElementList;
    public static WebElement visibleElement;
    public static WebElement categoryElement;
    public static WebElement clickableElement;
    public static LocalDateTime today;
    public static LocalDateTime hoursAgo;
    public static DateTimeFormatter formatter ;

    public static void initialize() {
        driver = Driver.getDriver();
        mtrcyclePage = new MotorcyclePage();
        homePage = new HomePage();
        actions = new Actions(driver);
        today = LocalDateTime.now();
        formatter= DateTimeFormatter.ofPattern("dd MMMM yyyy", new Locale("tr"));
        hoursAgo = LocalDateTime.now();

    }
}