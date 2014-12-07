package com.michaelszymczak.presentations.testconsciously

import spock.lang.Specification

class ProductTest extends Specification {

    void 'should store product name and its price'() {
        when:
        p = new Product(
                name: 'Ingolf Chair',
                price: 35.0
        )

        then:
        p.name == 'Ingolf Chair'
        p.price == 35.0

    }

    void 'be immutable value object'() {
        given: p = product()
        when: p.price = 55.0
        then: thrown ReadOnlyPropertyException
    }

    Product product() {
        new Product(
                name: 'Foo',
                price: 1.0
        )
    }

    private Product p
}
