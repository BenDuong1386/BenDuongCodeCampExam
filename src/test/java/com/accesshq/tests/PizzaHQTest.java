package com.accesshq.tests;

import com.accesshq.models.ContactPage;
import com.accesshq.models.Toolbar;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PizzaHQTest {

    WebDriver driver;
    public PizzaHQTest() {
    }

    @BeforeEach
    public void Setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://d3eczsrdruv8hn.cloudfront.net/#/");
    }

    @Test
    public void NavigateToContactTest() {
        ContactPage contactPage = new ContactPage(driver);
        contactPage.setToolbar(new Toolbar(driver.findElement((By.className("v-toolbar__items")))));
        contactPage.loadContactPage();;
    }

    @Test
    public void clickSubmit() {

        // Arrange
        ContactPage contactPage = new ContactPage(driver);
        contactPage.setToolbar(new Toolbar(driver.findElement((By.className("v-toolbar__items")))));
        contactPage.loadContactPage();;
        new WebDriverWait(driver,750).
                until(ExpectedConditions.visibilityOf(driver.findElement(By.className("v-card__text"))));
        contactPage.submitForm();


        // Act
        // TODO:
        driver.findElement((By.className("v-card__text"))).click();

        // Assert

    }
}
