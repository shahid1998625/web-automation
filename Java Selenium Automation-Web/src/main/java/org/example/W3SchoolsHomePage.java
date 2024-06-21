package org.example;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class W3SchoolsHomePage extends BaseClass {

    @FindBy(xpath = "//textarea[@class='gLFyf']")
        private WebElement TextArea;
        public WebElement getTextArea(){
            return TextArea;
        }
    @FindBy(xpath = "(//input[@value='Google Search'])[2]")
        private WebElement SearchBtn;
        public WebElement getSearchBtn(){
            return SearchBtn;
        }

//table[@id='customers']/tbody/tr[5]/td[1]/following::td[1]





}
