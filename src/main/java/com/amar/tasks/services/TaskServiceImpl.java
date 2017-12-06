package com.amar.tasks.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amar.tasks.domain.Task;
import com.amar.tasks.repositories.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService{
	
	private TaskRepository taskRepository;
	
	@Autowired
	public TaskServiceImpl(TaskRepository taskRepository) {
		super();
		this.taskRepository = taskRepository;
	}

	@Override
	public Iterable<Task> listAllTasks() {
		return this.taskRepository.findAll();
	}

	@Override
	public Task saveTask(Task task) {
		return this.taskRepository.save(task);
	}

}
