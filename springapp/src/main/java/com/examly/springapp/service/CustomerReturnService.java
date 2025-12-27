
package com.examly.springapp.service;

import java.util.List;
import com.examly.springapp.model.CustomerReturn;

public interface CustomerReturnService {
    CustomerReturn addCustomerReturn(CustomerReturn cr);
    List<CustomerReturn> getAllCustomerReturns();
    CustomerReturn getCustomerReturnById(int id);
}

