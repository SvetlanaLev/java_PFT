package training.PFT.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import training.PFT.addressbook.model.ContactData;

/**
 * Created by User on 6/28/2016.
 */
public class ContactsHelper {
  private FirefoxDriver wd;

  public ContactsHelper(FirefoxDriver wd) {
    this.wd = wd;
  }

  public void fillContactInfo(ContactData contactData) {
  wd.findElement(By.name("firstname")).click();
  wd.findElement(By.name("firstname")).clear();
  wd.findElement(By.name("firstname")).sendKeys(contactData.getFirstname());
  wd.findElement(By.name("middlename")).click();
  wd.findElement(By.name("middlename")).sendKeys(contactData.getMiddlename());
  wd.findElement(By.name("lastname")).click();
  wd.findElement(By.name("lastname")).clear();
  wd.findElement(By.name("lastname")).sendKeys(contactData.getLastname());
  wd.findElement(By.name("nickname")).click();
  wd.findElement(By.name("nickname")).clear();
  wd.findElement(By.name("nickname")).sendKeys(contactData.getNickname());
  wd.findElement(By.name("company")).click();
  wd.findElement(By.name("company")).clear();
  wd.findElement(By.name("company")).sendKeys(contactData.getCompany());
  wd.findElement(By.name("address")).click();
  wd.findElement(By.name("address")).clear();
  wd.findElement(By.name("address")).sendKeys(contactData.getAddress());
  wd.findElement(By.name("email2")).click();
  wd.findElement(By.name("notes")).click();
  wd.findElement(By.name("notes")).clear();
  wd.findElement(By.name("notes")).sendKeys(contactData.getNotes());
}
}
