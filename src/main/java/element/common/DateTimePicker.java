package element.common;

import org.openqa.selenium.By;

import element.BaseElement;

public abstract class DateTimePicker extends BaseElement {

	public DateTimePicker(By locator) {
		super(locator);
	}

	public abstract void selectDateTime(String datetime);
}
