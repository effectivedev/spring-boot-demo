package io.github.effectivedev.springbootdemo.converter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RestController
public class EventController {

    @GetMapping("/event/{event}")
    public String Event(@PathVariable Event event){
        log.info("test");
        return event.toString();
    }
}
