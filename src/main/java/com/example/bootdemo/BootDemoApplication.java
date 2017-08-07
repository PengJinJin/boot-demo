package com.example.bootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class BootDemoApplication {

	@ResponseBody
	@RequestMapping("/")
	public String greeting() {
		return "Hello World!";
	}

	@RequestMapping("/hello/{name}")
	public String hello(Model model, @PathVariable("name") String name) {
		model.addAttribute("name", name);
		return "hello";
	}

	public static void main(String[] args) {
		SpringApplication.run(BootDemoApplication.class, args);
	}
}
