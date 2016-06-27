package training.PFT.addressbook.tests;

import org.testng.annotations.Test;
import training.PFT.addressbook.model.ContactData;

public class AddNewContactsTests extends TestBase {

  @Test
  public void testAddNewContacts() {

    app.getNavigationHelper().goToAddNewPage();
    app.getContactsHelper().fillContactInfo(new ContactData("Sveta", "\\9", "Levent", "tyev_s", "HomeCoffee", "Minsk street, Minsk city", "I like this game!"));
    app.getNavigationHelper().enterNewContact();
  }

}
