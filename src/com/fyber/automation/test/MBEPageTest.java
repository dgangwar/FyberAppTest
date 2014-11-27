package com.fyber.automation.test;

import org.testng.annotations.Test;

import com.fyber.automation.core.BaseAppium;
import com.fyber.automation.core.Validation;
import com.fyber.automation.pageobject.MBEPage;
import com.fyber.automation.pageobject.TabNavView;

public class MBEPageTest extends BaseAppium
{

private TabNavView tabnav = new TabNavView();
private MBEPage mbePage;
	
	
	@Test
	public void isMBEPageOpened()
	{
		tabnav.goToMBEPage().isMBEPageOpened().shoulBeTrue("MBE page is not displayed selected");
	}
	
	@Test
	public void turnOnNotify()
	{
		mbePage = tabnav.goToMBEPage();
		new Validation(mbePage.turnOnNotification().getNotificationStatus(), 1);
	}
	
	@Test
	public void turnOffNotify()
	{
		mbePage = tabnav.goToMBEPage();
		new Validation(mbePage.turnOffNotification().getNotificationStatus(), 0);
	}
}
