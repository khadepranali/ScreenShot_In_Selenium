package com.ScreenQA;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FacebookScreenShot
{
    public static void main(String[] args) throws IOException
    {
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://www.facebook.com");

        TakesScreenshot ts=(TakesScreenshot)driver;

        File source=ts.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(source,new File("./ScreenShot1/facebook.png"));

        System.out.println("Screenshot Taken");


    }
}
