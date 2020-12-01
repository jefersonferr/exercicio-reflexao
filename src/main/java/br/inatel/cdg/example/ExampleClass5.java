package br.inatel.cdg.example;

import br.inatel.cdg.annotation.reading.NumberToSum;

public class ExampleClass5 extends ExampleClass4 implements ExampleInterface {
	
	@Override
	public void method1() {
		System.out.println("Example Method Without Annotation");
	}

	@Override
	@NumberToSum(1)
	public void method2() {
		System.out.println("Example Method With Annotation");
	}

	@Override
	@NumberToSum(2)
	public void method3() {
		System.out.println("Example Method With Annotation");

	}

}
