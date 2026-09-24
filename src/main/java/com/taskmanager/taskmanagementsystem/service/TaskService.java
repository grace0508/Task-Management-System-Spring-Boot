package com.taskmanager.taskmanagementsystem.service;

import com.taskmanager.taskmanagementsystem.entity.Task;
import com.taskmanager.taskmanagementsystem.entity.User;
import com.taskmanager.taskmanagementsystem.enums.Priority;
import com.taskmanager.taskmanagementsystem.enums.Status;
import com.taskmanager.taskmanagementsystem.repository.TaskRepository;
import com.taskmanager.taskmanagementsystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.time.LocalDate;
import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private UserRepository userRepository;

    public Task addTask(Task task) {
        return taskRepository.save(task);
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task getTaskById(Long id) {
        return taskRepository.findById(id).orElse(null);
    }

    public Task updateTask(Long id, Task updatedTask) {

        Task task = taskRepository.findById(id).orElse(null);

        if (task != null) {
            task.setTitle(updatedTask.getTitle());
            task.setDescription(updatedTask.getDescription());
            task.setStatus(updatedTask.getStatus());
            task.setPriority(updatedTask.getPriority());
            task.setDueDate(updatedTask.getDueDate());

            return taskRepository.save(task);
        }

        return null;
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

    public List<Task> getTasksByStatus(Status status) {
        return taskRepository.findByStatus(status);
    }

    public List<Task> getTasksByPriority(Priority priority) {
        return taskRepository.findByPriority(priority);
    }

    public List<Task> getTasksByDate(LocalDate date) {
        return taskRepository.findByDueDate(date);
    }

    public List<Task> getTasksByMonth(int month) {
        return taskRepository.findAll()
                .stream()
                .filter(task -> task.getDueDate() != null
                        && task.getDueDate().getMonthValue() == month)
                .toList();
    }

    public Task addTaskForUser(Long userId, Task task) {

        User user = userRepository.findById(userId).orElse(null);

        if(user != null) {

            task.setUser(user);

            return taskRepository.save(task);
        }

        return null;
    }

    public List<Task> getTasksByUser(Long userId) {

        User user = userRepository.findById(userId).orElse(null);

        if(user != null) {
            return taskRepository.findByUser(user);
        }

        return List.of();
    }

}