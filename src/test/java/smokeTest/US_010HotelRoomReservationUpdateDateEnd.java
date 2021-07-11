package smokeTest;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KoalaResortPage;
import utilities.Driver;

public class US_010HotelRoomReservationUpdateDateEnd {



    @Test

    public void HotelRoomReservationUpdateTest() throws InterruptedException {

        KoalaResortPage koalaResortPage=new KoalaResortPage();
        Actions actions=new Actions(Driver.getDriver());
        koalaResortPage.koalaResortLogin();

        koalaResortPage.hotelManagement.click();
        koalaResortPage.roomReservationUpdate.click();
        koalaResortPage.ahmetReservationHotelRoom1.click();
        actions.sendKeys(Keys.TAB);
        Thread.sleep(3000);
        koalaResortPage.ahmetRoomReservationDetails.click();
        koalaResortPage.reservationUpdateDateEnd.click();
        koalaResortPage.reservationUpdateDay.click();
        Thread.sleep(2000);
        koalaResortPage.reservationUpdateSave.click();

        actions.sendKeys(Keys.PAGE_UP).perform();
        koalaResortPage.roomReservationUpdate.click();

        Assert.assertEquals(koalaResortPage.reservationUpdateActualDateEnd.getText(),"11.07.2021");


        Driver.closeDriver();
















    }

}
