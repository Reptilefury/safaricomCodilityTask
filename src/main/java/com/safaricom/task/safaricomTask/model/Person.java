package com.safaricom.task.safaricomTask.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Table(name = "PERSONS")
public class Person {
    @Id
    @Column(name = "PERSON_ID")
    private long id;
    @Column(name = "SESSION_ID")
    private  long sessionId;

    @OneToMany(mappedBy = "person")
    private List<Guest> guests;
    @OneToMany(mappedBy = "person")
    private List<AppUser> appUsers;
    public Person() {
    }
}










