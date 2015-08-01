package com.iscool.exam.model;



import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "AD_SUBJECT")
public class Subject implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
}
