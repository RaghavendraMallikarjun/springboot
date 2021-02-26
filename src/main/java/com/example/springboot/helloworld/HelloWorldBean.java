package com.example.springboot.helloworld;

public class HelloWorldBean {
	
	private String message2;

	public HelloWorldBean(String message2) {
		// TODO Auto-generated constructor stub
		this.message2=message2;
	}

	public void setMessage2(String message2) {
		this.message2 = message2;
	}

	public String getMessage2() {
		return message2;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [message2=" + message2 + "]";
	}


}
