package org.example

import spock.lang.Specification

class CalTest extends Specification {
    def "addition of two number"() {
        given:
            //def a=12
            //def b=34
        when:
            def cal=new Cal()
            def r = cal.add(a,b)
        then:
            r == p
        where:
            a|b|p
            1|2|3
            4|5|9
            7|8|15
    }
}
