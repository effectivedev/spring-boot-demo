package io.github.effectivedev.springbootdemo.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class WrappingRequest extends HttpServletRequestWrapper {


    public WrappingRequest(HttpServletRequest request) {
        super(request);
    }

    @Override
    public String getParameter(String name) {
        if ("pwd".equals(name)) {
            return "secret";
        }
        return super.getParameter(name);
    }

    @Override
    public String[] getParameterValues(String name) {
        String values[] = super.getParameterValues(name);
        if ("pwd".equals(name)) {
            for (int index = 0; index < values.length; index++) {
                values[index] = "secret";
            }
        }
        return values;
    }
}
