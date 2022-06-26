package com.example.normaprojectcustomermanagement.model;

import com.example.normaprojectcustomermanagement.model.base.BaseId;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Country extends BaseId {

    @Column(length=2, nullable = false)
    private  String alpha2Code;
    @Column(length=3)
    private  String alpha3Code;

    @Column(nullable = false)
    private  String name;
}
