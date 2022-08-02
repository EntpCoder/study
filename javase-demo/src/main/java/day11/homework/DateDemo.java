package day11.homework;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * @author Yang Song
 * @date 2022/8/1 17:47
 */
public class DateDemo {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("当前时间:"+now);
        LocalDateTime afterTwoDay = now.plusDays(2);
        System.out.println("两天后的日期:"+afterTwoDay);
        LocalDateTime beforeThreeDay = now.plusDays(-3);
        System.out.println("三天前的日期:"+beforeThreeDay);
        String strDateTime = "2022/7/21 19:30";
        LocalDateTime parse = LocalDateTime.parse(strDateTime, DateTimeFormatter.ofPattern("yyyy/M/dd k:mm"));
        System.out.println("字符串转日期:"+parse);
        long betweenDay = ChronoUnit.DAYS.between(beforeThreeDay, now);
        System.out.println("两天相差的天数为:"+betweenDay);
        System.out.println(Clock.systemUTC());
        System.out.println(now.getDayOfYear());
        System.out.println("================");
        LocalDate start = LocalDate.of(2020,8,25);
        LocalDate end = LocalDate.of(2022,8,2);
        Period period = Period.between(start,end);
        System.out.println("两个时间之间的差值年:"+period.getYears()+",月:"+period.getMonths()+",日:"+period.getDays());
        System.out.println("===========");
    }
}
