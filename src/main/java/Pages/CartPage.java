package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;
    public CartPage(WebDriver driver){
        this.driver = driver;
    }

    By NumOfItems = By.xpath("//*[@id=\"jm\"]/main/div/div[1]/article/header/h2");

    By item1Price=By.xpath("//*[@id=\"jm\"]/main/div/div[1]/article/article[1]/a/div[3]/div");
    By item2Price=By.xpath("//*[@id=\"jm\"]/main/div/div[1]/article/article[2]/a/div[3]/div");
    By subTotal =By.xpath("//*[@id=\"jm\"]/main/div/div[2]/div/article/div[1]/p[2]");

    public Object getNumOfItems(){
        driver.findElement(NumOfItems).getText();
        return null;
    }
    public int firstItemPrice() {
        int firstItem = Integer.parseInt(driver.findElement(item1Price).getText().replaceAll("[^0-9]", ""));
        return firstItem;
    }
    public int seconedItemPrice() {

        int seconedItem = Integer.parseInt(driver.findElement(item2Price).getText().replaceAll("[^0-9]", ""));
        return seconedItem;
    }
    public int TotalPrice(){
        int subtotal= Integer.parseInt(driver.findElement(subTotal).getText().replaceAll("[^0-9]", ""));
        return subtotal;

    }


}
