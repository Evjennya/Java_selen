package stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import stqa.pft.addressbook.model.ContactData;

/**
 * Created by prohorova on 10.07.2018.
 */
public class ContactModificationTests extends TestBase{

  @Test
  public void testContactModification(){
    app.getNavgationHelper().gotoHomePage();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("test_name", "test_surname", null), false);
    app.getContactHelper().submitContactModification();
    app.getContactHelper().returnToHomePage();
  }
}
