package com.simo.model;

import javax.ejb.Local;
import java.util.List;

/**
 * Created by PS on 12/17/15.
 */
@Local
public interface PersonBean {

    public void addPerson(Integer ssn,String name);
    public String showPerson();
}
