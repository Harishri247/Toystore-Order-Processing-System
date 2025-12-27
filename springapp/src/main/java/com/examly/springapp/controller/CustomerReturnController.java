
package com.examly.springapp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import com.examly.springapp.model.CustomerReturn;
import com.examly.springapp.service.CustomerReturnService;

@RestController
@RequestMapping("/api/customer-returns")
public class CustomerReturnController {

    @Autowired
    private CustomerReturnService customerReturnService;

    @PostMapping
    public ResponseEntity<CustomerReturn> addCustomerReturn(@RequestBody CustomerReturn cr) {
        return new ResponseEntity<>(customerReturnService.addCustomerReturn(cr), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<CustomerReturn>> getAllCustomerReturns() {
        List<CustomerReturn> list = customerReturnService.getAllCustomerReturns();
        if (list.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerReturn> getCustomerReturnById(@PathVariable int id) {
        CustomerReturn cr = customerReturnService.getCustomerReturnById(id);
        if (cr == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(cr);
    }
}
