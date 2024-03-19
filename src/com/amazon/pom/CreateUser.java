package com.amazon.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateUser extends BasePage
{

	@FindBy(xpath="//div[text()='USERS']")
	private WebElement users;
	
	
	@FindBy(xpath="//div[text()='Add User']")
	private WebElement addUser;
	
	
	@FindBy(name="firstName")
	private WebElement firstName;
	
	
	@FindBy(name="lastName")
	private WebElement lastName;
	
	
	@FindBy(name="email")
	private WebElement email;
	
	
	
	@FindBy(name="username")
	private WebElement userName;
	
	
	@FindBy(name="password")
	private WebElement password;
	

	@FindBy(name="passwordCopy")
	private WebElement retypepassword;
	
	
	@FindBy(xpath="//span[text()='Create User']")
	private WebElement createUserButton;
	
	
	public CreateUser(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnUsers()
	{
		users.click();
	}
	
	
	public void clickOnAddUser()
	{
		addUser.click();
	}
	
	
	public void enterFirstName(String fn)
	{
		firstName.sendKeys(fn);
	}
	
	public void enterLastName(String ln)
	{
		lastName.sendKeys(ln);
	}
	
	public void enterEmail(String email1)
	{
		email.sendKeys(email1);
	}
	
	public void enterUserName(String un)
	{
		userName.sendKeys(un);
	}
	
	
	public void enterPassword(String pw)
	{
		password.sendKeys(pw);
	}
	
	
	public void reEnterPassord(String rpw)
	{
		retypepassword.sendKeys(rpw);
	}
	
	public void clickOnCreateUserButton()
	{
		createUserButton.click();
	}
	
	
}
