package Qspiders;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Books {

	public Books(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getBooksLink() {
		return booksLink;
	}

	@FindAll({@FindBy(linkText = "books"),@FindBy(partialLinkText = "BOOKS")})
	private WebElement booksLink;
	
	@FindBy(id = "products-orderby")
	private WebElement sortByDD;

	public WebElement getSortByDD() {
		return sortByDD;
	}

}
