package org.interview.cicd_githubaction_aws;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello,CI/CD World!";
    }

    @GetMapping
    public String welcome(){
        return "Welcome to CI/CD with GitHub Actions and AWS!";
    }

    @PostMapping("/greet")
    public String greet(String name){
        return "Hello, " + name + "! Welcome to CI/CD with GitHub Actions and AWS!";
    }

    @DeleteMapping("/goodbye")
    public String delete(String name){
        return "Hello, " + name + "! Welcome to CI/CD with GitHub Actions and AWS!";
    }

}
