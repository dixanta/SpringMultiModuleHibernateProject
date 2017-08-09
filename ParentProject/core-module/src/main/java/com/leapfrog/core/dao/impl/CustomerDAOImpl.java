/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.core.dao.impl;

import com.leapfrog.core.dao.CustomerDAO;
import com.leapfrog.core.entity.Complain;
import com.leapfrog.core.entity.Customer;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

/**
 *
 * @author USER
 */
@Repository(value = "customerDAO")
public class CustomerDAOImpl extends GenericDAOImpl<Customer> implements CustomerDAO {

    @Override
    public List<Complain> getComplains(int id) {
        session=sessionFactory.openSession();
        Criteria criteria=session.createCriteria(Complain.class);
        criteria.add(Restrictions.eq("customer.customerId", id));
        return criteria.list();
    }
    
}
