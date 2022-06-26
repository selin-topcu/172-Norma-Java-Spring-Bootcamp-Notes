package com.example.normaprojectcustomermanagement.model;

import com.example.normaprojectcustomermanagement.model.base.BaseId;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class City extends BaseId {

    @ManyToOne(targetEntity = Country.class)
    private  Country country;

    @Column(nullable = false)
    private String name;


}
