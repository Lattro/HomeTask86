import java.util.HashMap;
import java.util.Map;

public class Person
{
    private int id;
    private String name;
    private int age;
    private Sex sex;
    public Person(String name, int age, Sex sex)
    {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public void setId(int id)
{
    this.id = id;
}
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setSex(Sex sex) {
        this.sex = sex;
    }
    public Sex getSex() {
        return sex;
    }
    @Override
    public String toString()
    {
        String person = "Пользователь - "+name+". Возраст - "+age+". Пол - "+sex+".";
        return person;
    }
    @Override
    public int hashCode()
    {
        return super.hashCode();
    }
    @Override
    public boolean equals(Object obj)
    {
        return super.equals(obj);
    }
}
