package com.telran.otto.steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import com.telran.otto.pages.HomePage;
import io.cucumber.java8.En;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static com.codeborne.selenide.Selenide.open;

public class HomePageSteps implements En {
    HomePage homePage;
    String baseUrl = "https://www.otto.de/";
    WebDriver driver;


    public HomePageSteps() {
        Given("that we navigate to home page", () -> {
            driver = new FirefoxDriver();
            WebDriverRunner.setWebDriver(driver);
            homePage = open(baseUrl, HomePage.class);
        });

        When("we accept cookies", () -> {
            homePage.acceptCookies();
        });

        When("we press Mein Konto icon", () -> {
            homePage.goToMeinKonto();
        });

        Then("user icon shows that we're logged in", () -> {
            homePage.verifyAuthIcon().shouldBe(Condition.visible);
        });
        And("^we close the driver$", () -> {
            driver.close();
        });
    }


}
