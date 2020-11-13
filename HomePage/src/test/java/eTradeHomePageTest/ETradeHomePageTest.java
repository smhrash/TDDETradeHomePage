package eTradeHomePageTest;

import commonAPI.WebAPI;
import eTradeHomePage.ETradeHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;

public class ETradeHomePageTest extends WebAPI {

    ETradeHomePage eTradeHomePage;

    @BeforeMethod
    public void getInIt(){
        eTradeHomePage = PageFactory.initElements(driver,ETradeHomePage.class);


    }
    @Test(enabled = false)
    public void testInvalidText(){
        eTradeHomePage.doClickOnReferAFriendLink();
        eTradeHomePage.doWriteUserId();
        eTradeHomePage.doWritePassword();
        eTradeHomePage.doClickOnLongOnButton();
        String actualText = eTradeHomePage.invalidText();
        String expectedText = "Sorry! We're having trouble logging you on right now.";
        Assert.assertEquals(actualText,expectedText);

    }
    @Test
    public void testCashManagementPageTitle(){

        eTradeHomePage.doClickOnCashManagementLink();
        String actualTitle = eTradeHomePage.cashManagementPageTitle();
        Assert.assertEquals(actualTitle,"Cash Management | E*TRADE");

    }


}
