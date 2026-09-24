package com.taskmanager.taskmanagementsystem.repository;

import com.taskmanager.taskmanagementsystem.entity.Task;
import com.taskmanager.taskmanagementsystem.enums.Priority;
import com.taskmanager.taskmanagementsystem.enums.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import com.taskmanager.taskmanagementsystem.entity.User;



import java.time.LocalDate;
import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findByStatus(Status status);

    List<Task> findByPriority(Priority priority);

    List<Task> findByDueDate(LocalDate dueDate);

    List<Task> findByUser(User user);
}
