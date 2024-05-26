package com.ui.examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

public class PhoenixLocator extends By{
	
	public static By locatorById(String id)
	{
		//return id from the parent class(By)
	return id(id);
	}
	public static By locatorByXpath(String xpath)
	{
		//return xpath from the parent class(By)
	return xpath(xpath);
	}
	
	
	

	@Override
	public List<WebElement> findElements(SearchContext context) {
		// TODO Auto-generated method stub
		return null;
	}

}
