package stqa.pft.addressbook.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;


import java.util.Objects;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.remote.BrowserType.FIREFOX;


public class ApplicationManager {
  WebDriver wd;

  private SessionHelper sessionHelper;
  private NavgationHelper navgationHelper;
  private GroupHelper groupHelper;
  private ContactHelper contactHelper;
  private String browser;


  public ApplicationManager(String browser){

    this.browser = browser;
  }



  public void init() {
    System.setProperty("webdriver.chrome.driver", "/Users/prohorova/Tools/chromedriver");
    if (Objects.equals(browser, BrowserType.FIREFOX)){
      wd = new FirefoxDriver();
    } else if (Objects.equals(browser, BrowserType.GOOGLECHROME)){
      wd = new ChromeDriver();
    } else if (Objects.equals(browser, BrowserType.SAFARI)) {
      wd = new SafariDriver();
    }

    wd.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    wd.get("http://localhost/addressbook");
    groupHelper = new GroupHelper(wd);
    contactHelper = new ContactHelper(wd);
    navgationHelper = new NavgationHelper(wd);
    sessionHelper = new SessionHelper(wd);
    sessionHelper.login("admin", "secret");
  }


  public void stop() {
    wd.quit();
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public ContactHelper getContactHelper() { return contactHelper;}

  public NavgationHelper getNavgationHelper() {
    return navgationHelper;
  }
}
