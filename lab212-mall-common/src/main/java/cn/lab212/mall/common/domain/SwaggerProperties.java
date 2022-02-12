package cn.lab212.mall.common.domain;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author yinck
 * @version 1.0
 * @date 2021-01-14 18:44
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Builder
public class SwaggerProperties {

    private String apiBasePackage;

    private boolean enableSecurity;

    private String title;

    private String description;

    private String version;

    private String contactName;

    private String contactUrl;

    private String contactEmail;
}
