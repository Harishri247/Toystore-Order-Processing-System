
package com.examly.springapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.Supplier;
import com.examly.springapp.service.SupplierService;

@RestController
@RequestMapping("/api/suppliers")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @PostMapping
    public ResponseEntity<Supplier> addSupplier(@RequestBody Supplier supplier) {
        return new ResponseEntity<>(supplierService.addSupplier(supplier), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Supplier>> getAllSuppliers() {
        List<Supplier> list = supplierService.getAllSuppliers();
        return  new ResponseEntity<>(list,HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Supplier> getSupplierById(@PathVariable int id) {
        Supplier supplier = supplierService.getSupplierById(id);
        if (supplier == null) {
            return ResponseEntity.notFound().build();
        }
        return new ResponseEntity<>(supplier,HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Supplier> updateSupplier(@PathVariable int id, @RequestBody Supplier supplier) {
        Supplier updated = supplierService.updateSupplier(id, supplier);
        if (updated == null) {
            return ResponseEntity.notFound().build();
        }
        return new ResponseEntity<>(updated,HttpStatus.OK);
    }
}
