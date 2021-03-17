package com.qait.automation;

import org.testng.annotations.Test;

public class AppTest 
{
    @Test(expectedExceptions = EveryThingWentFine.class)
    public void myTest1() throws Exception{
         
        Runner.choice("FIREFOXDRIVER");

    }

    
    @Test(expectedExceptions = EveryThingWentFine.class)
    public void myTest2() throws Exception{
         
        Runner.choice("OPERADRIVER");

    }

    
    @Test(expectedExceptions = EveryThingWentFine.class)
    public void myTest3() throws Exception{
         
        Runner.choice("EDGEDRIVER");

    }

    
    @Test(expectedExceptions = EveryThingWentFine.class)
    public void myTest4() throws Exception{
         
        Runner.choice("CHROMEDRIVER");

    }
   
}
