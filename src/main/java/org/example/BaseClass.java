package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
//import io.cucumber.java.en.Given;

import java.io.File;

public class BaseClass {
    public WebDriver driver;


    public W3SchoolsHomePage w3;

    @BeforeTest
    public void browserStart() {
//        driver = new ChromeDriver();
        driver = new EdgeDriver();
        driver.get("https://www.google.com/");
//        driver.get("https://www.w3schools.com/html/html_tables.asp");
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }

    public void CaptureScreenshot(WebDriver driver, String ghv) {
        {
            try{
                TakesScreenshot screenshot = (TakesScreenshot) this.driver;
                File srcFile = screenshot.getScreenshotAs(OutputType.FILE);

                // Specify the location where screenshot will be saved
                File destFile = new File("D:\\OTR\\screenshot.jpeg");

                // Copy the screenshot to the specified location
                FileUtils.copyFile(srcFile, destFile);

                System.out.println("Screenshot taken and saved at: " + destFile.getAbsolutePath());
            } catch (Exception e) {
                System.out.println("An error occurred while taking screenshot: " + e.getMessage());
            }
        }
    }


    @AfterTest
    public void endSession() {
        driver.quit();
    }
}