package com.examly.springapp.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.examly.springapp.model.Supplier;
import com.examly.springapp.repository.SupplierRepo;

@Service
public class SupplierServiceImpl implements SupplierService {
 
    @Autowired
    private SupplierRepo supplierRepo;
    public Supplier addSupplier(Supplier supplier) {
       
        return supplierRepo.save(supplier);
    }

    public List<Supplier> getAllSuppliers() {
        return supplierRepo.findAll();
    }

    public Supplier getSupplierById(int id) {
        return supplierRepo.findById(id).get();
    }

    public Supplier updateSupplier(int id, Supplier supplier) {
       supplier.setSupplierId(id);
        return supplierRepo.save(supplier);
    }
}
