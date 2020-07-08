package jenkins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myjenkins")
public class Controller {

    @RequestMapping("/singletest1")
    public String tesssst1(){
        return "this is not jenkins dddddddd"+"ssssssssssssssssss";
    }

    @RequestMapping("/singletest1")
    public String test2(){
        return "this is jenkins singletest1";
    }
}
