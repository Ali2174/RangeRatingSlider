import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Main {
    public static void asserts(String exp, String act){

        if(exp.equals(act)){

         System.out.println("true");
     }else{
         System.out.println("Problem");
     }

    }
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://qaplayground.dev/apps/range-slider/");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-extensions");
        options.addArguments("--disable-popup-blocking");
        Thread.sleep(1000);
        WebElement slider=driver.findElement(By.xpath("/html/body/div/div[2]/input"));
        Thread.sleep(1000);
        // Slide
        Actions actions=new Actions(driver);
        actions.dragAndDropBy(slider,-50,0).perform();
        Thread.sleep(1000);
        actions.dragAndDropBy(slider,0,0).perform();
     WebElement feedback= driver.findElement(By.id("feedback"));
        Thread.sleep(1000);
     feedback.click();

     WebElement tymsg=driver.findElement(By.id("ty-msg"));
        System.out.println(tymsg.getText());
        //check up feedback texts
        asserts("Thank you for your feedback!",tymsg.getText());

     Thread.sleep(3000);
driver.quit();
    }
}