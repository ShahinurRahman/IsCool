package com.iscool.admin.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "AD_SECTION")
public class Section implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;  // Section A, Section B | Boy, Girl

}
