package com.uv.caching_java.service;

import com.uv.caching_java.entity.Inventory;
import com.uv.caching_java.repository.InventoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {
    private final InventoryRepository inventoryRepository;

    public InventoryService(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    public Inventory addInventory(Inventory inventory) {
        inventory.setId(null);
        return inventoryRepository.save(inventory);
    }

    public List<Inventory> getInventory() {
        return inventoryRepository.findAll();
    }

    public Inventory updateInventory(Integer id, Inventory inventory) {
        Inventory existing = getInventoryById(id);
        existing.setName(inventory.getName());
        existing.setPrice(inventory.getPrice());
        existing.setQuantity(inventory.getQuantity());
        existing.setType(inventory.getType());
        return inventoryRepository.save(existing);
    }

    public Inventory getInventoryById(Integer id) {
        return inventoryRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Inventory not found with id: " + id));
    }

    public void deleteInventory(Integer id) {
        Inventory inventory = getInventoryById(id);
        inventoryRepository.delete(inventory);
    }
}
