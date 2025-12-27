
package com.examly.springapp.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.CustomerReturn;
import com.examly.springapp.repository.CustomerReturnRepo;

@Service
public class CustomerReturnServiceImpl implements CustomerReturnService {

  
    @Autowired
    private CustomerReturnRepo customerReturnRepo;
    @Override
    public CustomerReturn addCustomerReturn(CustomerReturn cr) 
    {
        return customerReturnRepo.save(cr);

    }
    @Override
    public CustomerReturn getCustomerReturnById(int id)
    {
        return customerReturnRepo.findById(id).get();
    }

    @Override
    public List<CustomerReturn> getAllCustomerReturns()
    {
        return customerReturnRepo.findAll();
    }
}
