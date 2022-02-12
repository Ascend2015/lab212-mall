package cn.lab212.mall.auth.config;

import cn.lab212.mall.common.config.BaseSwaggerConfig;
import cn.lab212.mall.common.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author yinck
 * @version 1.0
 * @date 2021-09-29 01:34
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {
    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("cn.lab212.mall.auth.controller")
                .title("mall认证中心")
                .description("mall认证中心相关接口文档")
                .contactName("macro")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }
}
