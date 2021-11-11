package com.example.autotest;

import org.springframework.test.context.event.annotation.BeforeTestMethod;
import org.testng.annotations.*;

public class AutoTest {

    @Test
    public void test1(){
        System.out.println("Test张航是我儿");
    }

    @Test
    public void test2(){
        System.out.println("sss");
    }


    @BeforeMethod
    public  void beforeMethod(){
        System.out.println("测试方法之前执行的");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("测试方法之后执行的");
    }


    @BeforeClass
    public void BeforeClass(){
        System.out.println("类1");
    }


    @AfterClass
    public void AfterClass(){
        System.out.println("类2");
    }

    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("before测试套件");
    }

    @AfterSuite
    public void AfterSuite(){
        System.out.println("after测试套件");
    }



}
