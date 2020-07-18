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

    @RequestMapping("/remote")
    public String test3(){
        return "this is git remote";
    }

    @RequestMapping("/new-pr")
    public String test4(){
        return "this is a new pr";
    }

    @RequestMapping("/new-pr1549")
    public String test5(){
        return "this is a new pr 1549";
    }

    @RequestMapping("/main-pr1604")
    public String test6(){
        return "this is a new change 1604 by main";
    }

    @RequestMapping("/main-pr1646")
    public String test7(){
        return "this is a new change 1646 by main";
    }
}
