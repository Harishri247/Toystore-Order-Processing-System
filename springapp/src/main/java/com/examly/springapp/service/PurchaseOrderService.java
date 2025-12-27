
package com.examly.springapp.service;

import java.util.List;
import com.examly.springapp.model.PurchaseOrder;

public interface PurchaseOrderService {
    PurchaseOrder addPurchaseOrder(PurchaseOrder order);
    List<PurchaseOrder> getAllPurchaseOrders();
    PurchaseOrder getPurchaseOrderById(int id);
    PurchaseOrder updatePurchaseOrder(int id, PurchaseOrder order);
}
