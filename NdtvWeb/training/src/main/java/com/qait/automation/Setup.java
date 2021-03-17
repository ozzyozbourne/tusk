package com.qait.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;

class Setup {
    
     
    static WebDriver fireFoxDriverSetup() {
         
         WebDriverManager.firefoxdriver().setup();
         var firefoxDriver = new FirefoxDriver(); 
         firefoxDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
         return firefoxDriver;

     }

 
     static WebDriver chromeDriverSetup(){

        WebDriverManager.chromedriver().setup();
        var chromedriver = new ChromeDriver();
        chromedriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return chromedriver;

     }

     static WebDriver operaDriverSetup(){

        WebDriverManager.operadriver().setup();
        var operadriver = new OperaDriver();
        operadriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return operadriver;

     }

     static WebDriver edgeDriverSetup(){

        WebDriverManager.edgedriver().setup();
        var edgedriver = new EdgeDriver();
        edgedriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return edgedriver;
        
     }


}
