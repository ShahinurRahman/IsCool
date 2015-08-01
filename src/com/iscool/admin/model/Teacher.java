package com.iscool.admin.model;


import com.iscool.security.model.User;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@DiscriminatorValue("teacher")
public class Teacher extends User implements Serializable {

    private String name;

}
