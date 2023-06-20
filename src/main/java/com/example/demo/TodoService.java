package com.example.demo;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.TodoEntity;
import com.example.demo.TodoRepository;
@Service
public class TodoService {
@Autowired
private TodoRepository repository;
public String testService(){
// Todo Entity 생성
TodoEntity entity = TodoEntity.builder().title("My first todo item").build();
// Todo Entity 저장
repository.save(entity);
// Todo Entity 검색
TodoEntity savedEntity = repository.findById(entity.getId()).get();
return savedEntity.getTitle();
}
}