package io.github.effectivedev.springbootdemo.messages;

import com.sun.org.apache.xml.internal.utils.LocaleUtility;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
@Slf4j
public class MessageController {
    @Autowired
    MessageSource messageSource;

    @GetMapping("/message/{locale}/{code}")
    public String messageController(@PathVariable String locale, @PathVariable String code){
        log.info("local:{}", locale);
        log.info("code:{}", code);
        log.info(messageSource.getClass().toString());

        return messageSource.getMessage("name",null, Locale.KOREA);
    }
}
