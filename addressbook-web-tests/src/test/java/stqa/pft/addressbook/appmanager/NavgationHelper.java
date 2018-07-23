package stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by prohorova on 09.06.2018.
 */
public class NavgationHelper extends HelperBase {


  public NavgationHelper(WebDriver wd) {
    super(wd);

  }

  public void groupPage() {
    if (isElementPresent(By.tagName("h1")) && wd.findElement(By.tagName("h1")).getText().equals("Groups") && isElementPresent(By.name("new"))) {
      return;

    }
      click(By.linkText("groups"));

  }

  public void gotoHomePage() {
    if (isElementPresent(By.id("maintable"))) {
      return;
    }
    click(By.linkText("home"));
  }
}
