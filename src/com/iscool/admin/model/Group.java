package com.iscool.admin.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "AD_GROUP")
public class Group implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;    // Science | Arts | Commerce

}
