package com.rohao.Filter;


import org.springframework.beans.factory.annotation.Configurable;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@Configurable//将次Filter交给spring容器管理
@WebFilter(urlPatterns = "/*",filterName = "logFilter2")
public class LogCoSTFilter implements Filter {

    @Override
    public void init(javax.servlet.FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器2-init");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        System.out.println("过滤器2-doFilter-前");
        long start = System.currentTimeMillis();
        chain.doFilter(request, response);
        System.out.println("LogFilter2 Execute cost=" + (System.currentTimeMillis() - start));
        System.out.println("过滤器2-doFilter-后");
    }

    @Override
    public void destroy() {
        System.out.println("过滤器2-destroy");
    }
}
