package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsOnClass3 {
    //TestNG组测试
    //类分组

    public void teacher1(){
        System.out.println("GroupsOnClass3中的teacher1运行");

    }

    public void teacher2(){
        System.out.println("GroupsOnClass3中的teacher2运行");

    }

    public void teacher3(){
        System.out.println("GroupsOnClass3中的teacher3运行");

    }
}
