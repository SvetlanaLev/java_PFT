package training.PFT.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by User on 6/28/2016.
 */
public class NavigationHelper {
  private FirefoxDriver wd;

  public NavigationHelper(FirefoxDriver wd) {
    this.wd = wd;
  }

  public void gotoGroupPage() {
    wd.findElement(By.linkText("groups")).click();
  }

  public void goToAddNewPage() {
    wd.findElement(By.linkText("add new")).click();
  }

  public void enterNewContact() {
    wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
  }
}
