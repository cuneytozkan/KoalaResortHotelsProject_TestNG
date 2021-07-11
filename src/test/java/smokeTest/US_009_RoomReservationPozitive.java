package smokeTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.KoalaResortPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_009_RoomReservationPozitive {


    @Test
    public void roomPozitif() throws InterruptedException {
        KoalaResortPage koalaResortPage=new KoalaResortPage();
        Driver.getDriver().get(ConfigReader.getProperty("kr_url"));
        koalaResortPage.ilkLoginLink.click();

        koalaResortPage.kullaniciAdi.sendKeys(ConfigReader.getProperty("kr_valid_username"));

        koalaResortPage.passwordTextBox.sendKeys(ConfigReader.getProperty("kr_valid_password"));

        koalaResortPage.loginButonu.click();

        koalaResortPage.hotelManagement.click();
        koalaResortPage.roomReservations.click();
        koalaResortPage.addRoomReservation.click();

        WebElement dropdownIDUser=koalaResortPage.IDUser;
        Select dropdownbox = new Select(dropdownIDUser);
        dropdownbox.selectByVisibleText("username");

        WebElement dropdownIDHotelRoom=koalaResortPage.IDHotelRoom;
        Select dropdownRoom = new Select(dropdownIDHotelRoom);
        dropdownRoom.selectByIndex(2);

       koalaResortPage.Price.click();
       koalaResortPage.Price.sendKeys(ConfigReader.getProperty("kr_price"));
       Thread.sleep(500);

        koalaResortPage.DateStart.click();
        koalaResortPage.DateStart.sendKeys(ConfigReader.getProperty("kr_DateStart"));
        Thread.sleep(500);

        koalaResortPage.DateEnd.click();
        koalaResortPage.DateEnd.sendKeys(ConfigReader.getProperty("kr_DateEnd"));
        Thread.sleep(500);

        koalaResortPage.AdultAmount.click();
        koalaResortPage.AdultAmount.sendKeys(ConfigReader.getProperty("kr_maxAdult"));
        Thread.sleep(500);


       koalaResortPage.ChildrenAmount.click();
       koalaResortPage.ChildrenAmount.sendKeys(ConfigReader.getProperty("kr_maxChild"));
        Thread.sleep(500);

       koalaResortPage.ContactNameSurname.click();
       koalaResortPage.ContactNameSurname.sendKeys(ConfigReader.getProperty("kr_userName"));
        Thread.sleep(500);

       koalaResortPage.ContactPhone.click();
       koalaResortPage.ContactPhone.sendKeys(ConfigReader.getProperty("kr_phoneText"));
        Thread.sleep(500);


       koalaResortPage.ContactEmail.click();
       koalaResortPage.ContactEmail.sendKeys(ConfigReader.getProperty("kr_emailText"));
        Thread.sleep(500);

       koalaResortPage.Notes.click();
       koalaResortPage.Notes.sendKeys(ConfigReader.getProperty("kr_description"));

       koalaResortPage.saveButonu.click();

       Driver.closeDriver();

    }
}
