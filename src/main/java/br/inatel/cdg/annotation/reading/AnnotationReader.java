package br.inatel.cdg.annotation.reading;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

//Nessa classe você deverá implementar a sua solução
//Adicionalmente você também deverá criar
//a anotação NumberToSum como parte da solução

public class AnnotationReader<T> {
	
	private int totalSum;
	private Class<?> c;

	public AnnotationReader(Class<?> clazz) {
		this.c = clazz;
	}

	public void readAnnotations() {
		// somando os valores das anotacoes dos metodos
		for(Method m: c.getDeclaredMethods()) {
		   if (m.isAnnotationPresent(NumberToSum.class)) { 
			   totalSum += m.getAnnotation(NumberToSum.class).value();
		   }
		}
		// somando os valores das anotacoes dos campos
        for(Field f: c.getDeclaredFields()) {
           if (f.isAnnotationPresent(NumberToSum.class)) {
        	   totalSum += f.getAnnotation(NumberToSum.class).value();
           }
        }
	}
	
	public int getTotalSum() {
		return totalSum;
	}

}