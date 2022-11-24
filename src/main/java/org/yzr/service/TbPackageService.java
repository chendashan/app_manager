package org.yzr.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.yzr.model.TbPackage;

import java.util.List;

public interface TbPackageService extends IService<TbPackage> {

    List<TbPackage> getAllTbPackage();

    Integer getLastPosition();
}
