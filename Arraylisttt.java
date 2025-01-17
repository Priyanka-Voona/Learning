package Java;

import java.util.ArrayList;

public class Arraylisttt {
	public static void main(String[]args)
	{
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(false);
		a1.add(10);
		a1.add(3.144);
		a1.add('P');
		System.out.println(a1);
		ArrayList a2=new ArrayList();
		a2.add(90);
		a2.add(true);
		a2.add(3.144);
		a2.add("Priya");
		System.out.println(a2);
		a1.remove(3.144);
		System.out.println(a1);
		a1.addAll(a2);
		System.out.println(a1);
		System.out.println(a1.size());
		System.out.println(a2.isEmpty());
	}

}
