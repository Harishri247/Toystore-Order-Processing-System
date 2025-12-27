
package com.examly.springapp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import com.examly.springapp.model.PurchaseOrderItem;
import com.examly.springapp.service.PurchaseOrderItemService;

@RestController
@RequestMapping("/api/purchase-order-items")
public class PurchaseOrderItemController {

    @Autowired
    private PurchaseOrderItemService purchaseOrderItemService;

    @PostMapping
    public ResponseEntity<PurchaseOrderItem> addItem(@RequestBody PurchaseOrderItem item) {
        return new ResponseEntity<>(purchaseOrderItemService.addItem(item), HttpStatus.CREATED);
    }

    @GetMapping("/order/{orderId}")
    public ResponseEntity<List<PurchaseOrderItem>> getItemsByOrderId(@PathVariable int orderId) {
        return ResponseEntity.ok(purchaseOrderItemService.getItemsByOrderId(orderId));
    }
}

