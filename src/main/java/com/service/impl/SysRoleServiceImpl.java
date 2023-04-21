package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mapper.SysRoleMapper;
import com.pojo.SysRole;
import com.service.SysRoleService;
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService{

    @Autowired
    SysRoleMapper mapper;

    @Override
    public Integer roleForm(Integer id, String RoleName) {
        return mapper.roleForm(id, RoleName);
    }
}
