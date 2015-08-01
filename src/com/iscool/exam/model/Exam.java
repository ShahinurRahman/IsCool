package com.iscool.exam.model;



import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "AD_EXAM")
public class Exam implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String description;
}
