package io.github.effectivedev.springbootdemo.converter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

    @GetMapping("/event/{event}")
    public String Event(@PathVariable Event event){
        return event.getId().toString();
    }
}
