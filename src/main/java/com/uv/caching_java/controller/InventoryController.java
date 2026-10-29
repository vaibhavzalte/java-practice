package com.uv.caching_java.controller;

import com.uv.caching_java.entity.Inventory;
import com.uv.caching_java.service.InventoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/cache-demo")
public class InventoryController {

    private final InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @GetMapping("/health")
    public String healthCheck() {
        return "Inventory Controller is up and running!";
    }

    @PostMapping("/inventory")
    public Inventory addInventory(@RequestBody Inventory inventory) {
        return inventoryService.addInventory(inventory);
    }

    @GetMapping("/inventory")
    public List<Inventory> getInventory() {
        return inventoryService.getInventory();
    }

    @PutMapping("/inventory/{id}")
    public Inventory updateInventory(@PathVariable Integer id, @RequestBody Inventory inventory) {
        return inventoryService.updateInventory(id, inventory);
    }

    @GetMapping("/inventory/{id}")
    public Inventory getInventoryById(@PathVariable Integer id) {
        return inventoryService.getInventoryById(id);
    }

    @DeleteMapping("/inventory/{id}")
    public void deleteInventory(@PathVariable Integer id) {
        inventoryService.deleteInventory(id);
    }

}
