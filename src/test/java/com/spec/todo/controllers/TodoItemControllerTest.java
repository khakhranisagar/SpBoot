package com.spec.todo.controllers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.spec.todo.entities.TodoItem;
import com.spec.todo.services.TodoItemService;


@RunWith(MockitoJUnitRunner.class)
public class TodoItemControllerTest {

	@InjectMocks
	TodoItemController subject;
	
	@Mock
	TodoItemService todoItemService;
	
	
	
	@Test
	public void testCreatedTodoItemReturnsSavedTodoItems() {
		final TodoItem todoItemRequest = new TodoItem();
		final TodoItem todoItemResponse = new TodoItem();
		todoItemResponse.setId(100L);
		
		when(todoItemService.save(todoItemRequest)).thenReturn(todoItemResponse);
		
		assertThat(subject.createTodoItem(todoItemRequest).getId(),equalTo(todoItemResponse.getId()));
	}

}
