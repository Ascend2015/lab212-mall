package cn.lab212.mall.admin.config;

import cn.lab212.mall.common.config.BaseSwaggerConfig;
import cn.lab212.mall.common.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author yinck
 * @version 1.0
 * @date 2022-01-21 01:43
 */
@Configuration
public class SwaggerConfig extends BaseSwaggerConfig {
    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("cn.lab212.mall.controller")
                .title("后台系统")
                .description("mall后台相关接口")
                .contactName("xiaoyin")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }
}
