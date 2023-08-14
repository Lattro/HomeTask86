import java.util.HashMap;
import java.util.Map;

public class Methods
{
    private static Map<Integer,Person> mapUsers = new HashMap<Integer, Person>();
    private static int id = 0;
    public static void setMapUsers(Person person)
    {
        person.setId(id);
        mapUsers.put(id,person);
        id+=1;
    }
    public static Map<Integer, Person> getMapUsers()
    {
        return mapUsers;
    }
    public int getCountOfPerson()
    {
        int countPersons = 0;
        for (Map.Entry<Integer,Person> person: mapUsers.entrySet())
        {
            countPersons+=1;
        }
        System.out.println("Количество пользователей - "+countPersons);
        return countPersons;
    }
    public int getCountOfPersonBySex(Sex sex)
    {
        int countPersons = 0;
        for (Person person: mapUsers.values())
        {
                if(person.getSex() == sex)
                {
                    countPersons+=1;
                }
        }
        if(sex == Sex.MALE)
        {
            System.out.println("Количество пользователей мужского пола - "+countPersons);
        }
        else
        {
            System.out.println("Количество пользователей женского пола - "+countPersons);
        }
        return  countPersons;
    }
    public int getSumAge()
    {
        int sumAge = 0;
        for (Person person: mapUsers.values())
        {
            sumAge = sumAge+ person.getAge();
        }
        System.out.println("Суммарный возраст всех пользователей - "+ sumAge);
        return sumAge;
    }
    public int getSumAgeBySex(Sex sex)
    {
        int sumAge=0;
        for (Person person: mapUsers.values())
        {
            if(person.getSex()==sex)
            {
                sumAge+= person.getAge();
            }
        }
        if(sex == Sex.MALE)
        {
            System.out.println("Сумарный возраст пользователей мужского пола - "+sumAge);
        }
        else
        {
            System.out.println("Сумарный возраст пользователей женского пола - "+sumAge);
        }
        return sumAge;
    }
    public double getAverageAge()
    {
        double average = 0;
        int countUsers = 0;
        int sumAge = 0;
        for (Person person: mapUsers.values())
        {
                countUsers+=1;
                sumAge+= person.getAge();
        }
        average = sumAge/countUsers;
        System.out.println("Средний возраст всех сотрудников - "+average);
        return average;
    }
    public double getAverageAge(Sex sex)
    {
        double average = 0;
        int countUsers = 0;
        int sumAge = 0;
        for (Person person: mapUsers.values())
        {
            if (person.getSex()==sex)
            {
                countUsers += 1;
                sumAge += person.getAge();
            }
        }
        average = sumAge/countUsers;
        if(sex == Sex.MALE)
        {
            System.out.println("Средний возраст пользователей мужского пола - "+average);
        }
        else
        {
            System.out.println("Средний возраст пользователей женского пола - "+average);
        }
        return average;
    }
    public void getPersons()
    {
        for (Person person: mapUsers.values())
        {
            System.out.println("Пользователь - "+person.getName()+
                    ". Идентификатор - "+person.getId()+
                    ". Возраст - "+person.getAge()+
                    ". Пол - "+person.getSex());
        }
    }
    public void getPersons(Sex sex)
    {
        for (Person person: mapUsers.values())
        {
            if(person.getSex() == sex)
            {
                System.out.println("Пользователь - " + person.getName() +
                        ". Идентификатор - " + person.getId() +
                        ". Возраст - " + person.getAge() +
                        ". Пол - " + person.getSex());
            }
        }
    }
}
