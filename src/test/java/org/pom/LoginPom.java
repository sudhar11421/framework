package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPom extends BaseClass {
	public LoginPom() {
		PageFactory.initElements(driver,this);

	}
	@FindBy(how=How.XPATH, using="(//input[@type='text'])[1]")
	private WebElement searchbox;
	
	public WebElement getsearchbox() {
		return searchbox;
	}
	@FindBy(how = How.XPATH, using="//button[@seleniumid='sel_srcBtn']")
	private WebElement searchbutton;

	public WebElement getsearchbutton() {
		return searchbutton;
	}
	@FindBy(how = How.XPATH, using="(//div[@class=' product-name ellipsis-two-line mobile-product-name'])[3]")
	private WebElement findphone;
	
	public WebElement getfindphone() {
		return findphone;	
	}
	
	@FindBy(how= How.XPATH ,using="(//div[@class='n2_N_rippleContainer'])[4]")
	private WebElement addCart1;

	public WebElement getAddCart1() {
		return addCart1;
		
	}
	
	@FindBy(how = How.XPATH, using="(//div[@class=' product-name ellipsis-two-line mobile-product-name'])[4]")
	private WebElement findIphone13;
	
	public WebElement getfindIphone13() {
		return findIphone13;	
	}
	
	@FindBy(how= How.XPATH ,using="(//div[@class='n2_N_rippleContainer'])[5]")
	private WebElement addCart2;

	public WebElement getAddCart2() {
		return addCart2;
		
	}

	
}
//	
//	@FindBy(how = How.XPATH, using="(//div[@class=' product-name ellipsis-two-line mobile-product-name'])[4]")
//	private WebElement findIphone13;
//	
//	public WebElement getfindIphone13() {
//		return findIphone13;	
//	}
//	
//	@FindBy(how= How.XPATH ,using="(//div[@class='n2_N_rippleContainer'])[5]")
//	private WebElement addCart2;
//
//	public WebElement getAddCart3() {
//		return addCart3;
//		
//	}
//	
//	@FindBy(how = How.XPATH, using="(//div[@class=' product-name ellipsis-two-line mobile-product-name'])[4]")
//	private WebElement findIphone13;
//	
//	public WebElement getfindIphone13() {
//		return findIphone13;	
//	}
//	
//	@FindBy(how= How.XPATH ,using="(//div[@class='n2_N_rippleContainer'])[4]")
//	private WebElement addCart2;
//
//	public WebElement getAddCart4() {
//		return addCart4;
//		
//	}
//	
//	@FindBy(how = How.XPATH, using="(//div[@class=' product-name ellipsis-two-line mobile-product-name'])[4]")
//	private WebElement findIphone13;
//	
//	public WebElement getfindIphone13() {
//		return findIphone13;	
//	}
//	
//	@FindBy(how= How.XPATH ,using="(//div[@class='n2_N_rippleContainer'])[4]")
//	private WebElement addCart5;
//
//	public WebElement getAddCart2() {
//		return addCart5;
//		
//	}
//}
		
//	} 
//	@FindBy(how= How.XPATH,using="(//span[text()='Add to Cart'])[1]")
//	private WebElement Addtocart;
//
//	public WebElement getAddtocart() {
//		return Addtocart;
//	}
//	@FindBy(how= How.XPATH,using="(//a[@href='/products/henna-body-lotion'])[1]")
//	private WebElement lotion;
//
//	public WebElement getLotion() {
//		return lotion;
//
//	}
//	@FindBy(how = How.XPATH, using="//div[text()='ADD TO CART']")
//	private WebElement addcart;
//
//	public WebElement getAddcart() {
//		return addcart;
//	} 
//	@FindBy(how= How.ID,using="size_33203932")
//	private WebElement size;
//
//	public WebElement getSize() {
//		return size;
//	}
//	@FindBy(how = How.XPATH, using="//div[text()=' PROCEED ']")
//	private WebElement Proceed;
//
//	public WebElement getProceed() {
//		return Proceed;
//	}
//	@FindBy(how = How.XPATH, using="//a[text()='BUY NOW']")
//	private WebElement buy;
//
//	public WebElement getbuy() {
//		return buy;
//	}
//	@FindBy(how = How.XPATH, using="//label[text()='Full Name*']")
//	private WebElement name;
//
//	public WebElement getname() {
//		return name;
//	}
//
//	@FindBy(how= How.ID ,using="address_mobile_-1")
//	private WebElement mobnum;
//
//	public WebElement getMobnum() {
//		return mobnum;
//	}
//	@FindBy(how= How.ID,using="address_pincode_-1")
//	private WebElement pincode;
//
//	public WebElement getpincode() {
//		return pincode;
//	}
//	@FindBy(how= How.ID,using="address_city_-1")
//	private WebElement city;
//
//	public WebElement getcity() {
//		return city;
//	}
//	@FindBy(how= How.ID ,using="address_state_-1")
//	private WebElement state;
//
//	public WebElement getstate() {
//		return state;
//	}
//	@FindBy(how = How.XPATH, using="//div[@class='pA t0 l0 r0 b0 dN disabled_click_listener']")
//	private WebElement localityarea;
//
//	public WebElement getlocalityarea() {
//		return localityarea;
//
//	}
//	@FindBy(how= How.ID,using="address_house_no_-1")
//	private WebElement houseno;
//
//	public WebElement gethouseno() {
//		return houseno;
//	}
//	@FindBy(how= How.ID,using="address_street_-1")
//	private WebElement street;
//
//	public WebElement getstreet() {
//		return street;
//
//	}
//	@FindBy(how = How.XPATH, using="//label[text()='Home']")
//	private WebElement home;
//
//	public WebElement getHome() {
//		return home;		
//	}
//
//	@FindBy(how = How.XPATH, using="//input[@value='CONFIRM ADDRESS']")
//	private WebElement ConfirmAdd;
//
//	public WebElement getConfirmAddress() {
//		return ConfirmAdd;		
//	}


