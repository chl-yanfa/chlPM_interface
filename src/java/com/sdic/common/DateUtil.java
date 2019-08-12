package com.sdic.common;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 日期工具类
 */
public class DateUtil {

	
	/**
	 * 两个日期相减得到秒数
	 * @param minDate	小的时间
	 * @param maxDate	大的时间
	 * @return
	 */
	public static long dateSubtraction(Date minDate,Date maxDate){
		if(minDate == null || maxDate == null){
			return 0;
		}
		Long min = minDate.getTime();
		Long max = maxDate.getTime();
		return (max-min)/1000;
	}
	
	/**
	 * 秒数转换成小时
	 * @param secondes
	 * @return
	 */
	public static String secToTime(long secondes) {
        String timeStr = null;
        long hour = 0;
        long minute = 0;
        long second = 0;
        if (secondes <= 0)
            return "00:00:00";
        else {
            minute = secondes / 60;
            if (minute < 60) {
                second = secondes % 60;
                timeStr =  "00"+ ":"+unitFormat(minute) + ":" + unitFormat(second);
            } else {
                hour = minute / 60;
                /*if (hour > 99)
                    return "99:59:59";*/
                minute = minute % 60;
                second = secondes - hour * 3600 - minute * 60;
                timeStr = unitFormat(hour) + ":" + unitFormat(minute) + ":" + unitFormat(second);
            }
        }
        return timeStr;
    }
    public static String unitFormat(long i) {
    	String t = Long.toString(i);
    	if(t.length() < 2){
    		t = "0"+t;
    	}
        return t;
    }
    
    /**
	 * 两个日期格式化成00:00:00
	 * @param minDate	小的时间
	 * @param maxDate	大的时间
	 * @return
	 */
	public static String getDateToFormatHour(Date minDate,Date maxDate){
		return secToTime(dateSubtraction(minDate,maxDate));
	}
    /**
     * 格式化日期
     * @param date    需格式化的日期
     * @param format  格式化类型，如yyyy/MM/dd HH:mm:ss 等
     * @return
     */
    public static String formatDate(Date date,String format){
    	if(date == null){
    		return "";
    	}
    	SimpleDateFormat sdf = new SimpleDateFormat(format);
    	return sdf.format(date);
    }
    
    /**
     * 判断日期是上午还是下午
     * @param date
     * @return
     */
    public static String morningOrAfternoon(Date date) {
    	Calendar calendar = new GregorianCalendar(); 
    	calendar.setTime(date);
    	return (calendar.get(GregorianCalendar.AM_PM) == GregorianCalendar.PM)? "下午" : "上午";
	}
    /**
	 * 获取num天前的日期(算上今天)
	 * @return
	 */
	public static String otherDay(int num){
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, calendar.get(Calendar.DAY_OF_MONTH)-(num-1));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = sdf.parse(sdf.format(calendar.getTime()));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return sdf.format(date);
	}
	/**
	 * 获取num月前的日期
	 * @return	yyyy-MM-dd
	 */
	public static String beforeMonth(int num){
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH)-num);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = sdf.parse(sdf.format(calendar.getTime()));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return sdf.format(date);
	}
	/**
	 * 获取num月后的日期
	 * @return	yyyy-MM-dd
	 */
	public static String afterMonth(int num){
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH)-num);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = sdf.parse(sdf.format(calendar.getTime()));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return sdf.format(date);
	}
	
	/**
	 * Stringr类型转换成日期类型
	 * @return	yyyy-MM-dd
	 */
	/**
	 * 如果
	 * @param str
	 * @param format
	 * @return
	 */
	public static Date StringToDate(String str){
		String format = "yyyy年MM月dd日 HH:mm:ss";
		if(str==null || str.equals("")){
			return null;
		}else if (str.indexOf("-") != -1 && str.indexOf(":") != -1) {
			format = "yyyy-MM-dd HH:mm:ss";
		}else if (str.indexOf("-") != -1 && str.indexOf(":") == -1) {
			format = "yyyy-MM-dd";
		}else if (str.indexOf("/") != -1 && str.indexOf(":") != -1) {
			format = "yyyy/MM/dd HH:mm:ss";
		}else if (str.indexOf("/") != -1 && str.indexOf(":") == -1) {
			format = "yyyy/MM/dd";
		}
		SimpleDateFormat sdf  = new SimpleDateFormat(format); 
//		DateFormat sdf = DateFormat.getDateInstance();
		Date date = null;
		try {
			date = sdf.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
		return date;
	}
	
	public static void main(String[] args) {
		Date date = getTimesMonthmorning();
		System.out.println(formatDate(date, "yyyy/MM/dd HH:mm:ss"));
	}
	/**
	 * 获取今天0点时间
	 * @return
	 */
	public static Date getTimesmorning() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();
	}

	/**
	 * 获取今天24点时间
	 * @return
	 */
	public static Date getTimesnight() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 24);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return  cal.getTime();
	}

	/**
	 * 获得本周一0点时间
	 * @return
	 */
	public static Date getTimesWeekmorning() {
		Calendar cal = Calendar.getInstance();
		cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONDAY), cal.get(Calendar.DAY_OF_MONTH), 0, 0, 0);
		cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		return  cal.getTime();
	}

	/**
	 * 获得本周日24点时间
	 * @return
	 */
	public  static Date getTimesWeeknight() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(getTimesWeekmorning());
		cal.add(Calendar.DAY_OF_WEEK, 7);
		return cal.getTime();
	}

	/**
	 * 获得本月第一天0点时间
	 * @return
	 */
	public static Date getTimesMonthmorning() {
		Calendar cal = Calendar.getInstance();
		cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONDAY), cal.get(Calendar.DAY_OF_MONTH), 0, 0, 0);
		cal.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(Calendar.DAY_OF_MONTH));
		return  cal.getTime();
	}

	/**
	 * 获得本月最后一天24点时间
	 * @return
	 */
	public static Date getTimesMonthnight() {
		Calendar cal = Calendar.getInstance();
		cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONDAY), cal.get(Calendar.DAY_OF_MONTH), 0, 0, 0);
		cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		cal.set(Calendar.HOUR_OF_DAY, 24);
		return cal.getTime();
	}
	/**
	 * 获得num月前的第一天0点时间
	 * @return
	 */
	public static Date getBeforeMonths(int num) {
		Calendar cal = Calendar.getInstance();
		cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONDAY)-num, cal.get(Calendar.DAY_OF_MONTH), 0, 0, 0);
		cal.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(Calendar.DAY_OF_MONTH));
		return  cal.getTime();
	}
}
