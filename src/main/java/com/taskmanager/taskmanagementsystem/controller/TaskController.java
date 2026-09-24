package com.taskmanager.taskmanagementsystem.controller;

import com.taskmanager.taskmanagementsystem.entity.Task;
import com.taskmanager.taskmanagementsystem.enums.Priority;
import com.taskmanager.taskmanagementsystem.enums.Status;
import com.taskmanager.taskmanagementsystem.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;
    @PostMapping("/add")
    public Task addTask(@RequestBody Task task) {

        return taskService.addTask(task);
    }

    @GetMapping("/all")
    public List<Task> getAllTasks() {

        return taskService.getAllTasks();
    }

    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable Long id) {

        return taskService.getTaskById(id);
    }

    @PutMapping("/update/{id}")
    public Task updateTask(@PathVariable Long id,
                           @RequestBody Task task) {

        return taskService.updateTask(id, task);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteTask(@PathVariable Long id) {

        taskService.deleteTask(id);

        return "Task deleted successfully";
    }

    @GetMapping("/status/{status}")
    public List<Task> getTasksByStatus(@PathVariable Status status) {

        return taskService.getTasksByStatus(status);
    }

    @GetMapping("/priority/{priority}")
    public List<Task> getTasksByPriority(@PathVariable Priority priority) {

        return taskService.getTasksByPriority(priority);
    }

    @GetMapping("/date/{date}")
    public List<Task> getTasksByDate(@PathVariable LocalDate date) {

        return taskService.getTasksByDate(date);
    }

    @GetMapping("/month/{month}")
    public List<Task> getTasksByMonth(@PathVariable int month) {

        return taskService.getTasksByMonth(month);
    }

    @PostMapping("/add/{userId}")
    public Task addTaskForUser(@PathVariable Long userId,
                               @RequestBody Task task) {

        return taskService.addTaskForUser(userId, task);
    }

    @GetMapping("/user/{userId}")
    public List<Task> getTasksByUser(@PathVariable Long userId) {

        return taskService.getTasksByUser(userId);
    }



}