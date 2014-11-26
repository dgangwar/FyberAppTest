package com.fyber.automation.test;

import org.testng.annotations.Test;

import com.fyber.automation.TabNavView;

public class StartPageTest

{
	private TabNavView tabnav = new TabNavView();
	
	
	@Test
	public void isStartPageOpened()
	{
		tabnav.isStartPageOpened().shoulBeTrue("start sdk page is not opened");
		
	}

}
