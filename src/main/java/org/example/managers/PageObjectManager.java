package org.example.managers;


import org.example.pages.DashboardPage;
import org.example.pages.HomePage;
import org.example.pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {

    //fields of class
    private HomePage homePage;
    private LoginPage loginPage;
    private DashboardPage dashboardPage;
    private WebDriver driver;

    //homePage constructor
    public PageObjectManager(HomePage homePage) {
        this.homePage = homePage;
    }

    //loginPage constructor
    public PageObjectManager(LoginPage loginPage) {
        this.loginPage = loginPage;
    }


    //dashboardPage constructor
    public PageObjectManager(DashboardPage dashboardPage) {
        this.dashboardPage = dashboardPage;
    }


    //driver constructor
    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }


    // manage homePage
    public HomePage getHomePage() {
        return (homePage == null) ? homePage = new HomePage(driver) : homePage;
    }

    //manage loginPage
    public LoginPage getLoginPage() {
        return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;
    }

    //manage dashBoardPage
    public DashboardPage getDashboardPage() {
        return (dashboardPage==null) ? dashboardPage =new DashboardPage(driver): dashboardPage;
    }


}
