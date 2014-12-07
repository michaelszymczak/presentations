package com.michaelszymczak.presentations.testconsciously

import groovy.transform.EqualsAndHashCode
import groovy.transform.Immutable

@Immutable
@EqualsAndHashCode
class Product {
    String name
    BigDecimal price
}
