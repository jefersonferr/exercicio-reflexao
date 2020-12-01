package br.inatel.cdg.example;

import br.inatel.cdg.annotation.reading.NumberToSum;

public interface ExampleInterface {
	
    @NumberToSum(1)
    public void method1();
    
    @NumberToSum(2)
    public void method2();
    
    @NumberToSum(3)
    public void method3();

}
