package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignInPage {
    private WebDriver driver;
    public SignInPage (WebDriver driver){
        this.driver =driver;

    }
    By emailBox =By.className("mdc-text-field__input");
    By passwordBox =By.xpath("/html/body/div/div[4]/form/div/div[1]/div[3]/label/input");

    By confirmPassword=By.xpath("/html/body/div/div[4]/form/div/div[1]/div[4]/label/input");
    By continueBtn = By.xpath("/html/body/div/div[4]/form/div/div[3]/div[2]/button/span[3]");

    By SubmitBtn = By.cssSelector("#card_password > div.actions > div > button > span.mdc-button__touch");

    By firstName = By.id("input_first_name");

    By lastName = By.id("input_last_name");

    By PhoneNum = By.xpath("/html/body/div/div[4]/form/div/div[2]/div[4]/div[2]/label/input");

    By continBtn = By.cssSelector("#card_profile_details > div.actions > div > button > span.mdc-button__touch");

    By Gender = By.xpath("/html/body/div/div[4]/form/div/div[3]/div/div[1]/div/div[1]");

    By Male =By.xpath("/html/body/div/div[4]/form/div/div[3]/div/div[1]/div/div[2]/ul/li[1]");

    By date = By.id("input_birth_date");

    By checkbox = By.id("acceptTC");

    By submit4 = By.cssSelector("#confirmBtn > span.mdc-button__touch");

    By loginPass =By.xpath("/html/body/div/div[4]/form/div/div[3]/label/input");

    By loginBtn = By.xpath("/html/body/div/div[4]/form/div/div[4]/div[2]/button/span[3]");







    public void setEmail(){
        driver.findElement(emailBox).sendKeys("nasrlaa14@gmail.com");
        driver.findElement(continueBtn).click();

    }
    public void setPassword() throws InterruptedException {
        driver.findElement(passwordBox).sendKeys("Mn@123123");
        driver.findElement(confirmPassword).sendKeys("Mn@123123");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(SubmitBtn));
        driver.findElement(SubmitBtn).click();



    }
    public void setUserData(){
        driver.findElement(firstName).sendKeys("moh");
        driver.findElement(lastName).sendKeys("nasr");
        driver.findElement(PhoneNum).sendKeys("1273345090");
        driver.findElement(continBtn).click();
    }
    public void selectGender(){
        driver.findElement(Gender).click();
        driver.findElement(Male).click();

    }
    public void selectDate(){
        driver.findElement(date).sendKeys("08112005");

    }
    public void checkboxandconfirm() throws InterruptedException {
        driver.findElement(checkbox).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(submit4));
        driver.findElement(submit4).click();
    }
    public void loginProcess() throws InterruptedException {
        driver.findElement(emailBox).sendKeys("nasrlaa14@gmail.com");
        driver.findElement(continueBtn).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginPass));
        driver.findElement(loginPass).sendKeys("Mn@123123");
        driver.findElement(loginBtn).click();

    }

}


