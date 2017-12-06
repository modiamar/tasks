package com.amar.tasks.services;

import com.amar.tasks.domain.Task;

public interface TaskService {
	
	public Iterable<Task> listAllTasks();
	public Task saveTask(Task task);
	
}
