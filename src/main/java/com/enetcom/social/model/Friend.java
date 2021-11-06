package com.enetcom.social.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name ="friends")
public class Friend {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long friend_id;

    private long uid;
    private String name;
    private String imagepro;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
    private User user;

}
