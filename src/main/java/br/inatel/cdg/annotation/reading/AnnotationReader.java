package br.inatel.cdg.annotation.reading;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import br.inatel.cdg.annotation.exceptions.AnnotationReaderException;

//Nessa classe você deverá implementar a sua solução
//Adicionalmente você também deverá criar
//a anotação NumberToSum como parte da solução

public class AnnotationReader<T> {
	
	private int totalSum;
	private Class<?> classe;

	public AnnotationReader(Class<?> clazz) {
		this.classe = clazz;
	}

	public void readAnnotations() throws AnnotationReaderException {
		if (this.classe != null) {
			// somando os valores das anotacoes dos construtores
			for(Constructor<?> c: classe.getDeclaredConstructors()) {
				if (c.isAnnotationPresent(NumberToSum.class)) { 
					totalSum += c.getAnnotation(NumberToSum.class).value();
				}
			}
			// somando os valores das anotacoes dos metodos
			for(Method m: classe.getDeclaredMethods()) {
				if (m.isAnnotationPresent(NumberToSum.class)) { 
					totalSum += m.getAnnotation(NumberToSum.class).value();
				}
			}
			// somando os valores das anotacoes dos campos
			for(Field f: classe.getDeclaredFields()) {
				if (f.isAnnotationPresent(NumberToSum.class)) {
					totalSum += f.getAnnotation(NumberToSum.class).value();
				}
			}
			// somando os valores das anotacoes das classe internas
			for(Class<?> i: classe.getDeclaredClasses()) {
				AnnotationReader<Class<?>> innerReader = new AnnotationReader<Class<?>>(i);
				innerReader.readAnnotations();
				totalSum += innerReader.getTotalSum();
			}
		} else {
			throw new AnnotationReaderException("Classe nula");
		}
	}
	
	public int getTotalSum() {
		return totalSum;
	}

}