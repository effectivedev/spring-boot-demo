package io.github.effectivedev.springbootdemo.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.FilterConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.IOException;

@Slf4j
public class SecretFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.info("###SecretFilter Start###");
        chain.doFilter(new WrappingRequest((HttpServletRequest) request), response);
        log.info("####SecretFilter End####");
    }

    @Override
    public void destroy() {

    }
}
