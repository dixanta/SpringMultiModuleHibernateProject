/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.core.dao.impl;

import com.leapfrog.core.dao.ComplainDAO;
import com.leapfrog.core.entity.Complain;
import org.springframework.stereotype.Repository;

/**
 *
 * @author USER
 */
@Repository(value = "complainDAO")
public class ComplainDAOImpl extends GenericDAOImpl<Complain> implements ComplainDAO {
    
}
