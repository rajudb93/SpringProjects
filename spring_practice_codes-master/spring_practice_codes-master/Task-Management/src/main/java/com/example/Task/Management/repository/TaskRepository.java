package com.example.Task.Management.repository;

import com.example.Task.Management.model.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task,Long> {
}
