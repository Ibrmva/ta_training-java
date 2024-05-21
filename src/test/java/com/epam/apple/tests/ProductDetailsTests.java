package com.epam.apple.tests;

import com.epam.apple.pages.HomePage;
import com.epam.apple.pages.ProductDetailsPage;

public class ProductDetailsTests {

    private HomePage homePage;

    private ProductDetailsPage productDetailsPage;

    //@BeforeAll
    public void init(){
        homePage = new HomePage();
        productDetailsPage = new ProductDetailsPage();
    }

    //@Test
    public void shouldSubmitNonEmptyFeedbackSuccessfully(){
        homePage.navigateToProductDetailsPage("SameTitle");
        productDetailsPage.writeFeedback("Test Framework");
        //checkSuccessMessage
    }

    //@Test
    public void shouldSubmitEmptyFeedbackIsProhibited(){
        productDetailsPage.writeFeedback("Test Framework");
        //checkErrorMessage
    }

}
