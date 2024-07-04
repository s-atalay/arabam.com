package stepdefinitions;

import Utilities.ConfigReader;
import Utilities.ReusableMethods;
import hooks.Base;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import static Utilities.Driver.*;
import static Utilities.ReusableMethods.*;
import static org.junit.Assert.*;

public class Stepdefinitions extends Base {
    @Given("Open browser and go to {string}")
    public void open_browser_and_go_to(String URL) {
        getDriver().get(ConfigReader.getProperty(URL));
        ReusableMethods.wait(5);
        try {
            if (homePage.cookieAllert.isDisplayed() && homePage.cookieAllert.isEnabled()) {
                homePage.cookieAllert.click();
            }
        } catch (Exception e) {
        }
    }
    @Given("Verify that the logo is visible")
    public void verify_that_the_logo_is_visible() {
        assertTrue(homePage.logo.isEnabled());
    }
    @Given("Verify that the search box is visible")
    public void verify_that_the_search_box_is_visible() {
        homePage.searchBox.isDisplayed();
    }
    @Given("Verify that the search icon is visible")
    public void verify_that_the_search_icon_is_visible() {
        assertTrue(homePage.searchIcon.isDisplayed());
    }
    @Given("Verify that the {string} is visible")
    public void verify_that_the_is_visible(String webElementText) {
        visibleWebElement(webElementText);
    }
    @Given("Click on the logo")
    public void click_on_the_logo() {
      homePage.logo.click();
    }
    @Given("Verify that the {string} page is opened")
    public void verify_that_the_page_is_opened(String pageTitle) {
        checkTheTitle(pageTitle);
    }
    @Given("Click on the search box")
    public void click_on_the_search_box() {
       homePage.searchBox.click();
    }
    @Given("Type {string} into the search box")
    public void type_into_the_search_box(String searchText) {
       waitAndSendText(homePage.searchBox,searchText);
    }
    @Given("Click on the search icon")
    public void click_on_the_search_icon() {
        homePage.searchIcon.click();
    }
    @Given("Verify that {string} search results are opened")
    public void verify_that_search_results_are_opened(String searchText) {
        homePage.searchResultList.addAll(homePage.searchResultListRed);
        searchForText(homePage.searchResultList,searchText);
    }
    @Given("Verify that the {string} button is visible")
    public void verify_that_the_button_is_visible(String buttonText) {
        assertTrue(homePage.girisYapUyeOlLink(buttonText).isDisplayed());
        assertTrue(homePage.girisYapUyeOlLink(buttonText).isEnabled());
    }
    @Given("Click on the {string} button")
    public void click_on_the_button(String buttonText) {
        homePage.girisYapUyeOlLink(buttonText).click();
    }
    @Given("Move the mouse over the Ücretsiz İlan Ver button")
    public void move_the_mouse_over_the_ücretsiz_ilan_ver_button() {
        actions.moveToElement(homePage.ücretsizİlanVerDdm).perform();
        ReusableMethods.wait(5);
    }
    @Given("Verify that the Ücretsiz İlan Ver button and Trink Sat button are visible")
    public void verify_that_the_ücretsiz_ilan_ver_button_and_trink_sat_button_are_visible() {
        assertTrue(homePage.ücretsizİlanVerButton.isDisplayed());
        assertTrue(homePage.trinkSatButton.isDisplayed());
    }
    @Given("Verify that the Ücretsiz İlan Ver button is visible")
    public void verify_that_the_ücretsiz_ilan_ver_button_is_visible() {
        assertTrue(homePage.ücretsizİlanVerDdm.isDisplayed());
    }
    @Given("Click on the {string} title")
    public void click_on_the_title(String titleText) {
       clickWebElement(titleText);
    }
    @Given("Verify that posting dates are from the last {int} hours")
    public void verify_that_posting_dates_are_from_the_last_hours(int date) {
        hoursDateControl(date);
    }
    @Given("Verify that ads with {string} is visible")
    public void verify_that_ads_with_is_visible(String acilIconText) {
        visibleWebElement(acilIconText);
    }
    @Given("Verify that listings with reduced prices have appeared")
    public void verify_that_listings_with_reduced_prices_have_appeared() {
        for (WebElement element:homePage.oldPrices) {
            assertTrue(element.isDisplayed());
        }
    }
    @Given("Verify that the Vitrin title is visible")
    public void verify_that_the_vitrin_title_is_visible() {
        assertTrue(homePage.vitrinTitle.isDisplayed());
    }
    @Given("Verify that {int} ad links is visible and clickable under the Vitrin title")
    public void verify_that_ad_links_is_visible_and_clickable_under_the_vitrin_title(int count) {
        assertEquals(count,homePage.vitrinAdLinkList.size());
    }
    @Given("Click on the {string} category")
    public void click_on_the_category(String categoryName) {
        homePage.categoryName(categoryName).click();
    }
    @Given("Enter {string} for min year and {string} for max year")
    public void enter_for_min_year_and_for_max_year(String min, String max) {
        waitAndSendText(mtrcyclePage.minYear,min);
        ReusableMethods.wait(5);
        waitAndSendText(mtrcyclePage.maxYear,max);
    }
    @Given("Click on the Ara button")
    public void click_on_the_ara_button() {
        mtrcyclePage.araButton.click();
    }
    @Given("Verify that {string} error is visible")
    public void verify_that_error_is_visible(String errorMessage) {
        visibleWebElement(errorMessage);
    }
    @Given("Click on the Yıl title")
    public void click_on_the_yil_title() {
        ReusableMethods.wait(5);
        mtrcyclePage.yilTitle.click();
    }
}
