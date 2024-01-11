package com.mango.springbootwork.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author wangjingyuan
 * @date 2024/1/4
 */
@Component
public class TestFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println(" 1 TestFilter 执行 init 方法");

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("2 TestFilter 执行 doFilter 方法");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("2 TestFilter 执行 filterChain 方法");
    }

    @Override
    public void destroy() {
        System.out.println(" 3 TestFilter 执行 destroy 方法");
    }
}
