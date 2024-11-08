package com.epam.training.student_gulaiym_ibraimova.ta_trainingjava.pages;

import org.openqa.selenium.WebDriver;


public abstract class AbstractPage
{
    protected WebDriver driver;

    protected abstract AbstractPage openPage();

    protected AbstractPage(WebDriver driver)
    {
        this.driver = driver;
    }
}
