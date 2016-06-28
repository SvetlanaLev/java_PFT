package training.PFT.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by User on 6/28/2016.
 */
public class NavigationHelper extends HelperBase{

  public NavigationHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void gotoGroupPage() {
    click(By.linkText("groups"));
  }

  public void goToAddNewPage() {
    click(By.linkText("add new"));
  }

  public void enterNewContact() {
    click(By.xpath("//div[@id='content']/form/input[21]"));
  }
}
