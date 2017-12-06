package com.amar.tasks.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.amar.tasks.domain.Task;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {

}
