package com.example.demo;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.TodoEntity;
import com.example.demo.TodoRepository;
@Service
public class TodoService {
@Autowired
private TodoRepository repository;
public String testService() {
	
	TodoEntity entity = TodoEntity.builder().userId("user01").title("My first todo item").build();
	repository.save(entity);
	TodoEntity savedEntity = 
	repository.findByUserId(entity.getUserId()).get(0);
	return savedEntity.getUserId();
	}
	}
