package com.core.java8.feature.lambda;
class Child extends Parent{
		
		public Child()
		{
			super();
			System.out.println("C");
		}
		
		public Child(int i) {
			System.out.println("D");
		}
		
		static {
			System.out.println("Static Child");
		}
		
		
		{
			System.out.println("Instance Child");
		}
	}