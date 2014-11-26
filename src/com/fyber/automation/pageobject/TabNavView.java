package com.fyber.automation.pageobject;

import com.fyber.automation.core.AppiumCommands;
import com.fyber.automation.core.Validation;


public class TabNavView {
	
	private AppiumCommands appiumcommand = new AppiumCommands();

	public Validation isStartPageOpened() {
		
		boolean isPageOpened = appiumcommand.isElementPresentByXpath("//UIAApplication[1]/UIAWindow[2]/UIANavigationBar[1]");
		return new Validation(isPageOpened);
	}

	public StartSDKPage goToStartSDKPage() {
		return null;
	}

	public OfferWallPage goToOfferWallPage() {
		return null;
	}

	public InterStitialPage goToInterStitialPage() {
		return null;
	}

	public MBEPage goToMBEPage() {
		return null;
	}

	public MorePage goToMorePage() {
		return null;
	}

}
