package com.example.madhuni.demo.model;


import com.fasterxml.jackson.databind.DatabindException;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int payment_id;
    private Date paid_date;
    //@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private int order_id;

}
