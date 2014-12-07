package com.michaelszymczak.presentations.testconsciously

import spock.lang.Specification

class TrolleyTest extends Specification {

    void setup() {
        trolley = new Trolley()
    }

    void 'should be empty upon creation'() {
        expect:
        trolley.countItems() == 0
        trolley.total() == 0.0
    }

    void 'should calculate total cost of all items in the trolley'() {
        given:
        assert GUNDE_CHAIR.price == 5.0
        assert INGOLF_CHAIR.price == 30.1

        when:
        trolley.add(4, GUNDE_CHAIR)
        trolley.add(2, INGOLF_CHAIR)

        then:
        trolley.total() == 80.2
    }

    void 'should count all added items'() {
        when:
        trolley.add(1, GUNDE_CHAIR)
        trolley.add(5, INGOLF_CHAIR)

        then:
        trolley.countItems() == 6
    }

    private Trolley trolley
    private static GUNDE_CHAIR = new Product('Gunde Chair', 5.0)
    private static INGOLF_CHAIR = new Product('Ingolf Chair', 30.1)
}
