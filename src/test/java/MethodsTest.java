import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;
class MethodsTest {
    @Test
    void setMapUsers()
    {
        Methods.setMapUsers(new Person("1",11,Sex.MALE));
        Methods.setMapUsers(new Person("2",11,Sex.MALE));
        Methods.setMapUsers(new Person("3",11,Sex.MALE));
        Methods.setMapUsers(new Person("4",11,Sex.MALE));
        Methods.setMapUsers(new Person("5",11,Sex.MALE));
        Methods.setMapUsers(new Person("6",11,Sex.MALE));
        Methods.setMapUsers(new Person("7",11,Sex.FEMALE));
        Methods.setMapUsers(new Person("8",11,Sex.FEMALE));
    }
    @Test
    void getCountOfPerson()
    {
        Methods methods = new Methods();
        Assertions.assertEquals(8,methods.getCountOfPerson());
    }
    @Test
    void getCountOfPersonBySex()
    {
        Methods methods = new Methods();
        Assertions.assertEquals(6,methods.getCountOfPersonBySex(Sex.MALE));
        Assertions.assertEquals(2,methods.getCountOfPersonBySex(Sex.FEMALE));
    }
    @Test
    void getSumAge()
    {
        Methods methods = new Methods();
        Assertions.assertEquals(88,methods.getSumAge());
    }
    @Test
    void getSumAgeBySex()
    {
        Methods methods = new Methods();
        Assertions.assertEquals(22,methods.getSumAgeBySex(Sex.FEMALE));
        Assertions.assertEquals(66,methods.getSumAgeBySex(Sex.MALE));
    }
    @Test
    void getAverageAge()
    {
        Methods methods = new Methods();
        Assertions.assertEquals(11, methods.getAverageAge());
        Assertions.assertEquals(11, methods.getAverageAge(Sex.MALE));
        Assertions.assertEquals(11, methods.getAverageAge(Sex.FEMALE));
    }
}