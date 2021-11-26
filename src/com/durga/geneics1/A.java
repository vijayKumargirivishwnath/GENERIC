package com.durga.geneics1;
public class A<T> // GENERIC CLASS
{
	T a;//generic variable
	public A(T a)  
	{                       //generic constructor
		super();
		this.a = a;
	}

	

	public A() {
		// TODO Auto-generated constructor stub
	}



	void m1(T a)    //GENRIC USE IN METHOD
	{
		
	}
   void show()
   {
	   System.out.println("the type of a is="+a.getClass().getName());
   }
	public T get()
	{
		return a;
		
	}
	
}


