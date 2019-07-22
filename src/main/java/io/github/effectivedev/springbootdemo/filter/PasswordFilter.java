package io.github.effectivedev.springbootdemo.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.FilterConfig;
import javax.servlet.*;
import java.io.IOException;

@Slf4j
public class PasswordFilter implements javax.servlet.Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        log.info("@Start#########");
        chain.doFilter(request, response);
        log.info("@end###########");
    }

    @Override
    public void destroy() {

    }
}
