package com.iscool.admin.model;

import com.iscool.security.model.User;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@DiscriminatorValue("student")
public class Student extends User  implements Serializable {

    private String name;


}
