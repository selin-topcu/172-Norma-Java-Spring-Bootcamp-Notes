package org.patikadev.jpaexamplel.entity;

import lombok.Getter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@Getter
@MappedSuperclass // bu enttiy değil ama bi enttiynin için de kullanılacağını gösterir
public class BaseId {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
}
