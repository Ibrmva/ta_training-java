package com.epam.training.student_gulaiym_ibraimova.ta_trainingjava.pages;

import com.epam.training.student_gulaiym_ibraimova.ta_trainingjava.models.CloudEngine;
import com.epam.training.student_gulaiym_ibraimova.ta_trainingjava.util.DropdownUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;

public class GoogleCloudPricingCalculatorPage extends AbstractPage {

    private WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    DropdownUtils dropdownUtils = new DropdownUtils(driver);

    @FindBy(xpath = "//span[text()='Add to estimate']")
    private WebElement addToEstimateButton;

    @FindBy(xpath = "//h2[text()='Compute Engine']")
    private WebElement computeEngineButton;

    @FindBy(xpath = "//div[text()='Number of Instances']/parent::div/parent::div//input")
    private WebElement instanceQuantityInput;

    @FindBy(xpath = "//div[text()='Add GPUs']/parent::div/preceding-sibling::div//button")
    private WebElement addGPUsButton;

    @FindBy(xpath = "//span[text()='Share']")
    private WebElement shareButton;

    @FindBy(xpath = "//span[@class='close']")
    private WebElement closeChatBotButton;

    @FindBy(xpath = "//a[text()='Open estimate summary']")
    private WebElement openEstimateSummaryButton;

    private void setCommittedUsage(String textToMatch) {
        String optionXpath = String.format("//label[text()='%s']/parent::div", textToMatch);
        driver.findElement(By.xpath(optionXpath)).click();
    }

    private void setProvisioningModel(String textToMatch) {
        String optionXpath = String.format("(//div[.//label[text()='%s']])[last()]", textToMatch);
        driver.findElement(By.xpath(optionXpath)).click();
    }

    private boolean isPresent(String xpath) {
        return !driver.findElements(By.xpath(xpath)).isEmpty();
    }

    public GoogleCloudPricingCalculatorPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public GoogleCloudPricingCalculatorPage openPage()
    {
        return this;
    }

    public GoogleCloudPricingCalculatorPage submitParameters(CloudEngine testSpecs) throws InterruptedException {
        addToEstimateButton.click();
        computeEngineButton.click();
        instanceQuantityInput.clear();
        instanceQuantityInput.sendKeys(testSpecs.getNumberOfInstances());

        DropdownUtils.setDropdownValue("Operating System / Software", testSpecs.getOperatingSystem());
        setProvisioningModel(testSpecs.getProvisioningModel());
        DropdownUtils.setDropdownValue("Machine Family", testSpecs.getMachineFamily());
        DropdownUtils.setDropdownValue("Series", testSpecs.getSeries());
        DropdownUtils.setDropdownValue("Machine type", testSpecs.getMachineType());
        if (addGPUsButton.isEnabled()) addGPUsButton.click();
        DropdownUtils.setDropdownValue("GPU Model", testSpecs.getGPUtype());
        if (isPresent("(//div[.//span/span[text()='Number of GPUs']])[last()]")) {
            DropdownUtils.setDropdownValue("Number of GPUs", testSpecs.getNumberOfGPUs());
        }
        DropdownUtils.setDropdownValue("Local SSD", testSpecs.getLocalSSD());
        DropdownUtils.setDropdownValue("Region", testSpecs.getRegion());
        setCommittedUsage(testSpecs.getCommitedUsage());
        Thread.sleep(2_000);
        return this;
    }

    public GoogleCloudCostSummaryPage goToEstimateSummaryPage() {
        closeChatBotButton.click();
        shareButton.click();
        openEstimateSummaryButton.click();
        wait.until(numberOfWindowsToBe(2));
        String currentTab = driver.getWindowHandle();
        for (String tab : driver.getWindowHandles()) {
            if (!tab.equals(currentTab)) {
                driver.switchTo().window(tab);
                break;
            }
        }
        return new GoogleCloudCostSummaryPage(driver);
    }
}

