package com.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mapper.SysUserMapper;
import com.mapper.UserMapper;
import com.pojo.SysUser;
import com.pojo.User;
import com.service.SysUserService;
import com.service.USerService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements USerService {
}
