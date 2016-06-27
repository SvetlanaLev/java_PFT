package training.PFT.addressbook.tests;

import org.testng.annotations.Test;
import training.PFT.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {

        app.gotoGroupPage();
        app.initGroupCreation();
        app.fillGroupForm(new GroupData("group1", "group2", "group3"));
        app.submitGroupCreation();
        app.returnToGroupPage();
    }

}
