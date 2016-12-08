import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pom {
	WebDriver driver;
	By skip = By.id("tutorialSkipButton");
	
	public Pom(WebDriver driver) {
		this.driver = driver;
	}
    
	public void skip() {
		
	}
}
