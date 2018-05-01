package com.spec.todo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spec.todo.entities.TodoItem;
import com.spec.todo.services.TodoItemService;

@RestController
@RequestMapping(value = "/api/v1/todo-item")
public class TodoItemController {
	
	@Autowired
	TodoItemService itemService;

	@RequestMapping(value= "",method=RequestMethod.POST)
	public @ResponseBody TodoItem createTodoItem(@RequestBody TodoItem todoItem) {
		
		return itemService.save(todoItem);
	}
	
	
}
