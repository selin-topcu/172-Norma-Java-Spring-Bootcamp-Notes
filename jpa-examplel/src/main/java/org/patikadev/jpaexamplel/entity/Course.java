package org.patikadev.jpaexamplel.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Course extends BaseId{


    private String name;
    private String code;
}
