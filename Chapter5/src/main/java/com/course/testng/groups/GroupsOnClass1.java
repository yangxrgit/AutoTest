package com.course.testng.groups;

import org.testng.annotations.Test;

//注解写在类上，不写在方法上
@Test(groups = "stu")
public class GroupsOnClass1 {
    //TestNG组测试
    //类分组

    public void stu1(){
        System.out.println("GroupsOnClass1中的stu1111运行");

    }

    public void stu2(){
        System.out.println("GroupsOnClass1中的stu2222运行");

    }

    public void stu3(){
        System.out.println("GroupsOnClass1中的stu3333运行");

    }
}
