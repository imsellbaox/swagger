package spring.study.swa.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.study.swa.pojo.User;

/**
 * @author: V
 * @param:
 * @description:
 */


@RestController
public class HelloController {
    @GetMapping ("/hello")
    public String hello(){
        return "hello";
    }

    @PostMapping("/user")
    public User user(@ApiParam("用户User") User user){

        return user;
    }

    @ApiOperation("Nice 请求")
    @GetMapping("/nice")
    public String nice(){
        return nice();
    }
}
