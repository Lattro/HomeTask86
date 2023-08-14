import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Methods.setMapUsers(new Person("Александр",13, Sex.MALE));
        Methods.setMapUsers(new Person("Мария",15, Sex.FEMALE));
        Methods.setMapUsers(new Person("Никита",23, Sex.MALE));
        Methods.setMapUsers(new Person("Дмитрий",33, Sex.MALE));
        Methods.setMapUsers(new Person("Николай",45, Sex.MALE));
        Methods.setMapUsers(new Person("Анастасия",22, Sex.FEMALE));
        Methods.setMapUsers(new Person("Ольга",45, Sex.FEMALE));
        Methods methods = new Methods();
        methods.getCountOfPerson();
        methods.getSumAge();
        methods.getAverageAge();
        methods.getPersons();
        System.out.println("Введите пол пользователя, для подсчета данных по гендерной принадлежности (male/female)");
        try
        {
            String sex = scanner.next().toUpperCase();
            methods.getCountOfPersonBySex(Sex.valueOf(sex));
            methods.getPersons(Sex.valueOf(sex));
            methods.getSumAgeBySex(Sex.valueOf(sex));
            methods.getAverageAge(Sex.valueOf(sex));
        }
        catch (java.lang.IllegalArgumentException exception)
        {
          System.out.println("Ошибка ввода гендерной принадлежности - "+exception.toString());
        }
        scanner.close();
    }
}
