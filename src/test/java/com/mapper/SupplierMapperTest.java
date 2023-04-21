package com.mapper;

import com.SpringBootMybatisWebApplicationTests;
import com.pojo.Supplier;
import com.pojo.SysUser;
import com.service.impl.SupplierServiceImpl;
import com.service.impl.SysUserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SupplierMapperTest extends SpringBootMybatisWebApplicationTests {

    @Autowired
    SupplierServiceImpl service;


    //测试用户表
    @Test
    public void hello(){
        List<Supplier> list= service.list();
        list.forEach(System.out::println);
    }




}