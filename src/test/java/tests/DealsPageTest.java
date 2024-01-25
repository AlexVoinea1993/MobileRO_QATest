package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DealsPage;
import pages.HeaderPage;
import pages.HomePage;
import utils.Constants;
import utils.Errors;

public class DealsPageTest extends BaseTest {

    @Test(testName = "deals page display review")
    public void dealsPageDisplayTest() {
        HomePage homePage = new HomePage(driver);
        homePage.acceptCookiesNotification();
        Assert.assertTrue(homePage.isSearchButtonDisplayed(), Errors.RESULTS_BUTTON_NOT_DISPLAYED);
        Assert.assertEquals(homePage.getResultsButtonColor(), Constants.ORANGE_COLOR, Errors.RESULTS_BUTTON_COLOR_NOT_DISPLAYED);
        HeaderPage headerPage = new HeaderPage(driver);
        Assert.assertTrue(headerPage.isPageSloganTextDisplayed(), Errors.PAGE_SLOGAN_TEXT_NOT_DISPLAYED);
        Assert.assertEquals(headerPage.getPageSloganDisplayedText(), Constants.PAGE_SLOGAN_TEST);
        Assert.assertEquals(homePage.getNumberOfVehicleTabs(), 4, Errors.NUMBER_OF_VEHICLE_TABS_NOT_CORRECT);
        homePage.clickCarBrandButton();
        homePage.clickCarModelButton();
        homePage.clickMaxPriceButton();
        homePage.clickFirstRegistrationButton();
        homePage.clickMaxMileageButton();
        homePage.clickShowResultsButton();
        DealsPage dealsPage = new DealsPage(driver);
        Assert.assertTrue(dealsPage.isCarOfferDisplayed(), Errors.CAR_OFFER_NOT_DISPLAYED);
        dealsPage.clickCarOffer();
    }
}
