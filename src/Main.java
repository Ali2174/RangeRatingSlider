import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Main {
    public static void main(String[] args) throws InterruptedException {
                WebDriver driver=new ChromeDriver();
                driver.get("https://qaplayground.dev/apps/range-slider/");

        Thread.sleep(2000);
                WebElement inputRange=driver.findElement(By.xpath("/html/body/div/div[2]/input"));
              Actions action = new Actions(driver);
              action.dragAndDropBy(inputRange,-50,0).perform();
                Thread.sleep(1000);
                action.dragAndDropBy(inputRange,0,0).perform();
                Thread.sleep(1000);
                WebElement feedBack=driver.findElement(By.id("feedback"));
                feedBack.click();
                Thread.sleep(3000);
         driver.quit();
        System.out.println("No Problem");

    }
}