package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {
    //写测试套件之前运行的内容

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite 运行啦");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("after suite 运行啦");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("AfterTest");
    }
}
