package com.example.demo.dao;


import com.example.demo.vo.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2017/6/8.
 */
public interface SysUserRepository extends JpaRepository<SysUser, Long> {
    SysUser findByUsername(String username);
}
