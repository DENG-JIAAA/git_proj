package top.djosimon.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dj
 * @date 2021/1/11
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }
}
