package com.durga.geneics1;
public class Test {
public static void main(String[] args) {
		A<Integer> b=new A<Integer>(10);
		b.m1(13);
		b.show();
		System.out.println(b.get());
		A<Float> b1=new A<Float> (10.7f);
		b1.show();
		System.out.println(b1.get());
		A<Student> s=new A<>(new Student());
		s.show();
		}}
