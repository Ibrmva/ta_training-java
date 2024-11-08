package com.epam.training.student_gulaiym_ibraimova.ta_trainingjava.pages;

import com.epam.training.student_gulaiym_ibraimova.ta_trainingjava.models.CloudEngine;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GoogleCloudCostSummaryPage extends AbstractPage {

    private String getAttrValue(String attrKey) {
        String xpathToAttrValue = (String.format("//span[text()='%s']/following-sibling::span[1]", attrKey));
        if (isPresent(xpathToAttrValue)) {
            return driver
                    .findElement(By.xpath(xpathToAttrValue))
                    .getText();
        } else return null;
    }

    private boolean isPresent(String xpath) {
        return !driver.findElements(By.xpath(xpath)).isEmpty();
    }

    public GoogleCloudCostSummaryPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public GoogleCloudCostSummaryPage openPage()
    {
        return this;
    }

    public CloudEngine getEstimatedSummary() {
        return new CloudEngine(
                getAttrValue("Number of Instances"),
                getAttrValue("Operating System / Software"),
                getAttrValue("Provisioning Model"),
                null,null,
                getAttrValue("Machine type"),
                getAttrValue("GPU Model"),
                getAttrValue("Number of GPUs"),
                getAttrValue("Local SSD"),
                getAttrValue("Region"),
                getAttrValue("Committed use discount options")
        );
    }
}
