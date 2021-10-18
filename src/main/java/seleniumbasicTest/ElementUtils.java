package seleniumbasicTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ElementUtils {
	private WebDriver driver;

	public ElementUtils(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElement(By locator) {

		return driver.findElement(locator);

	}

	public List<WebElement> getElements(By locator) {

		return driver.findElements(locator);

	}

	public void dosendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	public String dogettext(By locator) {
		return getElement(locator).getText();
	}

	public boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

	public boolean doEnabled(By locator) {
		return getElement(locator).isEnabled();
	}

	public boolean doSelected(By locator) {
		return getElement(locator).isDisplayed();
	}

	public boolean checkElementDisabled(By locator, String atriName) {

		String atrValue = getElement(locator).getAttribute(atriName);
		if (atrValue.equals("true")) {
			return true;

		}
		return true;

	}

	public String dogetAttributeValue(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);

	}

	public void doLinkClick(By locartor, String linkValue) {
		List<WebElement> LagList = getElements(locartor);
		System.out.println(LagList.size());

		for (WebElement e : LagList) {
			String text = e.getText();
			System.out.println(text);
			if (text.trim().equals(linkValue)) {
				e.click();
				break;

			}
		}
	}

	public boolean checkElementDisplayed(By locator) {
		if (getElements(locator).size() == 1)
			return true;
		return false;
	}

	public boolean checkElementDisplayed(By locator, int elementOccurence) {
		if (getElements(locator).size() == elementOccurence)
			return true;
		return false;
	}

	/***************************** Drop Down *********************************/

	public void doSelectByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);

	}

	public boolean doSelectByValues(By locator, String values) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(values);
		return isDropDownValuesSelected(select, values);

	}

	public boolean doSelectByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
		return isDropDownValuesSelected(select, text);

	}

	public static boolean isDropDownValuesSelected(Select select, String expvalue) {
		if (select.getFirstSelectedOption().getText().contains(expvalue)) {
			System.out.println(expvalue + ": is selected");
			return true;
		}
		return false;

	}

	public void doSelectDropDown(By locator, String value) {

		Select select = new Select(getElement(locator));
		List<WebElement> optionList = select.getOptions();
		System.out.println(optionList.size());

		ietrateDropDownAndSelect(optionList, value);

	}

	public void selectdropdownWithoutSelect(By locator, String value) {
		List<WebElement> optionList = driver.findElements(locator);
		ietrateDropDownAndSelect(optionList, value);

	}

	private void ietrateDropDownAndSelect(List<WebElement> optionList, String value) {
		System.out.println("total Option " + optionList.size());
		for (WebElement e : optionList) {
			String text = e.getText();
			if (text.equals(value)) {
				e.click();
				break;

			}
		}

	}

	public void doActionsSendKeys(By locator, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).build().perform();
	}

	public void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator)).build().perform();
	}

}
