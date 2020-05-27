package com.shx.securityConfig;


import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class MypasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence charSequence) {
        //定义加密规则并返回加密后的密码
        return charSequence.toString();//此处我们就不加密了，直接返回明文
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return charSequence.equals(s);//上面没有加密，此处也就不用解密了
    }
}
