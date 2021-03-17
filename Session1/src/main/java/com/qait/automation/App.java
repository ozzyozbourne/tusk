package com.qait.automation;


import java.io.IOException;

public class App
{
    public static void main( String[] args ) throws IOException
    {
        Questiona a = new Questiona();
        a.runner();
        System.out.println( "Answer 2\n" );
        Questionb.qwerty();

    }
}
