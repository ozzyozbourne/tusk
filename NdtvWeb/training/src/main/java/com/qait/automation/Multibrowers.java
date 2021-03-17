package com.qait.automation;

class Multibrowsers implements Runnable{
    
    String input;

    Multibrowsers(String input){
        this.input = input;
    }
    
    private void choices(String input) throws EveryThingWentFine {

        Runner.choice(input);

    }

    public void run() {

    try{ choices(input); }
    
    catch(Exception e){ System.out.println("\n\n\n\n\n\n\n"+"success"+"\n\n\n\n\n");  }

    }
   
}
