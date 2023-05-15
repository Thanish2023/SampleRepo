package com.example.smaple;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest 
{
    @Test
    public void test1() {
    	System.out.println("Sample test");
    	Assert.assertEquals("Hi", "Hi");
    }
    
    @Test
    public void test2()
    {
    	System.out.println("Failure test");
    	Assert.assertEquals("Hello", "Hello");
    }
}