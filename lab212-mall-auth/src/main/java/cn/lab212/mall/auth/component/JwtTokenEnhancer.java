package cn.lab212.mall.auth.component;

import cn.lab212.mall.auth.domain.SecurityUser;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yinck
 * @version 1.0
 * @date 2021-09-29 03:22
 */
@Component
public class JwtTokenEnhancer implements TokenEnhancer {
    @Override
    public OAuth2AccessToken enhance(OAuth2AccessToken oAuth2AccessToken, OAuth2Authentication oAuth2Authentication) {
        SecurityUser securityUser = (SecurityUser) oAuth2Authentication.getPrincipal();
        Map<String, Object> info = new HashMap<>();
        //把用户id设置到jwt中
        info.put("id", securityUser.getId());
        info.put("client_id", securityUser.getClientId());
        ((DefaultOAuth2AccessToken) oAuth2AccessToken).setAdditionalInformation(info);
        return oAuth2AccessToken;
    }
}
