package org.example.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    final WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(id ="login")
    WebElement loginbtn;


    public void loginClick() {
        loginbtn.click();
    }
    public void navigateToHomePage() {
        driver.get("https://demoqa.com/books");
    }

    public void closeDriver() {
        driver.quit();
    }


}
