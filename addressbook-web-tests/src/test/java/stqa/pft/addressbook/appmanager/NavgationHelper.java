package stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by prohorova on 09.06.2018.
 */
public class NavgationHelper {
 privat FirefoxDriver wd;

  public NavgationHelper(FirefoxDriver wd) {
    this.wd =

  }

  public void gotoGroupPage() {
    wd.findElement(By.linkText("groups")).click();
  }
}
