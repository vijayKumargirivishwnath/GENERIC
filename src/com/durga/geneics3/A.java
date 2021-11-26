package com.durga.geneics3;
import java.util.ArrayList;
public class A {
public static void main(String[] args) {
ArrayList<String> l=new ArrayList<String>();
l.add("vijay");
//l.add(10);  //here Arraylist is generic if u want it behave like  non generic then use generic  
// l.add(10.5); //ArrayList as parameter of in other method(m1) then that list behave like non generic.
		A x=new A();
		x.m1(l);
	}
		
	public  void m1(ArrayList l)
	{
			l.add("vijay");
			l.add(10);
			l.add(10.5);
			System.out.println(l);
			}}


