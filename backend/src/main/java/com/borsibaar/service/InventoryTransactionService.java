package com.borsibaar.service;

import com.borsibaar.dto.InventoryResponseDto;
import com.borsibaar.entity.Inventory;
import com.borsibaar.entity.InventoryTransaction;
import com.borsibaar.entity.Product;
import com.borsibaar.mapper.InventoryMapper;
import com.borsibaar.repository.InventoryTransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class InventoryTransactionService {
    private final InventoryTransactionRepository inventoryTransactionRepository;
    private final InventoryMapper inventoryMapper;

    @Transactional
    public void createTransaction(Inventory inventory, String type, BigDecimal quantityChange,
            BigDecimal quantityBefore, BigDecimal quantityAfter,
            BigDecimal priceBefore, BigDecimal priceAfter,
            String referenceId, String notes, UUID userId) {
        InventoryTransaction transaction = new InventoryTransaction();
        transaction.setInventory(inventory);
        transaction.setTransactionType(type);
        transaction.setQuantityChange(quantityChange);
        transaction.setQuantityBefore(quantityBefore);
        transaction.setQuantityAfter(quantityAfter);
        transaction.setPriceBefore(priceBefore);
        transaction.setPriceAfter(priceAfter);
        transaction.setReferenceId(referenceId);
        transaction.setNotes(notes);
        transaction.setCreatedBy(userId);
        transaction.setCreatedAt(OffsetDateTime.now());
        inventoryTransactionRepository.save(transaction);
    }

    public InventoryResponseDto createInventoryResponse(Inventory inventory, Product product, BigDecimal currentPrice) {
        InventoryResponseDto base = inventoryMapper.toResponse(inventory);
        return new InventoryResponseDto(
                base.id(),
                base.organizationId(),
                base.productId(),
                product.getName(),
                base.quantity(),
                currentPrice,
                product.getDescription(),
                null,
                product.getMinPrice(),
                product.getMaxPrice(),
                base.updatedAt());
    }
}
