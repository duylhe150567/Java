package test1.edu.home;

import java.time.LocalDateTime;
import java.util.Calendar;

public class Main1 {

	public static void main(String[] args) {
		//System.out.println("Main2");
		String s = "Java;Python;Php;Ruby";
		String[] kq = s.split(";");
		
		for(int i=0; i<kq.length; i++)
		{
			System.out.println(kq[i]);
		}
		String s1 = new String("Java simple ei, Java Great ");
		String kq2 = s1.replaceFirst("Java", "J");
		System.out.println(kq2);
		System.out.println(s1.replaceAll("Java", "J"));
		for (String result : kq) {
			System.out.println(result);
		}
		
		
		
		
		
		
		/*
		String s = new String("Java simple ei ");
		int index1 = s.indexOf("i");
		System.out.println(index1);
		int index2 = s.lastIndexOf("i");
		System.out.println(index2);
		*/
		
		/*
		String s1 = "Hello ";
		System.out.println(s1.length());
		String s2 = s1 + "World" ;
		System.out.println(s2.length());
		System.out.println(s1+ "class");
		*/
	}
}
