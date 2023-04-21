package com.service;

import com.pojo.SysRole;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;


public interface SysRoleService extends IService<SysRole>{

    Integer roleForm(Integer id,String RoleName);//修改

}
