package com.sap.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@Controller
@EnableAutoConfiguration
public class DemoApplication {
@RequestMapping("/")
    @ResponseBody
    String home() {
        return "Spring Rocks";
    }

 
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
