package io.github.effectivedev.springbootdemo.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;

@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean passwordFilter() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean(new SecretFilter());
        registrationBean.setFilter(new SecretFilter());
        registrationBean.setOrder(Ordered.LOWEST_PRECEDENCE);
        registrationBean.addUrlPatterns("/*");
        return registrationBean;
    }
    @Bean
    public FilterRegistrationBean passwordFilter2(){
        FilterRegistrationBean registrationBean = new FilterRegistrationBean(new LogExecutionTimeFilter());
        registrationBean.setFilter(new LogExecutionTimeFilter());
        registrationBean.setOrder(Ordered.HIGHEST_PRECEDENCE);
        registrationBean.addUrlPatterns("/*");
        return registrationBean;
    }


}
