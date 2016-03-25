package com.gapperdan.hellospock.sample

import com.gapperdan.hellospock.sample.Library
import spock.lang.Specification;

class LibrarySpec extends Specification {
	
	def "I should get true when I call someLibraryMethod"() {

		given:
			def myLibrary = new Library() 
		
		when: 
			def myResult = myLibrary.someLibraryMethod();
			
		then:
			myResult == true
					
	}
}
