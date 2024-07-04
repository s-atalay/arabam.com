package Utilities;

import hooks.Base;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import static org.junit.Assert.*;


public class ReusableMethods extends Base {
    public  static void clickWebElement(String textName) {

        WebElement element = driver.findElement(By.xpath("//*[text()='" + textName + "']"));
        for (int i = 0; i < timeout; i++) {
            try {
                element.click();
                return;
            } catch (WebDriverException e) {
                wait(1);
            }
        }
        wait(5);
    }
    public static void hoursDateControl(int date) {
        hoursAgo=today.minusHours(date);
        LocalDate formatedHoursAgo = LocalDate.parse(hoursAgo.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        for (WebElement element: homePage.adDate) {
            LocalDate dateOfAd = LocalDate.parse(element.getText(),formatter);
            if (!dateOfAd.isEqual(formatedHoursAgo)){
            assertTrue(dateOfAd.isAfter(formatedHoursAgo));
            }
        }
    }
    public  static void visibleWebElement(String visibleText) {
        wait(5);
            visibleElementList = driver.findElements(By.xpath("//*[text()='" + visibleText + "']"));
            for (WebElement element:visibleElementList) {
                assertTrue(element.isDisplayed());
            }
    }
    public static void checkTheTitle (String title){
        String actualTitle = driver.getTitle();
        assertEquals(title,actualTitle);
    }
    public static void wait(int secs) {
        try {
            Thread.sleep(1000 * secs);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        } catch (StaleElementReferenceException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void waitAndSendText(WebElement element, String text) {
        element.click();
        for (int i = 0; i < timeout; i++) {
            try {
                element.sendKeys(text);
                return;
            } catch (WebDriverException e) {
                wait(1);
            }
        }
        wait(5);
    }
    public static void searchForText(List<WebElement> webElementList,String text){
        for (WebElement element: webElementList) {
            String searchResult = element.getText().toLowerCase();
            assertTrue(searchResult.contains(text.toLowerCase()));
        }
    }
    public  static void clickableWebElement(String clickableText) {
        wait(5);
        clickableElement = driver.findElement(By.xpath("//*[text()='" + clickableText + "']"));
        assertTrue(clickableElement.isEnabled());
    }

    public static void scrollIntoViewJS(WebElement element) {
        JavascriptExecutor jsexecutor = ((JavascriptExecutor) driver);
        jsexecutor.executeScript("arguments[0].scrollIntoView(true);", element);
    }
    public static void clickWithJS(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }
    public static void selectAnItemFromDropdown(WebElement item, String selectableItem) {
        wait(5);
        Select select = new Select(item);
        for (int i = 0; i < select.getOptions().size(); i++) {
            if (select.getOptions().get(i).getText().equalsIgnoreCase(selectableItem)) {
                select.getOptions().get(i).click();
                break;
            }
        }
    }
    public static void selectCheckBox(WebElement element, boolean check) {
        if (check) {
            if (!element.isSelected()) {
                element.click();
            }
        } else {
            if (element.isSelected()) {
                element.click();
            }
        }
    }
    public static void doubleClick(WebElement element) {
        actions.doubleClick(element).build().perform();
    }
    public static WebElement waitForVisibility(WebElement element, int timeToWaitInSec) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

}
