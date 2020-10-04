import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By header = By.id("site_header");
    private By content = By.className("full-w");
    private By footer = By.id("footer-in");

    public Boolean isHeaderExist(){
        WebElement el = driver.findElement(header);
        Boolean result = el.getText().contains("mail@vostochny.by");
        return result;
    }
    public Boolean isContentExist(){
        WebElement el = driver.findElement(content);
        Boolean result = el.getText().contains("Новости");
        return result;
    }
    public Boolean isFooterExist(){
        WebElement el = driver.findElement(footer);
        Boolean result = el.getText().contains("Аренда");
        return result;
    }
    public KatalogPage clickToKatalogKonfiscata() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[6]/div/div/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/ul/li[3]/a")).click();
        Thread.sleep(3000);
        return new KatalogPage(driver);
    }
}
