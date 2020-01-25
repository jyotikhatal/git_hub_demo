package com.practice;

import java.util.Arrays;
import java.util.Comparator;

public class JavaQuizPractice {

	public static void main(String[] args, String str) {
		String[] ar = {"c", "d", "b","e"};
		InnerClass in = new InnerClass();
		Arrays.parallelSort(ar,in);
		for (String string : ar) {
			System.out.println(str +"");
			//System.out.println("Aruna");

		}
		System.out.println(Arrays.binarySearch(ar, "b"));	

	}


	static class InnerClass implements Comparator<String>
	{
		public int compare(String s1, String s2)
		{
			return s2.compareTo(s1);
		}
	}
}