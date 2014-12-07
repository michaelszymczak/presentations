package com.michaelszymczak.presentations.testconsciously

class Trolley {

    private final List<LineItem> items = []

    int countItems() {
        if (items) {
            items.collect { it.quantity }.sum()
        } else {
            0
        }
    }

    BigDecimal total() {
        if (items) {
            items.collect { it.totalPrice }.sum()
        } else {
            0.0
        }
    }

    void add(int quantity, Product product) {
        items.add(new LineItem(quantity, product))
    }
}
