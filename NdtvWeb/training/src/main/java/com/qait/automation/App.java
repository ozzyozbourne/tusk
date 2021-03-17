package com.qait.automation;

public class App 
{
    public static void main( String[] args )
    {
        
        Thread var1 = new Thread( new Multibrowsers( "firefoxdriver")); 
        Thread var2 = new Thread( new Multibrowsers( "chromedriver" )); 
        Thread var3 = new Thread( new Multibrowsers( "operadriver"  )); 
        Thread var4 = new Thread( new Multibrowsers( "edgedriver"   )); 
        
         var1.start();
         var2.start();
         var3.start();
         var4.start();
        
    }
}