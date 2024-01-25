package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPage extends BasePage {
    @FindBy(css = ".claim.hidden-s")
    WebElement pageSlogan;

    public HeaderPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageSloganTextDisplayed() {
        return pageSlogan.isDisplayed();
    }

    public String getPageSloganDisplayedText() {
        return pageSlogan.getText();
    }
}
