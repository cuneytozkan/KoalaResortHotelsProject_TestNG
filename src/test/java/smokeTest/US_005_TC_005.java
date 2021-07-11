package smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KoalaResortPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_005_TC_005 {



    @Test
    public void phoneAramaKutusu() throws InterruptedException {
        KoalaResortPage koalaResortPage=new KoalaResortPage();
        Driver.getDriver().get(ConfigReader.getProperty("kr_url"));
        koalaResortPage.ilkLoginLink.click();

        koalaResortPage.kullaniciAdi.sendKeys(ConfigReader.getProperty("kr_valid_username"));

        koalaResortPage.passwordTextBox.sendKeys(ConfigReader.getProperty("kr_valid_password"));

        koalaResortPage.loginButonu.click();

        koalaResortPage.hotelManagement.click();

        koalaResortPage.hotelList.click();

        koalaResortPage.phoneTextTable.sendKeys(ConfigReader.getProperty("kr_phoneText"));

        koalaResortPage.hotelListSearchBtn.click();

        Thread.sleep(5000);
        Assert.assertEquals(koalaResortPage.nameHotelKontrol.getText(),ConfigReader.getProperty("kr_customer_name"));

        Driver.closeDriver();
    }
}
