package stqa.pft.addressbook.tests;

import org.testng.annotations.Test;


public class GroupDeletionTests extends TestBase {


  @Test
  public void testGroupDeletion() {
    app.getNavgationHelper().gotoGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deletSelectedGroup();
    app.getGroupHelper().returnToGroupPage();
  }


}
