package io.github.effectivedev.springbootdemo.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.FilterConfig;
import javax.servlet.*;
import java.io.IOException;

@Slf4j
public class LogExecutionTimeFilter implements javax.servlet.Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        long start = System.currentTimeMillis();
        log.info("########Start#########");
        chain.doFilter(request, response);
        log.info("exec time:{}",String.valueOf(System.currentTimeMillis() -start));
        log.info("########End###########");
    }

    @Override
    public void destroy() {

    }
}
