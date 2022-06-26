package com.example.normaprojectcustomermanagement.model;

import com.example.normaprojectcustomermanagement.model.base.BaseId;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Address extends BaseId {
    @ManyToOne
    private Customer customer;
    @ManyToOne
    private District district;

}
