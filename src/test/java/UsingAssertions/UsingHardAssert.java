package UsingAssertions;

import java.time.Duration;

import static org.testng.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.beust.jcommander.internal.Nullable;
public class UsingHardAssert {
	
	@Test
	
	public void scenario() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		
		//validate the title of webpage
		
		String acttitle = driver.getTitle();
		String exptitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		Assert.assertEquals(acttitle, exptitle);
	
		Assert.assertTrue(acttitle.contains(exptitle));
		
		Assert.fail();
		//Assert.assertNull(exptitle);
		
		driver.quit();
	}

}
