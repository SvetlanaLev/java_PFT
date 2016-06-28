package training.PFT.addressbook.appmanager;

import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by User on 6/28/2016.
 */
public class ApplicationManager {
   FirefoxDriver wd;

  private ContactsHelper contactsHelper;
  private SessionHelper sessionHelper;
  private NavigationHelper navigationHelper;
  private GroupsHelper groupsHelper;



  public void init() {
    wd = new FirefoxDriver();
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    wd.get("http://localhost/addressbook/");
    contactsHelper = new ContactsHelper(wd);
    sessionHelper = new SessionHelper(wd);
    groupsHelper = new GroupsHelper(wd);
    navigationHelper = new NavigationHelper(wd);
    sessionHelper.login("admin", "secret");
  }



  public void stop() {
    wd.quit();
  }

  public GroupsHelper getGroupsHelper() {
    return groupsHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }

  public ContactsHelper getContactsHelper() {
    return contactsHelper;
  }

 }
