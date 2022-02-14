package com.dcarras.spring.timecard.role;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    @Column(name = "role_id")
    private int id;
    private String role;
}
