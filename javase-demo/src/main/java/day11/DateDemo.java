package day11;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Yang Song
 * @date 2022/8/1 15:54
 */
public class DateDemo {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime of = LocalDateTime.of(2022,2,12,8,30);
        LocalDateTime biggerTime = now.compareTo(of) > 0 ? now : of;
        System.out.println("日期"+biggerTime+"更后");
        System.out.println(now.getYear()+"年");
        System.out.println(now.getMonthValue()+"月");
        System.out.println(now.getDayOfMonth()+"日");
        System.out.println(now.getHour()+"时");
        System.out.println(now.getMinute()+"分");
        System.out.println(now.getSecond()+"秒");
        LocalDate parse = LocalDate.parse("2000-01-12");
        System.out.println(parse);
        String time = "2021年02月21日";
        LocalDate d = LocalDate.parse(time, DateTimeFormatter.ofPattern("yyyy年MM月dd日"));
        String s = d.format(DateTimeFormatter.ofPattern("yyyy年MM月dd日日期"));
        System.out.println(s);
    }
}
