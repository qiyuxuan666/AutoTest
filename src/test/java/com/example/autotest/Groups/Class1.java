package com.example.autotest.Groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Class1 {

    @Test(groups = "server")
    public  void test1(){
        System.out.println("这是服务端租的测试方法111111");
    }

    @Test(groups = "server")
    public  void test2(){
        System.out.println("这是服务端租的测试方法22222");
    }

    @Test(groups = "client")
    public  void test3(){
        System.out.println("这是客户端租的测试方法33333333");
    }

    @Test(groups = "client")
    public  void test4(){
        System.out.println("这是客户端租的测试方法444444444444444");
    }


    @BeforeGroups("server")
    public  void BeforeGroups(){
        System.out.println("这是服务端租运行之前的测试方法！！！！！！！！");
    }

    @AfterGroups("server")
    public  void AfterGroups(){
        System.out.println("这是服务端租运行之后的测试方法！！！！！！！！！！！");
    }
}

