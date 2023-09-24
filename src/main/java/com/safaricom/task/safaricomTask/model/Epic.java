package com.safaricom.task.safaricomTask.model;

import jakarta.persistence.*;
import lombok.*;


@Table(name = "EPICS")
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
public class Epic extends Task {
    @Id
    @GeneratedValue
    private long id;

    @Column(name = "NAME")
    private String name;

    @JoinColumn(name = "AUTHOR", referencedColumnName = "author")
    private String author;
    @Column(name = "TASK_ID")
    @JoinColumn(name = "TASK_ID", referencedColumnName = "id")
    private long taskId;

    @Column(name = "PROJECT_ID")
    private long projectId;

    @Column(name = "PRODUCT_OWNER_NAME")
    private String productOwnerName;
}