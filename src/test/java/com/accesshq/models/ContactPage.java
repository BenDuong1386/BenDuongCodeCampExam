package com.accesshq.models;

import org.openqa.selenium.WebDriver;

public class ContactPage extends ModernForm {

    Toolbar toolbar;
    public ContactPage(WebDriver driver) {
        super(driver);
    }

    public void setToolbar(Toolbar toolbar) {
        this.toolbar = toolbar;
    }

    public void loadContactPage() {
        toolbar.clickContact();
    }

    public void submitForm() {
        toolbar.clickSubmit();
    }
}
