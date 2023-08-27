package hellocucumber;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static hellocucumber.Hooks.getDriver;

public class StepDefinitions {

    private final WebDriver driver = getDriver();

    @Given("I am on the login page")
    public void i_am_on_the_login_page() throws InterruptedException {
        System.out.println("STEP 1");

        driver.get("https://www.saucedemo.com/");
    }

    @When("I enter valid username and password")
    public void i_enter_valid_username_and_password() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        System.out.println("STEP 2");

    }
    @When("I click on Login button")
    public void i_click_on_login_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions

        driver.findElement(By.id("login-button")).click();
        System.out.println("STEP 3");



    }
    @Then("I should be logged in")
    public void i_should_be_logged_in() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions

        driver.findElement(By.id("smxdfvr"));
        System.out.println("STEP 4");
    }
}
