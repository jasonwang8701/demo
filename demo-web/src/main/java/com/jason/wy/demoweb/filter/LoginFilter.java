package com.jason.wy.demoweb.filter;

import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author wangyuan02
 * @desc
 * @date 2019-06-11 16:34
 */

@Order(1)
//重点
@WebFilter(filterName = "loginFilter", urlPatterns = "/*")
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        long start = System.currentTimeMillis();
        System.out.println("filter start:");
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        System.out.println(req.getRequestURL());
        if (String.valueOf(req.getRequestURL()).contains("favicon.ico")) {
            return;
        }

        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("filter ok Execute cost=" + (System.currentTimeMillis() - start));
    }

    @Override
    public void destroy() {

    }
}