import java.util.*;
import java.time.*;

public class Main
{
    public static void main(String[] args)
    {
        String gender = "Hz";
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter your name: ");
        String name = sc.next();

        System.out.print("Enter your surname: ");
        String surname = sc.next();

        System.out.print("Enter your middle name: ");
        String midname = sc.next();
        System.out.print("Enter your date of birth (year month day): ");
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();
        LocalDate date = LocalDate.of(year, month, day);

        if (midname.charAt(midname.length() - 1) == 'а')
        {
            gender = "Женщина";
        }
        else
        {
            gender = "Мужчина";
        }

        LocalDate curDate = LocalDate.now();
        int age = Period.between(date, curDate).getYears();

        System.out.println(surname + " " + name.charAt(0) + ". " + midname.charAt(0) + ".");
        System.out.println(gender);


        if (age % 10 == 1 && (age / 10) % 10 != 1)
        {
            System.out.println(age + " год");
        }
        else if ((age % 10 == 2 || age % 10 == 3 || age % 10 == 4) && (age / 10) % 10 != 1)
        {
            System.out.println(age + " года");
        }
        else
        {
            System.out.println(age + " лет");
        }
    }
}