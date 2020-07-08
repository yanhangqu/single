package jenkins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/is/myjenkins")
public class Controller {

    @RequestMapping("/singletest1")
    public String test1(){
        String s = "sss";
        return "this is not jenkins dddddddd"+"ssssssssssssssssss";
    }

    @RequestMapping("/singletest1")
    public String test2(){
        System.out.println("============");
        String result ="this is jenkins singletest11111111";
        return result;

    }
}
