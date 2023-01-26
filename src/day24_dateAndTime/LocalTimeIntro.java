package day24_dateAndTime;

import java.time.LocalTime;

public class LocalTimeIntro {
    public static void main(String[] args) {

        LocalTime currentTime = LocalTime.now();  // every time you call this method you will get a different time
        System.out.println(currentTime);
//        ---> 17:44:38.465874600
//            (hr)(min)(sec)(nano-sec)  ---> default format

        LocalTime startingTime = LocalTime.of(9, 20); // ONLY (hr) + (min) are required to create a time obj
        System.out.println(startingTime);
//        ---> 09:20


                           /* SAME METHODS OF LocalDate Class w/ name changes */

        /* :: Local Time uses... {getHour(), getMinute() , getSecond(), getNano()} */

        /* :: Local Time uses... {plusHours(), plusMinutes(), plusSeconds(), plusNanos()}*/

        /* :: Local Time uses... {minusHours(), minusMinutes(), minusSeconds(), minusNanos()}*/

        /* :: Local Time uses... {isEquals(), isBefore(), isAfter()}*/

                           /* Check LocalDateIntro for breakdown of ALL Methods */




    }

}
