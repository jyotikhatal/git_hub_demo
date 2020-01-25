package com.csi.oops;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DateFormatTest {

	public static void main(String[] args) {
		
		System.out.println("Current Date: " + new Date());
		System.out.println("Local Dtae: " + LocalDate.now());
		System.out.println("Local Time: " + LocalTime.now());
		System.out.println("Local Date And Time: " + LocalDateTime.now());
		Date d = new Date();
		SimpleDateFormat s = new SimpleDateFormat("DD/YY/MM");
		System.out.println(s.format(d));
		System.out.println("" + LocalDate.parse("1997-11-10"));//text format
		/*
		System.out.println("" + LocalDate.of(2020, 01, 13));
		System.out.println("" + LocalDate.ofEpochDay(0));//its represent by default epochday 0 then 1970-01-01
		System.out.println("" + LocalDate.ofYearDay(2020, 333));//year and year of day
		
		
		
		/*
		System.out.println("" + LocalTime.of(11, 23));//hrs and min
		System.out.println("" + LocalTime.of(21, 10, 55, 25));
		System.out.println("" + LocalTime.ofNanoOfDay(15));
		System.out.println("" + LocalTime.ofSecondOfDay(12));//second of day only 0 to 24 range

		
		System.out.println("" + LocalDateTime.of(2020, 01, 13, 20, 13));//year,month,dayofmonth,hrs,min
		System.out.println("" + LocalDateTime.MAX);
		System.out.println("" + LocalDateTime.from(null));
		*/

			}}


