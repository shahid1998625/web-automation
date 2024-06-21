package StepDefinationFile;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.BaseClass;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;

import java.util.concurrent.TimeUnit;

public class LaunchPage extends BaseClass {

    @Given("User Launches Browser")
    public void User_Launches_Browser() {
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
//        driver.get("https://www.w3schools.com/html/html_tables.asp");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @When("User Searches for {}")
    public void User_Searches_for(String st){
        String str = driver.getTitle();
        System.out.println(str);
        w3.getTextArea().sendKeys(st);
//        w3.getSearchBtn().click();

    }
    @Then("User Clicks on Search Button")
    public void User_Clicks_on_Search_Button(){
        w3.getSearchBtn().click();

    }


}
