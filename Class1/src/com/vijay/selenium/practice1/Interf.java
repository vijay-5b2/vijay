package com.vijay.selenium.practice1;

interface X
{
	void m1();
	int x=10;
}
public class Interf implements X {

	public void m1()
	{
	System.out.println("implemented");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interf  i=new Interf();
		i.m1();
		System.out.println(X.x);

	}
}
