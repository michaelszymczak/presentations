package com.michaelszymczak.presentations.testconsciously

class LineItem {
    private final int quantity
    private final Product product

    LineItem(int quantity, Product product) {
        this.product = product
        this.quantity = quantity
    }

    String getName() {
        product.name
    }

    int getQuantity() {
        quantity
    }

    BigDecimal getTotalPrice() {
        product.price * quantity
    }
}
