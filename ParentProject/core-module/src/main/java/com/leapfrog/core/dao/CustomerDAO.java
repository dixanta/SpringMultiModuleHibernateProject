/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.core.dao;

import com.leapfrog.core.entity.Complain;
import com.leapfrog.core.entity.Customer;
import java.util.List;

/**
 *
 * @author USER
 */
public interface CustomerDAO extends GenericDAO<Customer> {
    List<Complain> getComplains(int id);
}
