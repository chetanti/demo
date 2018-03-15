package com.chet;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;

public class ClassB extends ClassA {


	protected void newMethod() {
		
		System.out.println("inside B");
	}
	
	public static void main(String[] args) {
		
		Date now = new Date(); 
		Instant current = now.toInstant(); 
		LocalDateTime ldt = LocalDateTime.ofInstant(current, ZoneId.of("America/Chicago")); 
		
		System.out.println("value of Date: " + now);
		
		System.out.println("value of LocalDateTime: " + ldt); 
		
		// converting java 8 LocalDateTime to java.util.Date 
		
		ZonedDateTime zdt = ldt.atZone(ZoneId.systemDefault()); 
		Date output = Date.from(zdt.toInstant()); 
		System.out.println("value of LocalDateTime: " + zdt); 
		
		System.out.println("value of Date: " + output);

		 List names = new ArrayList();
			
	      names.add("Mahesh");
	      names.add("Suresh");
	      names.add("Ramesh");
	      names.add("Naresh");
	      names.add("Kalpesh");
			
	      names.forEach(System.out::println);
			
		
	}
	public void main1(String[] args) {
		LocalTime  currentDate = LocalTime.now();
		
		LocalDate tenthFeb2014 = LocalDate.of(2014, Month.FEBRUARY, 10);
		
		
		
		
		ZoneId losAngeles = ZoneId.of("America/Chicago");
		ZoneId berlin = ZoneId.of("Europe/Berlin");
		
		LocalDateTime dateTime = LocalDateTime.now();
		
		System.out.println(dateTime);
		ZonedDateTime berlinDateTime = ZonedDateTime.of(dateTime, losAngeles);
		
		System.out.println(berlinDateTime);
		
		Instant instant = Instant.now();
		System.out.println("instant " + instant);
		LocalDateTime dateTimeFromInstant = LocalDateTime.ofInstant(instant, ZoneId.of("America/Chicago"));
		Instant instantFromDateTime = LocalDateTime.now().toInstant(ZoneOffset.ofHours(-2));
		
		System.out.println(dateTimeFromInstant);
		System.out.println("---instantFromDateTime " + instantFromDateTime);
		ZonedDateTime zdt = dateTimeFromInstant.atZone(ZoneId.systemDefault());
		System.out.println("zdt " + zdt);
		Date output = Date.from(zdt.toInstant());
		
		System.out.println(output);
		System.out.println("ZoneId.systemDefault() " + ZoneId.systemDefault());
		
		Instant instantFromDate = new Date().toInstant();
		System.out.println("instantFromDateTime-- " + instantFromDateTime);
		Instant instantFromCalendar = Calendar.getInstance().toInstant();
		ZoneId zoneId = TimeZone.getDefault().toZoneId();
		ZonedDateTime zonedDateTimeFromGregorianCalendar = new GregorianCalendar().toZonedDateTime();
		Date dateFromInstant = Date.from(Instant.now());
		TimeZone timeZone = TimeZone.getTimeZone(ZoneId.of("America/Los_Angeles"));
		System.out.println(timeZone);
		GregorianCalendar gregorianCalendar = GregorianCalendar.from(ZonedDateTime.now());
		
		
		
		
		
		int offsetInSeconds = berlinDateTime.getOffset().getTotalSeconds();
		System.out.println(offsetInSeconds);
		
		Set<String> allZoneIds = ZoneId.getAvailableZoneIds();

		// using offsets
		LocalDateTime date = LocalDateTime.now();
		ZoneOffset offset = ZoneOffset.of("+05:00");

		// 2013-07-20 22:30 +05:00
		OffsetDateTime plusFive = OffsetDateTime.of(date, offset);

		// 2013-07-19 20:30 -02:00
		OffsetDateTime minusTwo = plusFive.withOffsetSameInstant(ZoneOffset.ofHours(-2));

		/*System.out.println("timezones: berlinDateTime: " + berlinDateTime);
		//System.out.println("timezones: losAngelesDateTime: " + losAngelesDateTime);
		System.out.println("timezones: offsetInSeconds: " + offsetInSeconds);
		System.out.println("timezones: allZoneIds: " + allZoneIds);
		System.out.println("timezones: offset: " + offset);
		System.out.println("timezones: plusFive: " + plusFive);
		System.out.println("timezones: minusTwo: " + minusTwo);*/
		
	}
}
