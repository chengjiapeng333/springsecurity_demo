package com.example.springsecurity.repo;

import com.example.springsecurity.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserRepository extends JpaRepository<SysUser, Long>{
    SysUser findByUsername(String username);
}
