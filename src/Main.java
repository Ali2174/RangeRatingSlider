import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://qaplayground.dev/apps/covered/#");

        ChromeOptions options = new ChromeOptions();

        WebElement mailInput=driver.findElement(By.id("info"));

        WebElement scroll=driver.findElement(By.className("wrapper"));



    }
}