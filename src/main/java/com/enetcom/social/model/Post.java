package com.enetcom.social.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name="posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long post_id;
    private String title;
    private String msg;
    private String image;
    private int likes;
    private int dislike;
    private int share;

    private Boolean fav;
    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
    private User user;

}
