/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.api.controller;

import com.leapfrog.core.dao.CustomerDAO;
import com.leapfrog.core.entity.Complain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author USER
 */
@Controller
@RequestMapping(value = "/api/customer")
public class CustomerController {
    @Autowired
    private CustomerDAO customerDAO;
    
    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody String index(){
        return "<h1>Customer Works</h1>";
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody String complains(@PathVariable("id")int id){
        StringBuilder content=new StringBuilder();
        
        
        for(Complain c:customerDAO.getComplains(id)){
            content.append("<p>"+c.getDescription()+"</p>");
        }
        return content.toString();
    }
}
