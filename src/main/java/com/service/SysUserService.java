package com.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.pojo.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SysUserService extends IService<SysUser>{


    List<SysUser> Select_aaa();

    List<SysUser> Select_Like(String realName,Integer roleID);

    //根据id查询
    List<SysUser> Select_ByID( Integer ID);



}
