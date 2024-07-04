package Page;

import hooks.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MotorcyclePage extends Base {
    @FindBy(xpath = "(//*[@type=\"text\"])[7]")                                          //Max placeholder under the "Yıl" section
    public WebElement maxYear;
    @FindBy(xpath = "(//*[@type=\"text\"])[6]")                                          //Min placeholder under the "Yıl" section
    public WebElement minYear;
    @FindBy(xpath = "(//*[@class=\"col btn-container\"])[3]")                            //"Ara" button next to "Yıl" section
    public WebElement araButton;
    @FindBy(xpath = "(//*[@type=\"button\"])[6]")                                        //"Yıl" title in the search details menü
    public WebElement yilTitle;

}
