package com.course.testng.multiThread;

import org.testng.annotations.Test;

public class MultiThreadOnAnnotion {
    //多线程测试-通过注解实现

    //10个线程 invocationCount线程数 threadPoolSize线程池数
    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test(){
        System.out.println(1);
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }
}
