package web;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class WhenWritingWebTestsInSerenity {
	
	@Managed(driver = "chrome")
	WebDriver driver;
	
	@Test
    public void shouldInstantiateAWebDriverInstanceForAWebTest() {
        driver.get("http://www.google.fr");                                

        driver.findElement(By.name("q")).sendKeys("firefly", Keys.ENTER);

        new WebDriverWait(driver,5).until(ExpectedConditions.titleContains("firefly - بحث Google‏"));

        assertThat(driver.getTitle()).contains("firefly - بحث Google‏");
    }     

}
