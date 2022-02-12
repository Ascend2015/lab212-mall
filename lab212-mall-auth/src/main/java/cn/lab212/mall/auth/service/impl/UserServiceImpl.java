package cn.lab212.mall.auth.service.impl;

import cn.lab212.mall.auth.service.UmsAdminService;
import cn.lab212.mall.auth.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * @author yinck
 * @version 1.0
 * @date 2021-09-29 02:50
 */
@Service
public class UserServiceImpl implements UserDetailsService {

    @Autowired
    private UmsAdminService adminService;

    @Autowired
    private UmsMemberService memberService;

    @Autowired
    private HttpServletRequest request;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }
}
