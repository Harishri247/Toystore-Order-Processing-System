package com.examly.springapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.examly.springapp.model.PurchaseOrder;
import com.examly.springapp.repository.PurchaseOrderRepo;

@Service
public class PurchaseOrderServiceImpl implements PurchaseOrderService {
 
    @Autowired
    private PurchaseOrderRepo purchaseOrderRepo;

    public PurchaseOrder  addPurchaseOrder(PurchaseOrder purchaseOrder)
    {
        return purchaseOrderRepo.save(purchaseOrder);
    }
    public List<PurchaseOrder> getAllPurchaseOrders()
    {
        return purchaseOrderRepo.findAll();
    }
    public PurchaseOrder getPurchaseOrderById(int id)
    {
        return purchaseOrderRepo.findById(id).get();
    }

    public PurchaseOrder updatePurchaseOrder(int id, PurchaseOrder purchaseOrder)
    {
        purchaseOrder.setPurchaseOrderId(id);
        return purchaseOrderRepo.save(purchaseOrder);

    }
}
