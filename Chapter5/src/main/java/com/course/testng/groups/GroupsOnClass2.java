package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass2 {
    //TestNG组测试
    //类分组

    public void stu1(){
        System.out.println("GroupsOnClass2中的stu1111运行");

    }

    public void stu2(){
        System.out.println("GroupsOnClass2中的stu2222运行");

    }

    public void stu3(){
        System.out.println("GroupsOnClass2中的stu3333运行");

    }
}
