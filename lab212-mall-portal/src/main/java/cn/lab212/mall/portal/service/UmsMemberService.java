package cn.lab212.mall.portal.service;

import cn.lab212.mall.common.api.CommonResult;
import cn.lab212.mall.common.domain.UserDto;
import cn.lab212.mall.model.UmsMember;

/**
 * @author yinck
 * @version 1.0
 * @date 2021-09-29 21:53
 */
public interface UmsMemberService {

    public UmsMember getByUsername(String username);

    public UmsMember getById(Long id);

    public void register(String username, String password, String telephone, String authCode);

    public String generateAuthCode(String telephone);

    public void updatePassword(String telephone, String password, String authCode);

    public UmsMember getCurrentMember();

    public void updateIntegration(Long id, Integer integration);

    public UserDto loadUserByUsername(String username);

    public CommonResult login(String username, String password);
}
