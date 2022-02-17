package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Case3 {

    private static WebDriver driver;
    private static details details;

    @BeforeAll
    public static void init () {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        details = new details(driver);
    }
    @Test
    @DisplayName("Проверка ошибки при отсутствии значения")
    public void test1() {
        driver.get("http://google.com");
        driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("calculator", Keys.ENTER);
        driver.findElement(By.cssSelector("[jsname='aN1RFf']")).click();
        driver.findElement(By.cssSelector("[jsname='Pt8tGc']")).click();
        assertEquals("Error", details.getError());
    }
        @AfterAll
        public static void teardown () {
            driver.quit();

    }
}