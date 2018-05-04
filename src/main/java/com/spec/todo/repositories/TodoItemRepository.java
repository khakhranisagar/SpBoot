package com.spec.todo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spec.todo.entities.TodoItem;

@Repository
public interface TodoItemRepository extends CrudRepository<TodoItem,Long>{

}
