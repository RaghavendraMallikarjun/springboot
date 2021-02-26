package com.example.springboot.helloworld;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@CrossOrigin(origins="http://localhost:4000")
public class HelloWorld {
	
	@RequestMapping(method=RequestMethod.GET,path="/hello-world")
	public String HelloWorldController() {
		return "hello-world";
	}	
	
	@RequestMapping(method=RequestMethod.GET,path="/hello-world-bean/path-variable/{name}")
	public HelloWorldBean helloWorldPathvariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("hello-world,%s",name));
	}
	
//	@RequestMapping(method=RequestMethod.GET,path="/hello-world-bean")
//	public HelloWorldBean helloWorldBean() {
//		return new HelloWorldBean("HelloWorld");
//	}
    
}
