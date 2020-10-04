import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultPage {
    WebDriver driver;

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
    }

    private By SerchResult = By.id("catalog");

    public Boolean isSearchResult(){
        WebElement el = driver.findElement(SerchResult);
        Boolean result = el.getText().contains("Apple");
        return result;
    }

}
