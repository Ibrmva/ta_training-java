package com.epam.training.student_gulaiym_ibraimova.ta_trainingjava.pages;

import com.epam.training.student_gulaiym_ibraimova.ta_trainingjava.configuration.constants;
import com.epam.training.student_gulaiym_ibraimova.ta_trainingjava.models.PastebinRecord;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasteCreatePage extends AbstractPage implements constants {

    @FindBy(id = "postform-text")
    private WebElement inputBody;

    @FindBy(id = "postform-name")
    private WebElement inputTitle;

    @FindBy(id = "select2-postform-expiration-container")
    private WebElement expirationDropdown;

    @FindBy(id = "select2-postform-format-container")
    private WebElement syntaxHighlightingDropdown;

    @FindBy(xpath = "//button[@class='btn -big']")
    private WebElement createButton;

    public PasteCreatePage(WebDriver driver){
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public PasteCreatePage openPage()
    {
        driver.navigate().to(PASTEBIN_BASE_URL);
        return this;
    }

    public PasteViewPage submitPaste(PastebinRecord inputPaste) {
        inputBody.sendKeys(inputPaste.getBody());
        inputTitle.sendKeys(inputPaste.getTitle());

        expirationDropdown.click();
        WebElement expirationOption = driver
                .findElement(By
                        .xpath("//li[contains(translate(text(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '"+ inputPaste.getExpiration() +"')]"));
        expirationOption.click();

        if (inputPaste.hasSyntax()) {
            syntaxHighlightingDropdown.click();
            WebElement syntaxOption = driver
                    .findElement(By.xpath("//li[text()='" + inputPaste.getSyntax() + "']"));
            syntaxOption.click();
        }
        createButton.click();
        return new PasteViewPage(driver);
    }
}

