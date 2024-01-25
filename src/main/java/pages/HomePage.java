package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HomePage extends BasePage {
    @FindBy(xpath = "//button[contains(text(),'De acord')]")
    WebElement accept;
    @FindBy(css = ".search-btn")
    WebElement resultsButton;
    @FindBy(css = ".g-col-3")
    List<WebElement> vehicleTabs;
    @FindBy(css = "#makeModelVariant1Make")
    WebElement carBrand;
    @FindBy(css = "#makeModelVariant1Model")
    WebElement carModel;
    @FindBy(css = "#maxPrice")
    WebElement maxPrice;
    @FindBy(css = "#minFirstRegistration")
    WebElement firstRegistration;
    @FindBy(xpath = "//select[@id='maxMileage']")
    WebElement maxMileage;
    @FindBy(css = ".js-show-results")
    WebElement showResults;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void acceptCookiesNotification() {
        accept.click();
    }

    public boolean isSearchButtonDisplayed() {
        return resultsButton.isDisplayed();
    }

    public void printResultsButtonColor() {
        System.out.println(resultsButton.getCssValue("background-color"));
    }

    public String getResultsButtonColor() {
        return resultsButton.getCssValue("background-color");
    }

    public int getNumberOfVehicleTabs() {
        return vehicleTabs.size();
    }

    public void clickCarBrandButton() {
        carBrand.click();
        Select select = new Select(carBrand);
        select.selectByValue("23600");
    }

    public void clickCarModelButton() {
        carModel.click();
        Select select = new Select(carModel);
        select.selectByValue("20");
    }

    public void clickMaxPriceButton() {
        maxPrice.click();
        Select select = new Select(maxPrice);
        select.selectByValue("25000");
    }

    public void clickFirstRegistrationButton() {
        firstRegistration.click();
        Select select = new Select(firstRegistration);
        select.selectByValue("2016");
    }

    public void clickMaxMileageButton() {
        maxMileage.click();
        Select select = new Select(maxMileage);
        select.selectByValue("100000");
    }

    public void clickShowResultsButton() {
        showResults.click();
    }
}
