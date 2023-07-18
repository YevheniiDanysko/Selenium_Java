import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTest {

    public static void main(String[] args) {

        WebDriver auto = new ChromeDriver();
        auto.get("https://www.technopolis.bg/bg/");
        auto.findElement(By.id("CybotCookiebotDialogBodyButtonAccept")).click();
        auto.findElement(By.className("lazyloaded")).click();
        auto.findElement(By.id("addToCartButton500929")).click();

    }
}
