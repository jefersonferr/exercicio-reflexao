package br.inatel.cdg.example;

import br.inatel.cdg.annotation.reading.NumberToSum;

public class ExampleClass3 extends ExampleClass2 {
	
		@NumberToSum(1)
		public int field1;

		@NumberToSum(2)
		private int field2;
		
		@NumberToSum(3)
		protected int field3;
		
		@NumberToSum(4)
		public ExampleClass3(int field1, int field2, int field3) {
			super();
			this.field1 = field1;
			this.field2 = field2;
			this.field3 = field3;
		}
		
		public void method4() {
			System.out.println("Example Method Without Annotation - Subclass");
		}
		
		@NumberToSum(10)
		public void method5() {
			System.out.println("Example Method With Annotation - Subclass");
		}		

}
