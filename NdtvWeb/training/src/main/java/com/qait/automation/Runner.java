package com.qait.automation;

class Runner {
   
    private Operations  driver;

    public static void choice(String input) throws EveryThingWentFine {
        
        input = input.toUpperCase();
        var obj = new Runner();
        
        if( input.equals("FIREFOXDRIVER") ) { obj.driver = new Operations( Setup.fireFoxDriverSetup() ); }
        if( input.equals("CHROMEDRIVER") )  { obj.driver = new Operations( Setup.chromeDriverSetup()  ); }
        if( input.equals("EDGEDRIVER"  ) )  { obj.driver = new Operations( Setup.edgeDriverSetup()    ); }
        if( input.equals("OPERADRIVER" ) )  { obj.driver = new Operations( Setup.operaDriverSetup()   ); }

        obj.navigate();

    }

    private void navigate() throws EveryThingWentFine {
       
      driver = Ndtv.ndtv(driver);  

      driver.end();
      Ndtv.getAnswer();

    }

    
}
