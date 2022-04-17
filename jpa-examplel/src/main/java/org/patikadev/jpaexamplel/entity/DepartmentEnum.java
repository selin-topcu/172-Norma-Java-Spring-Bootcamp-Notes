package org.patikadev.jpaexamplel.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name="Department_Enum")
public class DepartmentEnum extends BaseId{


    @Column(length = 50)
    private long number;
    @Column(length = 50)
    private String name;
//    @Enumerated(EnumType.STRING)
    private String department;
//    @Temporal(TemporalType.DATE)
    private Date birthDate;
}
