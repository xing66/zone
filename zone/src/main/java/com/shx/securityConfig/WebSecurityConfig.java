package com.shx.securityConfig;

import com.shx.security.SpringSecurityUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


/**
 * ClassName: SecurityConfig
 * Description:
 * date: 2020/5/25 20:11
 *
 * @author sunshine
 * @version v1.0
 * @since JDK 1.8
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private SpringSecurityUserService userDetailsService;

    @Bean
    public MypasswordEncoder passwordEncoder() {
        return new MypasswordEncoder();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService)
                .passwordEncoder(passwordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests()
                // 如果有允许匿名的url，填在下面
//                .antMatchers().permitAll()
                .anyRequest().authenticated()
                .and()
                // 设置登陆页
                .formLogin().loginPage("/signIn").loginProcessingUrl("/login")
                // 设置登陆成功页
                .defaultSuccessUrl("/index")
                .failureUrl("/errorPage")
                .permitAll()
                // 自定义登陆用户名和密码参数，默认为username和password
                .usernameParameter("username")
                .passwordParameter("password")
                .and().sessionManagement().invalidSessionUrl("/signIn")
                .and().rememberMe().tokenValiditySeconds(1209600)
                .and().logout().logoutSuccessUrl("/signIn").permitAll().and()
                .csrf()
                .disable();


    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        // 设置拦截忽略文件夹，可以对静态资源放行
        web.ignoring().antMatchers("/css/**", "/js/**");
    }
}