package io.github.effectivedev.springbootdemo.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class EventConf implements WebMvcConfigurer {

//    @Autowired
//    EventConverter eventConverter;
//
//    @Override
//    public void addFormatters(FormatterRegistry registry) {
//        registry.addConverter(eventConverter);
//    }
}
