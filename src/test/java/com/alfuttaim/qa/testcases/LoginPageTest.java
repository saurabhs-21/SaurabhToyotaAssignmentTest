package com.alfuttaim.qa.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.alfuttaim.qa.base.TestBase;
import com.alfuttaim.qa.pages.LoginPage;
import com.alfuttaim.qa.util.TestUtil;

@Listeners(CustomListener.class)
public class LoginPageTest extends TestBase {

	String email = "ssthakur2190@gmail.com";
	String area = "Dubai";
	String paydepoxpath = "//div[@id=\"accordion\"]/div/div/div/div/div[2]/div[2]/div/div[7]/div/button/span";
	String Makeyourchoicesxpath = "//span[contains(text(),'Make your choices')]";
	String ToyDAirxpath = "//option[text()='Toyota Dubai Airport']";
	String AvailableNow = "//span[text()='Available now']";
	String NameTitle = "Mr.";

	LoginPage loginpage;
	TestUtil testutil;

	LoginPageTest() {
		super();

	}

	@BeforeMethod
	public void setup() {
		initialization();
		testutil = new TestUtil();
		loginpage = new LoginPage();
		processingimpliwait();
	}

	@Test(priority = 1)
	public void homePageTitleTest() {
		processingimpliwait();
		String title = loginpage.validatePageTitle();
		Assert.assertEquals(title, "Buy New and Used Toyota Cars in The United Arab Emirates | Toyota");
		processingimpliwait();

		boolean flag = loginpage.ValidatePageImage();

		Assert.assertTrue(flag);

	}

	@Test(priority = 2)
	public void ValidateAddToCartProd() {

		loginpage.modelLnk();

		boolean flg = loginpage.validateBuyProdImg();
		Assert.assertTrue(flg);
		processingimpliwait();

		loginpage.BuyOnline();
		processingimpliwait();

		boolean fl = loginpage.verifyConfigBuyPage();
		Assert.assertTrue(fl);
		processingimpliwait();

		loginpage.AddToCart();
		processingimpliwait();

		boolean flag = loginpage.validateAddToCartProdImage();
		Assert.assertTrue(flag);
		processingimpliwait();

		System.out.println("ValidateAddToCartProdImage successfully");
	}

	@Test(priority = 3)
	public void TyCarTest() {
		loginpage.modelLnk();
		processingimpliwait();

		loginpage.BuyOnline();
		processingimpliwait();

		loginpage.ConfigurationAndBuy();
		processingimpliwait();

		boolean flag = loginpage.verifyChoosePage();
		Assert.assertTrue(flag);
		processingimpliwait();

		// ScrollDown
		scrolltoelement(prop.getProperty("choosexpath"));

		loginpage.Choose();
		processingimpliwait();
		System.out.println("Clicked on Choose button");
		processingimpliwait();

		scrolltoelement(prop.getProperty("AvailableNowXpath"));

		loginpage.AvailableNow();
		// ImplicitWait

		loginpage.BuyNow();
		processingimpliwait();
		System.out.println("BuyNow clicked successfully");

		boolean fg = loginpage.verifyMakeYourChoicePage();
		Assert.assertTrue(fg);
		processingimpliwait();

		scrolltoelement(Makeyourchoicesxpath);
		processingimpliwait();

		loginpage.MakeYourChoice();
		processingimpliwait();
		System.out.println("MakeYourChoice clicked successfully");

		loginpage.setArea(area);
		processingimpliwait();
		System.out.println("Area selected successfully");

		// ExplicitWait
		processingExpliwait(ToyDAirxpath);

		loginpage.setShowroom(prop.getProperty("showroom"));
		processingimpliwait();
		System.out.println("Showroom selected successfully");

		boolean fla = loginpage.validateConfirmPage();
		Assert.assertTrue(fla);
		processingimpliwait();

		loginpage.confirm();
		processingimpliwait();
		System.out.println("Area and Showroom confirmed successfully");

		scrolltoelement(prop.getProperty("Selectyourfinancexpath"));
		processingimpliwait();
		loginpage.Selectyourfinance();
		System.out.println("SelectFinance clicked successfully");
		processingimpliwait();

		boolean fa = loginpage.validatePayDepositPage();
		Assert.assertTrue(fa);
		processingimpliwait();

		scrolltoelement(paydepoxpath);
		processingimpliwait();

		loginpage.PayDeposit();
		processingimpliwait();
		System.out.println("Pay Deposit clicked successfully");

		boolean f = loginpage.validateRegisterNowPage();
		Assert.assertTrue(f);

		processingimpliwait();
		loginpage.RegisterNow();
		processingimpliwait();
		// SwitchToChildWindow
		switchtab();
		processingimpliwait();
		loginpage.Email(email);
		processingimpliwait();
		System.out.println("Email entered in child window successfully");

		loginpage.sendVerificationCode();
		processingimpliwait();
		System.out.println("VerificationCode Entered Successfully");

		WebElement fiResult = new WebDriverWait(driver, Duration.ofSeconds(60))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='newPassword']")));

		processingimpliwait();
		loginpage.NewPassword(prop.getProperty("Newpassword"));
		processingimpliwait();
		loginpage.RePassword(prop.getProperty("Repassword"));
		processingimpliwait();

		loginpage.setNameTitle(NameTitle);
		processingimpliwait();
		System.out.println("NameTitle selected");

		loginpage.FirstName(prop.getProperty("FirstName"));
		processingimpliwait();
		loginpage.LastName(prop.getProperty("LastName"));
		processingimpliwait();
		System.out.println("Name Entered Successfully");

		loginpage.SignUp();
		System.out.println("SignUp completed and User Registered Successfully");
		// SwitchfromChildToParentWindow loginpage.switchbacktab();
		processingimpliwait();
		System.out.println("Test Case PASSED");

	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
