package cn.lab212.mall.common.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author yinck
 * @version 1.0
 * @date 2021-01-14 16:41
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class WebLog {

    private String description;

    private String username;

    private Long startTime;

    private Integer spendTime;

    private String basePath;

    private String uri;

    private String url;

    private String method;

    private String ip;

    private Object parameter;

    private Object result;
}
