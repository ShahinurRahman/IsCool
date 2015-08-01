package com.iscool.exam.model;


import com.iscool.admin.model.Student;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "AD_MARKS")
public class Marks implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private  Exam exam;

    private MarksCalculationMethod mcm;

    private Student student;

    private Double written;

    private Double mcq;

    private Double practical;


}
