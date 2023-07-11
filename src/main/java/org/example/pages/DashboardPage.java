package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
    final WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath="//label[@id=\"userName-value\"]")
    WebElement currentUser;


    public  void CurrentUser(String user) {

        if (currentUser.getText().equalsIgnoreCase(user)) {
            System.out.println("Correct username:" + currentUser.getText());

        } else {
            System.out.println("Incorrect username... " );

        }

    }


}
