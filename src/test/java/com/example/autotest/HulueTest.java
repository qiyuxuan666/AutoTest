package com.example.autotest;

import org.testng.annotations.Test;

public class HulueTest {

    @Test
    public void Hulue1(){
        System.out.println("忽略1测试");
    }

    @Test(enabled = false)
    public void  Hulue2(){
        System.out.println("忽略2测试");
    }
}
