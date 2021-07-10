package tests.us_010;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KoalaResortPage;
import utilities.ConfigReader;
import utilities.Driver;

public class HotelRoomReservationDelete {
    KoalaResortPage koalaResortPage = new KoalaResortPage();
    Actions actions = new Actions(Driver.getDriver());

    @Test

    public void HotelRoomReservationUpdateTest() throws InterruptedException {

        koalaResortPage.koalaResortLogin();


        koalaResortPage.hotelManagement.click();
        koalaResortPage.roomReservationUpdate.click();
        actions.sendKeys(Keys.PAGE_DOWN);
        koalaResortPage.ahmetReservationHotelRoom1.click();
        actions.sendKeys(Keys.TAB);
        Thread.sleep(3000);
        koalaResortPage.ahmetRoomReservationDetails.click();
        Thread.sleep(2000);
        koalaResortPage.reservationUpdateDelete.click();

        actions.sendKeys(Keys.PAGE_UP).perform();
        koalaResortPage.roomReservationUpdate.click();

        System.out.println( koalaResortPage.reservationDeleteActual.isDisplayed());

        Assert.assertFalse(koalaResortPage.reservationDeleteActual.isDisplayed());



    }
}
