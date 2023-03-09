package com.mine.ts.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

/**
 * @author CaoY
 * @date 2022-12-20 17:24
 * @description 用户实体类
 */
@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@RequiredArgsConstructor
public class User {
    
    private Long id;

    private final String username;
    private final String password;
    private final String fullname;
    private final String street;
    private final String city;
    private final String state;
    private final String zip;
    private final String phone;



    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    // 账号是否未过期
    public boolean isAccountNonExpired() {
        return true;
    }

    // 账号是否未锁定
    public boolean isAccountNonLocked() {
        return true;
    }

    // 是否证书未过期
    public boolean isCredentialsNonExpired() {
        return true;
    }

    // 是否启用
    public boolean isEnabled() {
        return true;
    }
}
