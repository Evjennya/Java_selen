package stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import stqa.pft.addressbook.model.ContactData;
import stqa.pft.addressbook.appmanager.ContactHelper;

/**
 * Created by prohorova on 10.07.2018.
 */
public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation(){
    app.getNavgationHelper().gotoHomePage();
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("test_name", "test_surname", "test1"), true);
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnToHomePage();
  }
}
