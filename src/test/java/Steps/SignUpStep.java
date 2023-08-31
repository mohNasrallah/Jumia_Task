package Steps;

import Pages.HomePage;
import Pages.SignInPage;
import com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.ro.Si;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import static Pages.Hooks.chromeOption;
import static Pages.Hooks.driver;

public class SignUpStep {





    @Given("I am on the Jumia homepage")
    public void i_am_on_the_jumia_homepage() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOption());
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://www.jumia.com.eg/");
        driver.manage().window().maximize();
        Thread.sleep(5000);

    }
    @When("I click on the Account link and choose Sign in")
    public void i_click_on_the_Account_link_and_choose_Sign_in() throws InterruptedException {
        HomePage home = new HomePage(driver);
        home.navigateToSignInPage();



        // Write code here that turns the phrase above into concrete actions

    }
    @And("fill my data and submit")
    public void fill_my_data_and_submit() throws InterruptedException {

        SignInPage Sign = new SignInPage(driver);
        Sign.setEmail();
        Thread.sleep(5000);
        Sign.setPassword();
        Thread.sleep(5000);
        Sign.setUserData();
        Sign.selectGender();
        Sign.selectDate();
        Thread.sleep(3000);
        Sign.checkboxandconfirm();
        Thread.sleep(5000);
        HomePage home =new HomePage(driver);
        Assert.assertEquals(home.getMyaccount(),"My Account");
    }



    @Then("user should be registered successfully")
    public void user_should_be_registered_successfully()  {
        System.out.println("user created successfully" );
        driver.close();



    }

}
