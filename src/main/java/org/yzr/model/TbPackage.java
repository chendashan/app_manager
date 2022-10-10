package org.yzr.model;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;

@Data
public class TbPackage implements Serializable {

    private String id;

    private String buildVersion;

    @TableField("bundleid")
    private String bundleId;

    private Long createTime;

    private Integer minVersion;

    private String name;

    private String platform;

    private Integer size;

    private String version;

    private String appId;

    private String iconFileId;

    private String sourceFileId;

}
