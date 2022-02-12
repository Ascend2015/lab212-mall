package cn.lab212.mall.portal.service;

import cn.lab212.mall.model.UmsMember;

/**
 * @author yinck
 * @version 1.0
 * @date 2021-09-30 00:25
 */
public interface UmsMemberCacheService {
    /**
     * 删除会员用户缓存
     */
    void delMember(Long memberId);

    /**
     * 获取会员用户缓存
     */
    UmsMember getMember(Long memberId);

    /**
     * 设置会员用户缓存
     */
    void setMember(UmsMember member);

    /**
     * 设置验证码
     */
    void setAuthCode(String telephone, String authCode);

    /**
     * 获取验证码
     */
    String getAuthCode(String telephone);
}
