package com.fyber.automation.pageobject;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.fyber.automation.core.AppiumCommands;

public class TabNavView {
	
	private InterStitialPage interStitialPage  = new InterStitialPage();
	private MBEPage mbePage  = new MBEPage();
	private MorePage morePage = new MorePage();
	private OfferWallPage offerWallPage = new OfferWallPage();
	private StartSDKPage sdkPage = new StartSDKPage();
	
	
	private AppiumCommands appiumcommand = new AppiumCommands();

	
	
	public String getOpenedPage() {
		
		String TabViewPage = "//UIAApplication[1]/UIAWindow[2]/UIATabBar[1]/UIAButton";
		List<WebElement> pageList =  appiumcommand.getElementsByXpath(TabViewPage);
		Iterator<WebElement> itr = pageList.iterator();
		while(itr.hasNext())
		{
			WebElement element = itr.next();
			System.out.println(element.getAttribute("value"));
			if(element.getAttribute("value").equalsIgnoreCase("1"))
			{
				return element.getAttribute("name");
				
			}
			
		}
		return null;
		
	}

	public StartSDKPage goToStartSDKPage() {
		appiumcommand.clickByName("Start");
		
		return sdkPage;
	}

	public OfferWallPage goToOfferWallPage() {
		appiumcommand.clickByName("Start");
		return offerWallPage;
	}

	public InterStitialPage goToInterStitialPage() {
		appiumcommand.clickByName("Interstitial");
		return interStitialPage;
	}

	public MBEPage goToMBEPage() {
		appiumcommand.clickByName("MBE").waitForElementToExist(By.xpath("//UIATabBar[1]/UIAButton[@value='1']"));
		return mbePage;
	}

	public MorePage goToMorePage() {
		appiumcommand.clickByName("More");
		return morePage;
	}

}
