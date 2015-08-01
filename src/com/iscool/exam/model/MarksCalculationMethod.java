package com.iscool.exam.model;



import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "AD_MARKS_CAL_METHOD")
public class MarksCalculationMethod implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String methodCode;
    private Boolean effectOnFinal;
    private Integer percentage;
}

