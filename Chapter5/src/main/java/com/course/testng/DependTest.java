package com.course.testng;

import org.testng.annotations.Test;

public class DependTest {
    //依赖测试

    @Test
    public void test1(){
        System.out.println("test1 run");
        throw new RuntimeException(); //被依赖的test1失败之后，test2将不会执行，被忽略
    }

    //test2依赖test1，只执行test2时，会先执行test1再执行test2
    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run");
    }

}
