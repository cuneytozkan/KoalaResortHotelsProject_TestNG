package tests.us_010;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KoalaResortPage;
import utilities.ConfigReader;
import utilities.Driver;

public class HotelRoomReservationChangeHotelRoom {

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
        WebElement dropdownHotelRoom= koalaResortPage.reservationRoomChangeHotelRoom;
        Select dropdownBox= new Select(koalaResortPage.reservationRoomChangeHotelRoom);
        dropdownBox.selectByVisibleText("Krystel");
        koalaResortPage.reservationUpdateSave.click();

        actions.sendKeys(Keys.PAGE_UP).perform();
        koalaResortPage.roomReservationUpdate.click();

        Assert.assertEquals(koalaResortPage.ahmetReservationHotelRoom.getText(),"Krystel");






    }
}

