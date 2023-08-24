package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BakeryPage {
    private WebDriver driver;
    public BakeryPage(WebDriver driver){
        this.driver=driver;
    }
    By item1 = By.xpath("//*[@id=\"jm\"]/main/div[2]/div[3]/section/div[1]/article[1]/footer/form");
    By item2 = By.xpath("//*[@id=\"jm\"]/main/div[2]/div[3]/section/div[1]/article[2]/footer/form");

    By cart= By.xpath("//*[@id=\"jm\"]/header/section/div[2]/a");

    public void addItems() throws InterruptedException {
        driver.findElement(item1).click();
        Thread.sleep(3000);
        driver.findElement(item2).click();
    }
    public void navigateTocart(){
        driver.findElement(cart).click();
    }
}
