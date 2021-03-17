package com.qait.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.util.Set;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class Operations {
    
    private WebDriver webDriver;
    private WebElement webElement;

    Operations(WebDriver webDriver){

        this.webDriver = webDriver;
     }

    public void nav(String navigateTo){
         
        webDriver.navigate().to(navigateTo);
     
    }

    public void findElementbyClass(String cl){

        webElement = webDriver.findElement(By.className(cl));
    
    }

    public WebElement findElementbyClass(String cl, String yes){

        var webElreturned = webDriver.findElement(By.className(cl));
        return webElreturned;
    
    }

    public void findElementBycsssector(String cl){

        webElement = webDriver.findElement(By.cssSelector(cl));

    }

    public WebElement findElementBycsssector(String cl, String yes){

        var webElreturned = webDriver.findElement(By.cssSelector(cl));
        return webElreturned;


    }

    public void myclick(){

       webElement.click();

    }

    public void myclick(WebElement webElement){

        webElement.click();
 
     }


    public void end(){

        webDriver.quit();
    }

    public void switchFrame(String frame){

        webDriver.switchTo().frame(frame);

    }

    public void toParentFrame(){

        webDriver.switchTo().parentFrame();

    }

    public void toDefaultFrame(){
        
        webDriver.switchTo().defaultContent();
    
    }

    public Actions buildActionObj(){

        Actions builder = new Actions(webDriver);
        return builder;

    }

    public String getMainWindowHandle(){

        var mainWinHand = webDriver.getWindowHandle();
        return mainWinHand;

    }

    public Set<String> allWinHandles(){

        var allHandles = webDriver.getWindowHandles();
        return allHandles;

    }
    
   public void switchToWindow(String window){

        webDriver.switchTo().window(window);

   }

   public void sendTextValues(String val){

        webElement.sendKeys(val);

   }

   public String getWebText(String val){

       var text = webDriver.findElement(By.cssSelector(val)).getText();
       return text;

   }

   public void configCookie(String[] sit){

        webDriver.manage().addCookie(new Cookie (sit[0], sit[1]));

   }

   public void pleaseWait(long timeToWait){

       var wait = new WebDriverWait(webDriver, timeToWait);
       webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".notnow")));
      

   }


}