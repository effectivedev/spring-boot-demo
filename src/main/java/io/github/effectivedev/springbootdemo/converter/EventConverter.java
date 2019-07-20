package io.github.effectivedev.springbootdemo.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class EventConverter implements Converter<String, Event> {

    @Override
    public Event convert(String source) {
        return new Event(Integer.parseInt(source));
    }
}
