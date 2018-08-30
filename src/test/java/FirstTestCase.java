import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirstTestCase {

   WebDriver driver = null;

   @Test
   public void testEasy(String myURL, String myTitle) {
      driver.get("https://www.google.com");
      // Assert.assertTrue(title
      // .contains("Home page Nguoi An Phu huyen An Phu tinh An Giang"));
   }


}
