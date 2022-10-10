package org.yzr.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class TbPackage implements Serializable {

    private String id;

    private String buildVersion;

    private String buildId;

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
