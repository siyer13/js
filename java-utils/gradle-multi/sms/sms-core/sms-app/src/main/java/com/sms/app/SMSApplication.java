package com.sms.app;


import com.sms.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SMSApplication {


    public static void main(String[] args) {
        SpringApplication.run(SMSApplication.class, args);

    }
}
