package org.interview.cicd_githubaction_aws;

import org.springframework.web.bind.annotation.GetMapping;
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
}
