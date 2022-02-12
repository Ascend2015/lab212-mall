package cn.lab212.mall.portal.service;

import cn.lab212.mall.common.api.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @author yinck
 * @version 1.0
 * @date 2021-09-30 00:34
 */
@FeignClient("mall-auth")
public interface AuthService {

    @PostMapping(value = "/oauth/token")
    CommonResult getAccessToken(@RequestParam Map<String, String> parameters);
}
