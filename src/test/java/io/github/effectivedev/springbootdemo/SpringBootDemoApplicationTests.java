package io.github.effectivedev.springbootdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest
public class SpringBootDemoApplicationTests {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void contextLoads() {
        try {
            mockMvc.perform(get("/event/1"))
                    .andExpect(status().isOk())
                    .andExpect(content().string("1"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
