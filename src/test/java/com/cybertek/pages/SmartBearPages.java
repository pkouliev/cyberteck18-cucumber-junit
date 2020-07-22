package com.cybertek.pages;

import com.cybertek.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SmartBearPages {

    public SmartBearPages()  {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(id = "ctl00_MainContent_username")
    public WebElement UserNameElement;

    @FindBy(id = "ctl00_MainContent_password")
    public WebElement PassWordElement;

    @FindBy(linkText = "Order")
    public WebElement orderElement;
    @FindBy(xpath = "//select[@id='ctl00_MainContent_fmwOrder_ddlProduct']")
    public WebElement productDropdownElement;

    @FindBy(xpath = "//input[@id='ctl00_MainContent_fmwOrder_txtQuantity']")
    public WebElement Quantity;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$txtName']")
    public WebElement customerNameElement;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox2']")
    public WebElement street;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox3']")
    public WebElement city;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox4']")
    public WebElement state;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox5']")
    public WebElement zip;

    @FindBy(xpath = "//input[@id='ctl00_MainContent_fmwOrder_cardList_0']")
    public WebElement VisaCard;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox6']")
    public WebElement cardNumber;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox1']")
    public WebElement dateOfBirth;

    @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement processButton;

    @FindBy(linkText = "View all orders")
    public WebElement AllOrder;

    @FindBy(xpath = "//tbody//td//tr/td[2]")
    public List<WebElement> names;


}
