
package com.examly.springapp.service;

import java.util.List;
import com.examly.springapp.model.PurchaseOrderItem;

public interface PurchaseOrderItemService {
    PurchaseOrderItem addItem(PurchaseOrderItem item);
   List<PurchaseOrderItem>getItemsByOrderId (int orderId);
}
