package element.common;

import org.openqa.selenium.By;
import element.BaseElement;

public abstract class Table extends BaseElement {

	public Table(By locator) {
		super(locator);
	}

	public abstract String getText(int row, int col);
	public abstract void sendKeys(int row, int col, CharSequence... keysToSend);

}
