package cn.chenweilin.chope.controller;

import cn.chenweilin.chope.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cwl
 * @email 1045501964@qq.com
 * @date 2022/5/3 21:50
 */
@Controller
public class IndexController {
    @GetMapping("/index")
    public String index(Model model) {
        User user = new User();
        user.setAge(26);
        user.setEmail("747731461@qq.com");
        user.setName("村雨遥");
        model.addAttribute("user", user);
        return"index";
    }
}
