package com.course.testng.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
    //TestNG参数化测试
    //通过在resource/parameter.xml中指定参数

    @Test
    @Parameters({"name","age"})//参数，具体写在配置项文件中
    public void paramTest1(String name,int age){
        System.out.println("nam = "+name+";  age = "+age);

    }
}
