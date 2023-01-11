package com.alfuttaim.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.alfuttaim.qa.base.TestBase;

public class LoginPage extends TestBase {

	// Page Factory : OR

	@FindBy(xpath = "//div[@id=\"homeid\"]/div/nav/div[1]/a/img")
	WebElement validatePageLogo;

	@FindBy(xpath = "//a[@class='nav-link navbar-toggle']")
	WebElement clkmodelLink;

	@FindBy(xpath = "//div[@id=\"new\"]/div/div/div/div[3]/div/div/div[1]/div/div/div/div[1]/div[1]/a/img")
	WebElement ValidateBuyProdImg;

	@FindBy(xpath = "//div[@id=\"new\"]/div/div/div/div[3]/div/div/div[1]/div/div/div/div[1]/div[2]/div[1]/a/div/p")
	WebElement clkBuyOnline;

	@FindBy(xpath = "//div[@id=\"__next\"]/div/div[2]/div[1]/div/div[2]/div/div[1]/a/div")
	WebElement VerifyConfigPage;

	@FindBy(xpath = "//span[text()='Configure & Buy']")
	WebElement clkConfigAndBuy;

	@FindBy(xpath = "//div[@id=\"__next\"]/div/div[2]/div/div[2]/div/div[1]/div/div[2]/div/div/img")
	WebElement verifyChoosePage;

	@FindBy(xpath = "//div[@id=\"TrimCarListId\"]/div/div/div/div/div[1]/div[5]/div/button/span")
	WebElement clkChoose;

	@FindBy(xpath = "//span[text()='Available now']")
	WebElement VerifyAvailableNow;

	@FindBy(xpath = "//span[text()='Available now']")
	WebElement clkAvailableNow;

	@FindBy(xpath = "//span[text()='Buy now']")
	WebElement VerifyBuyNow;

	@FindBy(xpath = "//span[text()='Buy now']")
	WebElement clkBuyNow;

	@FindBy(xpath = "//li[@id=\"recentViewConfig\"]/img")
	WebElement AddToCart;

	@FindBy(xpath = "//div[@id=\"BagRecentView\"]/div/div/div/div/a/div/img")
	WebElement ValidateAddToCartProductImage;

	@FindBy(xpath = "//div[@id=\"BagRecentView\"]/div/div/div/div/a/div/p")
	WebElement TitleOfAddedProduct;

	@FindBy(xpath = "//div[@id=\"accordion\"]/div/div/div/div[1]/div/div/div[2]/div/div/div[1]/div[2]/img")
	WebElement VerifyMakeYourChoice;

	@FindBy(xpath = "//div[@id=\"accordion\"]/div/div/div/div[1]/div/div/div[2]/div/div/div[3]/div/button/span")
	WebElement MakeYourChoicebtn;

	@FindBy(xpath = "//div[@id=\"accordion\"]/div/div/div/div/div/div/div[1]/div[1]/form/div/div[1]/div/select")
	WebElement selArea;

	@FindBy(xpath = "//select[@name='retailer']")
	WebElement selShowroom;

	@FindBy(xpath = "//*[@id=\"accordion\"]/div/div/div/div/div/div/div[1]/div[1]/form/div/div[3]/input")
	WebElement VerifyConfirmPage;

	@FindBy(xpath = "//input[@value='Confirm']")
	WebElement confirmBtn;

	@FindBy(xpath = "//span[text()='Select your finance']")
	WebElement selectFinanceOption;

	@FindBy(xpath = "//*[@id=\"accordion\"]/div/div/div/div/div/div/div[1]/div[1]/form/div/div[3]/input")
	WebElement VerifyPayDepositPage;

	// span[text()='Pay deposit']

	@FindBy(xpath = "//div[@id=\"accordion\"]/div/div/div/div/div[2]/div[2]/div/div[7]/div/button/span")
	WebElement clkPayDeposit;

	@FindBy(xpath = "//div[@id=\"accordion\"]/div/div/div/div/div/div[1]/form/div/div[1]/div/div/button[1]")
	WebElement VerifyRegisterNowPage;

	@FindBy(xpath = "//button[contains(text(),'Register Now')]")
	WebElement RegisterNowbtn;

