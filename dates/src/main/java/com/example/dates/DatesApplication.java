package com.example.dates;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class DatesApplication {

    public static void main(String[] args) throws ParseException {
        //Date to Time
        Date dt=new Date();
        String time=DateTimeFormatter.ofPattern("H:mm").
                format(Instant.ofEpochMilli(dt.getTime())
                        .atZone(ZoneId.systemDefault())
                .toLocalDateTime());
        System.out.println(time);

        String time2=new SimpleDateFormat("H:mm").format(dt);
        System.out.println(time2);

        //*****************************//


        Date dtx=new Date();
        String formatted=new SimpleDateFormat("H:mm").format(dtx);
        LocalTime localTime= LocalTime.parse(formatted);
        System.out.println(localTime);
        /*****************/

        int hour=5;
        int min=20;
        String date=hour+":"+min;
        System.out.println(date);
        Date dte2=new SimpleDateFormat("H:mm").parse(date);
        System.out.println(dte2);
    }

}
