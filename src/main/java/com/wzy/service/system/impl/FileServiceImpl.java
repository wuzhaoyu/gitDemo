package com.wzy.service.system.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.wzy.entity.system.File;
import com.wzy.mapper.system.FileMapper;
import com.wzy.service.system.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * <p>
 * 文件表 服务实现类
 * </p>
 *
 * @author zzw
 * @since 2018-08-01
 */
@Service
public class FileServiceImpl extends ServiceImpl<FileMapper, File> implements FileService {

    @Autowired
    private FileMapper fileMapper;
}
