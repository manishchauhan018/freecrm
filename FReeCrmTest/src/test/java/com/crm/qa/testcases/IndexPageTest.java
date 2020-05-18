package com.crm.qa.testcases;

 import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;				
import com.crm.qa.pages.IndexPage;
import com.crm.qa.pages.LoginPage;


public class IndexPageTest extends TestBase {
	IndexPage indexPage; 	//create object  of IndexPage.java to use it in test class
	LoginPage loginPage;

	public IndexPageTest() throws IOException{
		super();
		
	}

	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		indexPage= new IndexPage();
	}
														//Free CRM #1 cloud software for any business large or small
	@Test(priority=1)
	public void IndexPageTitleTest() {
	String title=indexPage.validateIndexPageTitle();
	Assert.assertEquals(title, "Free CRM #1 cloud software for any business large or small");
		}
	
	@Test(priority=2)
	public void brandSloganTest() {
		boolean flag=indexPage.validatebrandSlogan();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void freeLogoTest() {
		boolean flag1=indexPage.validatefreeLogo();
		Assert.assertTrue(flag1);
		}
	@Test(priority=4)
	public void crmLogoTest() {
		boolean flag2=indexPage.validatecrmLogo();
		Assert.assertTrue(flag2);
	}
	
	/*@Test(priority=5)
	public void BtnLoginTest() {
		loginPage=indexPage.validateBtnLogin();  
	} */
		
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
