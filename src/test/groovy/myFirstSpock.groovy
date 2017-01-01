import spock.lang.Specification

class myFirstSpock extends Specification {
	
		def setup()
		{
			println "setuppppppppppppppppppppppppp"
		}
		
		def cleanup()
		{
			println "cleanupppppppppppppppppppppp"
		}
		
		def "my"(int a)
		{
			
			expect:
			a==2
			
			where:
			a|_
			2|_
			2|_
			2|_
			
		}
		
		def "my1"(int a)
		{
			
			expect:
			a==2
			
			where:
			a|_
			2|_
			2|_
			2|_
			
		}

}
