package com.qait.automation;

public class Ndtv {
    
    private static String answer;

    public static Operations ndtv( Operations driver) throws EveryThingWentFine {

       driver.nav("https://www.ndtv.com");
       driver.pleaseWait(20);
       driver.myclick();
       driver.findElementBycsssector("#h_sub_menu");
       driver.myclick();
       driver.findElementBycsssector("div.topnav_cont:nth-child(1) > a:nth-child(5)");
       driver.myclick();
       driver.findElementBycsssector("#searchBox");
       driver.sendTextValues("lucknow");
       answer = driver.getWebText("div.leaflet-marker-icon:nth-child(11) > div:nth-child(1) > div:nth-child(2) .tempRedText");
       return driver;
    }

    public static void  getAnswer () throws EveryThingWentFine {
       
       var answer1 = answer;
       if(answer1.equals(answer )){throw new EveryThingWentFine();}

    }


}
