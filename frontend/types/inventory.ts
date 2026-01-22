/**
 * Inventory-related type definitions
 * Note: All IDs are Long (number) in the backend, using IDENTITY generation strategy
 */

export interface InventoryItem {
  id: number;
  productId: number;
  productName: string;
  categoryId: number;
  categoryName: string;
  quantity: number;
  currentPrice: number;
  basePrice: number;
  minPrice: number;
  maxPrice: number;
  adjustedPrice?: number;
  organizationId: number;
  updatedAt: string;
}

export interface Category {
  id: number;
  name: string;
  dynamicPricing: boolean;
}

export interface InventoryTransactionResponseDto {
  id: number;
  inventoryId: number;
  transactionType: string;
  quantityChange: number;
  quantityBefore: number;
  quantityAfter: number;
  referenceId?: string;
  notes?: string;
  createdBy: string;
  createdByName?: string;
  createdByEmail?: string;
  createdAt: string;
}
