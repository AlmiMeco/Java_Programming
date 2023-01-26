package day25_constructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterIntro {
    public static void main(String[] args) {


        LocalDate today = LocalDate.now();

        System.out.println(today);
//        ---> 2022-11-26 (default pattern)

        DateTimeFormatter dF = DateTimeFormatter.ofPattern("MMMM d yy"); // date pattern
        DateTimeFormatter dF2 = DateTimeFormatter.ofPattern("MMM_d_y"); // date pattern
        DateTimeFormatter dF3 = DateTimeFormatter.ofPattern("y/MMM - d"); // date pattern
        DateTimeFormatter dF4 = DateTimeFormatter.ofPattern("EEEE, MMM-d-y"); // date pattern

        System.out.println(today.format(dF));
//        ---> November 26 22 (new format)

        System.out.println(today.format(dF2));
//        ---> Nov_26_2022

        System.out.println(today.format(dF3));
//        ---> 2022/Nov - 26

        System.out.println(today.format(dF4));
//        ---> Saturday, Nov-26-2022

        System.out.println("-----------------------------------------------------");


//     ----------------------------------------------------------------------------------------------------------------

        DateTimeFormatter tF = DateTimeFormatter.ofPattern("HH:mm:s");
        DateTimeFormatter tF2 = DateTimeFormatter.ofPattern("hh:m:s a");

        LocalTime currentTime = LocalTime.now();

        System.out.println(currentTime);
//        ---> 15:41:15.503425100 (default format)


        System.out.println(currentTime.format(tF));
//        ---> 15:41:15

        System.out.println(currentTime.format(tF2));
//        ---> 03:42:28 PM

        System.out.println("-----------------------------------------------------");



//     ----------------------------------------------------------------------------------------------------------------



        DateTimeFormatter dTF = DateTimeFormatter.ofPattern("MM-dd-y || HH:mm:s");

        LocalDateTime start = LocalDateTime.now();

        System.out.println(start);
//        ---> 2022-11-26T16:02:22.678408200 (default format)

        System.out.println(start.format(dTF));
//        ---> 11-26-2022 || 16:02:22

    }

}
