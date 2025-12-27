
package com.examly.springapp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import com.examly.springapp.model.PurchaseOrder;
import com.examly.springapp.service.PurchaseOrderService;

@RestController
@RequestMapping("/api/purchase-orders")
public class PurchaseOrderController {

    @Autowired
    private PurchaseOrderService purchaseOrderService;

    @PostMapping
    public ResponseEntity<PurchaseOrder> addPurchaseOrder(@RequestBody PurchaseOrder order) {
        return new ResponseEntity<>(purchaseOrderService.addPurchaseOrder(order), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<PurchaseOrder>> getAllPurchaseOrders() {
        List<PurchaseOrder> list = purchaseOrderService.getAllPurchaseOrders();
        if (list.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PurchaseOrder> getPurchaseOrderById(@PathVariable int id) {
        PurchaseOrder order = purchaseOrderService.getPurchaseOrderById(id);
        if (order == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(order);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PurchaseOrder> updatePurchaseOrder(@PathVariable int id, @RequestBody PurchaseOrder order) {
        PurchaseOrder updated = purchaseOrderService.updatePurchaseOrder(id, order);
        if (updated == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updated);
    }
}

