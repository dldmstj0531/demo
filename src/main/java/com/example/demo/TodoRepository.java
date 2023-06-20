package com.example.demo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.*;
@Repository
public interface TodoRepository extends JpaRepository<TodoEntity,String>{
List<TodoEntity>findByUserId(String userId);
}
