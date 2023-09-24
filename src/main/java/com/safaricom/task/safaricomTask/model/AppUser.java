package com.safaricom.task.safaricomTask.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Entity
@Getter
@Setter
@AllArgsConstructor
@Table(name = "USERS")
public class AppUser extends Person {
    @Id
    private long id;
    @JoinColumn(name = "PERSON_ID", referencedColumnName = "id")
    private long personId;
    @Column(name = "LOGIN")
    private String login;
    @Column(name = "USER_NAME")
    private String firstName;
    @Column(name = "USER_SURNAME")
    private String lastName;
}



