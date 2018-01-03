package com.bbaek.utils;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Date convert util
 * @author woonsungbaek
 * @since 2018.01.03
 */
public class DateUtil {
	/**
	 * Convert calendar's time value in milliseconds to date 
	 * @param time
	 * @return
	 */
	public static Date calendarToDate(long time) {
		Calendar cal = Calendar.getInstance();
		cal.setTimeZone(TimeZone.getTimeZone("Asia/Seoul"));
		cal.setTimeInMillis(time);
		return new Date(cal.getTimeInMillis());
	}
	
	/**
	 * Convert date to formatted date.
	 * @param date
	 * @param format
	 * @return
	 * @throws ParseException
	 */
	public static Date stringToDate(String date, String format) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.parse(date);
	}
	
	/**
	 * Convert date string to date(format yyyyMMdd)
	 * @param date
	 * @return
	 * @throws ParseException
	 */
	public static Date stringToDate(String date) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		return sdf.parse(date);
	}
	
	/**
	 * Convert date to date string(format yyyy-MM-dd)
	 * @param date
	 * @return
	 * @throws ParseException
	 */
	public static String dateToString(Date date) throws ParseException {
		return DateUtil.dateToString(date, "yyyy-MM-dd");
	}
	
	/**
	 * Convert date to string date(format yyyy-MM-dd)
	 * @param date
	 * @return
	 * @throws ParseException
	 */
	public static String dateToDateString(Date date) throws ParseException {
		return DateUtil.dateToString(date, "yyyy-MM-dd");
	}
	
	/**
	 * Convert date to string time(format HH:mm:ss)
	 * @param date
	 * @return
	 * @throws ParseException
	 */
	public static String dateToTimeString(Date date) throws ParseException {
		return DateUtil.dateToString(date, "HH:mm:ss");
	}
	
	/**
	 * Convert date to formatted string
	 * @param date
	 * @param format
	 * @return
	 * @throws ParseException
	 */
	public static String dateToString(Date date, String format) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(date);
	}

	/**
	 * Adds or subtracts the specified amount of time to the given calendar field, based on the calendar's rules.
	 * @param field Callendar
	 * @param amount
	 * @param base
	 * @return
	 */
	public static Date addFieldFromDate(int field, int amount, Date base) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(base);
		cal.add(field, amount);
		return cal.getTime();
	}

	/**
	 * Add minutes to the base time.
	 * @param amount
	 * @param base
	 * @return
	 */
	public static Date addMinuteFieldFromDate(int amount, Date base) {
		return addFieldFromDate(Calendar.MINUTE, amount, base);
	}
	
	/**
	 * Add seconds to the base time.
	 * @param amount
	 * @param base
	 * @return
	 */
	public static Date addSecFieldFromDate(int amount, Date base) {
		return addFieldFromDate(Calendar.SECOND, amount, base);
	}

	/**
	 * Add hours to the base time.
	 * @param amount
	 * @param base
	 * @return
	 */
	public static Date addHourFieldFromDate(int amount, Date base) {
		return addFieldFromDate(Calendar.HOUR, amount, base);
	}

	/**
	 * Add hour of day to the base time.
	 * @param amount
	 * @param base
	 * @return
	 */
	public static Date addHourOfDayFieldFromDate(int amount, Date base) {
		return addFieldFromDate(Calendar.HOUR_OF_DAY, amount, base);
	}
	
	/**
	 * Add date to the base time.
	 * @param amount
	 * @param base
	 * @return
	 */
	public static Date addDateFieldFromDate(int amount, Date base) {
		return addFieldFromDate(Calendar.DATE, amount, base);
	}
}
