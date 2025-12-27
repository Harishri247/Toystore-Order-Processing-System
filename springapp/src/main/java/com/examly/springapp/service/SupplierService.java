package com.examly.springapp.service;

import java.util.List;
import com.examly.springapp.model.Supplier;

public interface SupplierService {
    Supplier addSupplier(Supplier supplier);
    List<Supplier> getAllSuppliers();
    Supplier getSupplierById(int id);
    Supplier updateSupplier(int id, Supplier supplier);
}
