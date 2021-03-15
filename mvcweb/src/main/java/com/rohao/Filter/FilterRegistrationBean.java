package com.rohao.Filter;

import javax.servlet.*;
import java.io.IOException;

public class FilterRegistrationBean implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器1-init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("过滤器1-doFilter-前");
        long start = System.currentTimeMillis();
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("LogFilter1 Execute cost="+(System.currentTimeMillis()-start));
        System.out.println("过滤器1-doFilter-后");
    }

    @Override
    public void destroy() {
        System.out.println("过滤器1-destroy");
    }
}
