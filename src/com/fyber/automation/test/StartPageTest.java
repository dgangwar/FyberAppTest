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
		new Validation(tabnav.goToStartSDKPage().areAppID_Fields_Present());
	}
	
	@Test
	public void isStartUserID_Fields_Present()
	{
		new Validation(tabnav.goToStartSDKPage().areUserID_Fields_Present());
	}
	
	@Test
	public void isVcsKey_Fields_Present()
	{
		new Validation(tabnav.goToStartSDKPage().areVcsKey_Fields_Present());
	}
	
	@Test
	public void startSdk()
	{
		tabnav.goToStartSDKPage().startSDK();
	}
	
	@Test
	public void clearData()
	{
		tabnav.goToStartSDKPage().clearSDKData();
	}

	@Test
	public void dntClearData()
	{
		tabnav.goToStartSDKPage().dntClearSDKData();
	}
	
}
