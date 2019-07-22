package io.github.effectivedev.springbootdemo.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
public class WrappingRequest extends HttpServletRequestWrapper {
    //Encryption List
    private static final List SECRET_LIST = new ArrayList(Arrays.asList("pwd","PWD"));

    public WrappingRequest(HttpServletRequest request) {
        super(request);
    }

    @Override
    public String getParameter(String name) {

        if (SECRET_LIST.contains(name)) {
            String secret = "secret";
            log.info("name:{}, value:{}", name, secret);
            return secret;
        }
        return super.getParameter(name);
    }
    @Override
    public String[] getParameterValues(String name) {
        String values[] = super.getParameterValues(name);
        if (SECRET_LIST.contains(name)) {
            String secret = "secret";
            log.info("name:{}, value:{}", name, secret);
            int length = values.length;
            for (int index = 0; index < length; index++) {
                values[index] = secret;
            }
        }
        return values;
    }
}
