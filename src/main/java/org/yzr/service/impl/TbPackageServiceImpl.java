package org.yzr.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.yzr.mapper.TbPackageMapper;
import org.yzr.model.TbPackage;
import org.yzr.service.TbPackageService;

import java.util.List;

@Service
public class TbPackageServiceImpl extends ServiceImpl<TbPackageMapper, TbPackage> implements TbPackageService {

    @Override
    public List<TbPackage> getAllTbPackage() {

        return null;
    }
}
