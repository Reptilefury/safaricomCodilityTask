package com.safaricom.task.safaricomTask.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "GUESTS")
@Entity
public class Guest extends Person {
    @Id
    private long id;
    @Column(name = "TEMPORARY_NAME")
    private String temporaryName;

    @JoinColumn(name = "PERSON_ID", referencedColumnName = "id")
    private long personId;
}