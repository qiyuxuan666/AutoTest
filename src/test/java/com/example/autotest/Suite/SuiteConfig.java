package com.example.autotest.Suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {
    @BeforeSuite
    public  void beforeSuite(){
        System.out.println("before suite运行了");
    }

    @AfterSuite
    public void AfterSuite(){
        System.out.println("after suite 运行");
    }

    @BeforeTest
    public void BeforeTest(){
        System.out.println("BeforeTest");
    }


    @AfterTest
    public void AfterTest(){
        System.out.println("BeforeTest");
    }
}
