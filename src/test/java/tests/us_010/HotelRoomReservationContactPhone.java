package tests.us_010;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KoalaResortPage;
import utilities.ConfigReader;
import utilities.Driver;

public class HotelRoomReservationContactPhone {

    KoalaResortPage koalaResortPage = new KoalaResortPage();
    Actions actions = new Actions(Driver.getDriver());

    @Test

    public void HotelRoomReservationUpdateTest() throws InterruptedException {

        koalaResortPage.koalaResortLogin();

        koalaResortPage.hotelManagement.click();
        koalaResortPage.roomReservationUpdate.click();
        koalaResortPage.ahmetReservationHotelRoom1.click();
        actions.sendKeys(Keys.TAB);
        Thread.sleep(3000);
        koalaResortPage.ahmetRoomReservationDetails.click();
        koalaResortPage.reservationRoomContactPhone.clear();
        koalaResortPage.reservationRoomContactPhone.sendKeys(ConfigReader.getProperty("kr_contact_phone_update"));
        Thread.sleep(2000);
        koalaResortPage.reservationUpdateSave.click();

        actions.sendKeys(Keys.PAGE_UP).perform();
        koalaResortPage.roomReservationUpdate.click();

        Assert.assertEquals(koalaResortPage.reservationUpdateActualContactPhone.getText(),(ConfigReader.getProperty("kr_contact_phone_update")));







    }
}
