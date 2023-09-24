package com.safaricom.task.safaricomTask.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Entity
@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
@Table(name = "TASKS")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @Column(name = "author")
    private String author;
    @Column(name = "project_id")
    private long projectId;
    @Column(name = "product_owner")
    private String productOwner;
     Task(long id, String name, String author,long projectId,String productOwner){
        this.name = name;
        this.author = author;
        this.projectId = projectId;
        this.productOwner = productOwner;
    }
}