package cn.chenweilin.chope.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cwl
 * @email 1045501964@qq.com
 * @date 2022/5/3 21:50
 */
@RestController
public class HelloController {
    @GetMapping("/")
    public String hello(){
        return "ok";
    }
}
