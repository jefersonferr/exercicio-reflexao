package br.inatel.cdg.annotation.exceptions;

@SuppressWarnings("serial")
public class AnnotationReaderException extends Exception {
	
   String message;
   
   public AnnotationReaderException(String s) {
	   this.message = s;
   }

   @Override
   public String toString() {
	   return message;
   }
   
}
