package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.PageFactory.initElements;

public class details {
    @FindBy(css="div[class=\"jlkklc\"] #cwos.qv3Wpe")
    public WebElement Infinity;
    @FindBy(css="div[class=\"jlkklc\"] #cwos.qv3Wpe")
    public WebElement Error;

       public details(WebDriver driver) {
        initElements(driver, this);
    }
    public String getInfinity() {
        return Infinity.getText();
    }
    public String getError() {
        return Error.getText();
    }
}
