package com.abc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitBranchManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitBranchManageApplication.class, args);
    }

    private void m1() {
        System.out.println("砍价功能");
    }

}
