package element.common;

import org.openqa.selenium.By;

import element.BaseElement;

public abstract class ADateTimePicker extends BaseElement {

	public ADateTimePicker(By locator) {
		super(locator);
	}

	public abstract void selectDateTime(String datetime);
}
