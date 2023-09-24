package com.safaricom.task.safaricomTask.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Table(name = "GUESTS")
public class Guest extends Person {
//
//    @Column(name = "PERSON_ID")
//    private long personId;
    @Column(name = "TEMPORARY_NAME")
    private String temporaryName;

  //  @ManyToOne
    @OneToOne
    private Person person;
}