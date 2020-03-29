package com.course.testng;

import org.testng.annotations.Test;

public class IgnoreTest {
    //忽略测试

    //会被执行
    @Test
    public void ignore1(){
        System.out.println("ignore1 执行");
    }

    //不想执行
    @Test(enabled = false)
    public void ignore2(){
        System.out.println("ignore2 执行");
    }

    //会被执行
    @Test(enabled = true)
    public void ignore3(){
        System.out.println("ignore3 执行");
    }
}
