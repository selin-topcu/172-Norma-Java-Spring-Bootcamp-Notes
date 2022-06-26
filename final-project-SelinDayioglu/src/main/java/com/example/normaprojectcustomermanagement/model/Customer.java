package com.example.normaprojectcustomermanagement.model;

import com.example.normaprojectcustomermanagement.model.base.Account;
import com.example.normaprojectcustomermanagement.model.base.BaseId;
import com.example.normaprojectcustomermanagement.model.enums.Gender;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class Customer extends BaseId {
    @Column(nullable = false)
    private Long identityNumber; //TC

    @Column(nullable = false)
    private String name;

    private String middleName;

    @Column(nullable = false)
    private String lastName;

//    @Past
    private Date birthDay;

    @Column(nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private Gender gender;
    @Embedded //java tarafında grupladık (ContactInformation classındaki kolonlar eklendi)
    private ContactInformation contactInformation;

    //orphanRemoval true bağlı olanları silmemesini sağlar
    @OneToMany(mappedBy ="customer",cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Address> address =new HashSet<>();

    @OneToMany(mappedBy ="customer",cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Account> account =new HashSet<>();

//    @Transient
//    private  String  name+""+(StringUtils.hasLength()

    public void addAddress(Address address){
        address.setCustomer(this);
        this.address.add(address);
    }

//    public void addAccount(Account account){
//        account.setAccount(this);
//        this.account.add(account);
//    }


}
