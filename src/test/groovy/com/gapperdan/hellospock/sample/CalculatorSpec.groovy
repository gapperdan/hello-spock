package com.gapperdan.hellospock.sample

import spock.lang.Specification

class CalculatorSpec extends Specification {
	
	def "It should return 2 when calling sum for 1 and 1"() {
		
		given:
			def calculator = new Calculator()
		
		when:
			def sum = calculator.sum(1, 1)
			
		then:
			sum == 2					
	}
}
