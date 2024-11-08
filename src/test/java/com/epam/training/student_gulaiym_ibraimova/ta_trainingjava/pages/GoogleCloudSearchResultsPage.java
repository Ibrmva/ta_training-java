package com.epam.training.student_gulaiym_ibraimova.ta_trainingjava.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class GoogleCloudSearchResultsPage extends AbstractPage{

    @FindBy(xpath = "//a[text()='Google Cloud Pricing Calculator']")
    private WebElement pricingCalculatorLink;

    public GoogleCloudPricingCalculatorPage goToPricingCalculator() {
        pricingCalculatorLink.click();
        return new GoogleCloudPricingCalculatorPage(driver);
    }

    public GoogleCloudSearchResultsPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public GoogleCloudSearchResultsPage openPage()
    {
        return this;
    }
}
