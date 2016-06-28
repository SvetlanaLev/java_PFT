package training.PFT.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import training.PFT.addressbook.model.ContactData;

/**
 * Created by User on 6/28/2016.
 */
public class ContactsHelper extends HelperBase {
  private FirefoxDriver wd;

  public ContactsHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void fillContactInfo(ContactData contactData) {
    type(By.name("firstname"), contactData.getFirstname());
    type(By.name("middlename"), contactData.getMiddlename());
    type(By.name("lastname"), contactData.getLastname());
    type(By.name("nickname"), contactData.getNickname());
    type(By.name("company"), contactData.getCompany());
    type(By.name("address"), contactData.getAddress());
    click(By.name("email2"));
    type(By.name("notes"), contactData.getNotes());
  }
}
