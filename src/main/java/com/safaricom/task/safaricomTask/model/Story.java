package com.safaricom.task.safaricomTask.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "STORIES")
public class Story extends Task {
    private long id;
    @Column(name = "NAME")
    @JoinColumn(name = "task_name") // Specify the foreign key column
    private String name;
    @Column(name = "TASK_ID")
    @JoinColumn(name = "task_id") // Specify the foreign key column
    private long taskId;
    @Column(name = "AUTHOR")
    @JoinColumn(name = "author") // Specify the foreign key column
    private String author;
    @Column(name = "SPRINT_ID")
    private long sprintId;
}