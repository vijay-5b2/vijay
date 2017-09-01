package com.vijay.selenium.practice1;

public class A {
int a=10;
static int b=20;

public static void main(String[] args)
{
	int a1=100;
//System.out.println(b);
A obj=new A();
//System.out.println(obj.a);
	obj.m1();
	//m2();
	System.out.println(a1);
}
void m1()
{
	//int a2=1000;
//	System.out.println(a);
	System.out.println(b);
}
static void m2()
{
	System.out.println("Hi i'm a static method");
}
}
