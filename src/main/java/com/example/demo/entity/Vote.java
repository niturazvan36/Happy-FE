package com.example.demo.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Vote {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    String comment;

    Date startDate;
}
