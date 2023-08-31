package Steps;

import Pages.BakeryPage;
import Pages.CartPage;
import Pages.HomePage;
import Pages.SignInPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static Pages.Hooks.chromeOption;
import static Pages.Hooks.driver;

public class SignInStep  {
    @Given("I am on the homepage")
    public void I_am_on_the_homepage() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOption());
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://www.jumia.com.eg/");
        driver.manage().window().maximize();


    }


    @When("I navigate to Sign in page")
    public void i_Navigate_to_Sign_In_Page() throws InterruptedException {
        HomePage home = new HomePage(driver);
        home.navigateToSignInPage();
    }

    @And("fill my data and continue")
    public void fill_My_Data_and_Continue() throws InterruptedException {
        SignInPage sign = new SignInPage(driver);
        sign.loginProcess();
        Thread.sleep(5000);
        HomePage home = new HomePage(driver);
        home.hoverToBakery();
        Thread.sleep(5000);

    }
    @And("hover to bakery")
    public void hover_to_bakery()  {
        HomePage home = new HomePage(driver);
        home.hoverToBakery();

    }
    @And("add items to cart")
    public void add_items_to_cart() throws InterruptedException {
        BakeryPage bakery = new BakeryPage(driver);
        bakery.addItems();
        bakery.navigateTocart();
        CartPage cart = new CartPage(driver);
        Assert.assertEquals(cart.getNumOfItems(),"Cart (2)");
        Assert.assertEquals(cart.firstItemPrice()+cart.seconedItemPrice(),cart.TotalPrice());


    }

    @Then("user should be SignIn successfully")
    public void user_Should_be_SignIn_Successfully() {
        System.out.println("items added successfully and the total price is correct");
        driver.quit();
    }
}
