package training.PFT.addressbook;

import org.testng.annotations.Test;

public class AddNewContactsTests extends TestBase {

  @Test
  public void testAddNewContacts() {

    goToAddNewPage();
    fillContactInfo(new ContactData("Sveta", "\\9", "Levent", "tyev_s", "HomeCoffee", "Minsk street, Minsk city", "I like this game!"));
    enterNewContact();
  }

}
