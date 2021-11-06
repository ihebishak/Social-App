package com.enetcom.social.model;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long userRoleId;

    //user
    @ManyToOne(fetch = FetchType.EAGER)
    private User user;

    //role
    @ManyToOne(fetch = FetchType.EAGER)
    private Role role;
}
