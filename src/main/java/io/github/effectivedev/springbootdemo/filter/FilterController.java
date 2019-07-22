package io.github.effectivedev.springbootdemo.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.Map;

@Slf4j
@RestController
public class FilterController {

    @GetMapping("/test")
    public String test(HttpServletRequest request){
        Enumeration params = request.getParameterNames();
        StringBuffer sb = new StringBuffer();

        while (params.hasMoreElements()){
            String name = (String)params.nextElement();
            sb.append(name + " : " +request.getParameter(name));
            sb.append("<br>");
        }
        return sb.toString();
    }
}
