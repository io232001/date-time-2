package it.develhope.datetime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class Start
{
    public static void main(String args[])
    {
        LocalDateTime current=LocalDateTime.now();
        System.out.println("dayNumber:"+current.getDayOfMonth()+
                " fullMonthName:"+current.getMonth()+
                " Last2DigitsOfYearNumber:"+current.getYear()+
                " HourTime:"+current.getHour()+
                " minuteTime:"+current.getMinute());

        ZonedDateTime current1=ZonedDateTime.now();
        System.out.println(current1.getHour()+"."+current1.getMinute()+" "+current1.getZone());
    }
}



