package com.fyber.automation.test;

import org.testng.annotations.Test;

import com.fyber.automation.core.BaseAppium;
import com.fyber.automation.pageobject.TabNavView;

public class MBEPageTest extends BaseAppium
{

private TabNavView tabnav = new TabNavView();
	
	
	@Test
	public void isMBEPageOpened()
	{
		tabnav.goToMBEPage().isMBEPageOpened().shoulBeTrue("MBE page is not displayed selected");
	}
}
