import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KatalogPage {
    WebDriver driver;

    public KatalogPage(WebDriver driver) {
        this.driver = driver;
    }

    private By sortBar = By.className("search-field");
    private By productSearchInput = By.className("search-field");
    private By buttoSerch = By.className("search-btn");

    public Boolean isSotrtBarExist(){
        WebElement el = driver.findElement(sortBar);
        System.out.println(el.getAttribute("placeholder"));
        Boolean result = el.getAttribute("placeholder").contains("Поиск");
        return result;
    }
    public void inputTextToSearchInput(){
        driver.findElement(productSearchInput).sendKeys("iphone");
    }
    public SearchResultPage clickToSearchButton(){
        this.inputTextToSearchInput();
        driver.findElement(buttoSerch).click();
        return new SearchResultPage(driver);
    }

}
