import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class TestClass {
    WebDriver driver;
    HomePage homePage;
    KatalogPage katalogPage;
    SearchResultPage searchResultPage;

    @Mock
    TestMockClass testMockClass;


    @Before
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "/home/boris/IdeaProjects/TestNG1/10/JUNIT02102020/driver/geckodriver");
        driver = new FirefoxDriver();
        driver.get("http://konfiskat.by");



    }

    @Test
    public void test1(){
        homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isHeaderExist());
    }

    @Test
    public void test2(){
        homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isFooterExist());
    }

    @Test
    public void test3(){
        homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isContentExist());
    }

    @Test
    public void test4() throws InterruptedException {
        homePage = new HomePage(driver);
        katalogPage = homePage.clickToKatalogKonfiscata();
        Assert.assertTrue(katalogPage.isSotrtBarExist());
    }

    @Test
    public void test5() throws InterruptedException{
        homePage = new HomePage(driver);
        katalogPage = homePage.clickToKatalogKonfiscata();
        searchResultPage = katalogPage.clickToSearchButton();
        Assert.assertTrue(searchResultPage.isSearchResult());
    }

    @Test
    public void test6(){
        System.out.println("Start");
        when(testMockClass.myMethodTrue()).thenReturn(false);
        System.out.println(testMockClass.myMethodTrue());

    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
