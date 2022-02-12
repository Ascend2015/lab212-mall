package cn.lab212.mall.config;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author yinck
 * @version 1.0
 * @date 2021-09-30 13:23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Component
@ConfigurationProperties(prefix = "secure.ignore")
public class IgnoreUrlsConfig {

    private List<String> urls;
}
