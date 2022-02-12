package cn.lab212.mall.portal.service.impl;

import cn.lab212.mall.common.annotation.CacheException;
import cn.lab212.mall.common.service.RedisService;
import cn.lab212.mall.model.UmsMember;
import cn.lab212.mall.portal.service.UmsMemberCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author yinck
 * @version 1.0
 * @date 2021-09-30 00:25
 */
@Service
public class UmsMemberCacheServiceImpl implements UmsMemberCacheService {

    @Autowired
    private RedisService redisService;
    @Value("${redis.database}")
    private String REDIS_DATABASE;
    @Value("${redis.expire.common}")
    private Long REDIS_EXPIRE;
    @Value("${redis.expire.authCode}")
    private Long REDIS_EXPIRE_AUTH_CODE;
    @Value("${redis.key.member}")
    private String REDIS_KEY_MEMBER;
    @Value("${redis.key.authCode}")
    private String REDIS_KEY_AUTH_CODE;

    @Override
    public String getAuthCode(String telephone) {
        return null;
    }

    @Override
    public void delMember(Long memberId) {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_MEMBER + ":" + memberId;
        redisService.del(key);
    }

    @Override
    public UmsMember getMember(Long memberId) {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_MEMBER + ":" + memberId;
        return (UmsMember) redisService.get(key);
    }

    @CacheException
    @Override
    public void setMember(UmsMember member) {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_MEMBER + ":" + member.getId();
        redisService.set(key, member, REDIS_EXPIRE);
    }

    @CacheException
    @Override
    public void setAuthCode(String telephone, String authCode) {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_AUTH_CODE + ":" + telephone;
        redisService.set(key, authCode, REDIS_EXPIRE_AUTH_CODE);
    }
}
