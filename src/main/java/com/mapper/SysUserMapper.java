package com.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.pojo.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {


    List<SysUser> Select_aaa();

    List<SysUser> Select_Like(@Param("realName") String realName,@Param("roleID") Integer roleID);

    List<SysUser> Select_ByID(@Param("ID") Integer ID);




}