package com.example.normaprojectcustomermanagement.model;

import com.example.normaprojectcustomermanagement.model.base.BaseId;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
public class District extends BaseId {

    @ManyToOne(targetEntity = Country.class,cascade = CascadeType.ALL)
    private Country country;

    @ManyToOne(targetEntity = City.class)
    private City city;
}
