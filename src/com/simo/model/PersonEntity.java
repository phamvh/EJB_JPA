package com.simo.model;

import javax.persistence.*;

/**
 * Created by PS on 12/17/15.
 */

@Entity(name = "Person")
public class PersonEntity {

    @Id
    @Column(name = "Social")
    private int ssn;
    @Column(name = "Name")
    private String name;

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
