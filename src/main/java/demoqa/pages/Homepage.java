package demoqa.pages;

import com.saucedemo.pages.base.BasePage;
import demoqa.pages.forms.FormsPage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class Homepage extends BasePage {

    private By formsCard = By.xpath("//div[@id='app']//h5[text()='Forms']");

    public FormsPage gotoForms() {
        scrollToElementJS(formsCard);
        click(formsCard);
        return new FormsPage();
    }
}
