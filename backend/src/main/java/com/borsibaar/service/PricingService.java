package com.borsibaar.service;

import com.borsibaar.entity.Category;
import com.borsibaar.entity.Inventory;
import com.borsibaar.entity.Product;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Optional;

@Service
public class PricingService {

    public BigDecimal calculateCurrentPrice(Inventory inventory, Product product) {
        return Optional.ofNullable(inventory.getAdjustedPrice())
                .orElse(product.getBasePrice());
    }

    public BigDecimal calculatePriceAfterSale(BigDecimal currentPrice, Product product, Category category) {
        if (category != null && category.isDynamicPricing()) {
            BigDecimal newPrice = currentPrice.add(product.getOrganization().getPriceIncreaseStep());
            if (product.getMaxPrice() != null && newPrice.compareTo(product.getMaxPrice()) > 0) {
                return product.getMaxPrice();
            }
            return newPrice;
        }
        return currentPrice;
    }

    public BigDecimal calculateTotalPrice(BigDecimal unitPrice, BigDecimal quantity) {
        return unitPrice.multiply(quantity);
    }
}
