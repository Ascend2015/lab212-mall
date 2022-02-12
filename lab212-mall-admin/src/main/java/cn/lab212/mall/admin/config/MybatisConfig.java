package cn.lab212.mall.admin.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author yinck
 * @version 1.0
 * @date 2021-01-14 22:35
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"cn.lab212.mall.mapper","cn.lab212.mall.dao"})
public class MybatisConfig {
}
