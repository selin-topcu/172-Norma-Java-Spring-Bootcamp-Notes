package com.example.normaprojectcustomermanagement.model.base;

import com.example.normaprojectcustomermanagement.model.Currency;
import com.example.normaprojectcustomermanagement.model.Customer;
import com.example.normaprojectcustomermanagement.model.enums.AccountStatus;
import com.example.normaprojectcustomermanagement.model.enums.AccountType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Getter
@Setter
public class Account extends BaseId{
    @ManyToOne
    private Customer customer;
    @Enumerated
    private AccountType accountType=AccountType.CHECKING_ACCOUNT;
    @ManyToOne
    private Currency currency;

    @Column(nullable = false)
    private String bankCode;

    @Column(nullable = false)
    private String branchCode;

    @Column(nullable = false)
    private String accountNumber;

//    @Pattern(req)
    @Column(nullable = false)
    private String iban;

    @Enumerated(EnumType.ORDINAL)
    private AccountStatus status=AccountStatus.PASIVE;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    private Date blockedAt;

//    @FutureOrPresent
    @Temporal(TemporalType.TIMESTAMP)
    private Date activetedAt;

    @Column(nullable = false)
    private BigDecimal balance=BigDecimal.ZERO;

    @Column(nullable = false)
    private BigDecimal lockedBalance=BigDecimal.ZERO;


}
