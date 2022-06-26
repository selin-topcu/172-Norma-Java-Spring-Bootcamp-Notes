package com.example.normaprojectcustomermanagement.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

@Embeddable //soyut bir tablo olarak eklendi, somut gerçekte böyle bir tablo oluşturulmadı
@Getter
@Setter
public class ContactInformation {

    private String primaryEmail;
    private String secondaryEmail;
    private String primaryPhoneNumber;
    private String secondaryPhoneNumber;

}
