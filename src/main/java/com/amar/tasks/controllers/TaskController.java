package com.amar.tasks.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amar.tasks.domain.Task;
import com.amar.tasks.services.TaskService;

@RestController
@RequestMapping("/api/tasks")
@CrossOrigin(origins = "*")
public class TaskController {
	
	private TaskService taskService;
	
	public TaskController(TaskService taskService) {
		super();
		this.taskService = taskService;
	}

	@GetMapping(value={"", "/"})
	public Iterable<Task> listTasks(){
		return this.taskService.listAllTasks();
	}
	
	//Full api to this would be /api/tasks/save
	@PostMapping("/save")
	public Task addTask(@RequestBody Task task){
		return this.taskService.saveTask(task);
	}

}
