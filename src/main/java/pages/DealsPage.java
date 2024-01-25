package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DealsPage extends BasePage {
    @FindBy(xpath = "(//div[@class='g-row js-ad-entry'])[4]")
    WebElement carOffer;

    public DealsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isCarOfferDisplayed() {
        scrollToElement(carOffer);
        return carOffer.isDisplayed();
    }

    public void clickCarOffer() {
        carOffer.click();
    }
}