	@FindBy(xpath = "//input[@id='email']")
	WebElement enteremail;

	@FindBy(xpath = "//button[@id='emailVerificationControl_but_send_code']")
	WebElement sendVerificationCodebtn;

	@FindBy(xpath = "//input[@id='newPassword']")
	WebElement enterNewPassword;

	// input[@id='reenterPassword']

	@FindBy(xpath = "//input[@id='reenterPassword']")
	WebElement ReEnterPassword;

	// select[@id='extension_Title']
	@FindBy(xpath = "//select[@id=\"extension_Title\"]")
	WebElement selNameTitle;

	@FindBy(xpath = "//input[@id='givenName']")
	WebElement submitFirstName;

	// input[@id='surname']

	@FindBy(xpath = "//input[@id='surname']")
	WebElement submitSurName;

	@FindBy(xpath = "//button[@id=\"continue\"]")
	WebElement btnSignUp;

	// initializing the page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions:
	public String validatePageTitle() {
		return driver.getTitle();
	}

	public boolean ValidatePageImage() {
		return validatePageLogo.isDisplayed();
	}

	public void modelLnk() {
		clkmodelLink.click();
	}

	public boolean validateBuyProdImg() {
		return ValidateBuyProdImg.isDisplayed();
	}

	public void BuyOnline() {
		clkBuyOnline.click();
	}

	public boolean verifyConfigBuyPage() {
		return VerifyConfigPage.isDisplayed();
	}

	public void ConfigurationAndBuy() {
		clkConfigAndBuy.click();
	}

	public boolean verifyChoosePage() {
		return verifyChoosePage.isDisplayed();
	}

	public void Choose() {
		clkChoose.click();
	}

	public boolean verifyAvailableNowPage() {
		return VerifyAvailableNow.isDisplayed();
	}

	public void AvailableNow() {
		clkAvailableNow.click();
	}

	public boolean verifyBuyNowPage() {
		return VerifyBuyNow.isDisplayed();
	}

	public void BuyNow() {
		clkBuyNow.click();
	}

	public void AddToCart() {
		AddToCart.click();
	}

	public boolean validateAddToCartProdImage() {
		return ValidateAddToCartProductImage.isDisplayed();
	}

	public void AddedProductTitle() {
		String s2 = TitleOfAddedProduct.getText();
		System.out.println(s2);

	}

	public boolean verifyMakeYourChoicePage() {
		return VerifyMakeYourChoice.isDisplayed();
	}

	public void MakeYourChoice() {
		MakeYourChoicebtn.click();
	}

	public void setArea(String area) {
		Select areaid = new Select(selArea);
		areaid.selectByVisibleText(area);
	}

	public void setShowroom(String showroom) {
		Select showroomid = new Select(selShowroom);
		showroomid.selectByVisibleText(showroom);
	}

	public boolean validateConfirmPage() {
		return VerifyConfirmPage.isDisplayed();
	}

	public void confirm() {
		confirmBtn.click();
	}

	public void Selectyourfinance() {
		selectFinanceOption.click();
	}

	public boolean validatePayDepositPage() {
		return VerifyPayDepositPage.isDisplayed();
	}

	public void PayDeposit() {
		clkPayDeposit.click();
	}

	public boolean validateRegisterNowPage() {
		return VerifyRegisterNowPage.isDisplayed();
	}

	public void RegisterNow() {
		RegisterNowbtn.click();
	}

	public void Email(String email) {
		enteremail.sendKeys(email);
	}

	public void sendVerificationCode() {
		sendVerificationCodebtn.click();

	}

	public void NewPassword(String newpass) {
		enterNewPassword.sendKeys(newpass);

	}

	public void RePassword(String RePass) {
		ReEnterPassword.sendKeys(RePass);

	}

	public void setNameTitle(String NameTitle) {
		Select areaid = new Select(selNameTitle);
		areaid.selectByVisibleText(NameTitle);
	}

	public void FirstName(String firstName) {
		submitFirstName.sendKeys(firstName);

	}

	public void LastName(String LastName) {
		submitSurName.sendKeys(LastName);

	}

	public void SignUp() {
		btnSignUp.click();

	}

}
