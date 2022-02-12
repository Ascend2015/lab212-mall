package cn.lab212.mall.portal.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author yinck
 * @version 1.0
 * @date 2021-09-29 16:39
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"cn.lab212.mall.mapper", "cn.lab212.mall.portal.dao"})
public class MybatisConfig {
}
