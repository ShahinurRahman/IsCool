package com.iscool.admin.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "AD_Branch")
public class Branch  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Institution institution;
}
