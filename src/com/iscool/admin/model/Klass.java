package com.iscool.admin.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "AD_CLASS")
public class Klass implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;    // Nine, Ten etc

}
