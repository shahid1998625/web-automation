package org.example;

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.usermodel.Paragraph;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import java.io.FileInputStream;
import java.io.FileOutputStream;
//import org.apache.poi.hwp.HWPFDocument;
//import org.apache.poi.hwp.usermodel.Paragraph;
//import org.apache.poi.hwp.usermodel.Picture;
//import org.apache.poi.hwp.usermodel.Range;

public class googlelandingPage extends BaseClass {

    @Test
//    @Then
    public void StartGoogleTest() throws Exception {
//        WebDriver driver1;
//        driver1 = new EdgeDriver();
//        driver1.get("https://www.google.com/");
//        driver.get("https://www.w3schools.com/html/html_tables.asp");
        driver.manage().window().maximize();
        String st = driver.getTitle();
        System.out.println(st);
        WebElement TextBox1 = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
        TextBox1.sendKeys("Quality Matrix");

        TextBox1.sendKeys(Keys.ENTER);

        // WebElement table = driver.findElement(By.xpath("//table[@id='customers']/tbody"));
//        List <WebElement> rows = driver.findElements(By.xpath("//tr[5]"));
//        for(WebElement row: rows){
//            List<WebElement> columns = row.findElements(By.xpath("//td[2]"));
//            for (WebElement column: columns){
//                String celltext = column.getText();
//                System.out.println(celltext);
//            }
//        }


//        w3.getTextArea().sendKeys("Quality Matrix");
//        w3.CaptureScreenshot(driver, "OUT");
//        w3.getTextArea().sendKeys(Keys.ENTER);
//        w3.CaptureScreenshot(driver, "OUTq");
        //        w3.getSearchBtn().click();
//        CaptureScreenshot(driver);


// Define paths for screenshot and Word doc

//
//// Open or create a new Word document

//        CaptureScreenshot(driver,"SIJS");

//        public void CaptureScreenshot(WebDriver driver) throw Exception{
//            {
                try{
                    TakesScreenshot screenshot = (TakesScreenshot)driver;
                    File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
                    File destFile = new File("D:\\OTR\\screenshot.jpeg");
                    Thread.sleep(3000);
                    FileUtils.copyFile(srcFile, destFile);
                    Thread.sleep(3000);
                    System.out.println("Screenshot taken and saved at: " + destFile.getAbsolutePath());
                } catch (Exception e) {
                    System.out.println("An error occurred while taking screenshot: " + e.getMessage());
                }


    }

        }//}

//        w3.CaptureScreenshot(driver,"SS");
//            Keys.ENTER();
//            thread.sleep(3000);

        //WebElement ele2 = driver.findElement(By.xpath("(//input[@value='Google Search'])[2]"));
//            ele2.click();
//            Keys.ENTER(ele2);

//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


//        finally {
//        driver.quit();
//    }
//    }
//    }


//        JavascriptExecutor jse = ((JavascriptExecutor) driver



//}

