package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
    private WebDriver driver;
    public SignInPage (WebDriver driver){
        this.driver =driver;

    }
    By emailBox =By.className("mdc-text-field__input");
    By passwordBox =By.xpath("//*[@id=\"card_password\"]/div[3]/label/input");
    By confirmPassword=By.xpath("//*[@id=\"card_password\"]/div[4]/label/input");
    By continueBtn = By.xpath("/html/body/div/div[4]/form/div/div[3]/div[2]/button/span[3]");

    By SubmitBtn = By.cssSelector("#card_password > div.actions > div > button > span.mdc-button__touch");

    By firstName = By.id("input_first_name");

    By lastName = By.id("input_last_name");

    By PhoneNum = By.xpath("//*[@id=\"card_profile_details\"]/div[4]/div[2]/label/input");

    By continBtn = By.cssSelector("#card_profile_details > div.actions > div > button > span.mdc-button__touch");

    By Gender = By.xpath("//*[@id=\"gender\"]/div[1]");

    By Male =By.xpath("//*[@id=\"gender\"]/div[2]/ul/li[1]");

    By date = By.id("input_birth_date");

    By checkbox = By.id("acceptTC");

    By submit4 = By.cssSelector("#confirmBtn > span.mdc-button__touch");

    By loginPass =By.xpath("//*[@id=\"passwordForm\"]/div/div[3]/label/input");

    By loginBtn = By.xpath("//*[@id=\"loginButton\"]/span[3]");







    public void setEmail(String email){
        driver.findElement(emailBox).sendKeys(email);
        driver.findElement(continueBtn).click();

    }
    public void setPassword() throws InterruptedException {
        driver.findElement(passwordBox).sendKeys("Mn@123123");
        driver.findElement(confirmPassword).sendKeys("Mn@123123");
        Thread.sleep(3000);
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
        Thread.sleep(3000);
        driver.findElement(submit4).click();
    }
    public void loginProcess(String email ,String password) throws InterruptedException {
        driver.findElement(emailBox).sendKeys(email);
        Thread.sleep(1000);
        driver.findElement(continueBtn).click();
        driver.findElement(loginPass).sendKeys(password);
        driver.findElement(loginBtn).click();

    }

}


