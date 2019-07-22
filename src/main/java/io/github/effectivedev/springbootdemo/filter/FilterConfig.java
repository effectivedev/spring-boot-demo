package io.github.effectivedev.springbootdemo.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean passwordFilter() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean(new SecretFilter());
        registrationBean.setFilter(new SecretFilter());
        registrationBean.addUrlPatterns("/*");
        return registrationBean;
    }
//    @Bean
//    public FilterRegistrationBean passwordFilter2(){
//        FilterRegistrationBean registrationBean = new FilterRegistrationBean(new PasswordFilter());
//        registrationBean.setFilter(new PasswordFilter());
//        registrationBean.addUrlPatterns("/*");
//        return registrationBean;
//    }


}
