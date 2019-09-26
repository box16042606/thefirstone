import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

import static java.util.concurrent.TimeUnit.SECONDS;

public class TestBase {

   public static WebDriver driver;
   private static ChromeDriverService service;
   public static WebDriverWait wait;
   private final static String PATH_TO_CD = "";

   public TestBase() {
       try {
           service = new ChromeDriverService.Builder()
                   .usingDriverExecutable(new File(PATH_TO_CD))
                   .usingAnyFreePort()
                   .build();
            service.start();

            driver.manage().timeouts().implicitlyWait(10,SECONDS);
            wait = new WebDriverWait(driver, 15);

       } catch (Exception e) {
           e.printStackTrace();
       }
   }

   void goToURL () {
       driver.get(HP);
   }

}
