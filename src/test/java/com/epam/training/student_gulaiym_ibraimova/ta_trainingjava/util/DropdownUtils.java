package com.epam.training.student_gulaiym_ibraimova.ta_trainingjava.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropdownUtils {
    private static WebDriver driver;

    public DropdownUtils(WebDriver driver) {
        this.driver = driver;
    }

    private static final String DROPDOWN_PROPERTY_XPATH = "(//div[.//span/span[text()='%s']])[last()]";
    private static final String DROPDOWN_VALUE_XPATH = "(//li[.//span[text()='%s']])[last()]";

    public static void setDropdownValue(String property, String value) {
        String propertyXpath = String.format(DROPDOWN_PROPERTY_XPATH, property);
        String valueXpath = String.format(DROPDOWN_VALUE_XPATH, value);

        driver.findElement(By.xpath(propertyXpath)).click();
        driver.findElement(By.xpath(valueXpath)).click();
    }
}
