package ObjectPage.BET9;

import ObjectPage.HomePage;
import element.common.Image;
import org.testng.Assert;

public class BET9Page extends HomePage {
    public Image imgLogo = Image.xpath("//img[@alt='Header Logo']");

    @Override
    public void verifyLogoDisplay() {
        Assert.assertTrue(imgLogo.isDisplayed(),"FAILED! 9Bet Mainsite does not exist");
    }
}
