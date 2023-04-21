package com.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pojo.StorageRecord;
import com.mapper.StorageRecordMapper;
import com.service.StorageRecordService;
@Service
public class StorageRecordServiceImpl extends ServiceImpl<StorageRecordMapper, StorageRecord> implements StorageRecordService{

}
