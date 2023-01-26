package day24_dateAndTime;

import java.time.LocalDate;

public class LocalDateIntro {
    public static void main(String[] args) {


        LocalDate today = LocalDate.now(); // ---> Current Date (year - month - day)

        System.out.println(today);
//        ---> 2022-11-25  (default date format)

        LocalDate birthday = LocalDate.of(2001, 3, 13); //---> Specified date (year - month - day)

        System.out.println(birthday);
//        ---> 2001-03-13

        System.out.println("--------------------------------------------");

//        |.getYear() method|                 (gets YEAR of local date)
        System.out.println(birthday.getYear());
//      ---> 2001

//        |.getMonth() method|                (gets MONTH of local date ---> WORD FORMAT)
        System.out.println(birthday.getMonth());
//      ---> MARCH

//        |.getMonthValue() method|           (gets MONTH of local date ---> NUMBER FORMAT)
        System.out.println(birthday.getMonthValue());
//        ---> 3


        System.out.println("--------------------------------------------");


//        |.getDayOfWeek() method|            (gets day of specified date ---> WORD FORMAT)
        System.out.println(birthday.getDayOfWeek());
//        ---> TUESDAY (MARCH 13 2001)

//        |.getDayOfMonth() method|           (gets day of specified date ---> NUMBER FORMAT)
        System.out.println(birthday.getDayOfMonth());
//        ---> 13

//        |.getDayOfYear() method|            (gets day of specified date 1-365)
        System.out.println(birthday.getDayOfYear());
//        ---> 72 (72nd day of 2001)


        System.out.println("--------------------------------------------");


//        |.plusYears() method|               (add (x) years to current date)
        today = today.plusYears(1); // adds '1' year to today's date (must be assigned to old variable *immutable*)
        System.out.println(today);
//        ---> 2023-11-25

//        |.plusMonths() method|              (add (x) months to current date)
        today = today.plusMonths(1); // adds '1' month to today's date
        System.out.println(today);
//        ---> 2023-12-25

//        |.plusWeeks() method|               (add (x) amount of weeks {7days} to current date)
        birthday = birthday.plusWeeks(1); // 13 + 7 ---> 20
        System.out.println(birthday);
//        ---> 2001-03-20

//        |.plusDays() method|                (add (x) amount of days to date)
        today = today.plusDays(3);
        System.out.println(today);
//        ---> 2023-12-28


                    /* .minus... Years, Months, Weeks, Days method ---> the opposite of plus methods */


        System.out.println("--------------------------------------------");

        LocalDate birthday1 = LocalDate.of(1994, 7, 7);
        LocalDate birthday2 = LocalDate.of(1995, 6, 7);

//        |.isEquals() method|                (compares if two dates are equal)
        System.out.println(birthday1.isEqual(birthday2));
//        ---> false

//        |.isBefore() method|                (boolean method ---> true if date1 is before date2)
        System.out.println(birthday1.isBefore(birthday2));
//        ---> true

//        |.isAfter() method|                 (opposite of isBefore() method)
        System.out.println(birthday1.isAfter(birthday2));
//        ---> false

//        |.isLeapYear() method|              (checks if given date falls on a leap year ---> boolean {true/false})
        System.out.println(birthday.isLeapYear());
        System.out.println(birthday1.isLeapYear());
        System.out.println(birthday2.isLeapYear());
//        ---> false
//        ---> false
//        ---> false
        System.out.println(LocalDate.of(2000, 3,13).isLeapYear());
//        ---> true (2000 is a leap year)




    }


}
