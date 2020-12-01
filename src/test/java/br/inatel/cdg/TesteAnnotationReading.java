package br.inatel.cdg;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.inatel.cdg.annotation.exceptions.AnnotationReaderException;
import br.inatel.cdg.annotation.reading.AnnotationReader;
import br.inatel.cdg.example.ExampleClass1;
import br.inatel.cdg.example.ExampleClass2;
import br.inatel.cdg.example.ExampleClass3;
import br.inatel.cdg.example.ExampleClass4;
import br.inatel.cdg.example.ExampleClass5;
import br.inatel.cdg.example.ExampleInterface;

//Utilize essa classe de testes para guiar sua solução!
public class TesteAnnotationReading {

	@Test
	public void testeExemploClass1() {
		
		AnnotationReader<Class<ExampleClass1>> aReader = 
				new AnnotationReader<Class<ExampleClass1>>(ExampleClass1.class);
		
		try {
			aReader.readAnnotations();
		} catch (AnnotationReaderException e) {
			e.printStackTrace();
		}
		
		int totalSum = aReader.getTotalSum();
		
		assertEquals(6, totalSum);
	}
	
	@Test
	public void testeExemploClass2() {
		AnnotationReader<Class<ExampleClass2>> aReader = 
				new AnnotationReader<Class<ExampleClass2>>(ExampleClass2.class);
		
		try {
			aReader.readAnnotations();
		} catch (AnnotationReaderException e) {
			e.printStackTrace();
		}
		
		int totalSum = aReader.getTotalSum();
		
		assertEquals(15, totalSum);
	}
	
	@Test
	public void testeExemploClass3() {
		AnnotationReader<Class<ExampleClass3>> aReader = 
				new AnnotationReader<Class<ExampleClass3>>(ExampleClass3.class);
		
		try {
			aReader.readAnnotations();
		} catch (AnnotationReaderException e) {
			e.printStackTrace();
		}
		
		int totalSum = aReader.getTotalSum();
		
		assertEquals(20, totalSum);
	}	
	
	@Test
	public void testeExemploClass4() {
		AnnotationReader<Class<ExampleClass4>> aReader = 
				new AnnotationReader<Class<ExampleClass4>>(ExampleClass4.class);
		
		try {
			aReader.readAnnotations();
		} catch (AnnotationReaderException e) {
			e.printStackTrace();
		}
		
		int totalSum = aReader.getTotalSum();
		
		assertEquals(35, totalSum);
	}	
	
	@Test
	public void testeExemploInterface() {
		AnnotationReader<Class<ExampleInterface>> aReader = 
				new AnnotationReader<Class<ExampleInterface>>(ExampleInterface.class);
		
		try {
			aReader.readAnnotations();
		} catch (AnnotationReaderException e) {
			e.printStackTrace();
		}
		
		int totalSum = aReader.getTotalSum();
		
		assertEquals(6, totalSum);
	}	
	
	@Test
	public void testeExemploClass5() {
		AnnotationReader<Class<ExampleClass5>> aReader = 
				new AnnotationReader<Class<ExampleClass5>>(ExampleClass5.class);
		
		try {
			aReader.readAnnotations();
		} catch (AnnotationReaderException e) {
			e.printStackTrace();
		}
		
		int totalSum = aReader.getTotalSum();
		
		assertEquals(3, totalSum);
	}	

	@Test
	public void testeException() {
		
		@SuppressWarnings({ "rawtypes", "unchecked" })
		// caso a classe seja instanciada com uma referencia nula
		AnnotationReader aReader = new AnnotationReader(null);
		
		try {
			aReader.readAnnotations();
		} catch (AnnotationReaderException e) {
			assertEquals("Classe nula",e.toString());
		}
		
	}	
	
}