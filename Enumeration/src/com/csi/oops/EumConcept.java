package com.csi.oops;

import java.time.Month;

public class EumConcept {
	public enum Months
	{
	JANUARY,FEBRUARY,MARCH,APRIL,MAY,JUNE,JULY,AUGUST,SEPTEMBER,OCTOBER,NOVEMBER,DECEMBER;
		
	}
	

	public static void main(String[] args) {
	
		for (Months m : Months.values())
		{
			System.out.println(m);
			if(m.toString().equals("MAY"))
			{
				System.out.println("SUMMER");
			}
		}
		
/*System.out.println("Value is: " + Months.valueOf("JANUARY"));
System.out.println("Value is: " + Months.valueOf("FEBRUARY").ordinal());
System.out.println("Value is: " + Months.valueOf("MARCH").ordinal());*/
	}

}
