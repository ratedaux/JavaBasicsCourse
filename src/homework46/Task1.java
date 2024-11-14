package homework46;

import java.security.PublicKey;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Task1 {

    /*
    Получить и вывести на экран:
        - текущую дату
        - текущий год, месяц и день
    Создать дату, например Ваш день рождения и вывести на экран
    Создать две даты и проверить на равенство
    Получить и вывести на экран:
        - текущее время
        - текущее время + 3 часа
    Создать дату:
        - которая на неделю позже сегодняшней
        - которая была на год раньше сегодняшней используя метод minus
        - которая на год позже сегодняшней
        - tomorrow и yesterday и проверить находятся ли они до или после сегодняшней
    */

    public static void main(String[] args) {

        LocalDate date = LocalDate.now(); // возвращает текущую дату
        System.out.println("now: " + date);

        LocalDate bday=LocalDate.of(2000, 8, 15);
        System.out.println("bday date:" + bday);
        LocalDate date1 = LocalDate.of(2002, Month.FEBRUARY, 15);
        System.out.println("date1.equals(bday): " + date1.equals(bday));

        LocalTime time = LocalTime.now(); // возвращает текущее время
        System.out.println("current time:" + time);
        System.out.println("time.plusHours(1): " + time.plusHours(3));

        LocalDate date2=LocalDate.now();
        date2=date2.plusWeeks(1);
        LocalDate date3=date.minusYears(1);
        LocalDate date4=date.plusYears(1);

        LocalDate tomorrow=date.plus(1, ChronoUnit.DAYS);
        LocalDate yesterday = date.minus(1, ChronoUnit.DAYS);
        System.out.println("tomorrow.isAfter(date):" + tomorrow.isAfter(date));
        System.out.println("yesterday.isBefore(date):" + yesterday.isBefore(date));

        List<LocalDate> dates= List.of(date, date1, date2, date3, date4);
        System.out.println("amountOfDays(dates):" + amountOfDays(dates));
    }

    /*Написать метод, принимающий список из нескольких дат типа LocalDate и
    возвращающий количество дней между самой ранней и поздней датами в этом списке*/

    public static long amountOfDays(List<LocalDate> dates){
        if (dates == null || dates.isEmpty()) {
            throw new IllegalArgumentException("Список дат не должен быть пустым");
        }

        LocalDate minDate = dates.stream().min(LocalDate::compareTo).orElseThrow();
        LocalDate maxDate = dates.stream().max(LocalDate::compareTo).orElseThrow();

        return ChronoUnit.DAYS.between(minDate, maxDate);
    }
}
