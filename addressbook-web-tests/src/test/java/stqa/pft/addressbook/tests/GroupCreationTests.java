package stqa.pft.addressbook.tests;


import org.testng.annotations.Test;
import stqa.pft.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase{

  @Test
  public void testGroupCreation() {

    app.getNavgationHelper().gotoGroupPage();
    app.getGroupHelper().createGroup(new GroupData("test1", null, null));
  }

}
