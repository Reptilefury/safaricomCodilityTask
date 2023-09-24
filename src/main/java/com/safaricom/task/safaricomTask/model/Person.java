package com.safaricom.task.safaricomTask.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Table(name = "PERSONS")
public class Person {
    @Id
    private long id;
    @Column(name = "SESSION_ID")
    private long sessionId;

    @OneToMany
    private List<Guest> guests;
    @OneToMany
    private List<AppUser> appUsers;

    public Person() {
    }
}










