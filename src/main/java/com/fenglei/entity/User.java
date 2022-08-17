package com.fenglei.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Intellij IDEA.
 * User:  Administrator
 * Date:  2022/8/22
 */

@Entity
@Table (name = "user")
public class User implements java.io.Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @DateTimeFormat (pattern = "yyyy-mm-dd HH:mm:ss")
    private Date creatable;

    @ManyToOne
    @JoinColumn (name = "did")
    @JsonBackReference
    private Book book;

    @ManyToMany (cascade = {}, fetch = FetchType.EAGER)
    @JoinTable (name = "user_role",
            joinColumns = {@JoinColumn (name = "user_id")},
            inverseJoinColumns = {@JoinColumn (name = "roles_id")})
    private List<Role> roles;

    public User() {}
}
