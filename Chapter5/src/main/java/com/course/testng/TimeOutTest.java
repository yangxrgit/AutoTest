package com.course.testng;

import org.testng.annotations.Test;

public class TimeOutTest {
    //超时测试

    @Test(timeOut = 3000)//单位为毫秒
    public void testSuccess() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Test(timeOut = 2000)
    public void testFailed() throws InterruptedException {
        Thread.sleep(3000);
    }
}
