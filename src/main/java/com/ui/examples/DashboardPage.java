package com.ui.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage extends BrowserUtil{

	private static final By CREATE_JOB_LINK_LOCATOR = By.xpath("//span[contains(text(),' Create Job ')]//../..//..");
	private static final By DASHBOARD_LINK_LOCATOR = By.xpath("//span[text()=' Dashboard ']//..//..//..");
	private static final By READY_FOR_DELIVERY_LINK_LOCATOR = By.xpath("//span[text()=' Ready for delivery ']//..//..//..");
	private static final By DOWNLOAD_DELIVERY_NOTE_LINK_LOCATOR = By.xpath("//span[text()=' Download Delivery Note ']//..//..//..");
	private static final By INWARD_CC_JOBS_LOCATOR = By.xpath("//span[text()=' Inward CC Jobs ']//..//..//..");
	private static final By Pending_Job_Count=By.xpath("//button[@class='buttonToLink']");
	private static final By Created_Job_TODAY=By.xpath("(//button[@class='buttonToLink'])[2]");
	private WebDriver wd;


	public DashboardPage(WebDriver wd) {
		super(wd);
		this.wd=wd;
		// TODO Auto-generated constructor stub
	}
	
	public void countOfItems()
	{
		elementText(Pending_Job_Count);
		elementText(Created_Job_TODAY);
		
		
	}
	
	
	


	public CreateJobPage  goToCreateJobPage()
	{
		
		clickOn(CREATE_JOB_LINK_LOCATOR);
		CreateJobPage createJobPage=new CreateJobPage(wd);
		return createJobPage;
		
	} 
	

}
