package com.epam.training.student_gulaiym_ibraimova.ta_trainingjava.pages;

import com.epam.training.student_gulaiym_ibraimova.ta_trainingjava.models.PastebinRecord;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasteViewRawPage {
    WebDriver driver;

    @FindBy(xpath = "//pre")
    public WebElement rawPaste;

    public PasteViewRawPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public PastebinRecord getCreatedPaste() {
        return new PastebinRecord(
                driver.manage().getCookieNamed("titleCookie").getValue(),
                getRawPaste(),
                driver.manage().getCookieNamed("expirationCookie").getValue(),
                driver.manage().getCookieNamed("syntaxCookie").getValue()
        );
    }

    private String getRawPaste() {
        return rawPaste.getText();
    }
}

