package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case2 {

    private static WebDriver driver;

    @BeforeAll
    public static void init () {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    @DisplayName("Проверка деления на ноль")
    public void test1() {
        driver.get("http://google.com");
        driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("calculator", Keys.ENTER);
        driver.findElement(By.cssSelector("[jsname='abcgof']")).click();
        driver.findElement(By.cssSelector("[jsname='WxTTNd']")).click();
        driver.findElement(By.cssSelector("[jsname='bkEvMb']")).click();
        driver.findElement(By.cssSelector("[jsname='Pt8tGc']")).click();
    }
        @AfterAll
        public static void teardown () {
            driver.quit();
    }
}