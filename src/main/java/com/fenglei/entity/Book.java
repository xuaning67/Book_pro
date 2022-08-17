package com.fenglei.entity;

import javax.persistence.*;

/**
 * Created by Intellij IDEA.
 * User:  Administrator
 * Date:  2022/8/22
 */

@Entity
@Table (name = "book")
public class Book {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Book() {
    }
}
