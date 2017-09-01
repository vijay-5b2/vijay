package com.vijay.selenium.practice1;

public class B {
	int rollno;
	String sname;
	float sal;
	B(int rollno,String sname, float sal)
	{
	this.rollno=rollno;
	this.sname=sname;
	this.sal=sal;
	}
	
	public static void main(String[] args) {
		B s1=new B(101,"uday", 50000.00f);
		
		B s2=new B(102,"kumar", 60000.00f);
		

			System.out.println(s1.rollno);
			System.out.println(s1.sname);
			System.out.println(s1.sal);
			System.out.println(s2.rollno);
			System.out.println(s2.sname);
			System.out.println(s2.sal);
	}

}
