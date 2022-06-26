package com.example.normaprojectcustomermanagement.model.base;

import javax.persistence.*;

@MappedSuperclass
public class  BaseId {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
}
