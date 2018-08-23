package stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import stqa.pft.addressbook.model.ContactData;

/**
 * Created by prohorova on 10.07.2018.
 */
public class ContactModificationTests extends TestBase{

  @Test(enabled = false)
  public void testContactModification(){
    app.goTo().gotoHomePage();
    app.contact().initContactModification();
    app.contact().fillContactForm(new ContactData(), true);
    app.contact().submitContactModification();
    app.contact().returnToHomePage();

  }
}
