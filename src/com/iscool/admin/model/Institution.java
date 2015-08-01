package com.iscool.admin.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "AD_INSTITUTION")
public class Institution  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


}
