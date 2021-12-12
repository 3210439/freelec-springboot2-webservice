package com.bell_bell.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main (String[] args) {
        // SrpingApplication.run이 내장 WAS를 실행시켜준다.
        // 덕분에 언제 어디서나 같은 환경에서 스프링 부트를 배포할 수 있다.
        SpringApplication.run(Application.class, args);
    }
}
