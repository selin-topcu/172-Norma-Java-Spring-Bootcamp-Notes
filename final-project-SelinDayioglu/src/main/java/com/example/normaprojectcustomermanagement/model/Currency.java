package com.example.normaprojectcustomermanagement.model;

import com.example.normaprojectcustomermanagement.model.base.BaseId;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Currency extends BaseId {
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String code;
    private String symbol;

}
