package com.durga.geneics2;
import java.util.ArrayList;
public class A<T extends  Number> {
public static void main(String[] args) {
A<Integer> i=new A<Integer>(); //BY  extends keyword we can limit range of generic T to number only.(bound)
//A<String> i=new A<String>();  // compile time error.
}}
