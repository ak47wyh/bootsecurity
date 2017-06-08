package com.example.demo.service;

import com.example.demo.dao.SysUserRepository;
import com.example.demo.vo.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/6/8.
 */
@Service
public class CustUserService implements UserDetailsService {

    @Autowired
    private SysUserRepository sysUserRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUser sysUser = sysUserRepository.findByUsername(username);
        if(sysUser==null){
            throw new UsernameNotFoundException("username is null!");
        }
        return sysUser;
    }
}
