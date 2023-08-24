package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    By account = By.xpath("//*[@id=\"jm\"]/header/section/div[2]/div[1]/label");
    By signIn = By.xpath("//*[@id=\"dpdw-login-box\"]/div/div/a");
    By popup = By.cssSelector("#pop > div > section > button > svg");

    By myAccount = By.xpath("//*[@id=\"dpdw-login-box\"]/div/a[1]");

    By superMarket = By.xpath("//*[@id=\"jm\"]/main/div[1]/div[1]/div[1]/div/a[1]/span");

    By bakery = By.xpath("//*[@id=\"jm\"]/main/div[1]/div[1]/div[1]/div/div[1]/div/div[1]/div[2]/a[7]");



    public void navigateToSignInPage() throws InterruptedException {

            driver.findElement(popup).click();
            driver.findElement(account).click();
            driver.findElement(signIn).click();
            Thread.sleep(10000);
        }
        public Object getMyaccount(){
        driver.findElement(myAccount).getText();
            return null;
        }
        public void hoverToBakery() throws InterruptedException {
            WebElement mainMenu = driver.findElement(superMarket);

            Actions actions = new Actions(driver);

            actions.moveToElement(mainMenu);
            Thread.sleep(3000);

            WebElement subMenu = driver.findElement(bakery);

           actions.moveToElement(subMenu);

            actions.click().build().perform();
        }






}



