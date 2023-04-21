package com.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mapper.SysRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pojo.SysUser;
import com.mapper.SysUserMapper;
import com.service.SysUserService;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Map;

@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService{

    @Autowired
    SysUserMapper mapper;

    @Override
    public List<SysUser> Select_aaa() {
        return mapper.Select_aaa();
    }

    @Override
    public List<SysUser> Select_Like(String queryRealName, Integer queryRoleId) {
        return mapper.Select_Like(queryRealName,queryRoleId);
    }

    @Override
    public List<SysUser> Select_ByID(Integer ID) {
        return mapper.Select_ByID(ID);
    }


}
