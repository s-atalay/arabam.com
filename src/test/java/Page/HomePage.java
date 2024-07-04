package Page;

import Utilities.Driver;
import hooks.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;
public class HomePage extends Base {
    @FindBy(xpath = "//*[@class=\"header__logo\"]")                                            //Arabam.com logo
    public WebElement logo;
    @FindBy(xpath = "//*[@class=\"input\"]")                                                   //Search Box
    public WebElement searchBox;
    @FindBy(xpath = "//*[@class=\"search-button\"]")                                           //Search icon
    public WebElement searchIcon;
    @FindBy(xpath = "//*[@id=\"onetrust-accept-btn-handler\"]")                                //Cookie Allert
    public WebElement cookieAllert;
    @FindBy(xpath = "//*[@class=\"listing-list-item should-hover bg-white\"]")                 //Search Result List
    public List<WebElement> searchResultList;
    @FindBy(xpath = "//*[@class=\"listing-list-item should-hover bg-turbo-yellow\"]")          //Bold result within search results
    public List<WebElement> searchResultListRed;
    @FindBy(xpath = "//*[@class=\"btn-create-advert\"]")                                       //Ücretsiz İlan Ver menu
    public WebElement ücretsizİlanVerDdm;
    @FindBy(xpath = "//*[@class=\"btn btn-yellow\"]")                                          //"Ücretsiz İlan Ver" button under the "Ücretsiz İlan Ver" menu
    public WebElement ücretsizİlanVerButton;
    @FindBy(xpath = "//*[@class=\"btn btn-blue\"]")                                            //"Trink Sat" button under the "Ücretsiz İlan Ver" menu
    public WebElement trinkSatButton;
    @FindBy(xpath = "//*[@class=\"listing-text tac\"]")                                        //Publication date list of the ad
    public List<WebElement> adDate;
    @FindBy(xpath = "//*[@class=\"listing-oldprice no-wrap db tdlt\"]")                        //Old prices in advertisements with decreasing prices
    public List<WebElement> oldPrices;
    @FindBy(xpath = "(//*[@class=\"homePageHeader tac bold\"])[2]")                            //Vitrin title in the body
    public WebElement vitrinTitle;
    @FindBy(xpath = "(//div[@class=\"row\"])[2]/div")                                          //Ad link list under the Vitrin title
    public List<WebElement> vitrinAdLinkList;

    //Webelements for "Giriş Yap" and "Üye Ol" link on the homepage
    public WebElement girisYapUyeOlLink(String webElementText) {
        visibleElement= Driver.getDriver().findElement(By.xpath("//*[@aria-label='" + webElementText + "']"));
        return visibleElement;
    }
    //Webelements for categories on the homepage
    public WebElement categoryName(String categoryName) {
        categoryElement= Driver.getDriver().findElement(By.xpath("(//*[text()='" + categoryName + "'])[2]"));
        return categoryElement;
    }
}
