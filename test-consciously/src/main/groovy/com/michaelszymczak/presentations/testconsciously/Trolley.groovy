package com.michaelszymczak.presentations.testconsciously

class Trolley {

    private final List<Map> items = []

    int countItems() {
        if (items) {
            items.collect { it.quantity }.sum()
        } else {
            0
        }
    }

    BigDecimal total() {
        if (items) {
            items.collect { it.product.price * it.quantity }.sum()
        } else {
            0.0
        }
    }

    void add(int quantity, Product product) {
        Map lineItem = [product: product, quantity: quantity]
        items.add(lineItem)
    }
}
