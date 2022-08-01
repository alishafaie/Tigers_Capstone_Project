package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetailPageObject extends Base {

	public RetailPageObject() {
		PageFactory.initElements(driver, this);

		}

		// Background XPATH
		@FindBy(xpath = "//*[@id=\"logo\"]/h1/a")
		private WebElement testEnvironmentText;

		@FindBy(xpath = "//a[@title='My Account']")
		private WebElement myAccountButton;

		@FindBy(xpath = "//li//li//a[text()='Login']")
		private WebElement loginLink;

		@FindBy(id="input-email")
		private WebElement loginEmail;

		@FindBy(id="input-password")
		private WebElement loginPassword;

		@FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/form/input")
		private WebElement loginButton;

		@FindBy(xpath = "//h2[text()='Returning Customer']")
		private WebElement retailPageText;

		@FindBy(xpath = "//h2[text()='My Account']")
		private WebElement myAccountPage;

		// Scenario #1 XPATH Register as Affiliate
		@FindBy(xpath = "//a[text()='Register for an affiliate account']")
		private WebElement registerAffiliateAccount;

		@FindBy(xpath = "//*[@id='input-company']")
		private WebElement companyInput;

		@FindBy(xpath = "//*[@id='input-website']")
		private WebElement websiteInput;

		@FindBy(xpath = "//*[@id='tax']")
		private WebElement taxInput;

		@FindBy(xpath = "//*[@id='input-cheque']")
		private WebElement paymentCheque;

		@FindBy(xpath = "//*[@id='content']/form/div/div/input[1]")
		private WebElement aboutUsCheckBox;

		@FindBy(xpath = "//*[@id='content']/form/div/div/input[2]")
		private WebElement continueButton;

		@FindBy(xpath = "//i[@class='fa fa-check-circle")
		private WebElement registerAffiliateSuccessMessage;


		//SCENARIO #2 XPATH Edit your Affiliate Info
		@FindBy(xpath = "//*[@id=\"content\"]/ul[3]/li[1]")
		private WebElement editAffiliateLink;

		@FindBy(xpath = "//*[@id=\"content\"]/form/fieldset[2]/div[2]/div/div[3]")
		private WebElement bankTransferButton;

		@FindBy(xpath = "//*[@id=\"input-bank-name\"]")
		private WebElement bankNameInput;

		@FindBy(xpath = "//*[@id='input-company']")
		private WebElement abaNumberInput;

		@FindBy(xpath = "//*[@id=\"input-bank-swift-code\"]")
		private WebElement swiftCodeInput;

		@FindBy(xpath = "//*[@id='input-bank-account-name']")
		private WebElement accountNameInput;

		@FindBy(xpath = "//*[@id='input-bank-account-number']")
		private WebElement accountNumberInput;

		@FindBy(xpath = "//*[@id='content']/form/div/div/input")
		private WebElement editAffiliateContinueButton;

		@FindBy(xpath = "//*[@id='account-account']/div[1]")
		private WebElement editAffiliateSuccessMessage;


		//SCENARIO #3 XPATH Edit Account Info
		@FindBy(xpath = "//*[@id=\"content\"]/ul[1]/li[1]/a")
		private WebElement editAffiliateAccountLink;

		@FindBy(xpath = "//*[@id=\"input-firstname\"]")
		private WebElement firstNameInput;

		@FindBy(xpath = "//*[@id=\"input-lastname\"]")
		private WebElement lastNameInput;

		@FindBy(xpath = "//*[@id=\"input-email\"]")
		private WebElement emailInput;

		@FindBy(xpath = "//*[@id=\"input-telephone\"]")
		private WebElement telephoneInput;

		@FindBy(xpath = "//*[@id=\"content\"]/form/div/div[2]/input")
		private WebElement editAccountContinueButton;

		@FindBy(xpath = "//*[@id=\"account-account\"]/div[1]")
		private WebElement editAccountSuccessMessage;




		//BACKGROUND METHODS
		public void clickOnMyAccountButton() {
		myAccountButton.click();

		}
		public void clickOnLoginLink() {
		loginLink.click();

		}
		public boolean isLogoPresent() {
		if (testEnvironmentText.isDisplayed())
		return true;
		else
		return false;
		}
		public String getTitle() {
		return driver.getTitle();
		}
		public void enterEmail(String email) {
		loginEmail.sendKeys(email);
		}
		public void enterPassword(String password) {
		loginPassword.sendKeys(password);
		}
		public void clickOnLoginButton() {
		loginButton.click();
		}
		public String getMyAccountText() {
		String textFromUI = retailPageText.getText();
		return textFromUI;
		}
		public String getTextAfterLogin() {
		String myAccountText = myAccountPage.getText();
		return myAccountText;
		}


		//SCENARIO #1 METHODS
		public void clickOnRegisterAffiliateLink() {
		registerAffiliateAccount.click();
		}
		public void fillCompanyBox(String company) {
		companyInput.sendKeys(company);
		}
		public void fillWebsiteBox(String website) {
		websiteInput.sendKeys(website);
		}
		public void fillTaxBox(String taxID) {
		taxInput.sendKeys(taxID);
		}
		public void fillPaymentBox(String paymentMethod) {
		paymentCheque.sendKeys(paymentMethod);
		}
		public void aboutUsCheckBox() {
		aboutUsCheckBox.click();
		}
		public void clickContinueButton() {
		continueButton.click();
		}
		public boolean isCreateSuccessMessagePresent() {
		if(registerAffiliateSuccessMessage.isDisplayed())
		return true;
		else
		return false;
		}

		//SCENARIO #2 METHODS
		public void clickOnEditAffiliateLink() {
		editAffiliateLink.click();
		}
		public void clickOnBankTransferButton() {
		bankTransferButton.click();
		}
		public void fillBankNameInput(String bankName) {
		bankNameInput.sendKeys(bankName);
		}
		public void fillAbaNumber(String abaNumber) {
		abaNumberInput.sendKeys(abaNumber);
		}
		public void fillSwiftCodeInput(String swiftCode) {
		swiftCodeInput.sendKeys(swiftCode);
		}
		public void fillAccountName(String accountName) {
		accountNameInput.sendKeys(accountName);
		}
		public void fillAccountNumber(String accountNumber) {
		accountNumberInput.sendKeys(accountNumber);
		}
		public void editAffiliateContinueButton() {
		editAffiliateContinueButton.click();
		}
		public boolean isEditSuccessMessagePresent() {
		if(editAffiliateSuccessMessage.isDisplayed())
		return true;
		else
		return false;
		}

		//SCENARIO #3 METHODS
		public void clickOnEditAffiliateAccountLink() {
		editAffiliateAccountLink.click();
		}
		public void fillFirstNameInput(String firstname) {
		firstNameInput.sendKeys(firstname);
		}
		public void fillLastNameInput(String lastName) {
		lastNameInput.sendKeys(lastName);
		}
		public void fillEmailInput(String email) {
		emailInput.sendKeys(email);
		}
		public void fillTelephoneInput(String telephone) {
		telephoneInput.sendKeys(telephone);
		}
		public void clickOnEditAccountContinueButton() {
		editAccountContinueButton.click();
		}
		public boolean isEditAccountSuccessMessagePresent() {
		if(editAccountSuccessMessage.isDisplayed())
		return true;
		else
		return false;
		}
}
	









	
	




	