package com.shx;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * ClassName: SpringBootStartApplication
 * Description:
 * date: 2020/6/4 22:22
 *
 * @author sunshine
 * @version v1.0
 * @since JDK 1.8
 */
public class SpringBootStartApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(ZoneApplication.class);
    }
}
