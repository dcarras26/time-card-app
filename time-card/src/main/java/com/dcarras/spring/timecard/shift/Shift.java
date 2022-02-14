package com.dcarras.spring.timecard.shift;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "shifts")
public class Shift {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "shift_id")
    private int id;
    @Column(name = "start_date")
    private Date startDate;
}
