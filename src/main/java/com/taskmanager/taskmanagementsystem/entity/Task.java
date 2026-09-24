package com.taskmanager.taskmanagementsystem.entity;

import com.taskmanager.taskmanagementsystem.enums.Priority;
import com.taskmanager.taskmanagementsystem.enums.Status;
import jakarta.persistence.*;
import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.LocalDate;

@Entity
@Table(name = "tasks")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private LocalDate dueDate;

    private LocalDate createdDate;

    @Enumerated(EnumType.STRING)
    private Priority priority;

    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private User user;

    @PrePersist
    public void prePersist() {
        this.createdDate = LocalDate.now();
    }
}