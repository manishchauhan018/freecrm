package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class IndexPage extends TestBase {

	
		//Page Factory-OR Object Repository
		
		@FindBy(xpath = "//div[@class='rd-navbar-brand']//span[@class='brand-slogan'][contains(text(),'your business cloud partner')]")
		WebElement brandSlogan;
	
		@FindBy(xpath = "//div[@class='rd-navbar-panel']//span[contains(text(),'free')]")
		WebElement freeLogo;
		
		@FindBy(xpath = "//font[contains(text(),'crm')]")
		WebElement crmLogo;
		
		@FindBy(xpath = "btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left")
		WebElement BtnLogin;
		
		//initializing the page Objects
		public IndexPage() throws IOException {
			super();
		
			PageFactory.initElements(driver, this);
			}
		//Actions
		
		public String validateIndexPageTitle() {
			return driver.getTitle();
		}

		public boolean validatebrandSlogan() {
			return brandSlogan.isDisplayed();
		}
		
		public boolean validatefreeLogo() {
			return freeLogo.isDisplayed();
		}
		
		public boolean validatecrmLogo() {
			return crmLogo.isDisplayed();
		}
}
		/*
		public LoginPage validateBtnLogin(){
			BtnLogin.click();
			
			return new LoginPage();
		} */	
	
	
	
	
	
	
	
	


