package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.When;
import org.example.managers.PageObjectManager;
import org.example.pages.DashboardPage;
import org.example.pages.HomePage;
import org.example.pages.LoginPage;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.util.concurrent.TimeUnit;

public class Steps {
    WebDriver driver;
    HomePage homePage;
    DashboardPage dashboardPage;
    LoginPage loginPage;
    PageObjectManager pageObjectManager;

    @Given("^user is on Homepage$")
    public void userIsOnHomepage() {
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "C:\\Disk D\\Java-Selenium\\java__selenium\\Selenium_SDA\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(ops);
        Proxy proxy = new Proxy();
        proxy.setHttpProxy("myhttpproxy:3337");
        ops.setCapability("proxy", proxy);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        pageObjectManager = new PageObjectManager(driver);
        homePage = pageObjectManager.getHomePage();
        homePage.navigateToHomePage();
        Assertions.assertEquals("DEMOQA", driver.getTitle());

    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        homePage.loginClick();
    }

    @And("^user enter userName$")
    public void userEnterUserName() {
        loginPage = pageObjectManager.getLoginPage();
        loginPage.enterUserName("gunjankaushik");
    }

    @And("user enter password")
    public void userEnterPassword() {
        loginPage.enterPassword("Password@123");

    }

    @And("^user logs in$")
    public void userLogsIn() {
        loginPage.waitForSecond();
        loginPage.clickLogin();

    }

    @And("correct user is logged in")
    public void correct_user_is_logged_in() {
        // Write code here that turns the phrase above into concrete actions
        dashboardPage = pageObjectManager.getDashboardPage();
        dashboardPage.CurrentUser("gunjankaushik");
        homePage.closeDriver();
    }




}
