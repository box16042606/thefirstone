package tests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import tests.TestBase;

import static java.lang.Thread.sleep;


public class ColorsTest extends TestBase {

    @BeforeTest
    public void preConditionStep(){
        goToURL("https://www.rrrgggbbb.com/", true);
    }

    @Test
    public void testColors() throws InterruptedException {

        moveToElement(HomePage.letterR, 10, 10);
        sleep(200);
        Assert.assertTrue(isElementHasClass(HomePage.letterR, "black"));
        Assert.assertTrue(isElementPresent(HomePage.redBackground));

        moveToElement(HomePage.letterG,  10, 10);
        sleep(200);
        Assert.assertTrue(isElementHasClass(HomePage.letterG, "black"));
        Assert.assertTrue(isElementPresent(HomePage.greenBackground));

        moveToElement(HomePage.letterB, 10, 10);
        sleep(200);
        Assert.assertTrue(isElementHasClass(HomePage.letterB, "black"));
        Assert.assertTrue(isElementPresent(HomePage.blueBackground));

    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
