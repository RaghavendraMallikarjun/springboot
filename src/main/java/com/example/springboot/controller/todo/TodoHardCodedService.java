package com.example.springboot.controller.todo;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TodoHardCodedService {

	private static List<Todo> todos = new ArrayList();

	private static int idCounter = 0;
	
	static {
		todos.add(new Todo(++idCounter,"react-springboot",new Date(),"Learn React",false));
		todos.add(new Todo(++idCounter,"react-springboot",new Date(),"Learn Springboot",false));
		todos.add(new Todo(++idCounter,"react-springboot",new Date(),"Learn AWS",false));

	}
	
	public List<Todo> findAll(){
		return todos;
	}

}
