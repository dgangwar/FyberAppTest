package com.fyber.automation.test;

import org.testng.annotations.Test;

import com.fyber.automation.core.Validation;
import com.fyber.automation.pageobject.TabNavView;

public class MorePageTest {

	private TabNavView tabnav = new TabNavView();

	@Test
	public void isMorePageOpened() {
		tabnav.goToMorePage().isMorePageOpened()
				.shoulBeTrue("More page not opened");
	}

	@Test
	public void setLocationTest() {
		new Validation(tabnav.goToMorePage().goToUserSettings().selectLocation("Berlin")
				.getLocation().equalsIgnoreCase("Berlin"))
				.shoulBeTrue("Location is not set properly");
	}

}
