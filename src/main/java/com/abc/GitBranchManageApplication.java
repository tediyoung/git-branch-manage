package com.abc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitBranchManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitBranchManageApplication.class, args);
    }

    public void m2() {
        System.out.println("销售排行榜完成");
    }

}
