package com.epam.training.student_gulaiym_ibraimova.ta_trainingjava.pages;

import com.epam.training.student_gulaiym_ibraimova.ta_trainingjava.util.TestDataReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.epam.training.student_gulaiym_ibraimova.ta_trainingjava.configuration.constants.GOOGLE_CLOUD_BASE_URL;


public class GoogleCloudHomePage extends AbstractPage {

    private static final String TESTDATA_CLOUD_ENGINE_INITIAL_QUERY = "testdata.cloudEngine.initialQuery";

    @FindBy(xpath = "//div[@class='YSM5S']")
    private WebElement searchButton;

    @FindBy(xpath = "//input[@id='i4']")
    private WebElement searchInputField;

    @FindBy(xpath = "//i[contains(@class, 'google-material-icons PETVs') and @role='button']")
    private WebElement searchSubmitButton;

    public GoogleCloudHomePage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public GoogleCloudSearchResultsPage searchForPlatformCalculator() {
        searchButton.click();
        searchInputField.sendKeys(TestDataReader.getTestData(TESTDATA_CLOUD_ENGINE_INITIAL_QUERY));
        searchSubmitButton.click();

        return new GoogleCloudSearchResultsPage(driver);
    }

    @Override
    public GoogleCloudHomePage openPage()
    {
        driver.navigate().to(GOOGLE_CLOUD_BASE_URL);
        return this;
    }
}

