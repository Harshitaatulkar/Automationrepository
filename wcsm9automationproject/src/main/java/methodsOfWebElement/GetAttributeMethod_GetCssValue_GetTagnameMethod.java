package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod_GetCssValue_GetTagnameMethod {
                public static void main(String[] args) {
					WebDriver driver = new ChromeDriver();
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
					driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
					// get the attribute value of username textbox
				    WebElement usnTB = driver.findElement(By.xpath("//input[@placeholder='Username']"));
				    String attributeValue = usnTB.getAttribute("class");
				    System.out.println(attributeValue);
				    // get the css value of username textbox
				    WebElement usn = driver.findElement(By.xpath("//input[@placeholder='Username']"));
				    String Cssvalue = usn.getCssValue("color");
				    System.out.println(Cssvalue);
				    // get the tagname value of username textbox
				    WebElement untagname = driver.findElement(By.xpath("//input[@placeholder='Username']"));
				              String Name = untagname.getText();				     
					System.out.println(Name);
										}
}
