package com.mapper;

import com.SpringBootMybatisWebApplicationTests;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pojo.SysUser;
import com.service.impl.SysUserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SysUserMapperTest extends SpringBootMybatisWebApplicationTests {

    @Autowired
    SysUserServiceImpl service;


    //测试用户表
    @Test
    public void hello(){
       List<SysUser> list= service.list();
       list.forEach(System.out::println);
    }


    @Test
    public void aaa(){
        System.out.println("进入了分页");
        PageHelper.startPage(1,5);
        List<SysUser> app=service.Select_aaa();
        PageInfo<SysUser> pageInfo = new PageInfo<>(app,5);
        System.out.println(pageInfo);
    }


}