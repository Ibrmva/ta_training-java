package com.epam.training.student_gulaiym_ibraimova.ta_trainingjava.pages;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class PasteViewPage extends AbstractPage {

    private WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @FindBy(xpath = "//h1")
    public WebElement pasteTitle;

    @FindBy(xpath = "//div[@class='expire']")
    public WebElement pasteExpiration;

    @FindBy(xpath = "//div[@class='left']//a[@class='btn -small h_800']")
    public WebElement pasteSyntaxHighlighting;

    @FindBy(xpath = "//a[@class='btn -small' and text()='raw']")
    public WebElement viewRawButton;

    public PasteViewPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public PasteViewRawPage getPasteDetails() {
        wait.until(ExpectedConditions.visibilityOfAllElements(List.of(
                pasteTitle,
                pasteExpiration,
                pasteSyntaxHighlighting,
                viewRawButton
        )));

        Cookie titleCookie = new Cookie("titleCookie", pasteTitle.getText());
        driver.manage().addCookie(titleCookie);
        Cookie expirationCookie = new Cookie("expirationCookie", pasteExpiration.getText());
        driver.manage().addCookie(expirationCookie);
        Cookie syntaxCookie = new Cookie("syntaxCookie", pasteSyntaxHighlighting.getText());
        driver.manage().addCookie(syntaxCookie);

        viewRawButton.click();
        return new PasteViewRawPage(driver);
    }

    @Override
    public PasteViewPage openPage()
    {
        return this;
    }
}
