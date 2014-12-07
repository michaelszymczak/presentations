package com.michaelszymczak.presentations.testconsciously

import spock.lang.Specification

class LineItemTest extends Specification {

    void 'should store information about how many products it contains'() {
        when:
        LineItem lineItem = new LineItem(10, product())

        then:
        lineItem.name == product().name
        lineItem.quantity == 10
    }


    void 'should calculate price taking info consideration product price and quantity'() {
        when:
        LineItem lineItem = new LineItem(5, new Product('some product', 10.5))

        then:
        lineItem.totalPrice == 52.5
    }



    private static Product product() {
        new Product('Foo', 1.0)
    }
}
