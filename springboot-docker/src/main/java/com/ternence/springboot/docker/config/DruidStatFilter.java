package com.ternence.springboot.docker.config;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * @author Ternence
 * @version 1.0
 * @since 2018/8/25 13:36
 */

@WebFilter(
        filterName = "druidWebStatFilter",
        urlPatterns = {"/*"},
        //配置本过滤器放行的请求后缀
        initParams = {
                @WebInitParam(name = "exclusions",
                        value = "*.js,*.jpg,*.png,*.gif,*.ico,*.css,/druid/*")

        }
)
public class DruidStatFilter extends WebStatFilter {
}
