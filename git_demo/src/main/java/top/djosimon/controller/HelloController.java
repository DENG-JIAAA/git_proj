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
        System.out.println("你好 世界");
        return "hello world";
    }
}
