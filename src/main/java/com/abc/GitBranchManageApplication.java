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
        System.out.println("砍价真的完成了");

        System.out.println("预发布时，修复了一个 bug");
    }

}
