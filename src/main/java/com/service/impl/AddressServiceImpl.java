package com.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mapper.AddressMapper;
import com.pojo.Address;
import com.service.AddressService;
@Service
public class AddressServiceImpl extends ServiceImpl<AddressMapper, Address> implements AddressService{

}
