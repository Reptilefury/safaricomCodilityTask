package com.safaricom.task.safaricomTask.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
//@AllArgsConstructor
@Table(name = "USERS")
public class AppUser extends Person {
    @Id
    private long id;

    @Column(name = "PERSON_ID")
    private long personId;
    @Column(name = "LOGIN")
    private String login;
    @Column(name = "USER_NAME")
    private String firstName;
    @Column(name = "USER_SURNAME")
    private String lastName;
//
//    AppUser(long id, long personId,String login,String firstName,String lastName){
//
//        this.id = id;
//        this.personId = super.getId();
//        this.login = login;
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }

}



