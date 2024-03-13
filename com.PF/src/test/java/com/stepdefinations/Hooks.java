package com.stepdefinations;

import com.utilities.BaseClass;

import io.cucumber.java.Before;

public class Hooks extends BaseClass
{
	@Before
	public static void BeforeScenario()
	{
		lauchBrowser();
	}
	
	

}
