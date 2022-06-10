package com.accesshq.models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Toolbar {

    private WebElement header;

    public Toolbar(WebElement header) {
        this.header = header;
    }

    public void clickContact() {
        header.findElement(By.cssSelector("[aria-label=contact]")).click();
    }

    public void clickSubmit() {

        header.findElement(By.cssSelector("[aria-label=submit]")).click();
//        List<WebElement> buttons = header.findElements(By.cssSelector("btnPrimary"));
//        for (WebElement button: buttons) {
//            if (button.getText().equalsIgnoreCase("submit")) {
//                button.click();
//                break;
//            }
//        }
    }
}
