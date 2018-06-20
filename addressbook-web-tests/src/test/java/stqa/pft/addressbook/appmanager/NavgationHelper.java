package stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by prohorova on 09.06.2018.
 */
public class NavgationHelper extends HelperBase{


  public NavgationHelper(FirefoxDriver wd) {
    super(wd);

  }

  public void gotoGroupPage() {
    click(By.linkText("groups"));
  }
}
