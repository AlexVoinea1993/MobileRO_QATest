package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OfferPage extends BasePage {
    @FindBy(css = ".header-price-box")
    WebElement price;
    @FindBy(xpath = "(//i[@class='gicon-next-white-s icon--s'])[1]")
    WebElement button;
    @FindBy(xpath = "(//button[contains(text(),'Contactaţi vânzătorul')])[1]")
    WebElement contactButton;

    public OfferPage(WebDriver driver) {
        super(driver);
    }

    public boolean isHeaderPriceBoxDisplayed() {
        return price.isDisplayed();
    }

    public String getHeaderPriceBoxText() {
        return price.getText();
    }

    public void clickNextPhotoButton() {
        button.click();
    }

    public void printContactButtonColor() {
        System.out.println(contactButton.getCssValue("background-color"));
    }

    public String getContactButtonColor() {
        return contactButton.getCssValue("background-color");
    }
}
