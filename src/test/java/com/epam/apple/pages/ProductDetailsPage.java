package com.epam.apple.pages;

import com.epam.apple.pages.common.Footer;
import com.epam.apple.pages.common.Header;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage {

    private WebDriver driver = new ChromeDriver();

    private Header header;

    private Footer footer;

    private WebElement putProductTitle;

    @FindBy(id = "detailBulletsWrapper_feature_div")
    private WebElement productDetailsFeedback; //= driver.findElement(
//            By.id("detailBulletsWrapper_feature.div "));

    public void putProductToCart(){

    }


    public void writeFeedback(String feedback) {
        productDetailsFeedback.sendKeys(feedback);
        productDetailsFeedback.click();
    }

    public void editFeedback(String feedback){
        productDetailsFeedback.sendKeys(feedback);
    }

    public void navigateToSimilarProduct(){

    }

}
