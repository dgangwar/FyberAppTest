package com.fyber.automation.test;

import org.testng.annotations.Test;

import com.fyber.automation.core.BaseAppium;
import com.fyber.automation.core.Validation;
import com.fyber.automation.pageobject.TabNavView;

public class StartPageTest extends BaseAppium

{
	private TabNavView tabnav = new TabNavView();
	
	
	@Test
	public void isStartPageOpened()
	{
		new Validation(tabnav.getOpenedPage().equalsIgnoreCase("Start")).shoulBeTrue("Start SDK page is not opened");
		
	}
	
	@Test
	public void isStartAppID_Fields_Present()
	{
		
		
	}

	
}
