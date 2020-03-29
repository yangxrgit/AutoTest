package com.course.testng;

import org.testng.annotations.*;


public class BasicAnnotation {

    //最基本的注解：用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.println("这是测试用例1");
    }

    //标注为测试方法
    @Test
    public void testCase2(){
        System.out.println("这是测试用例2");
    }

    //在每一个@Test的方法之前运行
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod，这是在测试方法之前运行的");
    }

    //在每一个@Test的方法之后运行
    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod，这是在测试方法之后运行的");
    }

    //在每一个类运行之前运行
    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass，这是在类运行之前运行的");
    }

    //在每一个类运行之后运行
    @AfterClass
    public void afterClass(){
        System.out.println("afterClass，这是在类运行之后运行的");
    }

    //在每一个测试套件之前运行
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite测试套件，这是在测试套件之前运行的");
    }

    //在每一个测试套件运行之后运行
    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite测试套件，这是在测试套件之后运行的");
    }

    //包含关系：测试套件、类、方法，类属于测试套件。

}
