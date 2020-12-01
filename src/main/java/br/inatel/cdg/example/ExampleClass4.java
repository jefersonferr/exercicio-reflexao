package br.inatel.cdg.example;

import br.inatel.cdg.annotation.reading.NumberToSum;

public class ExampleClass4 {
	
	 private class ExampleInnerClass {
			@NumberToSum(15)
			public void method6() {
				System.out.println("Example Method With Annotation - InnerClass");
			}	
	 }
	 
     @NumberToSum(20)
     public void method7() {
	    new ExampleInnerClass();
     }	

}
