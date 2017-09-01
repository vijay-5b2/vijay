package collections;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("Hyderabad");
		al.add("Pune");
		//al.add(new Integer(10));
		al.add("Pune");
		al.add("Vizag");
		//al.add(new Double(100.00));
		//al.add(new Float(10.00f));
				System.out.println(al);
		
		Object o1 = al.get(3);
		//System.out.println(o1);
		if(o1 instanceof String)
		{
			String s =(String)o1;
			System.out.println(s);
		}
		else if (o1 instanceof Integer)	
		{
			Integer I=(Integer)o1;
			System.out.println(I);
		}
		else if (o1 instanceof Double)
		{
			
		Double d = (Double)o1;
		System.out.println(d);
		}

		else if (o1 instanceof Float)
		{
			
		Float f = (Float)o1;
		System.out.println(f);
		}
	}



}
