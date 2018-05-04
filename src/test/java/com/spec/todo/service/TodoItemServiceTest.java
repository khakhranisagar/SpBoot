package com.spec.todo.service;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.spec.todo.entities.TodoItem;
import com.spec.todo.repositories.TodoItemRepository;

@RunWith(MockitoJUnitRunner.class)
public class TodoItemServiceTest {

	@InjectMocks
	TodoItemServiceImpl subject;
	
	@Mock
	TodoItemRepository todoItemRepository;
	
	@Test
	public void test() {
		final TodoItem todoItem = new TodoItem();
		todoItem.setDescription("This is a task");
		
		final TodoItem todoItemResponse = new TodoItem();
		todoItemResponse.setId(100);
		todoItemResponse.setDescription("This is a task");
		
		when(todoItemRepository.save(todoItem)).thenReturn(todoItemResponse);
		
		TodoItem response = subject.save(todoItem);
		
		assertThat(response.getId(),equalTo(100));
		assertThat(response.getDescription(),equalTo("This is a task"));

		
		
		
	}

}
