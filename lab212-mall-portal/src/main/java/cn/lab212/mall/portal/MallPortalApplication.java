package cn.lab212.mall.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author yinck
 * @version 1.0
 * @date 2021-09-29 15:49
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "cn.lab212.mall")
public class MallPortalApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallPortalApplication.class, args);
    }
}
