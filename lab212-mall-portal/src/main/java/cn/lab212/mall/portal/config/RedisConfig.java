package cn.lab212.mall.portal.config;

import cn.lab212.mall.common.config.BaseRedisConfig;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

/**
 * @author yinck
 * @version 1.0
 * @date 2021-09-29 20:49
 */
@EnableCaching
@Configuration
public class RedisConfig extends BaseRedisConfig {
}
