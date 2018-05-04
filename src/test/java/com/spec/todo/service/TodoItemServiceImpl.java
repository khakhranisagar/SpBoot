package com.spec.todo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.spec.todo.entities.TodoItem;
import com.spec.todo.repositories.TodoItemRepository;
import com.spec.todo.services.TodoItemService;

public class TodoItemServiceImpl implements TodoItemService {

	@Autowired
	TodoItemRepository todoItemRepository;
	
	@Override
	public TodoItem save(TodoItem item) {
		// TODO Auto-generated method stub
		return this.todoItemRepository.save(item);
	}

}
