package com.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojo.SysRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface SysRoleMapper extends BaseMapper<SysRole> {

    @Update("update `t_sys_role` set role_name=#{RoleName} where id = #{id}")
    Integer roleForm(@Param("id") Integer id,@Param("RoleName") String RoleName);//修改


}