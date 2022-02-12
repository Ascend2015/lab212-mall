package cn.lab212.mall.portal.config;

import cn.lab212.mall.common.config.BaseSwaggerConfig;
import cn.lab212.mall.common.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author yinck
 * @version 1.0
 * @date 2021-09-29 21:38
 */
@EnableSwagger2
@Configuration
public class SwaggerConfig extends BaseSwaggerConfig {
    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.macro.mall.portal.controller")
                .title("mall前台系统")
                .description("mall前台相关接口文档")
                .contactName("macro")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }
}
