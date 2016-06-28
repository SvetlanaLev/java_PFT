package training.PFT.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import training.PFT.addressbook.model.GroupData;

/**
 * Created by User on 6/28/2016.
 */
public class GroupsHelper extends HelperBase{

  public GroupsHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void returnToGroupPage() {
      click(By.linkText("group page"));
  }

  public void submitGroupCreation() {
    click(By.name("submit"));
  }

  public void fillGroupForm(GroupData groupData) {
      type(By.name("group_name"), groupData.getName());
      type(By.name("group_header"),groupData.getHeader());
      type(By.name("group_footer"), groupData.getFooter());

  }

  public void initGroupCreation() {
      click(By.name("new"));
  }

  public void deleteSelectedGroup() {
      click(By.name("delete"));
  }

  public void selectGroup() {
    click(By.name("selected[]"));
  }
}
