package stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import stqa.pft.addressbook.model.ContactData;

/**
 * Created by prohorova on 10.07.2018.
 */
public class ContactCreationTests extends TestBase {

  @Test(enabled = false)
  public void testContactCreation(){
    app.goTo().gotoHomePage();
    app.contact().initContactCreation();
    app.contact().fillContactForm(new ContactData(), true);
    app.contact().submitContactCreation();
    app.contact().returnToHomePage();
  }
}
