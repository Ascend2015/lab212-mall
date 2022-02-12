package cn.lab212.mall.auth.service;

import cn.lab212.mall.common.domain.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author yinck
 * @version 1.0
 * @date 2021-09-29 15:24
 */
@FeignClient("mall-admin")
public interface UmsAdminService {

    @GetMapping("/admin/loadByUsername")
    UserDto loadUserByUsername(@RequestParam String username);

}
