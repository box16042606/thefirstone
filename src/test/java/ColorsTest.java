import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;


public class ColorsTest extends TestBase {

    @BeforeTest
    public void preConditionStep(){
        goToURL("https://www.rrrgggbbb.com/", true);
    }

    @Test
    public void login() throws InterruptedException {

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
    public void postConditionStep() {
        driver.quit();
    }
}
